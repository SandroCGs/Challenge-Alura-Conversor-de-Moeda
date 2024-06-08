package service;

import http.RequestHttp;

public class Service {
    private String codigoBase = "";
    private String codigoAlvo = "";
    private Double valor;
    private Double valorFinal;

    RequestHttp requestHttp = new RequestHttp();

    public double Conversao(){
        requestHttp.GeraLink(getCodigoBase(), getCodigoAlvo());
        requestHttp.ClientRequest();
        valorFinal = getValor()*requestHttp.getConversionRate();
        return valorFinal;
    }

    public String getCodigoBase() {
        return codigoBase;
    }
    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }
    public String getCodigoAlvo() {
        return codigoAlvo;
    }
    public void setCodigoAlvo(String codigoAlvo) {
        this.codigoAlvo = codigoAlvo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
