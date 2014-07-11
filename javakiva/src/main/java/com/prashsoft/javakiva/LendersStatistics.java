package com.prashsoft.javakiva;

/**
 * Created by becca on 7/10/14.
 */
public class LendersStatistics {

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

    //Required.Statistic to return. One of:One of: count_logins, count_lenders, average_loans_per_lender,
    // average_total_loaned_per_lender, average_loans_per_login, average_total_loaned_per_login
    public String stat_name;
}
