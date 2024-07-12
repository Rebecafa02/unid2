import java.util.ArrayList;
import java.util.List;

public class ListasCores {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<String>();

        cores.add("Vermelho"); //adicionando vermelho na posição 0
        cores.add(0, "azul"); // deslocando vermelho para posição 1 para adicionar azul
        cores.add(1, "Verde"); //deslocamento do vermelho para posição 2 para adicionar o verde

        for (int i = 0; i < cores.size(); i++){
            System.out.printf("Cor (Posição %d) : %s\n", i, cores.get(i));
        }
    }
}
