package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month>= 0 && month <3){
            System.out.println("Winter");
        }
        else if(month >= 3 && month <6){
            System.out.println("Spring");
        }
        else if(month>= 6 && month <10){
            System.out.println("Summer");
        }
        else if(month>= 10 && month <13){
            System.out.println("Autumn");
        }
        else{
            System.out.println("wrong number!");
        }

    }
}
