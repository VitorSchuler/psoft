public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("João");
        Usuario user2 = new Usuario("Maria");

        Produto ps5 = new Produto("PlayStation 5", "http://loja.com/ps5", false);

        // Usuários criam os alertas
        AlertaDisponibilidade alertaJoao = new AlertaDisponibilidade(user1);
        AlertaPromocao alertaMaria = new AlertaPromocao(user2);

        // Inscrevendo os alertas no produto
        ps5.adicionarAlerta(alertaJoao);
        ps5.adicionarAlerta(alertaMaria);

        System.out.println("--- ESTOQUE ATUALIZADO ---");
        // Isso deve notificar apenas o João (pois a Maria quer saber de promoção)
        ps5.setDisponivel(true); 

        System.out.println("--- BLACK FRIDAY INICIADA ---");
        // Isso deve notificar apenas a Maria (pois o João só pediu disponibilidade)
        ps5.aplicarPromocao("BLACK50");
    }
}