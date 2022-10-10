public class Main {
    public static void main(String[] args) {
        nameregister obj=new nameregister();
        obj.nameregistered();
        int f=obj.token();
        System.out.println("The Final Token Number : "+f);
        String k=obj.token2();
        System.out.println("The Final Token Name : "+k);
    }
}