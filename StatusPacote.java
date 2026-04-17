public enum StatusPacote {

    /** Pacote registrado, aguardando coleta. */
    PENDENTE,

    /** Pacote em trânsito com o veículo de entrega. */
    EM_TRANSITO,

    /** Pacote entregue com sucesso ao destinatário. */
    ENTREGUE,

    /** Entrega não foi concluída por algum motivo. */
    CANCELADO
}
