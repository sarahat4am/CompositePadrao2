package composite2.padrao.projeto;

public class Main {
    public static void main (String[]args){

        DepartamentoComposto departamentoComposto = new DepartamentoComposto("Sede");

        DepartamentoFolha departamentoFolha = new DepartamentoFolha("Recursos Humanos");
        DepartamentoFolha departamentoFolha2 = new DepartamentoFolha("Setor Financeiro");

        departamentoComposto.addDepartamento(departamentoFolha);
        departamentoComposto.addDepartamento(departamentoFolha2);

        DepartamentoComposto filial = new DepartamentoComposto("Filial 1");
        DepartamentoFolha vendas = new DepartamentoFolha("Vendas");

        filial.addDepartamento(vendas);
        departamentoComposto.addDepartamento(filial);

        departamentoComposto.imprimirNomeDepartamento();
    }
}
