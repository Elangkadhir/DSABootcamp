public class RichestPerson {
    public static void main(String[] args) {
        int num[][] = { { 1, 2, 3,1 }, { 2, 3, 4,1 } };
        System.out.println(maximumWealth(num));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int value = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                value += accounts[i][j];
            }
            if (max < value) {
                max = value;
            }
        }

        return max;
    }
}
