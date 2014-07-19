package com.prashsoft.javakiva;

/**
 * @author becca@bhardy.net on 7/10/14.
 */
public class PartnersStatistics {
    //The page position of results to return.
    private int page;

    //The application id in reverse DNS notation.
    private String appId;

    //Start date for the data range as a UNIX timestamp.
    private int start;

    // End date for the data range as a UNIX timestamp.
    private int end;

    //Period of granularity to section the data. One of:cumulative,year,quarter,month,week,day,hour
    private String period;

    //Required.Statistic to return. One of count, countries
    private String statName;

    // Argument to aggregate results by. One of: partner_id
    private String aggregate;

    private boolean isCurrentPartner;

    public boolean isCurrentPartner() {
        return isCurrentPartner;
    }

    public void setCurrentPartner(boolean isCurrentPartner) {
        this.isCurrentPartner = isCurrentPartner;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public String getAggregate() {
        return aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public void validate() {
        if (!getStatName().equals("count")
                && !getStatName().equals("countries")

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
