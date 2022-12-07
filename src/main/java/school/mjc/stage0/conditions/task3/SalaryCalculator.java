package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float newSalary = (int) salary;
        if(salary <= 10000){
            newSalary = salary - ((salary * 15)/100);
            System.out.println(newSalary);
        }
        else if(salary >= 10000 && salary <= 20000){
            newSalary = salary - ((salary * 18)/100);
            System.out.println(newSalary);
        }
        else if( salary >= 20000){
            newSalary = salary - ((salary * 20)/100);
            System.out.println(newSalary);
        }
        else{
            System.out.println("wrong input!");
        }
    }
}
