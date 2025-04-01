package com.expresscheff.ExpressCheffAPI.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public record Evento(
        String tipo,
        LocalDate data,
        LocalTime hora,
        String endereco,
        StatusEvento status,
        Cliente cliente,
        List<Servico> servicos,
        float valorBruto,
        float descontos,
        float valorLiquido,
        float valorPago,
        String formaPagamento,
        LocalDate dataPagamento
) {}
