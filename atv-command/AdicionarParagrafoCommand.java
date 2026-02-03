public class AdicionarParagrafoCommand implements Command {
    private Documento documento;
    private String texto;

    public AdicionarParagrafoCommand(Documento doc, String texto) {
        this.documento = doc;
        this.texto = texto;
    }

    @Override
    public void execute() {
        documento.adicionarParagrafo(texto);
    }

    @Override
    public void undo() {
        // O inverso de adicionar é remover
        documento.removerParagrafo(texto);
    }
}