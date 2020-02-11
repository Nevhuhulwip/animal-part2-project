public class Animal {
    private String name;

    public Animal() {

    }

    public  String sound() {
        System.out.println("Barks");
        System.out.println("Meows");
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   //public void eat(){
   //     System.out.println(name + " eat");
   // }

    public String eat() {
        return "Food";

    }

}
