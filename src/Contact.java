import java.util.Objects;

public class Contact {
    protected String name;
    protected int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " >>> " + number;
    }

    @Override
    public boolean equals(Object obj) {
        Contact o = (Contact) obj;
        return name.equals(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    public int getNumber() {
        return number;
    }
}
