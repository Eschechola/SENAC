package Entidades;

import java.util.UUID;

public class Funcionario {
    //region Propriedades

    private String _id;
    private String _nome;
    private double _salarioBruto;
    private double _salarioLiquido;
    private boolean _usaValeTransporte;
    private int _diasTrabalhados;
    private double _custoTransporteDiario;
    private double _bonus;
    private double _descontoINSS;
    private double _descontoIRPF;
    private double _descontoConvenio;
    private double _descontoRefeicao;
    private double _descontoAlimentacao;
    private double _descontoTransporte;
    private boolean _descontoCalculado;

    //endregion

    //region Construtores

    public Funcionario(
            String nome,
            double salarioBruto,
            double bonus,
            boolean usaValeTransporte,
            int diasTrabalhados,
            double custoTransporteDiario) {
        _id = gerarNovoId();
        _nome = nome;
        _salarioBruto = salarioBruto;
        _salarioLiquido = salarioBruto;
        _bonus = bonus;
        _usaValeTransporte = usaValeTransporte;
        _diasTrabalhados = diasTrabalhados;
        _custoTransporteDiario = custoTransporteDiario;
        _descontoCalculado = false;
    }

    //endregion

    //region Auxiliares

    private String gerarNovoId(){
        return UUID.randomUUID().toString();
    }

    public void descontarDoSalario(double desconto){
        _salarioLiquido -= desconto;
    }

    public void adicionarBonusAoSalario(){
        _salarioLiquido += _bonus;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "_id='" + _id + '\'' +
                ", _nome='" + _nome + '\'' +
                ", _salarioBruto=" + _salarioBruto +
                ", _salarioLiquido=" + _salarioLiquido +
                ", _usaValeTransporte=" + _usaValeTransporte +
                ", _diasTrabalhados=" + _diasTrabalhados +
                ", _custoTransporteDiario=" + _custoTransporteDiario +
                ", _bonus=" + _bonus +
                ", _descontoINSS=" + _descontoINSS +
                ", _descontoIRPF=" + _descontoIRPF +
                ", _descontoConvenio=" + _descontoConvenio +
                ", _descontoRefeicao=" + _descontoRefeicao +
                ", _descontoAlimentacao=" + _descontoAlimentacao +
                ", _descontoTransporte=" + _descontoTransporte +
                ", _descontoCalculado=" + _descontoCalculado +
                '}';
    }


    //endregion

    //region Getters

    public String getId() {
        return _id;
    }

    public String getNome() {
        return _nome;
    }

    public double getSalarioBruto() {
        return _salarioBruto;
    }

    public double getSalarioLiquido() {
        return _salarioLiquido;
    }

    public boolean getUsaValeTransporte() {
        return _usaValeTransporte;
    }

    public int getDiasTrabalhados() {
        return _diasTrabalhados;
    }

    public double getCustoTransporteDiario() {
        return _custoTransporteDiario;
    }

    public double getBonus() {
        return _bonus;
    }

    public double getDescontoINSS() {
        return _descontoINSS;
    }

    public double getDescontoIRPF() {
        return _descontoIRPF;
    }

    public double getDescontoConvenio() {
        return _descontoConvenio;
    }

    public double getDescontoRefeicao() {
        return _descontoRefeicao;
    }

    public double getDescontoAlimentacao() {
        return _descontoAlimentacao;
    }

    public double getDescontoTransporte() {
        return _descontoTransporte;
    }

    public boolean getDescontoCalculado() {
        return _descontoCalculado;
    }

    //endregion

    //region Setters

    public void setDescontoINSS(double descontoINSS) {
        _descontoINSS = descontoINSS;
    }

    public void setDescontoIRPF(double descontoIRPF) {
        _descontoIRPF = descontoIRPF;
    }

    public void setDescontoConvenio(double descontoConvenio) {
        _descontoConvenio = descontoConvenio;
    }

    public void setDescontoRefeicao(double descontoRefeicao) {
        _descontoRefeicao = descontoRefeicao;
    }

    public void setDescontoAlimentacao(double descontoAlimentacao) {
        _descontoAlimentacao = descontoAlimentacao;
    }

    public void setDescontoTransporte(double descontoTransporte) {
        _descontoTransporte = descontoTransporte;
    }

    public void setDescontoCalculado(boolean descontoCalculado) {
        _descontoCalculado = descontoCalculado;
    }

    //endregion
}