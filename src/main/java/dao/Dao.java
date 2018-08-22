package dao;

import Entyti.Product;

import java.util.List;

public interface Dao {
    public int insert(Product product) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    public List<Product> selectByCatalog(String catalogName);
}
