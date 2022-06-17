/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import Model.Cliente;
import Service.ClienteService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class ClienteDao {
    
     public int salvarCliente (Cliente cliente){
         
         Connection connection = MysqlConnect.getConection();
   
        PreparedStatement statement = null;
        int lastId = 0;
        
       
        try {
            String sql = "insert into cliente (nome, cpf, endereco, estado_civil) values(?,?,?,?)";
            statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getEndereco());
            statement.setString(4, cliente.getEstadoCivil());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        lastId = rs.getInt(1);
                         
                         
                    }
            
            statement.close();
               
         
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
        return lastId;
    }
     public Boolean DeletarCliente(Cliente cliente){
         
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        try {
            String sql = "DELETE  FROM cliente WHERE cpf =" +cliente.getCpf();
            statement = connection.prepareStatement(sql);
           
            statement.execute();
            statement.close();
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public Cliente BuscarCliente(Cliente cliente) {
         Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM `cliente` WHERE cpf ="+ cliente.getCpf();
            statement = connection.prepareStatement(sql);
//            statement.setString(1, cliente.getCpf());
            
            ResultSet rs = statement.executeQuery(sql);
             while(rs.next())
             {   cliente.setEndereco(rs.getString(5));
                 cliente.setNome(rs.getString(2));
                 cliente.setEstadoCivil(rs.getString(3));
                 cliente.setId(rs.getInt(1));
             }
            statement.close();
        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    return cliente;
    };

    public void deletarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
     
     
   