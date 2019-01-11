public class throwException {


    public static void main(String[] args) {
        String message="Caught an exception!";
        try
        {
            throw new Exception(message);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception reached in finally block");
        }
    }
}
