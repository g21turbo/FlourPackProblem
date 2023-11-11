public class Main {
    public static void main(String[] args) {


        System.out.println(canPackOther(1,0,4));
        System.out.println(canPackOther(0,5,4));
        System.out.println(canPackOther(0,5,4));
        System.out.println(canPackOther(2,2,11));
        System.out.println(canPackOther(-3,2,12));

    }


    // --------------------- Instructors Solution -----------------------------
    private static final int BIG_WEIGHT = 5;

    public static boolean canPackNew(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }




//  ------------------------ Submitted Solution ----------------------------------
    public static boolean canPackOther(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalBigWeight = bigCount * 5;
        int remainder = goal % 5;

        if (totalBigWeight + smallCount >= goal && smallCount >= remainder) {
            return true;
        } else {
            return false;
        }
    }




//    --------------------- Previous Attempt --------------------------------
//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0){
//            return false;
//        }
//
//        bigCount = bigCount * 5;
//        int remainder = bigCount % goal;
//
//        if ((bigCount + smallCount) % goal == 0) {
//            return true;
//        } else if (smallCount > goal){
//            return true;
//        } else if (bigCount % goal < 0 && smallCount < 1){
//            return false;
//        } else if (remainder != 0 && smallCount > remainder){
//            return true;
//        } else if (bigCount == 0 && smallCount < goal){
//            return false;
//        }
//        return true;
//    }
}