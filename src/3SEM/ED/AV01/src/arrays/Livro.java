package arrays;

public class Livro {
    private int _id;
    private String _titulo;
    private String _autor;
    private double _preco;
    public Livro()
    {
    }
    public Livro(
            int id,
            String titulo,
            String autor,
            double preco)
    {
        _id = id;
        _titulo = titulo;
        _autor = autor;
        _preco = preco;
    }
    public int getId() {
        return _id;
    }
    public void setId(int _id) {
        this._id = _id;
    }
    public String getTitulo() {
        return _titulo;
    }
    public void setTitulo(String _titulo) {
        this._titulo = _titulo;
    }
    public String getAutor() {
        return _autor;
    }
    public void setAutor(String _autor) {
        this._autor = _autor;
    }
    public double getPreco() {
        return _preco;
    }
    public void setPreco(double _preco) {
        this._preco = _preco;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "id=" + _id +
                ", titulo='" + _titulo + '\'' +
                ", autor='" + _autor + '\'' +
                ", preco=" + _preco +
                '}';
    }
}