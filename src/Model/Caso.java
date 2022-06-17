/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author wesll
 */
public class Caso {
    private int id;
    private int idCliente;
    private String descicao;
    private double valorHonorarios;
    private int parcelas;
    private int diaVencimento;


    /**
     * @return the descicao
     */
    public String getDescicao() {
        return descicao;
    }

    /**
     * @param descicao the descicao to set
     */
    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    /**
     * @return the valorHonorario
     */
    public double getValorHonorarios() {
        return valorHonorarios;
    }

    /**
     * @param valorHonorario the valorHonorario to set
     */
    public void setValorHonorario(double valorHonorario) {
        this.valorHonorarios = valorHonorario;
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the diaVencimento
     */
    public int getDiaVencimento() {
        return diaVencimento;
    }

    /**
     * @param diaVencimento the diaVencimento to set
     */
    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
}
