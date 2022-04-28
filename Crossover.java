import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Crossover extends Vechicle {
    String type = "Crossover";
    String model;
    String name;
    String color;
    int mass;
    int maxSpeed;
    int accel;
    int convertSpeed;
    String symb;

    public Crossover(String model, String name, String color, int maxSpeed){
        this.color=color;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.name = name;
        convertSpeed();
        if (color.equals("Red")){
            this.symb = "\ud83d\ude97";
        }
        if (color.equals("Blue")){
            this.symb = "\ud83d\ude99";
        }
    }

    public void convertSpeed(){
        if (maxSpeed>=200){
            convertSpeed = 100;
        }
        else if(maxSpeed<200&&maxSpeed>100){
            convertSpeed=350;
        }
        else {
            convertSpeed = 500;
        }
    }

    @Override
    public void gas() {

        System.out.println("Wroom-wroom");

        try {
            for (int c = 0; c < 1; c++) {
                StringBuilder str = new StringBuilder(this.symb);
                for (int i1 = 1; i1 < 60; i1++) {

                    str.insert(0, " ");
                    System.out.print(str);
                    TimeUnit.MILLISECONDS.sleep(convertSpeed);
                    System.out.print("\b\b");
                    str.deleteCharAt(0);
                    TimeUnit.MILLISECONDS.sleep(5);
                    if ( i1 == 30) {
                        System.out.println();
                        System.out.println("Wroom-wroom");
                    }
                }
                /*for (int b = 1; b < 10; b++) {
                    System.out.print("\b");
                    TimeUnit.MILLISECONDS.sleep(200);
                }*/
            }
        } catch (InterruptedException e) {
        }

    }


    @Override
    public void brake() {
        System.out.println("Break!    Whiiiii...");
    }
}
