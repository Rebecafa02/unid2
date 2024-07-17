import java.util.HashSet;
import java.util.Set;

public class SetConjuntoCores {
    public static void main(String[] args) {
        String[] cores = new String[]{"Amarelo", "Branco", "Cinza", "Dourado",
                "Esmeralda", "Laranja"};

        Set<String> conjuntoCores = new HashSet<String>();

        for(int i = 0; i < cores.length; i++){
            conjuntoCores.add(cores[i]);
        }

        conjuntoCores.add("Amarelo"); // o sistema ignora dados iguais
        System.out.println(conjuntoCores.add("Branco")); // o sistema ignora dados iguais

        System.out.println("Conjunto Cores: ");
        for(String cor : conjuntoCores){
            System.out.println(cor);
        }
    }
}
