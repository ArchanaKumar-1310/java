import java.sql.*;
public class Movieget {
	public static void get() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/movie";
		String username = "root";
		String password = "T#9758@qlph";
		String Query = "select * from movie_ticket";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("movie id:"+rs.getInt(1));
			System.out.println("movie name:"+rs.getString(2));
			System.out.println("movie screen:"+rs.getString(3));
			System.out.println("movie price:"+rs.getInt(4));
			
		}

}
	public static void main (String[]args) throws Exception {
		get();
		
}
}