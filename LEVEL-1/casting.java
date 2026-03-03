
class casting {

    public static void main(String args[]) {
        int a = 257; // 257%256 = 1 
        byte b = (byte) a;
        System.out.println(b);
        byte c = 124; // max 127
        int d = c; // byte to int no need to casting
        System.out.println(d);
        float e = 5.6f;
        int g = (int) e; // loss point value
        System.out.println(g);
        int num = 6;
        // int res = num++; // fetch the value and then increment //post - incrmt
        int res = ++num; // inrement then fetch // pre - incrmt
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
