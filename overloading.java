class overloading
{
    static void a()
    {
        System.out.println("anusha");
    }
    static void a(int b)
    {
        System.out.println(b);
    }
    static void a(int b,int c,String d)
    {
        System.out.println(b+" "+c+" "+d);
    }
    public static void main(String args[])
    {
        a();
        a(01);
        a(4,5,"stefy");
    }
}