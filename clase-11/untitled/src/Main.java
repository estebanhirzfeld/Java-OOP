import javax.swing.*;
import java.util.Arrays;

public class Main {

//    public static void getProduct (String[][] products, int productId){
//        int result = getProductIndex(products, productId);
//        if(result == -1){
//            JOptionPane.showMessageDialog(null, "Product not Found");
//        } else {
//            JOptionPane.showMessageDialog(null, "Product: " + products[result][0]);
//        }
//    }

    public static int getProductIndex(String[][] products, int productId){
        int productIndex = -1;
        for (int i = 0; i < products.length; i++){
            if (Integer.parseInt(products[i][3]) == productId){
                productIndex = i;
            }
        }
        return productIndex;
    }

//    public static void updateProductQty (String[] product, int qty){
//        qty = Math.abs(qty);
//        if(qty > Integer.parseInt(product[2])){
//            JOptionPane.showMessageDialog(null, "Qty amount cannot be higher than product stock");
//        } else {
//                product[2] = Integer.toString(Integer.parseInt(product[2]) - qty);
//            }
//        }

    public static void addToCart(String[][] products, String[][] cart, int cartIndex, int productId, int qty){
        int productIndex = getProductIndex(products, productId);
        if(productIndex == -1){
            JOptionPane.showMessageDialog(null, "Product not Found");
        } else {
            qty = Math.abs(qty);
            int productQty = Integer.parseInt(products[productIndex][2]);
            if(qty > productQty){
                JOptionPane.showMessageDialog(null, "Qty amount cannot be higher than product stock");
            } else {
                products[productIndex][2] = Integer.toString(Integer.parseInt(products[productIndex][2]) - qty);
                cart[cartIndex++] = products[productIndex];
                JOptionPane.showMessageDialog(null, "Product: " + products[productIndex][0] + " Added to Cart");
            }
        }

    }

    public static void main(String[] args) {

        String[][] products = {
                {"Product 1", "10", "4", "0"},
                {"Product 2", "20", "6", "1"},
                {"Product 3", "30", "8", "2"}
        };

        String[][] cart = new String[10][3];
        int cartIndex = 0;
        int userInput;

        userInput = Integer.parseInt(JOptionPane.showInputDialog("Insert product Id"));
        int qty = Integer.parseInt(JOptionPane.showInputDialog("Insert qty for your cart"));

        addToCart(products, cart, cartIndex, userInput, qty);

        System.out.println("Products: \n");
        System.out.println(Arrays.toString(products[userInput]));

        System.out.println("Cart: \n");
        System.out.println(Arrays.toString(cart[0]));

    }


}