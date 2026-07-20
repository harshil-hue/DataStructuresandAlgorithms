package Questions;

public class findUniqueInArray {
    public static void main() {
        int[] arr = {2,3,4,5,5,2,3,6,4};
        System.out.println(unique(arr));

        int[] arr2 = {2,3,2,4,4,5,3,5,5,2,3,6,4};
        System.out.println(unique2(arr2));
    }
    static int unique(int[] arr){
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }

    static int unique2(int[] arr) {
        int ans = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans |= (1 << bit);
            }
        }

        return ans;
    }
}
