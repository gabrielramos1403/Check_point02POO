public class Principal {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // --- Exemplo 1: entrega feita por caminhão ---
        Caminhao caminhao = new Caminhao("ABC1D34", 8000.0, 6);
        Pacote pacotePesado = new Pacote("BR999", 10.5);

        Rota rotaCaminhao = new Rota(pacotePesado, caminhao);
        rotaCaminhao.iniciarEntrega();

        // Exibe informações específicas do caminhão
        caminhao.exibirInformacoes();

        System.out.println();

        // --- Exemplo 2: entrega feita por moto (isso era impossível no código legado!) ---
        Moto moto = new Moto("XYZ5E67", 30.0, true);
        Pacote pacotePequeno = new Pacote("BR001", 2.0);

        Rota rotaMoto = new Rota(pacotePequeno, moto);
        rotaMoto.iniciarEntrega();

        // Exibe informações específicas da moto
        moto.exibirInformacoes();

        System.out.println();

        // --- Exemplo 3: demonstrando validação do encapsulamento ---
        // A linha abaixo causaria exceção — peso negativo não é aceito:
        // Pacote pacoteInvalido = new Pacote("BR000", -5.0); // IllegalArgumentException

        // A linha abaixo também falharia — capacidade negativa não é aceita:
        // Caminhao caminhaoInvalido = new Caminhao("AAA0000", -500.0, 4); // IllegalArgumentException

        System.out.println("Sistema FiapDelivery funcionando corretamente!");
    }
}
