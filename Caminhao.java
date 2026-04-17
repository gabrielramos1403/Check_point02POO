public class Caminhao extends Veiculo {

    /** Número de eixos do caminhão. Influencia no tipo de licença e rota permitida. */
    private int numeroDeEixos;

    /**
     * Construtor da classe Caminhao.
     *
     * @param placa           placa do caminhão
     * @param capacidadeCarga capacidade de carga em kg
     * @param numeroDeEixos   número de eixos (deve ser maior que zero)
     * @throws IllegalArgumentException se o número de eixos for inválido
     */
    public Caminhao(String placa, double capacidadeCarga, int numeroDeEixos) {
        super(placa, capacidadeCarga);
        if (numeroDeEixos <= 0) {
            throw new IllegalArgumentException("O número de eixos deve ser maior que zero.");
        }
        this.numeroDeEixos = numeroDeEixos;
    }

    /**
     * Retorna o número de eixos do caminhão.
     *
     * @return número de eixos
     */
    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    /**
     * Exibe as informações detalhadas do caminhão no console.
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Caminhão ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " kg");
        System.out.println("Número de eixos: " + numeroDeEixos);
    }
}
