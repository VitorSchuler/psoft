public class TotemDesembarque extends TotemAdapter {
    @Override
    public void vooAdicionado(VooEvent event) {
        if (event.getVoo().getTipoVoo() == TipoVoo.CHEGANDO) {
            System.out.println("[DESEMBARQUE] Novo voo aterrissando: " + event.getVoo().getNumero());
        }
    }
    // Implementaria o mesmo filtro if() para vooAtualizado e vooRemovido...
}