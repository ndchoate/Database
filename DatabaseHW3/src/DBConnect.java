import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.lang.Class;
import java.sql.*;
import java.math.*;

public class DBConnect
{
    public DBConnect(String host, String username, String password)
    {
        m_host = host;
        m_username = username;
        m_password = password;
    }

    // Input:
    //      String procedureName - name of stored procedure to be used (under
    //                          the Programmability\Stored Procedures dir in database)
    //                          NOTE: You DO NOT need to specify the particular database,
    //                              that's already done below (see assignment of procedureCall)
    //      String args - arguments to pass to the stored procedure
    //
    //      Example use: dbConnect.ExecuteStoredProcedure("add_request_review", "3,0,'please review'");
    //
    //      Above example taken from line 18 of workflow.sql
    public void ExecuteStoredProcedure(String procedureName, String args) {
        try
        {
            Statement stmt = m_connection.createStatement();
            String procedureCall = "exec [Reporting_developer].[work]." + procedureName + " " + args + ";";
            stmt.executeUpdate(procedureCall);
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }

    // Input:
    //      String table - Name of table to insert into
    //      String columns - Name of all columns to insert into. Has the form of
    //                      "( column0, column1, ..., columnn)"
    //      String values - Values to enter into each columns, same form as columns string
    public void InsertIntoTable(String table, String columns, String values)
    {
        try
        {
            Statement stmt = m_connection.createStatement();
            String insertStatement = "INSERT INTO " + table + " " +  columns + " VALUES " + values + ";";
            stmt.executeUpdate(insertStatement);
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }

    // Connect to the database using the attributes that have been instantiated using the
    // constructor
    public void Connect()
    {
        try
        {
            // Init SQL Server driver for connection
            Driver sqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
            DriverManager.registerDriver(sqlDriver);

            // Create connection URL based on user input
            String connectionURL = "jdbc:sqlserver://" + m_host + ";databaseName=Reporting_developer;" + "user=" +
                    m_username + ";password=" + m_password + ";";
            m_connection = DriverManager.getConnection(connectionURL);
            System.out.println("Connection Success!\n");
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }

    public Connection m_connection;
    public String m_host;
    public String m_username;
    public String m_password;
}