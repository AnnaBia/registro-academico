public class FuncionarioEnsinoMedio extends Funcionario {
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigo, double rendaBase, String escolaEnsinoMedio) {
        super(nome, codigo, rendaBase);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getDescricao() {
        return super.getDescricao() + ", Ensino Médio: " + escolaEnsinoMedio;
    }
}
