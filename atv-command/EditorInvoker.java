import java.util.Stack;

public class EditorInvoker {
    // Usamos uma Pilha (Stack) porque o último a entrar é o primeiro a sair (LIFO)
    private Stack<Command> historico = new Stack<>();

    public void executar(Command comando) {
        comando.execute();
        
        // Regra de Negócio: Apenas comandos reversíveis vão para o histórico.
        // Se for ImprimirCommand, não guardamos (pois não dá pra desfazer print).
        if (!(comando instanceof ImprimirCommand)) {
            historico.push(comando);
        }
    }

    public void desfazer() {
        if (!historico.isEmpty()) {
            Command ultimoComando = historico.pop();
            ultimoComando.undo();
        } else {
            System.out.println("Nada para desfazer.");
        }
    }
}