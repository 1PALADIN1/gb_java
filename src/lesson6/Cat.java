package lesson6;

public class Cat {
    private static int nextID = 1;

    private final int id;
    private final String name;
    private final String owner;
    private final int age;
    private final Color color;

    public Cat(int id, String name, String owner, int age, Color color) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, String owner, int age, Color color) {
        this(nextID, name, owner, age, color);
        nextID++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat otherCat) {
            return this.id == otherCat.id
                    && this.name.equals(otherCat.name)
                    && this.owner.equals(otherCat.owner)
                    && this.age == otherCat.age
                    && this.color == otherCat.color;
        }

        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + name + " [age: " + age + ", color: " + color + ", owner: " + owner + "]";
    }
}
