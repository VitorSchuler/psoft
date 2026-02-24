public class TotemEmbarque extends TotemAdapter {
    @Override
    public void vooAdicionado(VooEvent event) {
        if (event.getVoo().getTipoVoo() == TipoVoo.PARTINDO) {
            System.out.println("[EMBARQUE] Novo voo adicionado: " + event.getVoo().getNumero());
        }
    }
    // Implementaria o mesmo filtro if() para vooAtualizado e vooRemovido...
}