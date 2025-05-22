public class Funcionario {
    private String nome;
    private int codigo;
    private double rendaBase;

    public Funcionario(String nome, int codigo, double rendaBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.rendaBase = rendaBase;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getRendaBase() {
        return rendaBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setRendaBase(double rendaBase) {
        this.rendaBase = rendaBase;
    }

    public String getDescricao() {
        return "Nome: " + nome + ", Código: " + codigo + ", Renda base: R$ " + rendaBase;
    }
}
