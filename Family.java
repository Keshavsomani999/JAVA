public class Family {
    public static void main(String[] args) {
        int n =3;
        int j =0,i;
        char []a = {'x','y','x'};
        boolean []b = new boolean[n];

        for(i =0;i<b.length && n != 1;){
            if (b[i]==false){
                if (a[j]=='y'){
                    b[i]=true;
                    j++;
                    n--;
                }
                else {
                    j++;
                }
            }
            i++;
            if(i>=b.length){
                i=0;
            }
            if(j>=a.length){
                j=0;
            }

        }
        for(int k =0;k<b.length;k++){
            if (b[k]==false){
                System.out.println(k+1);
                break;
            }
        }

    }
}
