public class ImprimirCommand implements Command {
    private Documento documento;

    public ImprimirCommand(Documento doc) {
        this.documento = doc;
    }

    @Override
    public void execute() {
        documento.imprimir();
    }

    @Override
    public void undo() {
        // A especificação diz: "A operação de impressão não é reversível"
        // Então não fazemos nada aqui.
    }
}