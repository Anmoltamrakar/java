interface Astrer
{
    public void display();
    default void show()
    {
      System.out.println("Show Default Method");
    }
}
  
class Interface implements Astrer
{
    public void display()
    {
        System.out.println("Show Abstract Method");
    }
  
    public static void main(String args[])
    {
        Interface d = new Interface();
        d.display();
  
        // default method executed
        d.show();
    }
}