public class Polynomial{
	double [] pol;

	public  Polynomial(){
		pol = new double[0];
	}

	public Polynomial(double [] a){
		pol = new double[a.length];
		for(int i = 0; i < pol.length; i++){
			pol[i] = a[i];
		}
	}

	double  Power(double a,double power){
		double result = 1;
		for(int i = 0; i < power; i++){
			result = result * a;
		}
		return result;
	}
	public Polynomial add(Polynomial a){
		double [] temp_pol;
		if(this.pol.length >= a.pol.length){
			temp_pol = new double [this.pol.length];
		}else{
			temp_pol = new double [a.pol.length];	
		}
		for(int i = 0; i < temp_pol.length; i++){
			if(i < a.pol.length){
				if(i < this.pol.length){
					temp_pol[i] += this.pol[i];
				}
				temp_pol[i] += a.pol[i];
			}
		}
		
		 Polynomial result = new Polynomial(temp_pol);
		return result;

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
	
}