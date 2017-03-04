package db;

import java.sql.*;

/**
 * Created by Vadim on 26.02.2017.
 */
public class testSql {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;


        try {
//            Driver d = (Driver) Class.forName("org.sqlite.JDBC").newInstance();

//            String url = "jdbc:sqlite:C:/Users/Vadim/Desktop/Приклади/Library.db";

            //создание подключения к базе данных по url
//            con = DriverManager.getConnection(url);

            //подготовка SQL запроса
            String sql1 = "SELECT * FROM student";
//            String sql = "UPDATE Student SET blacklist=1  WHERE id=1;";
            stmt = con.createStatement();
//            stmt.executeUpdate(sql);


            //выполнение SQL запроса
            res = stmt.executeQuery(sql1);

            while (res.next()) {
                System.out.println(res.getString("blacklist"));
//                System.out.println(res.getString("title") + "-" + res.getString("author"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) res.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception ex) {

            }
        }
    }


}
