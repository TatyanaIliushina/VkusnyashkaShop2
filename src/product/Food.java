package product;

import product.Product;

public abstract class Food extends Product { // абстрактный класс еда наследуемый от продукта
        public Food(String name, int price, String status, double date, int barCode, double expirationDate) {
            super(name, price, status, date, barCode, expirationDate);
        }

        public void checkExpirationDate() { // единственный метод отличающийся от не продуктов
        }


    }

