public class Main {
    public static void main(String[] args) {

        task1();

        System.out.println();

         task2();

        System.out.println();
        System.out.println();

        task3();

        System.out.println();
        System.out.println();

        task4();

    }

    public static void task1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array_1 = {1.57, 7.654, 9.986};

        int[] array_2 = {07, 06, 2001};
    }

    public static void task2(){
        System.out.println("Задание #2");

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array_1 = {1.57, 7.654, 9.986};
        int[] array_2 = {07, 06, 2001};

        System.out.println("array\tarray_1\t array_2");

        for (int i = 0; i < 3; i++) {
            System.out.print("  " + array[i] + "\t\t");
            System.out.print(" " + array_1[i] + "\t   ");
            System.out.print("" + array_2[i]);
            System.out.println();
        }
    }

    public static void task3(){
        System.out.println("Задание #3");
        int[] array = {1, 2, 3};
        double[] array_1 = {1.57, 7.654, 9.986};

        System.out.println("array\tarray_1");

        for (int i = 2; i >= 0; i--) {
            System.out.print("  " + array[i] + "\t\t");
            System.out.print(" " + array_1[i] + "\t   ");
            System.out.println();
        }
    }

    public static void task4(){
        System.out.println("Задание #4");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] += 1;
                System.out.println(array[i]);
            }else {
                System.out.println(array[i]);
            }
        }
    }
}
