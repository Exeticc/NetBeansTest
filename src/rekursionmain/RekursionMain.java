
package rekursionmain;


public class RekursionMain {

    
    public static void main(String[] args) {
        //3.potenzf
        //System.out.println("3.Erg.:" + pot(2,3));
        System.out.println(rek(2,3));
    }
    
    public static int pot(int a,int b){
        if(b == 0){
            return 1;
        }
        else{
            return pot(a, b-1)*a; 
        }
    }
    
    public static int rek(int x, int y){
        if(y==1){
            return x;
        }
        return x + rek(x, y-1);
       
    }
    
}
