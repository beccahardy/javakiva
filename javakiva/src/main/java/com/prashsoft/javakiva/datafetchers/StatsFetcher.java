package com.prashsoft.javakiva.datafetchers;

import com.prashsoft.javakiva.*;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * Created by becca on 7/9/14.
 */
public class StatsFetcher {

    HttpClient client = new HttpClient();

    //Journal Entries Fetchers
    public String fetchJournalEntries(JournalEntriesStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/journal_entries/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));

    }


    //Lenders Fetcher
    public String fetchLenders(LendersStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/lenders/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));

    }

    //Loans Fetcher
    public String fetchLoans(LoanStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/loans/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));
    }

    //Partners Fetcher
    public String fetchPartners (PartnersStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/partners/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));
    }

    //Teams Fetcher
    public String fetchTeams (TeamsStatistics queryParams) throws Exception {
        HttpMethod method = new GetMethod("http://api.kivaws.org/v1/statistics/teams/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period + "&team_id=" + queryParams.teamID);

        client.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        return (new String(responseBody));
    }

}
