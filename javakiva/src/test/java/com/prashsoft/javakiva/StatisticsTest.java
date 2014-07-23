package com.prashsoft.javakiva;

import com.prashsoft.javakiva.datafetchers.StatsFetcher;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * @author becca@bhardy.net on 7/9/14.
 */
public class StatisticsTest {
/* COMMENTED OUT TO PREVENT RATE LIMITING BY KIVA'S API
    @Test
    public void testJournalEntriesCommentsYear() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.setStatName("average_comments");
        query.setPeriod("month");
        List<Map<String, String>> result = fetcher.fetchJournalEntries(query);
        System.out.println("Average Journal Entries Comments by Month: " + result);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testJournalEntriesRecommendationsMonth() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.setStatName("average_recommendations");
        query.setPeriod("cumulative");
        List<Map<String, String>> result = fetcher.fetchJournalEntries(query);
        System.out.println("Average Journal Entries Recommendations, Cumulative: " + result);
        assertTrue(result.size() >= 1);


    }

    @Test
    public void testLenders() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        LendersStatistics query = new LendersStatistics();
        query.setStatName("count_lenders");
        query.setPeriod("cumulative");
        List<Map<String, String>> result = fetcher.fetchLenders(query);
        System.out.println("Number of Lenders, Cumulative: " + result);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testLoans() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        LoanStatistics query = new LoanStatistics();
        query.setStatName("count");
        query.setPeriod("cumulative");
        List<Map<String, String>> result = fetcher.fetchLoans(query);
        System.out.println("Count of Loans, Cumulative: " + result);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testPartners() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        PartnersStatistics query = new PartnersStatistics();
        query.setStatName("count");
        query.setPeriod("month");
        List<Map<String, String>> result = fetcher.fetchPartners(query);
        System.out.println("Count of Partners by Month: " + result);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testTeams() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        TeamsStatistics query = new TeamsStatistics();
        query.setStatName("total_members");
        query.setTeamID(100);
        query.setPeriod("month");
        List<Map<String, String>> result = fetcher.fetchTeams(query);
        System.out.println("Total Members by Team, by Month: " + result);
        assertTrue(result.size() >= 1);
    }
*/
}
