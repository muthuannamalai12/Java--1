//	Write a Java program for handling the following exception
// NumberFormat Exception


class NumberFException
{
    public static void main(String args[])
    {
        try{
            int num=Integer.parseInt ("A") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}
