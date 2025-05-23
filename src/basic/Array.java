package basic;

public class Array {

    public static void main(String[] args) {

//        long startTime = System.nanoTime();
//       StringBuffer mg = new StringBuffer("hello ");
//        //System.out.println(mg.capacity());
//       for(int i = 0; i < 10000;i++){
//           mg.append("World");
//       }
//        System.out.println("Time taken in Buffer: "+(System.nanoTime()-startTime));
//
//        long startTime1 = System.nanoTime();
//        StringBuilder builder = new StringBuilder("Hello ");
//        for(int i = 0;i < 10000;i++){
//            builder.append("world");
//
//        }
//        System.out.println("Time taken in StringBuilder: "+(System.nanoTime()-startTime1));

//        boolean isAuthenticated = false;
//        if(isAuthenticated){
//            System.out.println("You are logged in");
//        }
//        if(!isAuthenticated){
//            System.out.println("You are not logged in");
//        }
        main mm = new main();
        mm.print();

        boolean isSignUp = true;
        boolean isEmailVerified = false;
        boolean isPasswordVerified = true;

        if(isSignUp && isEmailVerified && isEmailVerified){
            System.out.println("Welcome to your home page");
        }
        else if(isSignUp && !isEmailVerified){
            System.out.println("Please verify your email address");
        }
        else if( isSignUp && !isEmailVerified && isPasswordVerified){
            System.out.println("Please verify your password");
        }
        else System.out.println("You are not registered");

    }



}
