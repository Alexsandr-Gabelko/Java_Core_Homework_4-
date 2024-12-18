import data.Buyer;
import data.Order;
import data.Product;
import exception.AmountException;
import exception.CustomerException;
import exception.ProductException;

public interface CreateOrder {


    static Order createOrder(Buyer[] buyers, Product[] products, Buyer buyer, Product product, int quantity)
            throws AmountException, CustomerException, ProductException {

        // Проверка покупателя
        boolean validBuyer = false;
        for (Buyer e : buyers)
        {
            if (buyer.equals(e))
            {
                validBuyer = true;
                break;
            }
        }
        if (!validBuyer) {
            //System.out.println(buyer);
            throw new CustomerException("Такого покупателя не существует");
        }

        // Проверка продукта
        boolean validProduct = false;
        for (Product e : products)
        {
            if (product.equals(e))
            {
                validProduct = true;
                break;
            }
        }
        if (!validProduct) {
          //  System.out.println(product);
            throw new ProductException("Такого продукта не существует");
        }

        // Проверка количества
        if (quantity <= 0 || quantity > 100) {
            throw new AmountException("Неверное количество товара");
        }

        // Создание заказа
        return new Order(buyer, product, quantity);
    }
}