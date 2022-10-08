import java.lang.ref.Reference;
import java.util.Random;

public class CharacterFactory {
    Character createCharacter(){
        String[] season={"a", "s","d"};
        Character[] lst={new Elf(), new  Hobbit(), new Knight(), new King()};
        Random r=new Random();
        int el=r.nextInt(3);
        return lst[el];
    }
}
