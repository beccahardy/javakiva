package com.prashsoft.javakiva;

/**
 * @author becca@bhardy.net on 7/10/14.
 */
public class LendersStatistics {

    //The page position of results to return.
    private int page;

    //The application id in reverse DNS notation.
    private String appID;

    //Start date for the data range as a UNIX timestamp.
    private int start;

    // End date for the data range as a UNIX timestamp.
    private int end;

    //Period of granularity to section the data. One of:cumulative,year,quarter,month,week,day,hour
    private String period;

    //Required.Statistic to return. One of:One of: count_logins, count_lenders, average_loans_per_lender,
    // average_total_loaned_per_lender, average_loans_per_login, average_total_loaned_per_login
    private String statName;





    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void validate() {
        if (!getStatName().equals("count_logins")
                && !getStatName().equals("count_lenders")
                && !getStatName().equals("average_loans_per_lender")
                && !getStatName().equals("average_total_loaned_per_lender")
                && !getStatName().equals("average_loans_per_login")
                && !getStatName().equals("average_total_loaned_per_login")
                ) {
            throw new IllegalArgumentException();
        }

        if (!getPeriod().equals("cumulative")
                && !getPeriod().equals("year")
                && !getPeriod().equals("quarter")
                && !getPeriod().equals("month")
                && !getPeriod().equals("week")
                && !getPeriod().equals("day")
                && !getPeriod().equals("hour")
                ) {
            throw new IllegalArgumentException();
        }
    }


}
