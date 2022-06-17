/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import Model.Caso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class CasoDAO {
    public void cadastrarCaso(Caso caso){
    Connection connection = MysqlConnect.getConection();
   
        PreparedStatement statement = null;

        
       
        try {
            String sql = "insert into caso (codigo_cliente,descricao, valor_honorarios, parcelas, dia_vencimento) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setInt(1, caso.getIdCliente());
            statement.setString(2, caso.getDescicao());
            statement.setDouble(3, caso.getValorHonorarios());
            statement.setInt(4, caso.getParcelas());
            statement.setInt(5, caso.getDiaVencimento());
            
            statement.executeUpdate();
            
          
            
            statement.close();
               
         
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    
    }

    public Caso buscarCaso(Caso caso) {
        
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM `caso` WHERE codigo_cliente =" + String.valueOf(caso.getIdCliente());
            statement = connection.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery(sql);
             while(rs.next())
             {   caso.setDescicao(rs.getString(3));
                 caso.setDiaVencimento(rs.getInt(6));
                 caso.setValorHonorario(rs.getDouble(4));
                 caso.setParcelas(rs.getInt(5));
             }
            statement.close();
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    return caso;
        
        
        
    }

    public void deleteCaso(Caso caso) {
          
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        try {
            String sql = "DELETE FROM caso WHERE codigo_cliente ="+ caso.getIdCliente();
            statement = connection.prepareStatement(sql);
            statement.execute();
            statement.close();
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    
        
    }
    
}
