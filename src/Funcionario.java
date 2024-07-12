import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {
    private String nome;
    private double salario;
    private Date dataAdmissao;
    private int anoAdmissao;
    private int mesAdmissao;
    private int diaAdmissao;

    public Funcionario(String nome, double salario, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
        this.nome = nome;
        this.salario = salario;
        GregorianCalendar dataAdmissaoTemp = new GregorianCalendar(anoAdmissao, mesAdmissao -1, diaAdmissao);
        dataAdmissao = dataAdmissaoTemp.getTime();
    }


    public String getNome() {
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0)
            this.salario = salario;
    }

    public Date getDataAdmissao(){
        return dataAdmissao;
    }

    public void reajustarSalario(double percentual){
        double reajuste = salario * percentual/100;
        salario += reajuste;
    }

    public String toString(){
        return "Nome: " + nome + " Salario R$" + salario + " Data Admissão " + dataAdmissao;
    }
}
