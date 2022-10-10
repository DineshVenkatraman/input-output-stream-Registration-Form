import java.util.*;
import java.io.DataInputStream;
class nameregister
{
    DataInputStream d=new DataInputStream(System.in);
    Scanner so=new Scanner(System.in);
    String name;
    int age, num, anum,bnum, x, y;
    public void nameregistered()
    {

        try{
            System.out.println("Enter The Client Name");
            String name=d.readLine();
            System.out.println("Enter The Client age");
            int age=so.nextInt();
            System.out.println("Enter the Customer Number");
            int num=so.nextInt();
            System.out.println("Enter the Amount A");
            int anum=so.nextInt();
            System.out.println("Enter the Amount B");
            int bnum=so.nextInt();
            System.out.println("Enter the X No");
            int x=so.nextInt();
            System.out.println("Enter the Y No");
            int y=so.nextInt();
            this.name=name;
            this.age=age;
            this.num=num;
            this.anum=anum;
            this.bnum=bnum;
            this.x=x;
            this.y=y;
            this.dataregister1();
            this.dataregister2();
            this.dataregister3();
        }catch(Exception h){}

    }
    public void dataregister1()
    {
        System.out.println("The Customer Name : "+name);
        System.out.println("The Customer Age : "+age);
    }
    public void dataregister2()
    {
        System.out.println("The Customer Number : "+num);
    }
    public void dataregister3()
    {
        int tot=anum+bnum;
        System.out.println("The Customer Total Amount : "+tot);
    }
    public int token()
    {
        int sum=x+y;
        return sum;
    }
    public String token2()
    {
        String s="Ramesh";
        String x="Kumar";
        String sums=s+x;
        return sums;
    }
}
