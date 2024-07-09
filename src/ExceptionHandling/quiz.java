package ExceptionHandling;

public class quiz {
    public static void main(String[] args) {

        try
        {
            System.out.println(1);

            int i = Integer.parseInt("ABC");

            System.out.println(2);
        }
        catch (NumberFormatException e)
        {
            System.out.println(3);
        }
        catch (RuntimeException e){
            System.out.println(5);
        }
        catch (Exception e)
        {
            System.out.println(4);
        }


    }
}

//Catch block takes one argument of type java.lang.Object. True OR False?