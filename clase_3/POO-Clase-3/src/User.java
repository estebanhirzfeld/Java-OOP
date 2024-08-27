public class User {
    public String username;
    public String email;
    public String password;

    public boolean validatePassword(String password){
        boolean validPassword = true;
        // Flags
        boolean contains_eight = false;
        boolean contains_upper = false;
        boolean contains_lower = false;
        boolean contains_number = false;

        if (password.length() > 8 ) {
            contains_eight = true;
        }

        for (int i = 0; i < password.length(); i++){
            char letter = password.charAt(i);

            if(Character.isUpperCase(letter)){
                contains_upper = true;
            }
            if(Character.isLowerCase(letter)){
                contains_lower = true;
            }
            if(Character.isDigit(letter)){
                contains_number = true;
            }
        }
        if(!contains_eight){
            validPassword = false;
            System.out.println("Min 8 Characters");
        }
        if(!contains_upper){
            validPassword = false;
            System.out.println("UpperCase Character Missing");
        }
        if(!contains_lower){
            validPassword = false;
            System.out.println("LowerCase Character Missing");
        }
        if(!contains_number){
            validPassword = false;
            System.out.println("Number Character Missing");
        }
        return validPassword;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void changePassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
            System.out.println("New Password Set");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
