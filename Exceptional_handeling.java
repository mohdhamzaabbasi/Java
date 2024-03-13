public class Exceptional_handeling {
    public static void main(String[] args) {
        int []arrayA = new int [2];
        arrayA[0] = 1;
        arrayA[1] = 2;

        try{
            System.out.println(arrayA[3]);
            int i =50;
            int c =i/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arrayIndexOutOfBoundsException occured");
        }
        catch(Exception e){
            System.out.println("exception occured");
            
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println(arrayA[1]);
        System.out.println(arrayA[0]);
    }
    
}