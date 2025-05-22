public class FuncionarioGraduado extends Funcionario {
    private String faculdade;

    public FuncionarioGraduado(String nome, int codigo, double rendaBase, String faculdade) {
        super(nome, codigo, rendaBase);
        this.faculdade = faculdade;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Faculdade: " + faculdade;
    }
}
