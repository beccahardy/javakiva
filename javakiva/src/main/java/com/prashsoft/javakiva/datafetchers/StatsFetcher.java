package com.prashsoft.javakiva.datafetchers;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prashsoft.javakiva.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

/**
 * Created by becca on 7/9/14.
 */

public class StatsFetcher {

    JsonFactory factory = new JsonFactory();
    ObjectMapper mapper = new ObjectMapper(factory);
    TypeReference<List<Map<String, String>>> typeRef
            = new TypeReference<List<Map<String, String>>>() {
    };

    Client client = ClientBuilder.newClient();


    //Journal Entries Fetchers
    public List<Map<String, String>> fetchJournalEntries(JournalEntriesStatistics queryParams) throws Exception {
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/journal_entries/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;


    }


    //Lenders Fetcher
    public String fetchLenders(LendersStatistics queryParams) throws Exception {
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/lenders/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        return value;
    }

    //Loans Fetcher
    public String fetchLoans(LoanStatistics queryParams) throws Exception {
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/loans/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        return value;
    }

    //Partners Fetcher
    public String fetchPartners(PartnersStatistics queryParams) throws Exception {
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/partners/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        return value;
    }

    //Teams Fetcher
    public String fetchTeams(TeamsStatistics queryParams) throws Exception {
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/teams/"
                + queryParams.stat_name + ".json?period="
                + queryParams.period + "&team_id=" + queryParams.teamID);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        return value;
    }

}
