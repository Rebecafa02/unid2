import java.util.ArrayList;
import java.util.Collection;

public class FuncionarioUtil {
    public static void main(String[] args) {

        Collection <Funcionario> quadro = new ArrayList<>();
        quadro.add(new Funcionario("Rebeca Almeida", 1500.00, 2023, 6, 19));
        quadro.add(new Funcionario("Gustavo Matos", 1750.00, 2023, 6, 5));
        quadro.add(new Funcionario("Vicente Almeida", 2000.00, 2018, 9, 15));
        quadro.add(new Funcionario("Jeane Paula", 4000, 1997, 3, 17));

        /* while(it.hasNext()){
            Funcionario func = (Funcionario)it.next();
            func.reajustarSalario(5);
            System.out.println("Funcionário: [" + func + "]" );
        } */
        for (Funcionario func : quadro) {
            func.reajustarSalario(5);
            System.out.println("Funcionário: [" + func + "]");
        }

    }
}