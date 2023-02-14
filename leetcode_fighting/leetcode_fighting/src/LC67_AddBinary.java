public class LC67_AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11","11"));

    }

    // Cách làm:
    // Tương tự như phép cộng số nguyên, ta đặt phép cộng binary theo hàng dọc với nguyên tắc, 1 + 1 = 0  nhớ 1 sang hàng tiếp theo;
    // Ví dụ 11 + 11 :
    // Xét hàng ngoài cùng với index i =  (.length - 1): 1 + 1 = 0 nhớ 1 -> ta được rs = '0'
    // Tiếp theo index i - 1 : 1 + 1 + 1 (dư ở hàng trước) = 1 nhớ 1 -> ta được rs = '10'.
    // Kết thúc vòng lặp khi cả 2 string đều chạy hết chỉ mục ( index < 0)
    // Cuối cùng nếu phần dư vẫn còn ( surplus = 1 ) -> cộng thêm 1 vào rs -> rs = "110
    public static String addBinary(String a, String b) {
        StringBuilder rs = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int surplus = 0;
        // Kết thúc khi cả 2 đều nhỏ hơn 0
        while (i >= 0 || j >= 0) {
            int sum = surplus;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            if (sum > 1){
                surplus = 1;
            }else {
                surplus = 0;
            }
            rs.append(sum%2);
        }
        if (surplus == 1){
            rs.append(surplus);
        }
        // chuỗi sau khi nhận được sẽ phải dùng reverse để đảo ngược lại vì append sẽ tự động thêm vào bên trái.
        return rs.reverse().toString();
    }


}
