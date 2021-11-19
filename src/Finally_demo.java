//To demonstrate finally
public class Finally_demo {
    //through an exception out of the method
    static void A()
    {
        try
        {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }finally
        {
            System.out.println("A's finally");
        }
    }
    //Return from within a try block
    static void B()
    {
        try
        {
            System.out.println("Inside B");
            return;

        }
        finally
        {
            System.out.println("B's finally");
        }
    }
    //execute a try block normally
    static void C()
    {
        try
        {
            System.out.println("Inside C");

        }
        finally
        {
            System.out.println("C's finally");
        }
    }

    public static void main(String[] args) {
        try
        {
            A();
        }
        catch(Exception obj)
        {
            System.out.println("Exception caught");
        }
        B();
        C();
    }
}
