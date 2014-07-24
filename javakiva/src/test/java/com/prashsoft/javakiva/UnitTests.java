package com.prashsoft.javakiva;

import junit.framework.TestCase;

// import static org.hamcrest.CoreMatchers.is;
// import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;


public class UnitTests extends TestCase { 

	public void testAssertTrueIsTrue() {
		assertTrue(true);
	}

	public void testAssertTrueIsNotFalse() {
		assertTrue(!false);
	}

 // public void testLoansDetails() { OK
 //        System.out.println("Testing Loan Details: ");
 //        LoanUtil loanUtil = new LoanUtil();
 //        List loansList = loanUtil.getLoansDetails("55781"); 
 //        Loan loan = (Loan)loansList.get(0); 
        
 //        StringBuilder sb = new StringBuilder();
 //        sb.append(" Activity: Fishing\n");
 //        sb.append(" Basket Amount: \n");
 //        sb.append(" Funded Amount: 425.0\n");
 //        sb.append(" Id: 55781\n");
 //        sb.append(" Image: http://www.kiva.org/img/w800/179190.jpg\n");
 //        sb.append(" Loan Amount: 425.0\n");
 //        sb.append(" Loan Description: null\n");
 //        sb.append("Location: \n");
 //        sb.append("Country Code: MZ\n");
 //        sb.append("Country: Mozambique\n");
 //        sb.append("Town: Catembe, Maputo\n");
 //        sb.append("Geo Level: town\n");
 //        sb.append("Geo Pairs: -26.009167 32.566667\n");
 //        sb.append("Geo Type: point\n");
 //        sb.append("\n");
 //        sb.append(" Name: Albertina\n");
 //        sb.append(" Paid Amount: 425.0\n");
 //        sb.append(" Posted Date: Sat, 12 Jul 2008 23:20:18 GMT\n");
 //        sb.append(" Funded Date: Sun, 13 Jul 2008 01:53:27 GMT\n");
 //        sb.append(" Raised Amount: \n");
 //        sb.append(" Sector: Food\n");
 //        sb.append(" Status: paid\n");
 //        sb.append(" Partner Id: 23\n");
 //        sb.append(" Use: To buy wood to repair her boat\n");
 //        sb.append(" Borrowers: \n");
 //        sb.append("Borrower Id: null\n");
 //        sb.append("Borrower First Name: Albertina\n");
 //        sb.append("Borrower Last Name: \n");
 //        sb.append("Borrower Gender: F\n");
 //        sb.append("Borrower Pictured: true\n");
 //        sb.append("Terms: \n");
 //        sb.append("Disbursal Amount: 10000.0\n");
 //        sb.append("Disbursal Currency: MZN\n");
 //        sb.append(" Local Payments: Due Date: Tue Aug 26 07:00:00 CDT 2008\n");
 //        sb.append(" Local Payments: Amount: 625.0\n");
 //        sb.append(" Scheduled Payments: Due Date: Thu Oct 16 07:00:00 CDT 2008\n");
 //        sb.append(" Scheduled Payments: Amount: 26.56\n");
 //        sb.append("Disbursal Date: Sat Jul 26 20:53:27 CDT 2008\n");
 //        sb.append("Loan Amount: 425.0\n");
 //        sb.append("Loss Liability: Non Payment: partner\n");
 //        sb.append("Loss Liability: Currency Exchange: partner\n");
 //        sb.append(" Payments: \n");
 //        sb.append("Payment Id: 296559\n");
 //        sb.append("Payment Amount: 27.0\n");
 //        sb.append("Payment Local Amount: 635.29\n");
 //        sb.append("Payment Processed Date: Fri Aug 15 09:00:01 CDT 2008\n");
 //        sb.append("Payment Settlement Date: Fri Aug 29 05:14:53 CDT 2008\n");
 //        sb.append("Payment Comment: scheduled_repayment\n");
 //        sb.append("Payment Rounded Local Amount: 642.6\n");
 //        sb.append("Posted Date: Sat Jul 12 18:20:18 CDT 2008\n");
 //        sb.append("Funded Date: Sat Jul 12 20:53:27 CDT 2008\n");
 //        sb.append("Journal Totals: Entries: 0\n");
 //        sb.append("Journal Totals: Bulk Entries: null");
 //        assertEquals(sb.toString(), loan.toString()); 
 // }


