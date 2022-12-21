public class Duck extends Animal implements Flyable {
    @Override
    public String sound() {
        return "quack";
    }
    public void dive() {
        System.out.println("Boong+ jom+");
    }
    public void fly() {
        System.out.println("pb pb");
    }

    @Override
    public void glide() {
        System.out.println("fewwww");
    }

    public void clean(Animal animal) {
        System.out.println(this.toString() + " is cleaning " + animal.toString());
    }

}
