package project1;
import java.sql.*;
public class Employee_CLass 
{
    static Connection c;
    static Statement ss;
    static String query;
    static connect t = new connect();
    
    public static void Change_Data(int SSN ,String typeOFInfo ,String NewInfo)
    {      
        try {
            c=t.setconnect();
           ss=c.createStatement();
            query="update employee set '"+typeOFInfo+ "' = '"+NewInfo+"' where SSN= '"+SSN+"' ";
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
    public static void Add_Employee(String name,int SSN,String Adress,int Age,int Salary ,int Phone )
    {
        try {
            c=t.setconnect();
            ss=c.createStatement();
            query="insert into Employee values ('"+name+"','"+SSN+"','"+Adress+"','"+Age+"','"+Salary+"','"+Phone+"')";
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

    public static void Delete_Employee(int SSN ,int code)
    {
        try {
            c=t.setconnect();
            ss=c.createStatement();
            query="delete from Employee where SSN ="+SSN+"";
            ss.execute(query);
            query="delete from login where code="+code+"";
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
