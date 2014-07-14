package com.prashsoft.javakiva;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import com.prashsoft.javakiva.KivaUtil;

public class UnitTests extends TestCase { 

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		LoanUtil loanUtil = new LoanUtil();

		//TODO
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		//TODO
	}

	@Test
	public void assertTrueIsTrue() {
		assertTrue(true);
	}

	@Test
	public void assertTrueIsNotFalse() {
		assertTrue(false);
	}

	@Test
	public void LoanDetails() {
				//message, expected, actual
		assertEquals("TODO", "TODO", loanUtil.getLoansDetails("55781"));
	}

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

        Test Loan.getNewestLoans()loansList = loanUtil.getNewestLoans(5);
        loan = (Loan) loansList.get(10);
        
        System.out.println(loan.toString());

        
        LenderUtil lenderUtil = new LenderUtil();
          
		Test Lender.getLendersDetails() List lendersList = lenderUtil.getLendersDetails(new String[] { "jeremy"}); 
		Lender lender = (Lender) lendersList.get(0);

		System.out.println(lender.toString());
        
        Test Lender.getNewestLenders() lendersList = lenderUtil.getNewestLenders(); lender = (Lender)lendersList.get(10); System.out.println(lender.toString());
         
        Test Lender.getLendersByParams()LenderUtil lenderUtil = new LenderUtil();
        LenderSearchParams lenderSearchParams = new LenderSearchParams(null, null, null, "newest", 11);
        List lendersList = lenderUtil.getLendersByParams(lenderSearchParams);
        Lender lender = (Lender) lendersList.get(0);
        System.out.println(lender.toString());
    }
}