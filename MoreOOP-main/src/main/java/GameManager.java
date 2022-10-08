import sun.reflect.ReflectionFactory;

public class GameManager {
    public static void main(String[] args) {
        GameManager gm=new GameManager();
        CharacterFactory factory=new CharacterFactory();
        gm.fight(factory.createCharacter(), factory.createCharacter());
    }
    void fight(Character c1, Character c2) {
        System.out.println("Fight between to characters\n"+"Ch1: "+c1+"\nCh2: "+c2+"\n");
        while (true){
            c1.kick(c2);
            System.out.println("Ch1 "+c1+" kick Ch2 "+c2+"\n");
            if (!c2.isAlive()){
                System.out.println("Ch1 "+c1+" win.");
                return;
            }
            c2.kick(c1);
            System.out.println("Ch2 "+c2+" kick Ch1 "+c1+"\n");
            if (!c1.isAlive()){
                System.out.println("Ch2 "+c2+" win.");
                return;
            }
        }
    }
}
