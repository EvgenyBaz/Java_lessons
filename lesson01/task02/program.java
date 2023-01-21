
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package lesson01.task02;
public class program {
    public static void main(String[] args) {

        Integer [] arr = new Integer[]{1,1,0,1,1,1};
        Integer num_count = 0;
        Integer max_count = 0;

        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i]==1){
                num_count+= 1;
            }
            else 
            {
                if (num_count > max_count)
                {
                    max_count = num_count;
                    // num_count = 0;
                }
                num_count = 0;
            }
        }
        if (num_count > max_count)
        {
            max_count = num_count;
        }
        System.out.println(max_count);

    }
   
}