package actionet;

/**
 *
 * @author calebfrost
 */
public class ForLoops {

    //original
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    

    //updated
        //n is the length
        int n = 5;

        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            //two strings
            //dots to start
            String dots = new String(new char[n - i]).replace("\0", ".");
            //2nd string used to grow + replace
            String digit = new String(new char[i]).replace("\0", number);
            //pieced together
            String output = dots + digit;
            //print
            System.out.print(output);
            System.out.println();
        }
    }

}
