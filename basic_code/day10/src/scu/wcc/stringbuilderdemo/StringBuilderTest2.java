package scu.wcc.stringbuilderdemo;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String result = appendArr(arr);
        System.out.println(result);
    }

    public static String appendArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }

        }
        return sb.toString();
    }
}
