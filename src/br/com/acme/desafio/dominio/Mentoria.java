package br.com.acme.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Mentoria extends Conteudo {
    LocalDate data;

    @Override
    public double calcularXp() {
        return Conteudo.XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }
}
