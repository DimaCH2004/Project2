package Data;

public class User {
    private final String
            firstName = "Dima",
            lastName = "Chubinidze",
            phone = "555555555",
            email = "dima@gmail.com",
            date = "03/24/2004",
            password = "password123";
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public String getPassword() {
        return password;
    }
}