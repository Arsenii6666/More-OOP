
public class Elf extends Character{
    Elf(){
        setHp(10);
        setPower(10);
    }
    @Override
    public void kick(Character c) {Kicks.elfKick(this, c);}
}
