package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        float newNumber = (float) number;
        if(number == 0){
            System.out.println("cannot divide by zero");
        }
        else if((number / 5) == (newNumber / 5)  && (number / 11) == (newNumber / 11)){
            System.out.println("Dividable");
        }
        else if((number / 5) != (newNumber / 5)  || (number / 11) != (newNumber / 11)){
            System.out.println("Non-dividable");
        }
    }
}
