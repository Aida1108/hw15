import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        double [] bigBox = {1.57, 7.654, 9.986};

        char [] box = {'a', 'b', 'c'};

        // Задание 2
        System.out.println("Задание 2");

        for(int i = 0; i < weight.length; i++){
            System.out.print(weight[i]);
            if(i != weight.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < bigBox.length; i++){
            System.out.print(bigBox[i]);
            if(i != bigBox.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = 0; i < box.length; i++){
            System.out.print(box[i]);
            if(i != box.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        for(int i = weight.length - 1; i >= 0; i--){
            System.out.print(weight[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = bigBox.length - 1; i >= 0; i--){
            System.out.print(bigBox[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for(int i = box.length - 1; i >=0; i--){
            System.out.print(box[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        for(int i = 0; i < weight.length; i++){
            if(weight[i] % 2 != 0){
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));

    }
}