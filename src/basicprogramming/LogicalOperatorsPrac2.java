package basicprogramming;

public class LogicalOperatorsPrac2 {

	public static void main(String[] args) {
		//Check if a candidate can apply for a job if they are a graduate OR have 3+ years of experience.
		boolean graduate=true;
		boolean have3plusyearsexp=false;
		if(graduate || have3plusyearsexp)
		{
			System.out.println("Candidate can apply for a job");
		}else {
			System.out.println("Can't apply");
		}
				

	}

}
