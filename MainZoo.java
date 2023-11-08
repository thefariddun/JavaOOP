package academy.zoo;

public class MainZoo {
    public static void main(String[] args) {
        String hello = "Hello Backend"; // A

        hello += " Double Hello"; // B

        StringBuilder builder = new StringBuilder("Hello Backend");

        int x = 10;
        while (x-- > 0) {
            hello += 'A';

            builder.append('A');
        }

        System.out.println(builder.toString());

//        Animal animal = new Animal("some animal", "small", 10);
//        System.out.println(animal);
//        animal.move();
//        animal.makeNoise();
//
//        Dog dog = new Dog(10, "Larbador");
//        System.out.println(dog);
//        dog.move();
//        dog.makeNoise();
//
//        Dog wolf = new Dog(10, "Wolf");
//        System.out.println(wolf);
//        wolf.move();
//        wolf.makeNoise();
    }
}
