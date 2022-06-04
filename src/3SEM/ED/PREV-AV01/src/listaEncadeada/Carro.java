package listaEncadeada;

public class Carro {
    private int _id;
    private int _ano;
    private double _preco;
    private String _marca;
    private String _modelo;

    public Carro(
            int id,
            int ano,
            double preco,
            String marca,
            String modelo) {
        this._id = id;
        this._ano = ano;
        this._preco = preco;
        this._marca = marca;
        this._modelo = modelo;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public int getAno() {
        return _ano;
    }

    public void setAno(int ano) {
        this._ano = ano;
    }

    public double getPreco() {
        return _preco;
    }

    public void setPreco(double preco) {
        this._preco = preco;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String marca) {
        this._marca = marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String modelo) {
        this._modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "_id=" + _id +
                ", _ano=" + _ano +
                ", _preco=" + _preco +
                ", _marca='" + _marca + '\'' +
                ", _modelo='" + _modelo + '\'' +
                '}';
    }
}
