package company.com;
public class Gindac extends Insecta
{
    private int k = printInit("Gindac.k initializat");
    public Gindac()
    {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Gindac.x2 initializat");
    public static void main(String[] args)
    {
        System.out.println("Gindac constructor");
        Gindac b = new Gindac();
        System.out.println("Furnica constructor");
        Furnica f=new Furnica();
    }
}
