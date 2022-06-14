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
    
     public void salvarCliente (Cliente cliente){
         
          System.out.print("teste1");
         Connection connection = MysqlConnect.getConection();
         System.out.print("teste2");
        PreparedStatement statement = null;
        
        System.out.print("teste4");
        try {
            String sql = "insert into cliente (nome, cpf, endereco, estado_civil) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            System.out.print("teste42");
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getEndereco());
            statement.setString(4, cliente.getEstadoCivil());
           

       
            
            
            
            statement.execute();
            System.out.print("teste5");
            statement.close();


        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    }
     public void DeletarCliente(Cliente cliente){
         
          System.out.print("teste1");
         Connection connection = MysqlConnect.getConection();
         System.out.print("teste2");
        PreparedStatement statement = null;
        
        System.out.print("teste4");
        try {
            String sql = "DELETE FROM 'cliente' where cpf = ? ";
            statement = connection.prepareStatement(sql);
            System.out.print("teste42");
          
            statement.setString(2, cliente.getCpf());
          
            statement.execute();
            System.out.print("teste5");
            statement.close();


        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void BuscarCliente(Cliente cliente) {
                System.out.print("teste1");
         Connection connection = MysqlConnect.getConection();
         System.out.print("teste2");
        PreparedStatement statement = null;
        
        System.out.print("teste4");
        try {
            String sql = "SELECT * FROM `cliente` WHERE cpf = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getCpf());
            ResultSet rs = statement.executeQuery(sql);
           
             
             while(rs.next())
             {
                 String nome = rs.getString("nome");
                 String cpf = rs.getString("cpf");
                 String endereco = rs.getString("endereco");
                 String estado_civil = rs.getString("estado_civil"); 
                 System.out.print(nome +" "+ cpf + " " + " " + endereco + " " + estado_civil );
              
             }
            
            
           
           
            statement.close();


        }catch (SQLException e){
       
            JOptionPane.showMessageDialog(null, e);

        }
    
    }
}
     
     
   