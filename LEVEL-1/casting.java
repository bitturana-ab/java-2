
class casting {

    public static void main(String args[]) {
        int a = 257; //257%256 = 1 
        byte b = (byte) a;
        byte c = 124; //max 127
        int d = c; // byte to int no need to casting
        float e = 5.6f;
        int g = (int) e; //loss point value
        int num = 6;
        // int res = num++; // fetch the value and then increment //post - inrmt
        int res = ++num; // inrement then fetch // pre - incmt
        System.out.println(res);

        int x = 5;
        int y = 6;
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x != y);
        System.out.println(x == y);
    }
}
