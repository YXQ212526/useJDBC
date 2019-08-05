import java.sql.*;
public class Main {

  public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection=DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=UTC","root","Yxq12345!");
    Statement statement=connection.createStatement();
    String sql="select phone,name from student_basic_info";
    ResultSet resultSet=statement.executeQuery(sql);
    while(resultSet.next())
    {
      String phone=resultSet.getString("phone");
      String name=resultSet.getString("name");
      System.out.println(name+":"+phone);
    }
    resultSet.close();
    statement.close();
    connection.close();

  }


}
