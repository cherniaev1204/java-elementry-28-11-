package lessons.lesson13.passwordAndUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

    private static final long serialVersionUID = 1L;

    String username;
    String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
        out.writeObject("secured" + password);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.username = (String) in.readObject();
        String password = (String) in.readObject();
        this.password = password.substring(7);
    }
}
