package com.prashsoft.javakiva;

import com.prashsoft.javakiva.datafetchers.StatsFetcher;
import org.junit.Test;

/**
 * Created by becca on 7/9/14.
 */
public class StatisticsTest {

    @Test
    public void testJournalEntriesCommentsYear() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.stat_name = "average_comments";
        query.period = "cumulative";
        String result = fetcher.fetchJournalEntries(query);
        System.out.println(result);

    }

    @Test
    public void testJournalEntriesRecommendationsMonth() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.stat_name = "average_recommendations";
        query.period = "cumulative";
        String result = fetcher.fetchJournalEntries(query);
        System.out.println(result);


    }

    @Test
    public void testLenders() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        LendersStatistics query = new LendersStatistics();
        query.stat_name = "count_lenders";
        query.period = "cumulative";
        String result = fetcher.fetchLenders(query);
        System.out.println(result);
    }

    @Test
    public void testLoans() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        LoanStatistics query = new LoanStatistics();
        query.stat_name = "count";
        query.period = "cumulative";
        String result = fetcher.fetchLoans(query);
        System.out.println(result);
    }

    @Test
    public void testPartners() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        PartnersStatistics query = new PartnersStatistics();
        query.stat_name = "count";
        query.period = "cumulative";
        String result = fetcher.fetchPartners(query);
        System.out.println(result);
    }

    @Test
    public void testTeams() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        TeamsStatistics query = new TeamsStatistics();
        query.stat_name = "total_members";
        query.teamID = 100;
        query.period = "cumulative";
        String result = fetcher.fetchTeams(query);
        System.out.println(result);
    }

}
