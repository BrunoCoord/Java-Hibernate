package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="FD_SEQ", sequenceName="FEED_SEQ", allocationSize=1)
public class Feed
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FD_SEQ")
	private int id;
	private Date dataPostagem;
	private int numeroCompartilhamentos;

	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id; 
	}
	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) { 
		this.dataPostagem = dataPostagem; 
	}
	public int getNumeroCompartilhamentos() {
		return numeroCompartilhamentos;
	}

	public void setNumeroCompartilhamentos(int numeroCompartilhamentos) { 
		this.numeroCompartilhamentos = numeroCompartilhamentos; 
	}
}