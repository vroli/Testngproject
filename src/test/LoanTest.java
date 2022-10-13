package test;


	import org.testng.annotations.Test;

	public class LoanTest extends BaseClass{
		
		
		
		@Test(groups= {"sanity"})
		public void HomeLoanTest() {
			
			System.out.println("Inside Home Loan Test");
		}
		
		@Test
		public void PersonalLoanTest() {
			
			System.out.println("Inside Personal Loan Test");
		}
		
		@Test
		public void PersonalLoanTest1() {
			
			System.out.println("Inside Personal Loan Test");
		}

}
