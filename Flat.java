import java.util.concurrent.TimeUnit;

public class Flat {

    Corridor corridor = new Corridor();
    Kitchen kitchen = new Kitchen();
    private Badroom badroom = new Badroom();
    private BigRoom bigRoom = new BigRoom();
    private Key key = new Key();
    private Door door1 = new Door(key.a, Lock.lock, this);

    private boolean light_on;
    boolean electro_on;
    private String name = "Flat 56";
    private int count_enter = 0;
    private int count_exit = 0;

    public static void main(String[] args) throws InterruptedException {
        Flat flat56 = new Flat();
        //Crossover Tesla = new Crossover();
        Garage garage = new Garage();

        System.out.println(flat56.name);

        boolean state = flat56.door1.state;
        while (!state) {
            System.out.println("Wrong key");
            for (int i = 4; i >= 0; i--) {
                if (i == 0) {
                    for (int c = 0; c < 3; c++) {
                        for (int i1 = 1; i1 < 5; i1++) {
                            System.out.print(".");
                            TimeUnit.MILLISECONDS.sleep(200);
                        }
                        for (int b = 1; b < 5; b++) {
                            System.out.print("\b");
                            TimeUnit.MILLISECONDS.sleep(200);
                        }
                    }
                    int t = 100;
                    System.out.println("Wait for " + t + " sec and try again");
                    for (; t > 0; t--) {
                        System.out.println("Left " + t + " seconds");
                        TimeUnit.SECONDS.sleep(1);
                    }
                    i = 5;
                }
                System.out.println("Left " + i + " tries");
                flat56.key = new Key();
                flat56.door1 = new Door(flat56.key.a, Lock.lock, flat56);
                state = flat56.door1.state;

                if (state) {
                    break;
                }
            }
        }
        flat56.Counter(1, 0);
        flat56.door1.chkDoor();
        flat56.corridor.setLite(true);
        System.out.println(getLite(flat56.corridor.name, flat56.corridor.light_on));
        flat56.door1.exit();
        flat56.corridor.setLite(false);
        flat56.setLiteAll(false);
        flat56.Counter(0, 1);
        System.out.println(flat56.info());
garage.Drive();



    }

    private void setLiteAll(boolean light_on) {
        this.light_on = light_on;
        //this.getClass().getDeclaredFields()_reflex!!!

    }

    private static String getLite(String w, boolean isLight_on) { //static?
        String where = w;

        if (isLight_on) {
            return "Light in " + where + " - ON";
        } else {
            return "Light in " + where + " - OFF";
        }
    }

    private String info() {

        String s = "Было " + count_enter + " входов и " + count_exit + " выходов" + "\n";
        String s1 = getLite(corridor.name, corridor.light_on) + "\n";
        String s2 = getLite(bigRoom.name, bigRoom.light_on) + "\n";
        String s3 = getLite(badroom.name, badroom.light_on) + "\n";
        String s4 = getLite(kitchen.name, badroom.light_on) + "\n";
        String s5 = bigRoom.name + " -- " + bigRoom.TV + ", " + bigRoom.size + " size, "
                + " window open: " + bigRoom.isWindowOpen + " , " + bigRoom.chars + " " + " (chars), " +
                bigRoom.sofa + " (sofa) " + "\n";
        door1.chkDoor();
        return s + s1 + s2 + s3 + s4 + s5;
    }

    private void Counter(int enter, int exit) {

        count_enter = count_enter + enter;
        count_exit = count_exit + exit;


    }


}
