class Main {
    public static void main(String[] args) {
//        User john = new User("John", 1954, 2, 18);
//        john.doSomething();
//
//        Admin nicolas = new Admin();
//        nicolas.setName("Nicolas");
//        nicolas.setDob(1964, 1, 7);
//        nicolas.doSomething();
//        nicolas.doSomething(3);
//        nicolas.doExtra();
//
//        Admin peter = new Admin();
//        peter.setName("Peter");
//        peter.doExtra();
//        peter.greet("hello");

        Duck donald = new Duck();
        Duck daisy = new PekingDuck();
//        Cow wagyu = new Cow();
//        donald.clean(wagyu);
        donald.clean(daisy);
        daisy.clean(donald);
    }
}
