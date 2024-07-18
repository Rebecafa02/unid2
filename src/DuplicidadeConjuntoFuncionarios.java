import java.util.Set;
import java.util.HashSet;

public class DuplicidadeConjuntoFuncionarios {
    public static void main(String[] args) {
        SetFuncionario f1, f2, f3, f4;

        Set<SetFuncionario> quadro = new HashSet<SetFuncionario>();

        f1 = new SetFuncionario("Jose", 1500.02, 2002, 5, 25);
        f2 = new SetFuncionario("Maria", 4500.1, 2003, 10, 2);
        f3 = new SetFuncionario("Helena", 650.15, 2010, 8, 15);
        f4 = new SetFuncionario("Jose", 1500.02, 2002, 5, 25);


        quadro.add(f1);
        quadro.add(f2);
        quadro.add(f3);
        quadro.add(f4);

        for (SetFuncionario func : quadro) {
            func.reajustarSalario(5);
            System.out.println("Funcionário: [" + func + "]");
        }
    }
}
