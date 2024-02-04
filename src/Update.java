import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update {
	public static void updateval() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String password = "T#9758@qlph";
		String Query = "update movie_ticket set price='300' where movie_id='103'";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		
		pst.executeUpdate();
		con.close();
		
	}
	public static void main (String[]args)throws Exception
	{
		updateval();
	}
}
