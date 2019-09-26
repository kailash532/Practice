package AutomationPackage;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
	
	static int factorial(int n)
    {
        int fact = 1;
        int i;
        for(i=1; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    // Function to display the pascal triangle
    static void display(int n) 
    {
        int i;
        int coefficient;
        int line;
        for(line=0;line<=n;line++)
        {
            for(i=0;i<=line;i++)
            {
            	int num1=factorial(line);
            	int num2=factorial(line-i) * factorial(i);
                System.out.print( num1/num2+ " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		int numbrOfRows=4;
		PascalTraingle pt=new PascalTraingle();
		pt.display(numbrOfRows);
		
		
	}

}
