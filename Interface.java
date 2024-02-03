interface Flying
{
    public abstract void fly();

}
class Birds implements Flying{
    public void fly() {
        System.out.println("It's a bird");
    }
}
class Airplane implements Flying{
    public void fly() {
        System.out.println("It's a airplane");
    }
}


public class Interface {
    public static void main(String[] args) {
        Birds bird= new Birds();
        bird.fly();
        Airplane airplane= new Airplane();
        airplane.fly();
    }

    }
