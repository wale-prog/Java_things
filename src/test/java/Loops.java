public class Loops {

    public static void forLoop() {

        for(int i = 0; i < 5; i += 1) {
            System.out.println(i);
        }
    }

    public static void practice() {
        // Going from numbers 1 - 50
        // Check number if they are divisible by 2

//        for(int i = 0; i <= 50; i += 2) {
//            if(i != 0) {
//                System.out.println(i);
//            }
//        }

        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
//        forLoop();
        practice();
    }
}
