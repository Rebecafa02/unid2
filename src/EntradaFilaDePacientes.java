import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class EntradaFilaDePacientes {
    public static void main(String[] args) {
        Queue<String> filaDePacientes = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        char op;

        do{
            System.out.println("OPERAÇÕES COM FILA DE PACIENTES: ");
            System.out.println("Adicionar/Remover/Listar/Encerrar  (A/R/L/E)?");
            op = scanner.nextLine().toLowerCase().charAt(0);

            switch(op){
                case 'a':
                    System.out.println("Digite o nome do novo Paciente: ");
                    filaDePacientes.add(scanner.nextLine().toUpperCase());
                    break;

                case 'r':
                    if(filaDePacientes.isEmpty()){
                        System.out.println("A fila de Pacientes está vazia!");
                    } else {
                        System.out.printf("Ultimo paciente removido: %s\n", filaDePacientes.remove());
                    }
                    break;

                case 'l':
                    if(filaDePacientes.isEmpty()){
                        System.out.println("A fila de Pacientes está vazia!");
                    } else {
                        System.out.println("Fila de pacientes:");
                        Iterator<String> it = filaDePacientes.iterator();
                        for(int i = 1; it.hasNext(); i++){
                            System.out.printf("Paciente %d: %s\n", i, it.next());
                        }
                    } break;
            }
        } while (op != 'e');

        scanner.close();
    }
}
