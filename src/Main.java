import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{5,3,10,2,1};
        String[] names = new String[]{"zz","yy","bb","aa"};
        SomeClass[] someClasses = new SomeClass[]{new SomeClass(3),new SomeClass(2),new SomeClass(1)};

        Task.sort(a,0,4);

        System.out.println("Для Integer");

        System.out.println(Arrays.toString(a));

        Task.sort(names);

        System.out.println("Для String");

        System.out.println(Arrays.toString(names));

        Task.sort(someClasses,0,2);

        System.out.println("Для произвольного типа данных");

        System.out.println(Arrays.toString(someClasses));
    }
}
