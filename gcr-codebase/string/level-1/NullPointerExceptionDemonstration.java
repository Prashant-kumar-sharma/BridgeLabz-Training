//Create a class NullPointerExceptionDemonstration to throw null pointer exception

public class NullPointerExceptionDemonstration {

    //Method to generate NullPointerException
    public static void generateException(){

        String text=null;

        //This line will generate NullPointerException
        System.out.println(text.length());
    }

    //Method to handle NullPointerException
    public static void handleException(){

        String text=null;

        try{
            System.out.println(text.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String args[]) {
    try {
        generateException();
    } catch (NullPointerException e) {
        System.out.println("Exception occured in generateException() ");
    }
	handleException();
	}
}
