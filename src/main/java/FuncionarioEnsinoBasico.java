public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigo, double rendaBase, String escolaEnsinoBasico) {
        super(nome, codigo, rendaBase);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Ensino Básico: " + escolaEnsinoBasico;
    }
}
