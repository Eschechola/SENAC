public class Funcionario {
    private int _id;
    private String _nome;
    private String _cargo;
    private double _salario;

    public Funcionario(
            int id,
            String nome,
            String cargo,
            double salario) {
        this._id = id;
        this._nome = nome;
        this._cargo = cargo;
        this._salario = salario;
    }

    public Funcionario(
            String nome,
            String cargo,
            double salario) {
        this._nome = nome;
        this._cargo = cargo;
        this._salario = salario;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String cargo) {
        this._cargo =_cargo;
    }

    public double getSalario() {
        return _salario;
    }

    public void setSalario(double salario) {
        this._salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "_id=" + _id +
                ", _nome='" + _nome + '\'' +
                ", _cargo='" + _cargo + '\'' +
                ", _salario=" + _salario +
                '}';
    }
}
