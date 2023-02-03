public class LC1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max = 0;

        for (int i = 0; i < row; i++) {
            int sum = 0 ;
            for (int j = 0; j < col; j++) {
                sum +=  accounts[i][j];
            }
            // cách 1
            if (max < sum ) {
                max = sum;
            }
            sum = 0;
            // cách 2
//            max = Math.max(max,sum);
            // Hoặc max = max < sum ? sum : max;
        }
        return max;
    }
}
