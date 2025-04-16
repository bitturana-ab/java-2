
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class AsList {

    public static void main(String ar[]) {
        List<Integer> nums = Arrays.asList(4, 3, 6, 7, 8);
        //first normal loop
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        //second enhance loop 
        // for(int n:nums){
        //     System.out.println(n);
        // }
        //forEach Method
        nums.forEach(n -> System.out.println(n));
        // Stream interface only use once
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        s3.forEach(n -> System.out.println(n));
    }
}

// class ReverseString {
//     public String reverseString(String str) {
//         char[] charArray = str.toCharArray();
//         int left = 0;
//         int right = charArray.length - 1;
//         while (left < right) {
// //        swap characters at the left and right positin
//             char temp = charArray[left];
//             charArray[left] = charArray[right];
//             charArray[right] = temp;
// //        move the pointer towards each other
//             left++;
//             right--;
//         }
//         return new String(charArray);
//     }
// }
// class AsList {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//         ReverseString reverse = new ReverseString();
//         String rev = reverse.reverseString("Java");
//         System.out.print(rev);
//     }
// }
