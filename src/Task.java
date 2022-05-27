public class Task {
    public static <T extends Comparable<T>> void sort(T[] data,int from,int to){
        if(from > to){
            System.out.println("Индекс левой границы массива не может быть больше правой ");
            return;
        }

        if (from < 0 || to >= data.length || from*to < 0){
            System.out.println("Введены неверные парамертры from или to");
            //Или просто границы массива
            return;
        }

        int size = to;
        for(int i = size; i > from; i--) {
            for(int j = from + 1; j <= i; j++) {
                if (data[j-1].compareTo(data[j]) > 0) {
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void sort(T[] data){
        sort(data,0,data.length -1);
    }


}
