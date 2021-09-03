package com.dio.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHoras {

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idUsuario;
        private Long idMovimentacao;
    }

    @EmbeddedId
    private BancoHorasId id;

    LocalDateTime dataTrabalhada;
    BigDecimal quantidadeHoras;
    BigDecimal saldoHorasTrabalhadas;
}
