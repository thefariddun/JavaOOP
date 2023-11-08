package academy.zoo;

public class Dog extends Animal {
    private String zoti = null;
    private final String tailType;

    public Dog() {
        super("some dog", "small", 1);
        this.tailType = "none";
    }

    public Dog(int weight, String zoti) {
        super(zoti == "Wolf" ? "Wolf" : "Dog", weight < 2 ? "Small" : weight < 5 ? "Medium" : "Large", weight);
        this.zoti = zoti;
        this.tailType = "Curved";
    }

    @Override
    public void move() {
        switch (zoti) {
            case "Larbador" -> System.out.println(zoti + " is running");
            case "Chixuaxua" -> System.out.println(zoti + " is just sitting");
            default -> System.out.println(zoti + " is walking");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") auf();
        else bark();
    }

    private void bark() {
        System.out.println(zoti + " dog barking");
    }

    private void auf() {
        System.out.println("Auf");
    }

    public String getZoti() {
        return zoti;
    }

    public void setZoti(String zoti) {
        this.zoti = zoti;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "zoti='" + zoti + '\'' +
                "} " + super.toString();
    }
}
