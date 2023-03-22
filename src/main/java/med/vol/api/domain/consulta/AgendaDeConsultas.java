package med.vol.api.domain.consulta;

import med.vol.api.domain.medico.MedicoRepository;
import med.vol.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public void agendar(DadosAgendamentoConsulta dados) {

        var paciente = pacienteRepository.findById(dados.idPaciente());
        var medico = medicoRepository.findById(dados.idMedico());

        var consulta = new Consulta(null, medico, paciente, dados.data());
        consultaRepository.save(consulta);
    }
}
