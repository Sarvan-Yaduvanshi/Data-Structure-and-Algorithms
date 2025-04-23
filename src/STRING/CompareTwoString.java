package STRING;
public class CompareTwoString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        // Compare Two String
        if ( str1 == str2) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
        if ( str1 == str3) {    // str1, str2 ==> Both ak hi memory location per create hua hai, but str3 different memory location per
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
         //  Compare Two String
        if ( str1.equals(str3)) {   // str1,str2 se compare me == replace .equals ---> value ko compare
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
    }
}
