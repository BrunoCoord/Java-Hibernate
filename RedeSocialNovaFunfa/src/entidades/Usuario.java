package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="USU_SEQ", sequenceName="USUARIO_SEQ", allocationSize=1)
@Table(name="USUARIO")
public class Usuario
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USU_SEQ")
	@Column(name="USUARIO_ID")
	private int id;
	private String nome;
	private String email;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="GRUPO_USUARIO", joinColumns={@javax.persistence.JoinColumn(name="GRUPO_ID")}, inverseJoinColumns={@javax.persistence.JoinColumn(name="USUARIO_ID")})
	private Set<Grupo> grupos = new HashSet<Grupo>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
	List<Notificacao> notificacoes = new ArrayList<Notificacao>();

	public Set<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
	 this.grupos = grupos; 
	}
	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id; 
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { 
		this.nome = nome; 
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) { 
		this.email = email; 
	}
}