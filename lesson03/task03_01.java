// Random rnd = new Random();
// Random random = new Random();

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Random;

//         ArrayList<Integer> list1 = new ArrayList<>();
//         //int a = random.nextInt(10);
//         for (int i = 0; i < 10; i++) 
//         {
//             list1.add(random.nextInt(10));
//         }
//         list1.sort(Comparator.naturalOrder());
//         for (Object x : list1)
//         {
//             System.out.print(x + " ");
//         }


// аполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

package lesson03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
// import java.util.Random;

public class task03_01 {
    public static void main(String[] args) {

        // ArrayList<String> list = new ArrayList<>(Arrays.asList ("Меркурий","Венера"));
        ArrayList<String> list = new ArrayList<>();

        list.add("Земля");
        list.add( "Марс");
        list.add( "Юпитер");
        list.add( "Юпитер");
        list.add( "Венера");
        list.add( "Плутон");
        list.add( "Сатурн");
        list.add( "Земля");
        list.add( "Земля");
        System.out.println(list);

        list.sort(Comparator.naturalOrder());

        int count = 1; 
        for (int i=0 ; i<list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1))){
                count++;
            }
            else{
                System.out.print(list.get(i));
                System.out.println(" " +count);
                count  = 1;
            }
        }
        System.out.print(list.get(list.size()-1));
        System.out.println(" " + count);



        // Random random = new Random();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // int a = random.nextInt(10);
        // for (int i = 0; i < 10; i++) 
        // {
        //     list1.add(random.nextInt(10));
        // }
        // list1.sort(Comparator.naturalOrder());
        // for (Object x : list1)
        // {
        //     System.out.print(x + " ");
        // }


        
    }
}