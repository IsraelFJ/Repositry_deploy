package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tab_jogadores")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Nome é obrigatório.")
    private String idade;

    @NotBlank(message = "Nome é obrigatório.")
    private String altura;

    @NotBlank(message = "Nome é obrigatório.")
    private String peso;

    @NotBlank(message = "Nome é obrigatório.")
    private String posicao;

    @NotBlank(message = "Nome é obrigatório.")
    private String numeroDaCamisa;

    public Jogador() {
    }

    public Jogador(Long id, Sexo sexo, String nome, String idade, String altura, String peso, String posicao, String numeroDaCamisa) {
        this.id = id;
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "Nome é obrigatório.") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "Nome é obrigatório.") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "Nome é obrigatório.") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "Nome é obrigatório.") String posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(@NotBlank(message = "Nome é obrigatório.") String numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", sexo=" + sexo +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numeroDaCamisa='" + numeroDaCamisa + '\'' +
                '}';
    }
}
