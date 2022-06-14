package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/d_advogados";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static  Connection getConection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException("Erro na conexão com banco de dados" + e);
        }
    }
    public static void closeConnection(Connection connection){
        try {
            if(connection!= null){
                connection.close();
            }
        }catch (SQLException e){
            throw new RuntimeException("Erro ao encerrar conexão com banco de dados" + e);
        }
    }
     public static void closeConnection(Connection connection, PreparedStatement statement){
        closeConnection(connection);
        try {
            if(statement != null){
                statement.close();
            }
        }catch (SQLException e){
            throw new RuntimeException("Erro ao encerrar conexão com banco de dados" + e);
        }
    }


}
