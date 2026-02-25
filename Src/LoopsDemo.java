public class LoopsDemo {
    public static void main(String[] args) {
        
        for(int i=1; i<5; i++) {
            System.out.println("Number: " +i);
        }
        System.out.println("For loop example:");


        //while loop
        int j=1;
        while (j<=5) {
            System.out.println("value: " +j);
            j++;
        System.out.println("\nWhile loop Example");
        }

        //DO-While Loop
        int k =1;
        do {
            System.out.println("Count: " +k);
            k++;
        }while (k <= 5);

        System.out.println("\nDo-while loop Example");

    }
}
