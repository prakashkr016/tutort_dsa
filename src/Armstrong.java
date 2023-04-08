public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongCheck(n));
    }

    static boolean armstrongCheck(int num) {
        boolean flag = false;
        int sum, rem, orgNum;
        sum = rem = 0;
        orgNum = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num /= 10;
        }
        if (orgNum == sum) {
            flag = true;
        }
        return flag;
    }
}
