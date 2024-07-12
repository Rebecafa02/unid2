import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaDeLivros {
    public static void main(String[] args) {
        Deque<String> pilhaDeLivros = new ArrayDeque<>();
        String ultimoLivro =  null;

        pilhaDeLivros.push("Leitura de verão");
        pilhaDeLivros.push("Hipotese do Amor");
        pilhaDeLivros.push("Percy Jackson");
        pilhaDeLivros.push("Trono de vidro");

        System.out.println("Pilha após o empilhamento de livros: " + pilhaDeLivros);

        pilhaDeLivros.push("Uma farsa de amor na Espanha");
        System.out.println("Pilha após novo empilhamento: " + pilhaDeLivros);

        ultimoLivro = pilhaDeLivros.pop();

        System.out.println("Pilha após o desempilhamento do livro: " +ultimoLivro + ": " + pilhaDeLivros);

    }
}
