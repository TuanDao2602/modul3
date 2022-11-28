package ra.model.dao;

import java.util.List;

public interface ProductDao <T,V> extends AppDao<T,V>{
    List<T> searchByName(String name);
    boolean  updateProductStatus(int id);
}
