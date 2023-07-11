package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private IProductDao productDao;
    private ILogger[] loggers;

    public ProductManager(IProductDao productDao,ILogger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olmaz");
        }


        productDao.add(product);

        for (ILogger logger:loggers){
            logger.log(product.getName());
        }
    }
}
