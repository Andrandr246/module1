public class Task1 {
    public static void main(String[] args) {
        int[] Arr = {2, 4, 6, 2, 3, 2, 8, 7, 5};
        int tmp = 0, count = 0;

        for (int i = 0; i < Arr.length; i++) {
            if(i == (Arr.length-1))break;
            for (int j = i+1; j < Arr.length; j++) {
                if(Arr[i] == Arr[j]) {tmp = Arr[i]; break;}
            }

        }
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] != tmp) count++;

        }
        System.out.println(count);
    }
}
