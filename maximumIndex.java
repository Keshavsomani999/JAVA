public class maximumIndex {
    public static void main(String[] args) {
        int arr[] = {34,8,10,3,2,80,31,33};
        int j = arr.length-1;
        int d = 0;
        int max=0;
        for (int i =0;i<arr.length;){
            if (i<j){

                if (arr[i] < arr[j]){
//                    System.out.println(arr[i]);
//                    System.out.println(arr[j]);
                    d = j-i;
//                    System.out.println(d);
                    i++;

                    j= arr.length-1;
                    if (max<=d){
//
                        max=d;
                    }
                }
                else {
                    j--;
                }
            }
            else {
                break;
            }
        }
        System.out.println(max);
    }
}
