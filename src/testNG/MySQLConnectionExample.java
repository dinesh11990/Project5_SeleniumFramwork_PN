package testNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub


		//1. Mention the type of DB to be used

		Class.forName("com.mysql.cj.jdbc.Driver");


		//2. Create connection with the DB by giving the DB details

		Connection connection = DriverManager.
				getConnection("jdbc:mysql://root@localhost/selenium_users");


		//3. Create a statement

		Statement statement = connection.createStatement();


		//4. Execute the query

		ResultSet result = statement.executeQuery("SELECT * FROM superheroes_table");

		//5. Store the Result in ResultSet

		while(result.next()){

			System.out.println("Name: "+result.getString(1)+
					" Nick Name: "+ result.getString(2));

		}




	}

}
