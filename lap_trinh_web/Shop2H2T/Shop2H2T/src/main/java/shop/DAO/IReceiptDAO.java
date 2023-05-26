package shop.DAO;

import java.util.List;

import shop.Models.CartModel;
import shop.Models.ReceiptModel;

public interface IReceiptDAO {
	List<ReceiptModel> findAllOfCheckOutedCarts(List<CartModel> checkOutedCartsOfUser);
	void insertReceipt(ReceiptModel receipt);
}
