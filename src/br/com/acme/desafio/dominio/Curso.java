package br.com.acme.desafio.dominio;

import java.util.Objects;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHorario;

    public Curso(String titulo, String descricao, int cargaHorario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHorario = cargaHorario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHorario == curso.cargaHorario && Objects.equals(titulo, curso.titulo) && Objects.equals(descricao, curso.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHorario);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }
}
