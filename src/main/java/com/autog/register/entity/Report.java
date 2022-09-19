package com.autog.register.entity;

import javax.persistence.*;

@Entity
@Table(name = "Relatorio")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRelatorio;
    private String empresaContratada;
    private String dataRelatorio;
    private String bandeira;
    private String gestorResponsavel;
    private String empresa;
    private String cnpj;
    private Double totalKwm;
    private Double totalReais;
    private String nomeArquivo;

    @ManyToOne
    @JoinColumn(name = "fkPredio", referencedColumnName = "idPredio")
    private Building building;

    public Report() {
    }

    public Report(String empresaContratada, String dataRelatorio, String bandeira, String gestorResponsavel, String empresa, String cnpj, Double totalKwm, Double totalReais, String nomeArquivo, Building building) {
        this.empresaContratada = empresaContratada;
        this.dataRelatorio = dataRelatorio;
        this.bandeira = bandeira;
        this.gestorResponsavel = gestorResponsavel;
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.totalKwm = totalKwm;
        this.totalReais = totalReais;
        this.nomeArquivo = nomeArquivo;
        this.building = building;
    }

    public Integer getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(Integer idRelatorio) {
        this.idRelatorio = idRelatorio;
    }
}
