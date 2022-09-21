import java.util.Scanner;
class Naturalnum_sum{
    public static void main(String[] args){
        int n, i=1, sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
          sum+=i;
          i++;
        }
    System.out.println("sum of" +n+"natural numbers" +sum);
   }
} 
