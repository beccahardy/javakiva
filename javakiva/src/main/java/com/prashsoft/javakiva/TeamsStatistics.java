package com.prashsoft.javakiva;

/**
 * @author becca@bhardy.net on 7/10/14.
 */
public class TeamsStatistics {
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

    //Required.Statistic to return. One of total_members
    public String stat_name;

    public int teamID;
}
