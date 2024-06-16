import java.util.ArrayList;

/**
 * Classe que gerencia o cronograma alimentar.
 */
public class Cronograma {
    private ArrayList<Alimento> cronograma;

    /**
     * Construtor da classe Cronograma.
     */
    public Cronograma() {
        this.cronograma = new ArrayList<>();
    }

    /**
     * Adiciona um alimento ao cronograma.
     * 
     * @param alimento Alimento a ser adicionado.
     */
    public void adicionarAlimento(Alimento alimento) {
        cronograma.add(alimento);
    }

    /**
     * Remove um alimento do cronograma.
     * 
     * @param alimento Alimento a ser removido.
     */
    public void removerAlimento(Alimento alimento) {
        cronograma.remove(alimento);
    }

    /**
     * Lista todos os alimentos no cronograma.
     * 
     * @return Lista de alimentos.
     */
    public ArrayList<Alimento> listarAlimentos() {
        return cronograma;
    }

    /**
     * Altera um alimento no cronograma.
     * 
     * @param index    Índice do alimento a ser alterado.
     * @param alimento Novo alimento.
     */
    public void alterarAlimento(int index, Alimento alimento) {
        if (index >= 0 && index < cronograma.size()) {
            cronograma.set(index, alimento);
        }
    }
}