	// public void testGetNewestLoans() { //OK
 //        System.out.println("Testing GetNewestLoans:");
 //        LoanUtil loanUtil = new LoanUtil();
 //        assertNotNull(loanUtil.getNewestLoans());
 //    }


    // public void testGetLoansByParams() { //NullPointerException
    //  System.out.println("Testing GetLoansByParams:");
    //     LoanUtil loanUtil = new LoanUtil();
    //     List loansList = loanUtil.getLoansByParams(new LoanSearchParams("fishing", "in_repayment", "female", "food", "af","mz", "23", "newest", 1)); 
    //     Loan loan = (Loan) loansList.get(0); 
    //     System.out.println(loan.toString());
    //     System.out.println("-------------------------------------------------");
    // }

    // public void testGetLoanLenders() { //illegal arg exception - no bean specified
    //     System.out.println("Testing GetLoanLenders:");
    //     LoanUtil loanUtil = new LoanUtil();
    //     List<Lender> loanLendersList = loanUtil.getLoanLenders(123526);
    //     Lender lender = loanLendersList.get(0);

    //     System.out.println("Testing getLoanLenders:");
    //     System.out.println(lender.toString());
    // }

    // public void testGetLoanJournalEntries() { //OK
    //     LoanUtil loanUtil = new LoanUtil();
    //     List loanJournalEntriesList = loanUtil.getLoanJournalEntries(new Integer(123526));
    //     JournalEntry journalEntry = (JournalEntry) loanJournalEntriesList.get(0); 

    //     System.out.println("Testing getLoanJournalEntries:");
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(" Journal Entry Author: ");
    //     sb.append("Jonathan Neri" + "\n");
    //     sb.append(" Journal Entry Body: ");
    //     sb.append("<p>Norma Juadong loan was Php 10,000. She bought farm supplies and grown her harvest. She was glad because the loan has increased their income. Thanks to the fertilizers and pesticides. Also to the lenders.</p>\n");
    //     sb.append(" Journal Entry Bulk: ");
    //     sb.append("\n");
    //     sb.append(" Journal Entry Comment Count: ");
    //     sb.append("0\n");
    //     sb.append(" Journal Entry Date: ");
    //     sb.append("Sat Dec 05 13:15:42 CST 2009\n");
    //     sb.append(" Journal Entry Id: ");
    //     sb.append("204118\n");
    //     sb.append(" Journal Entry Recommendation Count: ");
    //     sb.append("0\n");
    //     sb.append(" Journal Entry Subject: ");
    //     sb.append("Norma Juadong, Loan Update\n");

    //     assertEquals(sb.toString(), journalEntry.toString());
    // }
    
    // public void testGetNewestLenders() { //OK
    //     System.out.println("Testing GetNewestLenders: ")
    //     LenderUtil lenderUtil = new LenderUtil();
    //     assertNotNull(lenderUtil.getNewestLenders());
    // }

    // public void testGetNewestLoans(){ //OK
    //     System.out.println("Testing Get Newest Loans");
    //     LoanUtil loanUtil = new LoanUtil();
    //     assertNotNull(loanUtil.getNewestLoans());
    // }

    // public void testGetLenderDetails(){ //static reference nonstatic context
    //     LenderUtil lenderUtil = new LenderUtil();
    //     lenderUtil.getLendersDetails();
    //     String[] lenderID = {"jeremy"};
    //     List lendersList = lenderUtil.getLendersDetails(lenderID); 
    //     Lender lender = (Lender) lendersList.get(0);

    //     System.out.println(lender.toString());
    // }

       
    public void testGetLendersByParams(){ //NullPointerException
        LenderUtil lenderUtil = new LenderUtil();
        LenderSearchParams lenderSearchParams = new LenderSearchParams(null, null, null, "newest", 11);
        List lendersList = lenderUtil.getLendersByParams(lenderSearchParams);
        Lender lender = new Lender();
        lendersList.get(0);
        assertNotNull(lender.toString());
    } 
}