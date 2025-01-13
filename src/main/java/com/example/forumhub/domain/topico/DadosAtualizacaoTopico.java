package com.example.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        String autor,
        String curso
) {
}
