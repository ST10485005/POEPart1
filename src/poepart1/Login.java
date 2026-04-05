package poepart1;

public class Login {
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String cellPhoneNumber;

    // Constructor
    public Login(String firstName, String lastName, String userName, String password, String cellPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public boolean checkUserName() {
        return userName.contains("_") && userName.length() <= 5;
    }
    public boolean checkPasswordComplexity() {
    boolean hasCapitalLetter = false;
    boolean hasNumber = false;
    boolean hasSpecialCharacter = false;

    // Check length first
    if (password.length() < 8) {
        return false;
    }

    // Loop through each character
    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);

        if (Character.isUpperCase(ch)) {
            hasCapitalLetter = true;
        } else if (Character.isDigit(ch)) {
            hasNumber = true;
        } else if (!Character.isLetterOrDigit(ch)) {
            hasSpecialCharacter = true;
        }
    }

    return hasCapitalLetter && hasNumber && hasSpecialCharacter;
}
}