package by.jonline.pr05.task02;

import by.jonline.pr05.task02.Payment.Product;

/* Создать класс Payment с внутренним классом, с помощью объектов которого
 * можно сформировать покупку из нескольких товаров.
 */

public class Task02 {

	public static void main(String[] args) {

		Payment payment = new Payment("Test");
		PaymentActivity paymentActivity = new PaymentActivity();
		payment.addProduct(new Product("First", 10.5));
		payment.addProduct(new Product("Second", 5.9));
		payment.addProduct(new Product("Third", 4.8));
		payment.addProduct(new Product("Fourth", 1.5));
		System.out.println(paymentActivity.getTotalAmount(payment));

	}

}