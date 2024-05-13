package composite2.padrao.projeto;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoComposto implements Departamento{
    private String nome;
    private List<Departamento> subdepartamentos = new ArrayList<>();

    public DepartamentoComposto(String nome){
        this.nome = nome;
    }

    public void addDepartamento(Departamento departamento){
        subdepartamentos.add(departamento);
    }

    @Override
    public void imprimirNomeDepartamento() {
        System.out.println(nome);
        for (Departamento departamento: subdepartamentos) {
            departamento.imprimirNomeDepartamento();
        }
    }
}
