package pattern;

public class triangle {

    public static void pattern2(int n){

        int i, j;


        for ( i = 0; i <= n; i++) {
            for (j = 0; j <= n-1 ; j++) {
                System.out.print(" ");

            }
            for ( j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }

    }


    public static void main(String[] args) {

        int n = 6;
        pattern2(n);
    }
}
