public class StringVsStrinBuilderVsStrinBuffer {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String s1 = "Hello";

        for(int i = 0; i < 100000; i++) {
            s1 = s1 + " EveryOne";
        }
        //Hello EveryOne

        //Hello Everyone EveryOne


       // System.out.println(s1);

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");

        for(int i = 0; i < 100000; i++) { // 100000 millisec
            sb.append(" Everyone");
        }


        for(int i = 0; i < 33333; i++) {  // 33K millisec
            sb.append(" Everyone");
        }

        for(int i = 33334; i < 66666; i++) { //33k millisec

        }

        for(int i = 66667; i < 100000; i++) //34k millisec
        {

        }
        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        StringBuffer sbb = new StringBuffer("Hello");

        for(int i = 0; i < 100000; i++) {
            sbb.append(" everyOne");
        }

        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }

}
