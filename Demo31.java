import java.util.HashSet;

public class Demo31 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(10);               // Integer
        set.add("Hello, World!");   // String
        set.add(3.14);              // Double
        set.add(true);              // Boolean
        set.add('A');               // Character
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}