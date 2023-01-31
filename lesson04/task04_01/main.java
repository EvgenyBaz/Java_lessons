// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> arList = new ArrayList<>();
//         LinkedList<Integer> linList = new LinkedList<>();
//         long timeStart = System.currentTimeMillis();
//         for (int i = 0; i < 1000000; i++){
//             arList.add(i);
//         }
//         long timeFinish = System.currentTimeMillis();

//         System.out.println(timeFinish-timeStart);
//         System.out.println("-----------------------");
//         timeStart = System.currentTimeMillis();
//         for (int i = 0; i < 1000000; i++){
//             linList.add(i);
//         }
//         timeFinish = System.currentTimeMillis();
//         System.out.println(timeFinish-timeStart);
        
//     }
// }


// 1. Принимает от пользователя строку вида

// text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// До тех пор, пока пользователь не введёт "stop"


package lesson04.task04_01;

import java.util.Scanner;
import java.util.LinkedList;

public class main {
    public static void main() {

        LinkedList<String> list = new LinkedList<String>();
        String string_to_parse ="";
        Scanner scan= new Scanner(System.in);
        while (!string_to_parse.equals("stop")) {
            System.out.println("Введите строку типа TEXT~num");
            string_to_parse = scan.nextLine();
            String [] string_arr = string_to_parse.split("~");
            if (string_arr[0].equals("print")){
                list.remove(Integer.parseInt(string_arr[1]));
            }
            else
            {
                list.add(Integer.parseInt(string_arr[1]),string_arr[0]);    
            }         
        }
        scan.close();
    }
    
}
