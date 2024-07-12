import java.util.ArrayDeque;
import java.util.Queue;

public class FilaPacientes {
    public static void main(String[] args) {
        Queue<String> filaPacientes = new ArrayDeque<>();
        String ultimoPaciente = null;

        filaPacientes.add("Jose Silva");
        filaPacientes.add("Lucas Santos");
        System.out.println("Fila após inclusão de pacientes: " + filaPacientes);

        filaPacientes.add("Maria José");
        System.out.println("Fila após Nova Inclusão: " + filaPacientes);

        ultimoPaciente = filaPacientes.poll();
        System.out.println("Fila após saída de: " + ultimoPaciente + ": " +  filaPacientes);

        ultimoPaciente = filaPacientes.poll();
        ultimoPaciente = filaPacientes.poll();
        System.out.println("Fila após Saída de mais dois Pacientes: " + filaPacientes);

        System.out.println(filaPacientes.poll()); //tentativa de remoção com fila vazia
    }
}
