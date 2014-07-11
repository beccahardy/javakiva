package com.prashsoft.javakiva;

/**
 * Created by becca on 7/10/14.
 */
public class PartnersStatistics {
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

    //Required.Statistic to return. One of count, countries
    public String stat_name;

    // Argument to aggregate results by. One of: partner_id
    public String aggregate;

    public boolean isCurrentPartner;
}
