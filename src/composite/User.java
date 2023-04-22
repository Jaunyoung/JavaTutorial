package composite;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String name;
    private int birthyear;

    public User(String email, String name, int birthyear) {
        this.email = email;
        this.name = name;
        this.birthyear = birthyear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthyear=" + birthyear +
                '}';
    }
}
