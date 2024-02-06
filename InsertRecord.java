import java.sql.*;
class InsertRecord
{
  public static void main(String[]args)
{
try
{

Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","Sravs9494");
Statement stmt=Con.createStatement();
stmt.executeUpdate("insert into myemp values(103, 'Purnima', 12500,'A')");
System.out.println("Record Inserted");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}