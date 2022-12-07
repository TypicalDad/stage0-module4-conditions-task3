package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int newCharacter = (int) character;
        if(newCharacter>64 && newCharacter <123){
            if(newCharacter ==65 ||newCharacter ==69|| newCharacter ==73|| newCharacter ==79|| newCharacter ==85|| newCharacter ==89 ||newCharacter ==97 ||newCharacter ==101 ||newCharacter ==105|| newCharacter ==111 ||newCharacter ==117|| newCharacter ==121){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("wrong alphabet! ");
        }
    }
}
