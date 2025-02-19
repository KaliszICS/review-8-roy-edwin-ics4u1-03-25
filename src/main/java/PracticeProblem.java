public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static String pluralize(String endiny){

		if (endiny.toLowerCase().endsWith("ey")){
			return ("eys");
		}
		
		else if (endiny.toLowerCase().endsWith("y")) {
			return ("ies");
		}
		
		else if (endiny.toLowerCase().endsWith("ife")){
			return ("ives");
		}
		else{
			return ("s");
		}

	}

	public static int min(int in1, int in2, int in3) {
		if (in1>in2){
			if (in2>in3){
				return in3;
			}
		
		else{
			return in2;
		}
	}
		else{
			if (in1>in3){
				return in3;
			}
		
		else{
			return in1;
			}		
		}	
	}

	public static boolean isLeapYear(int leap){
		if (leap%4==0){
			if(leap%100==0){
				if(leap%400==0){
					return true;
					}
					else{
						return false;
					}
					
				}
				else{
					return true;
				}
			}
			else{
				return false;
			}
		}
	}
