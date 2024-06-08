package controller;

import service.Service;
import java.util.InputMismatchException;

public class MenuStart {

    private String codigoBase;
    private String codigoAlvo;
    private Double valorEntrada;
    private Double valorSaida;
    private int opcao = 9;
    private int cont = 1;

    ApresentaTela apresentaTela = new ApresentaTela();
    RecebeValores recebeValores = new RecebeValores();
    Service service = new Service();

    public void Start() {
        while (opcao > 0){
            while (opcao < 0 || opcao > 6){
                apresentaTela.printTela(cont);
                try{
                    opcao = recebeValores.OpcaoMenu();
                }
                catch (InputMismatchException e) {
                    opcao = 0;
                    apresentaTela.printInvalidaFim();

                }
                if (opcao < 0 || opcao > 6){
                    apresentaTela.printInvalida();
                }
            }
            if (opcao == 0){
                break;
            }
            setCodigo(cont, selecionaCodigo(opcao));
            apresentaTela.printValorDesejado(getCodigoBase(), getCodigoAlvo());
            if(cont%2 == 0){
                try{
                    setValorEntrada(recebeValores.RecebeValor());
                } catch (InputMismatchException e) {
                    opcao = 0;
                    apresentaTela.printInvalidaFim();
                    break;
                }
                service.setCodigoBase(getCodigoBase());
                service.setCodigoAlvo(getCodigoAlvo());
                service.setValor(getValorEntrada());
                setValorSaida(service.Conversao());
                apresentaTela.printValorConvertido(getCodigoBase(), getCodigoAlvo(), getValorEntrada(), getValorSaida());
            }
            this.cont++;
            this.opcao = 9;
        }
    }

    private void setCodigo(int cont, String selecionaCodigo){
        if (cont % 2 == 1){
            setCodigoBase(selecionaCodigo);
        }
        else {
            setCodigoAlvo(selecionaCodigo);
        }
    }

    public Double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(Double valorSaida) {
        this.valorSaida = valorSaida;
    }

    private String selecionaCodigo(int opcao){
        switch (opcao){
            case 1:
                return "BRL";
            case 2:
                return "JPY";
            case 3:
                return "CNY";
            case 4:
                return "GBP";
            case 5:
                return "EUR";
            case 6:
                return "USD";
            default:
                return "";
        }
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
    public Double getValorEntrada() {
        return valorEntrada;
    }
    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }
}
