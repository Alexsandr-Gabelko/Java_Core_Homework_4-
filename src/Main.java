//1. Написать классы покупатель, товар и заказ;
//2. Создать массив покупателей, массив товаров и массив заказов;
//3. Создать статический метод “совершить покупку” со строковыми
// параметрами, соответствующими полям объекта заказа. Метод должен вернуть объект заказа
//4. Если в метод передан несуществующий покупатель, товар или отрицательное количество, метод должен выбросить
//соответствующее исключение;
//5 Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями.
//Обработать исключения.
//6. Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.

//В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол»
//со значением созданного перечисления. Добавить геттеры, сеттеры.
//Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
// написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
// а мужчин с 23 февраля, если сегодня соответствующий день.

import data.Buyer;
import data.Gender;
import data.Order;
import data.Product;
import exception.AmountException;
import exception.CustomerException;
import exception.ProductException;


public class Main {
    public static void main(String[] args)  {
        Buyer buyer_1 = new Buyer("Иванов Иван Иванович", 25, "87017567935", Gender.MALE);
        Buyer buyer_2 = new Buyer("Петров Петр Петрович", 28, "87027567948", Gender.MALE);
        Buyer buyer_3 = new Buyer("Петров Виктор Андреевич", 38, "87057567998", Gender.MALE);
        Buyer buyer_4 = new Buyer("Сидоров Андрей Виктороыич", 45, "87077567955", Gender.MALE);
        Buyer buyer_5 = new Buyer("Савельев Илья Александрович", 54, "87027567948", Gender.MALE);
        Buyer buyer_6 = new Buyer("Савельева Алла Александровна", 50, "87777567942", Gender.FEMALE);
        Buyer buyer_7 = new Buyer("Скворцова Марина Федоровна", 50, "87777567959", Gender.FEMALE);
        Buyer[] buyers = {buyer_1, buyer_2, buyer_3, buyer_4, buyer_5, buyer_6, buyer_7};

        Product product_1 = new Product("Кофе", 30);
        Product product_2 = new Product("Чай", 20);
        Product product_3 = new Product("Чипсы", 15);
        Product product_4 = new Product("Круассан", 55);
        Product product_5 = new Product("Чизкейк", 45);
        Product product_6 = new Product("Тирамису", 65);
        Product[] products = {product_1, product_2, product_3, product_4, product_5, product_6};


        Buyer newBuyer_1 = new Buyer("Иванов Иван Иванович", 25, "87017567935", Gender.MALE);
        Buyer newBuyer_2 = new Buyer("Сидоров Иван Иванович", 45, "87017567935", Gender.MALE);
        Buyer newBuyer_3 = new Buyer("Савельев Илья Александрович", 54, "87027567948", Gender.MALE);
        Buyer newBuyer_4 = new Buyer("Петров Виктор Андреевич", 38, "87057567998", Gender.MALE);
        Buyer newBuyer_5 = new Buyer("Савельева Алла Александровна", 50, "87777567942", Gender.FEMALE);
        Buyer newBuyer_6 = new Buyer("Скворцова Марина Федоровна", 50, "87777567942", Gender.FEMALE);
        Buyer[] newBuyers = {newBuyer_1, newBuyer_2, newBuyer_3, newBuyer_4, newBuyer_5, newBuyer_6 };

        Product newProduct_1 = new Product("Кофе", 30);
        Product newProduct_2 = new Product("Чизкейк", 45);
        Product newProduct_3 = new Product("Пончики", 45);
        Product newProduct_4 = new Product("Чай", 20);
        Product newProduct_5 = new Product("Тирамису", 65);
        Product newProduct_6 = new Product("Круассан", 55);
        Product[] newProducts = {newProduct_1, newProduct_2, newProduct_3, newProduct_4,  newProduct_5, newProduct_6};
        Buyer buyer;
        Product product;
        int [] quantitys = {2, 3, 101, 5, 7, -5};

        for (int i = 0; i <6; i++) {
            buyer = newBuyers[i];
            product = newProducts[i];

            try {
                Order order = CreateOrder.createOrder(buyers, products, buyer, product, quantitys[i]);
                System.out.printf("Заказ создан: %s%n", order);
                System.out.printf("%s заказ оформлен \n", order.getCount());
            } catch (AmountException | CustomerException | ProductException e) {
                System.err.println("Validation error: " + e.getMessage());
            }
        }

        Congratulations.сongratulations(buyers);

    }
}