// String in java is not a primitive data type it's a class in java

class StringJava {

    public static void main(String a[]) {
        // String name = new String("bittu"); //store in heap memery by reference variable
        String name = "bittu"; //this will auto create object of string 
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" rana"));
        //mutable & immutable String
        StringBuilder sb = new StringBuilder("bittu");
        System.out.println(sb.capacity()); //16 extra space for changing
        sb.deleteCharAt(2);
        sb.insert(0, "java ");
        System.out.println(sb.length());
        System.err.println(sb.append(" ab"));

    }
}
