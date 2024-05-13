package composite2.padrao.projeto;

public class DepartamentoFolha implements Departamento{
    private String nome;

    public DepartamentoFolha(String nome){
        this.nome = nome;
    }

    public void imprimirNomeDepartamento(){
        System.out.println(nome);
    }
}
