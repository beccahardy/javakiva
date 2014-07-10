package com.prashsoft.javakiva;

import com.prashsoft.javakiva.datafetchers.StatsFetcher;
import org.junit.Test;

/**
 * Created by becca on 7/9/14.
 */
public class StatisticsTest {

    @Test
    public void testJournalEntriesStatsYear() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.period = "year";
        String result = fetcher.fetchJournalEntriesStats(query);
        System.out.println(result);

    }

    @Test
    public void testJournalEntriesStatsMonth() throws Exception {
        StatsFetcher fetcher = new StatsFetcher();
        JournalEntriesStatistics query = new JournalEntriesStatistics();
        query.period = "month";
        String result = fetcher.fetchJournalEntriesStats(query);
        System.out.println(result);


    }
}
