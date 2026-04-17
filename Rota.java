public class Rota {

    /** Pacote que será transportado nesta rota. */
    private Pacote pacote;

    /**
     * Veículo responsável pela entrega.
     * Declarado como {@link Veiculo} (tipo pai) para aceitar qualquer subtipo.
     */
    private Veiculo veiculo;

    /**
     * Construtor da classe Rota.
     *
     * @param pacote  pacote a ser entregue (não pode ser nulo)
     * @param veiculo veículo que realizará a entrega (não pode ser nulo)
     * @throws IllegalArgumentException se o pacote ou o veículo forem nulos
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote da rota não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo da rota não pode ser nulo.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /**
     * Retorna o pacote associado a esta rota.
     *
     * @return pacote da rota
     */
    public Pacote getPacote() {
        return pacote;
    }

    /**
     * Retorna o veículo associado a esta rota.
     *
     * @return veículo da rota
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Inicia a entrega do pacote, atualizando seu status para EM_TRANSITO
     * e exibindo as informações da rota no console.
     */
    public void iniciarEntrega() {
        pacote.atualizarStatus(StatusPacote.EM_TRANSITO);
        System.out.println("=== Iniciando Entrega ===");
        System.out.println("Pacote: " + pacote.getCodigoRastreamento());
        System.out.println("Peso: " + pacote.getPesoKg() + " kg");
        System.out.println("Status: " + pacote.getStatus());
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("========================");
    }
}
