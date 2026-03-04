
class Student {

    int rollno;
    String name;
    static int marks;
}

class array {

    public static void main(String args[]) {
        // for student class
        // Student s1 = new Student();
        // s1.rollno = 28;
        // s1.name = "ancy";
        // s1.marks = 98;
        // Student s2 = new Student();
        // s2.rollno = 25;
        // s2.name = "bittu";
        // s2.marks = 82;
        // Student s3 = new Student();
        // s3.rollno = 21;
        // s3.name = "sung";
        // s3.marks = 78;
        //creating array of objects of class student
        // Student st[] = new Student[4];
        // st[0] = s1; //inserting in array
        // st[1] = s2;
        // st[2] = s3;
        // //printing data through enhance for loop
        // for (Student stud : st) {
        //     System.out.println("name:" + stud.name + " ; " + "roll:" + stud.rollno + " ; " + "marks:" + stud.marks);
        // }

        // multi-dimensional or 2-d array 
        System.out.println("Here are multi or 2 dimensional array's elements: ");
        int nums[][] = new int[3][4];

        // fill the elements of nums array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }       
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.err.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // //same thing for loop or enhance for loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        // //jagged array
        // int nums[][] = new int[3][];//jagged array
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         nums[i][j] = (int) (Math.random() * 10);
        //     }
        // }
        // for (int n[] : nums) {
        //     for (int m : n) {
        //         System.err.print(m + " ");
        //     }
        //     System.err.println();
        // }
        //example 1-d array
        System.err.println("Here are 1-d array's elements: ");
        int nums1[] = new int[4];
        nums1[0] = 4;
        nums1[1] = 8;
        nums1[2] = 3;
        nums1[3] = 9;
        // enhanced foor loop
        for (int n : nums1) {
            System.out.println(n);
        }
    }
}
