package med.vol.api.paciente;

import med.vol.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, DadosEndereco endereco) {
}
