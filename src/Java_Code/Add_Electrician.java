package Java_Code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Add_Electrician")
public class Add_Electrician extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Our_Home","root","");
			
			HttpSession session2 = request.getSession(false) ;
			String groupName  = (String) session2.getAttribute("groupName");
			
			String sql = "select * from Group_Details where groupName = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, groupName);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("password").equals(password)) {
					String sql1 = "insert into "+ groupName +"_ElecList values(?,?,?)";
					PreparedStatement ps1 = con.prepareStatement(sql1);
					ps1.setString(1,  name);
					ps1.setString(2, phone);
					ps1.setString(3, "available");
					
					ps1.executeUpdate();
					
					response.sendRedirect("AddElec_Succesfull.jsp");
				} else {
					response.sendRedirect("AddElec_WrongPassword.jsp");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
