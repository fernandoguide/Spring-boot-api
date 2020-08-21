package br.com.fernando.api.k2partnering.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    private String nome;
    private String email;
    @JsonIgnore
    private String senha;

    private String rua;
    private String cidade;
    private String bairro;
    private String cep;
    private String estado;

    public Clientes(Integer id, String nome , String email ) {
        this.id = id;
        this.nome =nome;
        this.email = email;
    }

    public Clientes() {
    }
}