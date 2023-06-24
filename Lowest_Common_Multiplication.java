package Greatest_Common_Divisor;

public class Lowest_Common_Multiplication {
	public static void main(String[] args) {
		System.out.println(LCM(12,14));
	}
	public static int LCM(int a,int b){
	    int lcm=(a*b)/GCD(a,b);
	    return lcm;
	}
	public static int GCD(int a,int b){
	    if(b==0)
	    return a;
	    else
	    return GCD(b,a%b);
	}
}
