package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;



@Table(name="Brands")
@Getter
/*
 * @Getter
 * @Setter
 * @AllArgsConstructor
 * @*/
@Entity
public class Brand {
	
	private int id;
	private String name;
	
	
	/*public Brand() {
		super();
	}

	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	*/
	

}
