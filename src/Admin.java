import java.time.LocalDate;

public class Admin extends User{

    public void doSomething() {
        System.out.println("Hello admin "+this.getName()+"!");
    }

    public void doSomething(int n){
        for(int i = 0; i < n; i++){
            super.doSomething();
        }
    }
    public void doExtra(){
        LocalDate date = LocalDate.ofEpochDay(LocalDate.now().getMonthValue());
        if(date.equals(getDob())){
            System.out.println("Happy birthday Admin!");
        }else System.out.println("No");
    }
    public  void greet(String x) {
        System.out.println(x);
    }
}
