package com.prashsoft.javakiva;

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




   /* partner_id(number)

    Partner ID
    to limit
    results by
    .

    is_rate_eligible(string)

    One of
    :true,false
            */

   /* GET /statistics/journal_entries/:stat_name
    GET /statistics/lenders/:stat_name
    GET /statistics/loans/:stat_name
    GET /statistics/partners/:stat_name
    GET /statistics/teams/:stat_name

    */

    //public int journalEntriesStats() {

        // or averages the number of comments or recommendations on journal entries
        //theoretically you can break
        // down by cumulative, year, quarter, month, week, day, hour
    }

