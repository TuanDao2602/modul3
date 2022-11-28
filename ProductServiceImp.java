package ra.model.serviceImp;

import ra.model.dao.CatalogDAO;
import ra.model.dao.ProductDao;
import ra.model.daoImp.CatalogDAOImp;
import ra.model.daoImp.ProductDAOImp;
import ra.model.entity.Catalog;
import ra.model.entity.Product;
import ra.model.service.ProductService;

import java.util.List;

public class ProductServiceImp<T,V> implements ProductService<Product,Integer> {
    private ProductDao<Product,String> productDao = new ProductDAOImp<>();
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }
    @Override
    public boolean save(Product product) {
        return productDao.save(product);
    }

    @Override
    public boolean update(Product product) {
        return productDao.update(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productDao.searchByName(name);
    }

    @Override
    public boolean updateProductStatus(int id) {
        return productDao.updateProductStatus(id);
    }


}
