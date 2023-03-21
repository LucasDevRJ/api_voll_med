package med.vol.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente

        @NotNull
        @Future
        LocalDateTime data
) {
}
