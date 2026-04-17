public class Moto extends Veiculo {

    /** Indica se a moto possui baú para transporte de cargas maiores. */
    private boolean possuiBau;

    /**
     * Construtor da classe Moto.
     *
     * @param placa           placa da moto
     * @param capacidadeCarga capacidade de carga em kg
     * @param possuiBau       {@code true} se a moto tiver baú, {@code false} caso contrário
     */
    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga);
        this.possuiBau = possuiBau;
    }

    /**
     * Informa se a moto possui baú.
     *
     * @return {@code true} se tiver baú, {@code false} caso contrário
     */
    public boolean isPossuiBau() {
        return possuiBau;
    }

    /**
     * Exibe as informações detalhadas da moto no console.
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Moto ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " kg");
        System.out.println("Possui baú: " + (possuiBau ? "Sim" : "Não"));
    }
}
