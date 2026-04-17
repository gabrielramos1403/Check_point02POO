public abstract class Veiculo {

    /** Placa do veículo no formato padrão brasileiro. */
    private String placa;

    /** Capacidade máxima de carga em quilogramas. */
    private double capacidadeCarga;

    /**
     * Construtor da classe Veiculo.
     *
     * @param placa          placa do veículo (não pode ser nula ou vazia)
     * @param capacidadeCarga capacidade de carga em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se a placa for inválida ou a capacidade for negativa
     */
    public Veiculo(String placa, double capacidadeCarga) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser vazia.");
        }
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("A capacidade de carga deve ser maior que zero.");
        }
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Retorna a placa do veículo.
     *
     * @return placa do veículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Retorna a capacidade de carga do veículo em kg.
     *
     * @return capacidade de carga
     */
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * Exibe as informações básicas do veículo.
     * Método abstrato — cada subclasse define seu próprio formato de exibição.
     */
    public abstract void exibirInformacoes();
}
