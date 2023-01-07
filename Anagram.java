public class Anagram {
    public static void main(String[] args) {
        char temp;
        String a = "eat";
        String b = "Ate";
        char ch[] = a.toCharArray();
        char ch1[] = b.toCharArray();
        if (ch.length == ch1.length){
            for (int i =0;i<ch.length;i++){
                for (int j=1;j<ch.length-i;j++){
                    if (ch[j-1]>ch[j]){
                        temp = ch[j-1];
                        ch[j-1] = ch[j];
                        ch[j] = temp;
                    }
                    if(ch1[j-1]>ch1[j]){
                        temp = ch1[j-1];
                        ch1[j-1] = ch1[j];
                        ch1[j] = temp;
                    }

                }
            }
            int i;
            for (i = 0;i<a.length();i++){
                if (ch[i]!=ch1[i]){
                    break;
                }
            }
            if (i== ch.length){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
        else {
            System.out.println("Given String is not an Anagram");
        }
    }
}
