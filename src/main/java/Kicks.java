public class Kicks {
    static void hobbitKick(Character c){
        System.out.println("Cryyy::::::::");
    }
    static void elfKick(Character hero, Character enemy) {
        if (enemy.getPower()<hero.getPower()){
            enemy.setHp(0);
            return;
        }
        hero.setPower(hero.getPower()+1);
    }
    static void nobleKick(Character hero, Character enemy){
        enemy.setHp(enemy.getHp()-hero.getPower());
    }
}
