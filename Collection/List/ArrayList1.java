
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArrayList1 {

    public static void main(String[] args) {
        //for converting object to integer 
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(13);
        nums.add(19);
        nums.add(23);
        nums.add(32);
        nums.add(93);
        nums.add(25);
        nums.add(13);
        System.out.println(nums);
        //using enhance for loop
        // for(int n : nums){
        //     System.out.println(n);
        // }

        //list support index value
        List<Integer> n = new ArrayList<Integer>();
        n.add(34);
        n.add(89);
        n.add(90);
        n.add(34);
        System.out.println(n);
        //get value at index 
        System.out.println(n.get(2));
        //get index of a value
        System.out.println(n.indexOf(89));
    }
}
