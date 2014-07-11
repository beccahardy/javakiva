package com.prashsoft.javakiva;


// Average number of comments or recommendations on journal entries
//Aggregate by cumulative, year, quarter, month, week, day, hour

public class JournalEntriesStatistics {

    //The page position of results to return.
    public int page;

    //The application id in reverse DNS notation.
    public String app_id;

    //Start date for the data range as a UNIX timestamp.
    public int start;

    // End date for the data range as a UNIX timestamp.
    public int end;

    //Period of granularity to section the data. One of:cumulative,year,quarter,month,week,day,hour
    public String period;

    //Required.Statistic to return. One of:average_comments,average_recommendations
    public String stat_name;

    // Argument to aggregate results by. One of: partner_id
    public String aggregate;

    // partner_id(number) Partner ID to limit results by
    public int partnerID;

    //One of:true,false
    public boolean is_rate_eligible;




}

