package by.jonline.pr05.task02;

import by.jonline.pr05.task02.Payment.Product;

public class PaymentActivity {

	public double getTotalAmount(Payment payment) {
		double sum = 0;
		if (payment != null) {
			for (Product product : payment.getListOfProducts()) {
				sum += product.getCost();
			}
		}
		return sum;
	}
}