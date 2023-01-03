package med.vol.api.medico;

import med.vol.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(Long id, String nome, String telefone, DadosEndereco endereco) {

}
