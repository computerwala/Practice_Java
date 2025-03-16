public class MainBubbleSort {


    public static void main(String[] args) {
        int[] numbs = {2,5,4,6,8,9,13,12,11};
        int size = numbs.length;
        int temp;

        System.out.println("before sorting");
        for (int num : numbs) {
            System.out.print(num + " ");

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(numbs[j] > numbs[j+1]){
                    temp = numbs[j];
                    numbs[j] = numbs[j+1];
                    numbs[j+1]= temp;


                }
            }
        }
        System.out.println();
        System.out.println("after sorting :" );
        for(int num: numbs){
            System.out.print(num + " ");
        }
    }
}
