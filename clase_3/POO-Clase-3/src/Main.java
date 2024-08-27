
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    User tony = new User("tony", "tony@montana.com","password123456");

    tony.changePassword("newPassword12354");

    Movie scarface = new Movie("Scarface");

        System.out.println("movie:" + scarface.name);
        System.out.println("rate:" + scarface.getRate());

        scarface.setRate(5.0);

        System.out.println("rate:" + scarface.getRate());

    }
}