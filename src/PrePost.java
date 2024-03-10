public class PrePost {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        int z=7;
        int a=8;

        System.out.println(x+=2);//12
        System.out.println(y++);//5 post increment - get value from memory print it first
        System.out.println(y);//6
        System.out.println(++a);//9
        z--;
        System.out.println(z);//6
    }
}
