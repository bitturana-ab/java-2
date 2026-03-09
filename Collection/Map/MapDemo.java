
import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String args[]) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Bittu", 89);
        students.put("Ancy", 99);
        students.put("AB", 80);
        students.put("AB", 25);
        System.out.println(students);
        System.out.println(students.get("Ancy"));
        System.out.println(students.get("AB"));
    }
}