import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public void doSomething(){
        System.out.println("Hello " + this.name+" who was born on "+this.dob+" !");
    }
    public User(){
        this(null, LocalDate.now().getYear(),LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
//        this.name = null;
//        this.dob = LocalDate.now();
    }
    public User(String _name, int year, int month, int day){
        this.name = _name;
        this.dob = LocalDate.of(year, month, day);
    }
    public String getName(){
        return this.name;
    }
    public LocalDate getDob(){
        return this.dob;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(int year, int month, int day){
        this.dob = LocalDate.of(year, month, day);
    }
    protected final void greet(){
        System.out.println("Hello!");
    }
}
