package shop.DAO;

import java.util.List;
import shop.Models.ProductModel;


public interface IProductDAO {
	List<ProductModel> findAll();
	ProductModel find(int productId);
	List<ProductModel> findByCategory(int categoryId);
	
	void insertProduct(ProductModel product);
	void deleteProduct(int productId);
	void editProduct(ProductModel product);
	
	List<ProductModel> findAllBySellerId(int sellerId);
	int findProductId(ProductModel product);
}
