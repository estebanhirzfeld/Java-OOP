import javax.swing.*;

public class Password {
    public static void main(String[] args){
        String password = JOptionPane.showInputDialog(null,"Enter Password");

//        Flags
        boolean contains_eight;
        boolean contains_upper;
        boolean contains_lower;
        boolean contains_number;

        if (password.length() < 8 ){
            JOptionPane.showMessageDialog(null, "Bad Password");
        }

        for (int i = 0; i < password.length(); i++){
            String letter = (String) password.charAt(i);

            if((String)letter.isUpperCase){

            }
        }

    }
}
