import java.util.Arrays;
import java.util.Scanner;
public class Leet1 {
    public static int minCoins(int N, int K) {
        int[] dp = new int[K + 1];
        Arrays.fill(dp, K + 1);
        dp[0] = 0;
        for (int coin = 2; coin <= N; coin++) {
            for (int j = K; j >= coin; j--) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
        return dp[K] == K + 1 ? -1 : dp[K];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(minCoins(a, b)); 
    }
}
