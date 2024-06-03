import java.io.File;


public class Polynomial{
	double [] pol;
	int [] powers;

	public  Polynomial(){
		pol = new double[1];
		powers = new double[1];
	}

	public Polynomial(double [] coef,int [] p){
		num_inputs = new double[coef.length];
		x_inputs = new int [p.len]
		for(int i = 0; i < coef.length(); i ++){
			if(coef[i] == 0 ){
						
			}
		}
	}

	public Polynomial(File input){
		Scanner line = new Scanner(input);
		String equation = line.nextLine();
		String[] values = equation.split("(?=[+-])");
		double [] pol_result = new double[values.length()];
		int [] powers_result = new int[values.length];
		int counter = 0;
		for(int i = 0; i < values.length(); i ++ ){
			String[] temp = values[i].split("x");
			if(temp[0].contains("-") && temp.length() > 1){
				String[] temp2 = temp[0].split("-");
				pol_results[counter] = -Double.parseDouble(temp2[1]);
				if(temp[1] == ""){
					powers_result[counter] = 1;
				}else{
					powers_result[counter] = Integer.parseInteger(temp[1]);
				}
				counter = counter + 1;
			}else if (!temp[0].contains("-") && temp.length() > 1){
				String[] temp = values[i].split("x");
				if(temp[0].contains("+")){
					String[] temp2 = temp[0].split("+");
					pol_results[counter] = -Double.parseDouble(temp2[1]);
					if(temp[1] == ""){
						powers_result[counter] = 1;
					}else{
						powers_result[counter] = Integer.parseInteger(temp[1]);
					}
					counter = counter + 1;
				}
			}else{
				if(temp[0].contains("-")){
					String[] temp2 = temp[0].split("-");
					pol_results[counter] = -Double.parseDouble(temp2[1]);
				}else{
					String[] temp2 = temp[0].split("+");
					pol_results[counter] = -Double.parseDouble(temp2[1]);
				}
				power_results[counter] = 0;
				counter = counter + 1;
			}
		}
	}

	public Polynomial add(Polynomial a){
		int matches = 0;
		for(int i = 0 ; i < a.powers.length(); i++){
			for(int j = 0; j < this.powers.length(); j ++){
				if(a.powers[i] == this.powers[i]){
					matches = matches + 1;
				}
			}
		}
		int len = a.powers.length() + this.powers.length() - matches;
		int [] powers = new int[len];
		Double [] 
		for(int i = 0; i < a.powers.length(); i++){
			for()

		}
	}
	

	public double evaluate(double a){
		double result = 0;
		for(int i =0; i < this.pol.length; i++){
			result += this.pol[i] * Power(a, i);
		}
		return result;
	}
	

	public boolean hasRoot(double a){
		if(this.evaluate(a) == 0){
			return true;
		}else{
			return false;
		}
	}

	public void saveToFile(String name){

	}

	public Polynomial multiply(Polynomial a){
		

	}
	
}