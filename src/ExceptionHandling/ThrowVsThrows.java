//package ExceptionHandling;
//
//import java.io.IOException;
//
//public class ThrowVsThrows {
//    public static void main(String[] args) {
//        try{
//
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Exception is caught");
//        }
//        catch (BussinessEcption e) {
//            System.out.println("Bussiness Exception");
//        }
//    }
//
//    public  int sumOfTwoNumber(int a, int b) throws ArithmeticException,BussinessEcption {
//        someMethod();
//        throw  new ArithmeticException();
//        //return 0;
//    }
//
//    private static int sumofTwoNumber(int a, int b, int c) {
//    return 0;
//    }
//    private static void someMethod() throws BussinessEcption{
//        someotherMethod();
//        throw new BussinessEcption();
//        //some logic
//    }
//
//    private static void someotherMethod () {
//        throw new BussinessEcption();
//
//    }
//}
