import lombok.Getter;
import lombok.Setter;

import java.util.Random;
@Setter
@Getter
public abstract class  Noble extends Character {
    @Override
    public void kick(Character c) {Kicks.nobleKick(this, c);}
    private int maxhp;
    private int minhp;
    private int maxpow;
    private int minpow;

    void Generator(){
        Random r=new Random();
        setPower(r.nextInt(maxpow-minpow)+minpow);
        setHp(r.nextInt(maxhp-minhp)+minhp);
    }
}
