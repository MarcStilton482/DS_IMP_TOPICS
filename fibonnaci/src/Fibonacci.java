public class Fibonacci
{
    Fibonacci(int N)
    {
        int counter = 0;
        int num1 = 0, num2 = 1;
        while(counter<N)
        {
            System.out.print(num1+" ");
            int num3 = num2+num1;
            num1 = num2;
            num2 = num3;
            counter += 1;
        }
    }
    public static void main(String[] args)
    {
        int N = 10;
        new Fibonacci(N);
    }


}