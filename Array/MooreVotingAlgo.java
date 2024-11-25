public class MooreVotingAlgo {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int n = arr.length;
        int ele = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = arr[i];
                cnt = 1;
            } else if (ele == arr[i]) {
                cnt += 1;
            } else {
                cnt -= 1;
            }
        }
        // Verifying the count of majority element > n/2 times or not...
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele)
                cnt1++;
        }
        if (cnt1 > n / 2)
            System.out.println("Majority Element : " + ele);
        else
            System.out.println("Majority Element not present...");
    }
}
