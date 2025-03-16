package pattern;

public class SquareStar {


    public static void pattern1(int n){

        int i, j;
     //rows
        for(i=0; i<n; i++){
        //column
            for(j=0; j<n;j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

        }
    }




    public static void main(String[] args) {
    int n=6;
    pattern1(n);

    }

}
