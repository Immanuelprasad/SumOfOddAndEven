public class SumOfOddAndEven
{
    public static void main(String[] args)
    {
        int i, j, evenSum = 0, oddSum = 0;
        for(i = 0; i <= 20; i++)
            if(i % 2 !=0)
            {
                System.out.println(i);
                oddSum = oddSum + i;
            }
        System.out.println("Sum Of Odd Numbers = " + oddSum);
        {
            for (j = 0; j <= 20; j++)
                if (j % 2 ==0)
                {
                    System.out.println(j);
                    evenSum = evenSum + i;
                }
            System.out.println("Sum Of Even Numbers = " + evenSum);
        }
    }
}