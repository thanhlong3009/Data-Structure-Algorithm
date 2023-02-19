package Math;

public class LC1342_NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public static int numberOfSteps(int num) {
        if (num == 0){
            return 0;
        }
        int count = 0;
        while (num > 0){
            if (num % 2 == 1){
                num -= 1;
                count++;
            }
            num /= 2;
            count++;
        }
        return count - 1 ;
    }
}
