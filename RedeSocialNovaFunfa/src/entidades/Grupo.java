package entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="GP_SEQ", sequenceName="GRUPO_SEQ", allocationSize=1)
@Table(name="GRUPO")
public class Grupo
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GP_SEQ")
	@Column(name="GRUPO_ID")
	private int id;
	private Date dataCriacao;
	private String nome;


	
	@ManyToMany(mappedBy="grupo")
	private Set<Usuario> usuarios = new HashSet<Usuario>();

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) { 
		this.usuarios = usuarios; 
	}
	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id; 
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { 
		this.nome = nome; 
	}
}