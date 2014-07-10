package com.prashsoft.javakiva.datafetchers;

import com.prashsoft.javakiva.JournalEntriesStatistics;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * Created by becca on 7/9/14.
 */
public class StatsFetcher {

    HttpClient client = new HttpClient();



    public String fetchJournalEntriesStats(JournalEntriesStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/journal_entries/average_comments.json?period="
        + queryParams.period);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));

    }

}
