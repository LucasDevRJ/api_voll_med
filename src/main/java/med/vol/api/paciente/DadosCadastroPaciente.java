package med.vol.api.paciente;

import med.vol.api.endereco.Endereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
}
