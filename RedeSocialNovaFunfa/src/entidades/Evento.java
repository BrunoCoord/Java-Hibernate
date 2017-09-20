package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="EV_SEQ", sequenceName="EVENTO_SEQ", allocationSize=1)
public class Evento {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EV_SEQ")
	private int id;
	private String local;
	private Date data;

	public int getId(){
	
		return id;
	}

	public void setId(int id) { 
			this.id = id; 
	}
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) { 

		this.local = local; 
	}
	public Date getData() {
		return data;
	}

	public void setData(Date data) { 
		this.data = data; 

	}
}

