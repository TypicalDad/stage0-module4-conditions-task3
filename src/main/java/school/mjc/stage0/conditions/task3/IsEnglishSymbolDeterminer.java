package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int oneMore = (int) symbol;
        if(oneMore>40 && oneMore <123){
            System.out.println("English");
        }
        else{
            System.out.println("Non English");
        }
    }
}
