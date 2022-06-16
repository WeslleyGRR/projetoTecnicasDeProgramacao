/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Conexao.ClienteDao;
import Model.Cliente;

/**
 *
 * @author wesll
 */
public class ClienteService {
    
    public void cadastrarCliente(String nome, String estadoCivil,String endereco, String cpf){
        Cliente cliente  = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEstadoCivil(estadoCivil);
        cliente.setEndereco(endereco);
       
       
        ClienteDao clienteDao = new ClienteDao();
      
       clienteDao.salvarCliente(cliente);
            
    }
    
    public void deletarCliente(String cpf){
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        ClienteDao clienteDao = new ClienteDao();
      
       clienteDao.DeletarCliente(cliente);
    
    }
    
    public void buscaCliente(String cpf){
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        ClienteDao clienteDao = new ClienteDao();
       clienteDao.BuscarCliente(cliente);
       
       
    }
    
       public void DeletarCliente(String cpf){
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        ClienteDao clienteDao = new ClienteDao();
       clienteDao.deletarCliente(cliente);
       
       
    }
    public void mostrarCliente(String nome, String cpf, String endereco, String estado_civil) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    
}
