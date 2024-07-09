package ExceptionHandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
//        int[] arr = null;
       // System.out.println(arr[0]);
        try {
     int[] arr = null;
//            System.out.println(arr[0]);

            arr = new int[6];
            arr[6] = 7;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is getting out of bound plesase correct the index");
        }
        catch (NullPointerException e){
            System.out.println("You are having null value for the arr please assign some value to it.!");
        }
        finally {
            System.out.println("Finally block is getting executed!");
//            int[] arr  = new int[5];
//            arr[5] = 6;
        }

        System.out.println("The program run completely");
    }
}
