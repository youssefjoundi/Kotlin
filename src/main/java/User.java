

public class User {
    private String name;

    public User(String name) {

        this.name = name;
    }

    public void create(created Created) {
        Created.onCreate(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
