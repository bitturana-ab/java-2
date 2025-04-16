
import java.util.Set;
import java.util.TreeSet;

class SetCollection {

    public static void main(String[] args) {
        //for converting object to integer 
        // Set<Integer> nums = new HashSet<Integer>();

        //treeset gives sorted array
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(13);
        nums.add(19);
        nums.add(23);
        nums.add(32);
        nums.add(93);
        nums.add(25);
        nums.add(13);
        System.out.println(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
