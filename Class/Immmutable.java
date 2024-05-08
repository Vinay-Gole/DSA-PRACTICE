// #Make the class to final so that  the subclass can't extend it and make changes to  the class

// # Make the variables of class is private and final

// #There should not be any setter methods in the class


class Engine {
    int speed;

    public Engine(int speed) {
        this.speed = speed;
    }
}

public final class Immmutable {

    private final int id;
    private final String name;
    private final Engine engine;

    public Immmutable(int i, String name, Engine e) {
        this.id = i;
        this.name = name;

        Engine newEngine = new Engine(e.speed);
        this.engine = newEngine;
    }

    public int getId(int id) {
        return id;

    }

    public int getName(int name) {
        return name;
    }

    public static void main(String[] args) {
        Engine e = new Engine(80);
        Immmutable ob = new Immmutable(1, "vinay", e);
        e.speed = 90;
        int id = ob.id;
        String name = ob.name;
        // ob.id=40;
        // ob.name="Simran"; can't change because it declared to private and final

        System.out.println("All the information will be printed here:");
        System.out.println(ob.engine.speed + "| " + id + " |" + name);

    }
}