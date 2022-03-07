package one.digitalinnovation.gof.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenenationType.AUTO);
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
