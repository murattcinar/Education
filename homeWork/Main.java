package homeWork;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V15",15000,"16 GB Ram");

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenova V16";
		product2.unitPrice = 14000;
		product2.detail = "15 GB Ram";
		
		
		Product[] products = {product1, product2};
		
		for (Product product : products) {
			
			System.out.print(product.name);
			System.out.print(product.id);
			System.out.print(product.unitPrice);
			System.out.print(product.detail);
			System.out.println();
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);

	}
}
