
// // Пример: 3 2 1 3 5 6
// // Вывод: 2 1 5 6 3 3
// // От Pavel всем 09:20 PM
// public class Task03 {
//     public static void main(String[] args) {
//         Integer [] arr = new Integer[] {2, 3, 3, 1, 3, 3, 5, 3};
//         Integer val = 3;
//         for (Integer i = 0; i < arr.length; i++)
//         {
//             for (Integer j = 0; j < arr.length - 1; j++)
//             {
//                 if (arr[j] == val)
//                 {
//                     if (arr[j + 1] != val)
//                     {
//                         Integer change = arr[j + 1];
//                         arr[j + 1] = arr[j];
//                         arr[j] = change;
//                     }
//                     else continue;
//                 }
//             }
//         }
//         for (Integer k = 0; k < arr.length; k++)
//         {
//             System.out.println(arr[k]);
//         }
//     }
// }

// От Pavel всем 09:46 PM
// import javax.lang.model.util.ElementScanner14;

// public class Task03 {
//     public static void main(String[] args) {
//         Integer [] arr = new Integer[] {2, 3, 3, 1, 3, 3, 5, 0};
//         Integer val = 3;
        // for (Integer i = 0; i < arr.length; i++)
        // {
        //     for (Integer j = 0; j < arr.length - 1; j++)
        //     {
        //         if (arr[j] == val)
        //         {
        //             if (arr[j + 1] != val)
        //             {
        //                 Integer change = arr[j + 1];
        //                 arr[j + 1] = arr[j];
        //                 arr[j] = change;
        //             }
        //             else continue;
        //         }
        //     }
        // }
        // {2, 3, 3, 1, 3, 3, 5, 0}
    //     Integer count = 0;
    //     Integer change = 0;
    //     for (Integer i = arr.length - 1; i >= 0; i--)
    //     {
    //         if (arr[i] == 3) 
    //         {
    //             count += 1;
    //             change = arr[i];
    //             arr[i] = a
    //         }   
    //     }
    // }    