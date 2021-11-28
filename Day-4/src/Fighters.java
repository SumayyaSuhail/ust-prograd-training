public class Fighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean fighter1Turn=false;
        if(firstAttacker==fighter1.name){
            fighter1Turn=true;
        }
        while (fighter1.health > 0 && fighter2.health > 0) {
            if(fighter1Turn) {
                fighter2.health -= fighter1.damagePerAttack;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
            }
            fighter1Turn = !fighter1Turn;
        }
        if(fighter1.health<=0)
            return fighter2.name;
        else
            return fighter1.name;
    }
}
class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
