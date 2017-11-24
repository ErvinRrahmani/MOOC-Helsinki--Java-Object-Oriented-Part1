// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application{
   
    public static void main(String [] args)
    {
        int[] values = {1,2,3,4,5};
        
        for(int value : values)
        {
            System.out.print(value + " "); //prints 1,2,3,4,5
        }
        
        System.out.println();
        
        ArrayHandling.resetArray(values);
        
        for(int value : values)
        {
            System.out.println(value); // prints 0,0,0,0,0
        }
        
        
        
        

    } 
}
