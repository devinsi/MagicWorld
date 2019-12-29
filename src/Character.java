public class Character {
    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public  Character(int level, int life, int strength, int agility, int intelligence){
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }
}
