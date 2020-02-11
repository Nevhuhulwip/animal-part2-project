import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Cat cat = new Cat();
    Dog dog = new Dog();

    @Test
    public void TestDogSound(){
        Assert.assertEquals(dog.sound(), "Barks");
    }
    @Test
    public void TestDogEat(){
        Assert.assertEquals(cat.eat(),  "Food" );
    }
     @Test
     public void TestCatSound(){
        Assert.assertEquals(cat.sound(),  "Meows" );
     }

    @Test
    public void TestCatEat(){
        Assert.assertEquals(cat.eat(),  "Food" );
    }
    @Test
    public void TestgetName(){
        Cat cat = new Cat();
        cat.setName("Rax");
        Dog dog = new Dog();
        dog.setName("Stormy");
        Assert.assertEquals(cat.getName(),  "Rax" );
        Assert.assertEquals(dog.getName(),  "Stormy" );
    }

}
