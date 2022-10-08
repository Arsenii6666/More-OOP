public class Hobbit extends Character {
    Hobbit(){
        setPower(0);
        setHp(3);
    }
    int hp=3;
    int power=0;
    @Override
    public void kick(Character c) {Kicks.hobbitKick(c);}
}
