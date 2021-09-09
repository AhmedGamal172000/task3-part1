import java.util.Scanner;

public class task2part1
{

    public static void main(String []args) {

        int[] rand_num = new int[10];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            rand_num[i] = scn.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            for(int j = i +1 ; j < 10 ; j++)
            {
                if(rand_num[i] > rand_num[j])
                {
                    int temp =rand_num[i] ;
                    rand_num[i] = rand_num[j];
                    rand_num[j] = temp;
                }
            }

        }
        for(int i = 0 ; i<10 ; i++)
        {
            System.out.println(rand_num[i]);
        }
    }
}
