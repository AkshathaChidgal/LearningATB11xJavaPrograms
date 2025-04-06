package ex_13_AccessModifier.Police;

public class Cop {
    private int gun;
    String iCard;

    // Param Con
    public Cop(int bullet){
        this.gun = bullet;
    }

    // Method / Behavior
    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }

}
