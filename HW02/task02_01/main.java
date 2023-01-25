// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package HW02.task02_01;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    
    public static void main(String[] args) throws IOException {
        
        Integer[] array = new Integer[]{10, 4, 11, 8, 4, 7, 7};
        Boolean flag = false;
        Integer temp;
        FileWriter writer = new FileWriter("HW02/task02_01/log.txt");

        while (!flag){
            flag = true;
            for (int i = 0; i<array.length-1; i++){

                if (array[i]  > array[i+1]){
                    flag = false;
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;

                    try {
                        
                        writer.write(Arrays.toString(array));
                        writer.write("\n");                     
                    }
                    catch (Exception e){
                        System.out.println("Что то не так");
                    }   
                }
            }           
        }
        writer.close();
    } 
}


