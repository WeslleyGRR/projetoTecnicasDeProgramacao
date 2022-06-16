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
    private BigDecimal valorHonorario;
    private Date data;
    private String tipo;

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
    public BigDecimal getValorHonorario() {
        return valorHonorario;
    }

    /**
     * @param valorHonorario the valorHonorario to set
     */
    public void setValorHonorario(BigDecimal valorHonorario) {
        this.valorHonorario = valorHonorario;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
}
