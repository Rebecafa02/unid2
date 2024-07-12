import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListaLigadaCores {
    public static void main(String[] args) {
        List<String> cores = new LinkedList<>();

        cores.add("Vermelho"); //inclusão de elementos
        cores.add("Azul"); //inclusão de elementos ao final da fila
        cores.add("Amarelo");

        ListIterator<String> it = cores.listIterator();
        it.next(); //visitando o 1° elemento
        it.add("Preto");
        it.next(); //visitando o 2° elemento
        it.remove(); //removendo o ultimo elemento visitado


        int i = 0; //contador de elementos
        for (String cor: cores){
            System.out.printf("Cor (Posição %d): %s\n", i++, cor);
        }


    }
}
