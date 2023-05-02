package Objects;

public class User {
    public User() {
    }


    String username;
    String firstName;

    public String getFirstName ( ) {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getZipcode ( ) {
        return zipcode;
    }

    public void setZipcode ( String zipcode ) {
        this.zipcode = zipcode;
    }

    String lastName;
    String zipcode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
