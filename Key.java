import java.util.Scanner;

public class Key {
     int a=getKey();
    public static int getKey() {
        Scanner sc = new Scanner(System.in);

        int code=0;
        System.out.println("Welcome to our sweet house");
        System.out.println("Input code for enter");

        if (sc.hasNextInt()) {
            code = sc.nextInt();
        }
        if (String.valueOf(code).length() > 7) {

            System.out.println("Code is incorrect");
            getKey();
        }

        return code;

    }

}


