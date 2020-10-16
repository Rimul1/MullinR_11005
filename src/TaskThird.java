public class TaskThird {
    public static void main(String[] args){
        int[] array = new int[]{2,62,5,43,23,64};

        System.out.println(max(array));
    }
    public static int max(int[] array){
        int Max = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                Max = array[i];
            } else {
                Max = array[i + 1];
            }
        }
        return Max;
    }
}
