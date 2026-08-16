// package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getter
    public String getPassword() {
        return this.password;
    }
    // Setter
    public void setPassword(String pass) {
        this.password = pass;
    }
}

// There are 4 types of Access Modifier:
// 1. public = accessible from anywhere
// 2. private = accessible only within the class
// 3. protected = accessible within the package and outside the package through inheritance only
// 4. default = accessible only within the package

// with the help of getter and setter we can access private stuffs;


public class AccessModifier {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}