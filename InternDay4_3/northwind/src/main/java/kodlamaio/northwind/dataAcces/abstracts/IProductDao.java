package kodlamaio.northwind.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.Product;

public interface IProductDao extends JpaRepository<Product, Integer> {

}
