public class Animal {
    private String name;

    public Animal() {

    }

    public void sound() {
        System.out.println("Barks");
        System.out.println("Meows");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String eat() {
        return "Food";

    }

}
