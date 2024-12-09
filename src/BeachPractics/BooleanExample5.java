package BeachPractics;

public class BooleanExample5 {



    public static void main(String[] args) {

        int num=10;
        boolean flag=false;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("prime");
        }

    }
}
