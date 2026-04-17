public class Pacote {

    /** Código único de rastreamento do pacote. */
    private String codigoRastreamento;

    /** Peso do pacote em quilogramas. */
    private double pesoKg;

    /** Status atual do pacote no fluxo de entrega. */
    private StatusPacote status;

    /**
     * Construtor da classe Pacote.
     *
     * @param codigoRastreamento código único de rastreamento (não pode ser nulo ou vazio)
     * @param pesoKg             peso do pacote em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se o código for inválido ou o peso for negativo
     */
    public Pacote(String codigoRastreamento, double pesoKg) {
        if (codigoRastreamento == null || codigoRastreamento.trim().isEmpty()) {
            throw new IllegalArgumentException("O código de rastreamento não pode ser vazio.");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso do pacote deve ser maior que zero.");
        }
        this.codigoRastreamento = codigoRastreamento;
        this.pesoKg = pesoKg;
        this.status = StatusPacote.PENDENTE; // todo pacote começa como PENDENTE
    }

    /**
     * Retorna o código de rastreamento do pacote.
     *
     * @return código de rastreamento
     */
    public String getCodigoRastreamento() {
        return codigoRastreamento;
    }

    /**
     * Retorna o peso do pacote em kg.
     *
     * @return peso em kg
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * Retorna o status atual do pacote.
     *
     * @return status do pacote
     */
    public StatusPacote getStatus() {
        return status;
    }

    /**
     * Atualiza o status do pacote para um novo valor.
     *
     * @param novoStatus novo status a ser atribuído (não pode ser nulo)
     * @throws IllegalArgumentException se o novo status for nulo
     */
    public void atualizarStatus(StatusPacote novoStatus) {
        if (novoStatus == null) {
            throw new IllegalArgumentException("O status não pode ser nulo.");
        }
        this.status = novoStatus;
    }
}
