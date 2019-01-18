package Model;

import java.sql.Date;
import java.util.Objects;

public class FichaAvaliacao {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String diagnostico;
    private String dataConsulta;


    public FichaAvaliacao(String nome, String cpf, int idade, String sexo, String diagnostico, String dataConsulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
        this.dataConsulta = dataConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getData() {
        return dataConsulta;
    }

    public void setData(String data) {
        this.dataConsulta = dataConsulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FichaAvaliacao that = (FichaAvaliacao) o;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "FichaAvaliacao[ Nome: " + nome + " Sexo: " + sexo + "Diagnostico Clinico: " + diagnostico;
    }
}
