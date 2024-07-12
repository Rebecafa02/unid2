import java.util.HashSet;
import java.util.Set;

public class ConjuntoCores {
    public static void main(String[] args) {
        String[] cores = new String[]{"Amarelo", "Branco", "Cinza", "Dourado",
                "Esmeralda", "Laranja"};
        Set<String> conjuntoCores = new HashSet<String>();

        for (int i = 0; i<cores.length; i++){
            conjuntoCores.add(cores[i]);
        }
        System.out.println("Conjunto de Cores: ");
        for (String cor: conjuntoCores){
            System.out.println(cor);
        }
    }
}
