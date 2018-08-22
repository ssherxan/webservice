package dao;

import Entyti.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoimplMySql implements Dao {
    public Connection getConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
        DriverManager.registerDriver(driver);
        StringBuilder url = new StringBuilder();
        url.append("jdbc:mysql://"). //db type
                append("localhost:"). // host name
                append("3306/"). // port
                append("brigadir?"). //db
                append("user=root&"). //login
                append("password=root"); // password
        Connection connection = DriverManager.getConnection(url.toString());
        return connection;
    }

    public int insert(Product product) {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            String query = "Insert into products ( name,article,picture, catalog, price) VALUES('"
                    +  product.getName() +
                    "','" + product.getArticle() + "','" + product.getPicture()
                    + "','" + product.getCatalog() + "','" + product.getPrice() + "')"; //sql query
            System.out.println(query);
            statement.execute(query);

            int count = statement.getUpdateCount();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public List<Product> selectByCatalog(String catalogName) {
        Connection connection = null;
        List<Product> list = new ArrayList<Product>();
        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            ResultSet products = statement.executeQuery("SELECT name, article, picture,catalog, price FROM products" +
                    " WHERE catalog='" + catalogName + "'");
            // Перебор строк с данными
            while (products.next()) {
                String name = products.getString("name");
                String article = products.getString("article");
                String picture = products.getString("picture");
                String catalog = products.getString("catalog");
                int price = products.getInt("price");
                Product p = new Product(name, article, picture, catalog, price);
                System.out.println(p);
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
