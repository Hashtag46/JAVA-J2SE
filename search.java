public class search {
    public static void main(String ars[])
    {
        int a=Integer.parseInt(ars[0]);
        int b=Integer.parseInt(ars[1]);
        int c=Integer.parseInt(ars[2]);
        int p=a>b?(a>c?b>c?b:c:a):(a>c?a:b>c?c:b);
        System.out.println("The second-highest number is "+p);

    }
}
