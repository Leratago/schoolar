package br.com.schoolar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "diretor")
public class Diretor {

    @Id
    private String nome;
    private String datadenascimento;
    private String endereco;
    private String email;
    private String telefone;
    private String departamento;
    private String equipedegestao;
}
