public class MainCommand {
    public static void main(String[] args) {
        // 1. Configuração inicial
        Documento doc = new Documento();
        EditorInvoker editor = new EditorInvoker();

        // 2. Criando os comandos (baseado no exemplo da imagem)
        Command c1 = new AdicionarParagrafoCommand(doc, "Bom dia pessoal");
        Command c2 = new AdicionarParagrafoCommand(doc, "Boa atividade!");
        Command print = new ImprimirCommand(doc);

        // --- Execução conforme a imagem ---
        
        System.out.println("> Adicionando 'Bom dia pessoal' e 'Boa atividade!'");
        editor.executar(c1);
        editor.executar(c2);
        
        System.out.println("> Imprimindo conteúdo:");
        editor.executar(print); 
        // Esperado: "Bom dia pessoal", "Boa atividade!"

        System.out.println("\n> Reverter operação (undo)");
        editor.desfazer(); // Remove "Boa atividade!"
        
        System.out.println("> Imprimindo conteúdo:");
        editor.executar(print);
        // Esperado: Apenas "Bom dia pessoal"

        System.out.println("\n> Adicionando 'Boa sorte!!!'");
        Command c3 = new AdicionarParagrafoCommand(doc, "Boa sorte!!!");
        editor.executar(c3);
        
        System.out.println("> Imprimindo conteúdo:");
        editor.executar(print);
        // Esperado: "Bom dia pessoal", "Boa sorte!!!"

        System.out.println("\n> Reverter duas vezes");
        editor.desfazer(); // Remove "Boa sorte!!!"
        editor.desfazer(); // Remove "Bom dia pessoal"
        
        System.out.println("> Imprimindo conteúdo:");
        editor.executar(print);
        // Esperado: Vazio ("")
    }
}