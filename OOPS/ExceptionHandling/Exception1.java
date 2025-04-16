class ABException extends Exception{

    public ABException(String message) {
        super(message);
    }
    
}
class Exception1 {

    public static void main(String arg[]) {
        int i = 0;
        int j = 0;
        int num[] = new int[5];
        try {
            j = 18 / 30;
            if (j == 0) {
                throw new ABException("zero or negative num");
            }
            System.out.println(num[2]);
            System.out.println(num[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit" + e);
        } catch (ArithmeticException e) {
            j = 18;
            System.out.println(e.getMessage());
        } 
        catch (ABException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
