public class MainProgram {
    public static void main(String args[]){
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        dog1.setName( "Rax");
        //dog1.eat();
        //dog1.sound();
        System.out.println( dog1.eat());
        System.out.println(dog1.sound());
        cat.setName( "Stormy");
        //cat.eat();
        //cat.sound();
        System.out.println(cat.eat());
        System.out.println(cat.sound());

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.adoptPet(dog2);


        System.out.println("-------------------------");
        home.adoptPet(cat);
        home.makeAllSounds();



    }
}
