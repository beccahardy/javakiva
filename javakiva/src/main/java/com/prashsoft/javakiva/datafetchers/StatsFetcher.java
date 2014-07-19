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
 * @author becca@bhardy.net on 7/9/14.
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
        queryParams.journalEntriesValidation();

        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/journal_entries/"
                + queryParams.getStatName() + ".json?period="
                + queryParams.getPeriod());
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;

    }

    //Lenders Fetcher
    public List<Map<String, String>> fetchLenders(LendersStatistics queryParams) throws Exception {
        queryParams.validate();

        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/lenders/"
                + queryParams.getStatName() + ".json?period="
                + queryParams.getPeriod());
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;
    }


    //Loans Fetcher
    public List<Map<String, String>> fetchLoans(LoanStatistics queryParams) throws Exception {
        queryParams.validate();

        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/loans/"
                + queryParams.getStatName() + ".json?period="
                + queryParams.getPeriod());
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;
    }


    //Partners Fetcher
    public List<Map<String, String>> fetchPartners(PartnersStatistics queryParams) throws Exception {
        queryParams.validate();

        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/partners/"
                + queryParams.getStatName() + ".json?period="
                + queryParams.getPeriod());
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;
    }


    //Teams Fetcher
    public List<Map<String, String>> fetchTeams(TeamsStatistics queryParams) throws Exception {
        queryParams.validate();
        WebTarget target = client.target("http://api.kivaws.org/v1/statistics/teams/"
                + queryParams.getStatName() + ".json?period="
                + queryParams.getPeriod() + "&team_id=" + queryParams.getTeamID());
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        List<Map<String, String>> result = mapper.readValue(value, typeRef);
        return result;
    }


}