class Ab{
    int a=10;
    int b;
    static int c=30; 
    static int d;
    public static void main(String[] args){
        int e = 40;
        int f;
        Ab t= new Ab();
        System.out.println(t.a); //10
        System.out.println(t.b);//0
        System.out.println(t.c);//30
        System.out.println(t.d);//0
        System.out.println(c);//30
        System.out.println(e);//40
        //System.out.println(f); initilization req for local variable
    }
}