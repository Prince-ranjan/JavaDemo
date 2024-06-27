public class ifDemo {
    public static void main(String[] args) {
        int[] arr1 = {100, 70, 15, 85, 56, 97, 30, 25};


        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        for(int i = 0; i < 10; i++) {
            System.out.println("Marks = " + arr1[i]);
            if(arr1[i] >= 90) {
                System.out.println("Grade A" );
            }
            else if(arr1[i] >= 80) {
                System.out.println("Grade B");
            }
            else if(arr1[i]  >= 70) {
                System.out.println("Grade C");
            }
            else{
                System.out.println("Grade D");
            }
        }


        int count = 0;
        boolean flag = false && true;
        while(flag) {
            System.out.println("running the loop");
            count++;
        }



//        for(int i = 0; i < arr1.length; i++) {
//            if(arr1[i] >= 35) {
//                System.out.println("student " + (i + 1) + " Passed!");
//            }
//            else{
//                System.out.println("student " + (i + 1) + " Failed!");
//            }
//        }


    }
}

/*
student 1 passed!
student 2 passed!
student 3 passed!
student 4 passed!
student 5 passed!
student 6 passed!
student 7 failed!
student 8 failed!
 */
