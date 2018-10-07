public class Ex6_1 {
    public static void main(String[] args) {
        int k = getPentagonalNumber(2);
        System.out.println(k);

    }

    public static int getPentagonalNumber(int n){

        int pentaNumber = n*(3 *n - 1) / 2;
        return pentaNumber;
    }
}
