package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.IProductService;
import kodlamaio.northwind.dataAcces.abstracts.IProductDao;
import kodlamaio.northwind.entity.concretes.Product;

@Service
public class ProductManager implements IProductService {

	
	private IProductDao productDao;
	
	@Autowired
	public ProductManager(IProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
//7.gün
