package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Repository
public class InMemoryBrandRepository implements IBrandRepository {

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands=new ArrayList<>();
		brands.add(new Brand(1,"Bmw"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Reno"));

	}

	public List<Brand> getall() {
		
		return brands;
	}

}
