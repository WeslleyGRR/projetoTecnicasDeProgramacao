/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Conexao.CasoDAO;
import Model.Caso;
import Model.Cliente;

/**
 *
 * @author wesll
 */
public class CasoService{
    
    public void cadastrarCaso(String descricao,double valorHonorario, int data, int idCliente, int parcelas){
    Caso caso = new Caso();
    caso.setDescicao(descricao);
    caso.setValorHonorario(valorHonorario);
    caso.setDiaVencimento(data);
    caso.setIdCliente(idCliente);
    caso.setParcelas(parcelas);
    CasoDAO casoDao = new CasoDAO();
    
    casoDao.cadastrarCaso(caso);
    }
    public void buscarCaso(){}
    public void deletarCaso(){}
    public void atualizarCaso(){}

    public Caso buscarCaso(int id) {
         CasoDAO casoDao = new CasoDAO();
         Caso caso = new Caso();
         caso.setIdCliente(id);
         
         return casoDao.buscarCaso(caso);
    }

    void deletarCaso(Cliente buscarCliente) {
         CasoDAO casoDao = new CasoDAO();
         Caso caso = new Caso();
         caso.setIdCliente(buscarCliente.getId());
         casoDao.deleteCaso(caso);
    }
         
    
}
