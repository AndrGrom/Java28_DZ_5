package academy.belhard.entity;

public class User extends Person {

    private String email;
    private String password;

    public User(String first, String last, String ema, String pas) {
        super(first, last);
        this.email = ema;
        this.password = pas;
    }

    public String getFullInfo() {
        return "Имя: " + getFullName() + " \n" + "E-mail: " + this.email + " \n";
    }

    public boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }
}
