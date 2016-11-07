class areacalc
{
    areacalc()
    {
        int b=0;
        int h=0;
        int w=0;
    }
    public areacalc(float f, int bre, int hi)
    {
        System.out.println("Area of Triange: " + f*bre*hi);
    } 
      
    public areacalc(int width, int hi)
    {
        System.out.println("Area of Square: "+ width*hi);
        
    }
}
public class AreaCalcConstructor{

     public static void main(String []args)
     {
         areacalc a1 = new areacalc();
         areacalc a = new areacalc(0.5f,20,30);
         areacalc b = new areacalc(30,30);
     }
}
