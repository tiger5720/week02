package srp;

public class Poketmon {
    private String name;
    private int level;
    private int hp;

    public Poketmon(String name, int level)
    {
        this.name = name;
        this.level = level;
        this.hp = 100;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // SRP 위배
//    public void attack(String opponent){
//        System.out.println(opponent + "를(을) 기본 공격합니다!");
//    }
//    public void evolve(){
//        level++;
//        System.out.println("레벨 up!");
//    }

    // 기능을 추가적으로 넣을 수 있다
}
