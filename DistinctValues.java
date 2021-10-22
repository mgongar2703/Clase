public class DistinctValues {
    
    public static void main(String[] args) {
    
	int A = 1;
	int B = 2;
	int C = 1;
	
	if (A == B && A == C && B == A && B == C && C == A && C == B) {
	System.out.println("1");
	} else if (A != B && A != C && B != A && B != C && C != A && C != B) {
	System.out.println(3);
	} else if (A == B && A != C && B == A && B != C && C != A && C != B) {
	System.out.println("2");
	} else if (A != B && A != C && B != A && B == C && C != A && C == B ) {
	System.out.println("2");
	} else if (A != B && A == C && B != A && B != C && C == A && C != B) {
	System.out.println("2");
	}
	
 }   
}
