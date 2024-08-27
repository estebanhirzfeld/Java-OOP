public class Character {
    String name;
    int lives;
    String[] powers = new String[3];

    public Character(String name, int lives, String[] powers) {
        this.name = name;
        this.lives = lives;
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
