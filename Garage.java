import java.util.Scanner;

public class Garage {
    Crossover Tesla = new Crossover("Tesla", "X", "Blue", 320);
    Crossover Lada = new Crossover("Lada", "1109", "Red", 150);

    public void GarageInfo(){
        System.out.println();
    }

    public void Drive() {
        System.out.println("Want to drive? (Type yes or just Y)");
        Scanner scEx = new Scanner(System.in);
        String drive = scEx.nextLine();
        if (drive.equals("yes") || drive.equals("Y")) {

            System.out.println("Choose your car (Lada or Tesla)");

            String choose = scEx.nextLine();
            if (choose.equals("Lada")) {
                Lada.gas();
                System.out.println("Hrrrr.....");
                System.out.println("Trrrr......");
                Lada.brake();
                System.out.println("Car is damaged! Sorry.....");

            } else if (choose.equals("Tesla")) {
                Tesla.gas();
                Tesla.brake();
                System.out.println("You are finished!!");
                Drive();

            }


        }
    }
}