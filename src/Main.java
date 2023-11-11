public class Main {
    public static void main(String[] args) {


        System.out.println(canPack(1,0,4));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));

    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        bigCount = bigCount * 5;
        int remainder = bigCount % goal;

        if ((bigCount + smallCount) % goal == 0) {
            return true;
        } else if (smallCount > goal){
            return true;
        } else if (bigCount % goal < 0 && smallCount < 1){
            return false;
        } else if (remainder != 0 && smallCount > remainder){
            return true;
        } else if (bigCount == 0 && smallCount < goal){
            return false;
        }
        return true;
    }
}