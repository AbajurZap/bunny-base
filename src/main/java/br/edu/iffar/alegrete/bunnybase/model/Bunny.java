package br.edu.iffar.alegrete.bunnybase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coelho")
public class Bunny {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int idade;
    private int raca;
    private int tipo;
    private int sexo;
    private int reprodutor;
    private int matriz;

    public Bunny() {
    }

    public Bunny(Long id, String name, int idade, int raca, int tipo, int sexo, int reprodutor, int matriz) {
    this.id = id;
    this.name = name;
    this.idade = idade;
    this.raca = raca;
    this.tipo = tipo;
    this.sexo = sexo;
    this.reprodutor = reprodutor;
    this.matriz = matriz;
}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public int getRaca() {
        return raca;
    }

    public int getTipo() {
        return tipo;
    }

    public int getSexo() {
        return sexo;
    }

    public int getReprodutor() {
        return reprodutor;
    }

    public int getMatriz() {
        return matriz;
    }
}