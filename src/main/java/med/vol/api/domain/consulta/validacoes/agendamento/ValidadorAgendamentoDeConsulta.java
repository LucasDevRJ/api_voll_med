package med.vol.api.domain.consulta.validacoes.agendamento;

import med.vol.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);
}
