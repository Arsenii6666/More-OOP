import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class  Character {
    private int hp;
    private int power;
    public abstract void kick(Character c);
    public boolean isAlive(){
        return this.getHp()>0;
    }

    public void setHp(int num) {
        if (num>=0){
            hp = num;
        }
        else {
            hp=0;
        }
    }

    @Override
    public String toString() {
        return getClass().getName()+"{hp="+getHp()+", power="+getPower()+"}";
    }
}
