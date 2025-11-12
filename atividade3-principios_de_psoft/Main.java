public class Main {
    public static void main(String[] args) {
        // 1. Contratando um novo desenvolvedor
        Papel papelDev = new Desenvolvedor();
        Funcionario joao = new Funcionario("João", papelDev);
        joao.executarTrabalho();
        
        System.out.println("\n--- Nova Sprint! João virou Líder ---");
        
        // 2. João vira Líder (Acumula papéis)
        // Criamos o Decorator Lider, "envelopando" o papel atual de João
        joao.setPapel(new Lider(joao.getPapel())); 
        joao.executarTrabalho();

        System.out.println("\n--- Fim da Sprint! João voltou a ser só Dev ---");

        // 3. João deixa de ser Líder
        // (Nota: para isso funcionar 100%, o Lider devia ter um getPapelBase())
        // Vamos simplificar e setar um novo Papel Dev
        joao.setPapel(new Desenvolvedor());
        joao.executarTrabalho();

        System.out.println("\n--- João foi promovido a Gerente! ---");

        // 4. João é promovido (Muda de papel)
        // O objeto Funcionario é o MESMO. Só o seu Papel interno muda.
        joao.setPapel(new Gerente());
        joao.executarTrabalho();
    }
}