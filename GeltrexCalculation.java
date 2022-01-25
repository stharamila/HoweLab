import java.util.Scanner;

public class GeltrexCalculation {
	//Want  a Final Stock 2 mg/mL
			//Get a  lot number from geltrex vial, search on TF website and obtain protein conc
	//example PC: 17.5 mg/mL
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a protein concentration of geltrex(mg/mL):");
		double ProteinConc = sc.nextDouble();
		
		System.out.println("Enter the volume of a vial (1/5 mL)?");
		int VialVol = sc.nextInt();
		
		double TotalVolumne = ProteinConc * VialVol/2;
		
		System.out.println("Total Volume:" + TotalVolumne);
		
		double geltrexmedia = TotalVolumne - VialVol;
		System.out.println("Volume of geltrex Media to be added: " + geltrexmedia );
		
				
	sc.close();
	}
}
	