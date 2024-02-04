import java.sql.*;
public class Insert {
	public static void insertval() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String password = "T#9758@qlph";
		String Query = "insert into movie_ticket values(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 2);
		pst.setString(2, "ayalan");
		pst.setString(3, "screen2");
		pst.setInt(4, 250);
		pst.executeUpdate();
		con.close();
		
	}
	public static void main (String[]args)throws Exception
	{
		insertval();
	}
}
