package Math;

public class LC1281_SubtractTheProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prd = 1;
        while (n == 0) {
            sum += n %10;
            prd *= n %10;
            n /= 10;
        }
        return prd - sum;
    }
}
