import java.util.Scanner;

public class Door {
    private Flat flat56;
    private Corridor corridor;
    private Kitchen kitchen;

    boolean state;


    public Door(int key, int lock, Flat flat) {
        this.flat56 = flat;
        state = Open_door(key, lock);
    }

    public boolean Open_door(int key, int lock) {
        boolean state = false;




        if (key == lock) {
            state = true;
            flat56.corridor.light_on=true; //NULL POINT
        } else {

            state = false;
        }


        return state;

    }

    public void exit() {
        System.out.println("Want to exit? (Type exit)");
        Scanner scEx = new Scanner(System.in);
        String out = scEx.nextLine();
        if (out.equals("exit")) {
            state = false;
            System.out.println("By!");
            chkDoor();

            // flat56.kitchen.oven.oven_on = false; //NULL POINT
        }

    }

    public void chkDoor() {
        if (state) {
            System.out.println("Door is open");
        } else {
            System.out.println("Door is closed");
        }
    }

}