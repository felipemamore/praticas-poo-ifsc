package diagrama;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	private Integer nrRegistro;
	private LocalDate dataContratacao;
	
	public Funcionario(String nome, LocalDate dataNasc, String email, Integer nrRegistro, LocalDate dataContratacao) {
		super.setNome(nome);
		super.setDataNasc(dataNasc);
		super.setEmail(email);
		this.nrRegistro = nrRegistro;
		this.dataContratacao = dataContratacao;
	}
	
	
	public Integer getNrRegistro() {
		return nrRegistro;
	}

	public void setNrRegistro(Integer nrRegistro) {
		this.nrRegistro = nrRegistro;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public void pedirDemissao() {
		
	}
	
	public void serContratado() {
		
	}

}
