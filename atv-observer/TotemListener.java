public interface TotemListener {
    void vooAdicionado(VooEvent event);
    void vooAtualizado(VooEvent event);
    void vooRemovido(VooEvent event);
}