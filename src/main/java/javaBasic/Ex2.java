package javaBasic;

public class Ex2 {
    public static void main(String[] args) {
        ProductOrder first = new ProductOrder();
        ProductOrder second = new ProductOrder();
        ProductOrder third = new ProductOrder();

        ProductOrder [] products = {first, second, third};
        for (ProductOrder product: products){
            System.out.println(product.productName+" "+product.productPrice+" "+product.productQuantity);
        }


    }
}
