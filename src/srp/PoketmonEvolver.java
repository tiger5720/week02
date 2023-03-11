package srp;

public class PoketmonEvolver {
    public void evolve(Poketmon poketmon)
    {
        poketmon.setLevel(poketmon.getLevel()+1);
        //level++;
        System.out.println("레벨 up!");
    }
}
