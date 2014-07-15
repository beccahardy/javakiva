package com.prashsoft.javakiva;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import com.prashsoft.javakiva.KivaUtil;

public class UnitTests extends TestCase { 

	// @Before
	// protected void setUp() throws Exception {
	// 	super.setUp();
	// 	LoanUtil loanUtil = new LoanUtil();

	// 	//TODO
	// }

	// @After
	// protected void tearDown() throws Exception {
	// 	super.tearDown();
	// 	//TODO
	// }

	//@Test
	public void testAssertTrueIsTrue() {
		assertTrue(true);
	}

	//@Test
	public void testAssertTrueIsNotFalse() {
		assertTrue(!false);
	}

	//@Test
	public void testLoanDetails() {
				//message, expected, actual
		LoanUtil loanUtil = new LoanUtil();
		assertEquals("Get Loan Details", "[ Activity: Fishing\n Basket Amount: \n Funded Amount: 425.0\n Id: 55781\n Image: http://www.kiva.org/img/w800/179190.jpg\n Loan Amount: 425.0\n Loan Description: null\nLocation: \nCountry Code: MZ\nCountry: Mozambique\nTown: Catembe, Maputo\nGeo Level: town\nGeo Pairs: -26.009167 32.566667\nGeo Type: point\n\n Name: Albertina\n Paid Amount: 425.0\n Posted Date: Sat, 12 Jul 2008 23:20:18 GMT\n Funded Date: Sun, 13 Jul 2008 01:53:27 GMT\n Raised Amount: \n Sector: Food\n Status: paid\n Partner Id: 23\n Use: To buy wood to repair her boat\n Borrowers: \nBorrower Id: null\nBorrower First Name: Albertina\nBorrower Last Name: \nBorrower Gender: F\nBorrower Pictured: true\nTerms: \nDisbursal Amount: 10000.0\nDisbursal Currency: MZN\n Local Payments: Due Date: Tue Aug 26 07:00:00 CDT 2008\n Local Payments: Amount: 625.0\n Scheduled Payments: Due Date: Thu Oct 16 07:00:00 CDT 2008\n Scheduled Payments: Amount: 26.56\nDisbursal Date: Sat Jul 26 20:53:27 CDT 2008\nLoan Amount: 425.0\nLoss Liability: Non Payment: partner\nLoss Liability: Currency Exchange: partner\n Payments: \nPayment Id: 296559\nPayment Amount: 27.0\nPayment Local Amount: 635.29\nPayment Processed Date: Fri Aug 15 09:00:01 CDT 2008\nPayment Settlement Date: Fri Aug 29 05:14:53 CDT 2008\nPayment Comment: scheduled_repayment\nPayment Rounded Local Amount: 642.6\nPosted Date: Sat Jul 12 18:20:18 CDT 2008\nFunded Date: Sat Jul 12 20:53:27 CDT 2008\nJournal Totals: Entries: 0\nJournal Totals: Bulk Entries: null]", loanUtil.getLoansDetails("55781"));
	}

/*
	@Test
	public void AdaptedTests() {
		List loansList = loanUtil.getLoansDetails("55781"); 
		Loan loan = (Loan)loansList.get(0); 
		
		System.out.println(loan.toString());
        System.out.println("-------------------------------------------------");

        List loanLendersList = loanUtil.getLoanLenders(new Integer(123526)); 
        Lender lender = (Lender)loanLendersList.get(0); 

        System.out.println(lender.toString());
        System.out.println("-------------------------------------------------");

        List loanJournalEntriesList = loanUtil.getLoanJournalEntries(new Integer(123526));
        JournalEntry journalEntry = (JournalEntry) loanJournalEntriesList.get(0); 

        System.out.println(journalEntry.toString());
        System.out.println("-------------------------------------------------");

        loansList = loanUtil.getLoansByParams(new LoanSearchParams("fishing", "in_repayment", "female", "food", "af","mz", "23", "newest", 1)); loan = (Loan) loansList.get(0); System.out.println(loan.toString());
        
        System.out.println("-------------------------------------------------");

        List loanUpdatesList = loanUtil.getLoanUpdates(51107);
        LoanUpdate loanUpdate = (LoanUpdate) loanUpdatesList.get(1);
        
        System.out.println(loanUpdate.toString());
        System.out.println("-------------------------------------------------");

        LenderUtil lenderUtil = new LenderUtil();

        List lendersList = lenderUtil.getLendersDetails(new String[] { "alainh", "pamela1889" });
        lender = (Lender) lendersList.get(0);
        
        System.out.println(lender.toString());
        System.out.println("-------------------------------------------------");

        lender = (Lender) lendersList.get(1);
        
        System.out.println(lender.toString());
        System.out.println("-------------------------------------------------");

        Test Loan.getNewestLoans();
        loansList = loanUtil.getNewestLoans(5);
        loan = (Loan) loansList.get(10);
        
        System.out.println(loan.toString());

        
        LenderUtil lenderUtil = new LenderUtil();
          
		Test Lender.getLendersDetails();
		List lendersList = lenderUtil.getLendersDetails(new String[] { "jeremy"}); 
		Lender lender = (Lender) lendersList.get(0);

		System.out.println(lender.toString());
        
        Test Lender.getNewestLenders();
        lendersList = lenderUtil.getNewestLenders();
        lender = (Lender)lendersList.get(10); System.out.println(lender.toString());
         
        Test Lender.getLendersByParams();
        LenderUtil lenderUtil = new LenderUtil();
        LenderSearchParams lenderSearchParams = new LenderSearchParams(null, null, null, "newest", 11);
        List lendersList = lenderUtil.getLendersByParams(lenderSearchParams);
        Lender lender = (Lender);
        lendersList.get(0);
        System.out.println(lender.toString());

    }
*/
}