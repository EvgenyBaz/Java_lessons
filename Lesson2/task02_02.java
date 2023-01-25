// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Вывод: a4b3cd2 для примера

package Lesson2;

import java.util.Scanner;

public class task02_02 {
    
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        System.out.print("\n введите строку: ");

        String string = scan.next();

        scan.close();

        System.out.println(ZipString(string));
        
    }

    public static String ZipString(String str) {
        
        StringBuilder zip = new StringBuilder();


        int count = 1;
        
        for (Integer i = 0; i<str.length()-1; i++){
            if (str.charAt(i)==(str.charAt(i+1))){
               count++;

            }
            else{
                zip.append(str.charAt(i)).append(count);
                count =1;
            }

        }
        zip.append(str.charAt(str.length()-1)).append(Integer.toString(count));
        return zip.toString();

    }

}


