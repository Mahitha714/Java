public class ArraysDemo {
    public static void main(String[] args) {

        //Declaring and initializing array
        int[] numbers = {10, 20 ,20 ,40 ,50};

        System.out.println("Accessing Elements");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Third Element: " + numbers[2]);

        System.out.println("\nLooping Through Array:");

        //using for loop
        for (int i =0; i < numbers.length; i++) {
            System.out.println("value: " + numbers[i]);
        }

        System.out.println("\nUsing Enhanced For Loop");
   

     //Enhanced For Loop
     for (int num : numbers) {
        System.out.println("Number:" + num);
     }   

     //Finding Sum
     int sum = 0;
     for (int num : numbers) {
        sum += num;
     }
     System.out.println("\nSum of Array: " + sum);


    }
    
    }
