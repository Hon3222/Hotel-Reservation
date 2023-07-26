package project1;
import java.sql.*;
public class Customer_Class {
    
    static Connection c;
    static Statement ss;
    static String query;
    static connect t = new connect();
    
    public static void Change_Data(int SSN ,String typeOFInfo ,String NewInfo)
    {      
        try {
            c=t.setconnect();
            ss=c.createStatement();
            query="update customers set '"+typeOFInfo+ "' = '"+NewInfo+"' where SSN= '"+SSN+"' ";
            ss.execute(query);
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
                finally {
            try {
                c.close();
                ss.close();
            }              
            catch(SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }
    }    
    public static void Add_Customer(String name,int SSN,int Phone )
    {
        try {
            c=t.setconnect();
            ss=c.createStatement();
            query="insert into customers values ('"+name+"','"+SSN+"','"+Phone+"')";
            ss.execute(query);
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
                finally {
            try {
                c.close();
                ss.close();
            }              
            catch(SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }
    }

    public static void Delete_Employee(int SSN)
    {
        try {
            c=t.setconnect();
            ss=c.createStatement();
            query="delete from Customers where SSN ="+SSN+"";
            ss.execute(query);
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
                finally {
            try {
                c.close();
                ss.close();
            }              
            catch(SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }
    }        
}
