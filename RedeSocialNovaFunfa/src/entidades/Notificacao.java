package entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="NOTI_SEQ", sequenceName="NOTIFICACAO_SEQ", allocationSize=1)
public class Notificacao
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NOTI_SEQ")
	private int id;
	private Date dataEnvio;
	private String remetente;
	private String destinatario;
	@OneToOne
	private Usuario usuario;


	public Usuario getUsuario(){
	
		return usuario;
	}

	public void setUsuario(Usuario usuario) { 
		this.usuario = usuario; 
	}
	public int getId(){
	
		return id;
	}

	public void setId(int id) { 
		this.id = id; 
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) { 
		this.dataEnvio = dataEnvio; 
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) { 
		this.remetente = remetente; 
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) { 
		this.destinatario = destinatario; 
	}
}