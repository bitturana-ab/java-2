
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortListArray {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(19);
        nums.add(97);
        nums.add(70);
        nums.add(78);
        //for sorting these list
        Collections.sort(nums);
        System.out.println(nums);
        //sort with last digit only or own logic to sort
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1; //swap
                } else {
                    return -1; //no swap
                }
            }
        };
        Collections.sort(nums, com);
        System.out.println(nums);

    }
}
