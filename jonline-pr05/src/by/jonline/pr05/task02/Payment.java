package by.jonline.pr05.task02;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private String checkName;
	private List<Product> listOfProducts;

	{
		checkName = "Default Name";
		listOfProducts = new ArrayList<Product>();
	}

	public Payment() {

	}

	public Payment(String checkName) {
		this.checkName = checkName;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public boolean addProduct(Product product) {
		return listOfProducts.add(product);
	}

	public boolean removeProduct(Product product) {
		return listOfProducts.remove(product);
	}

	public static class Product {

		private String name;
		private double cost;

		public Product() {

		}

		public Product(String name, double cost) {
			this.name = name;
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(cost);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [name = " + name + ", cost = " + cost + "]";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkName == null) ? 0 : checkName.hashCode());
		result = prime * result + ((listOfProducts == null) ? 0 : listOfProducts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (checkName == null) {
			if (other.checkName != null)
				return false;
		} else if (!checkName.equals(other.checkName))
			return false;
		if (listOfProducts == null) {
			if (other.listOfProducts != null)
				return false;
		} else if (!listOfProducts.equals(other.listOfProducts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [checkName = " + checkName + ", listOfProducts = " + listOfProducts + "]";
	}

}