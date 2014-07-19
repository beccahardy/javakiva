package com.prashsoft.javakiva;


// Average number of comments or recommendations on journal entries
//Aggregate by cumulative, year, quarter, month, week, day, hour

public class JournalEntriesStatistics {

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

    //Required.Statistic to return. One of:average_comments,average_recommendations
    private String statName;

    // Argument to aggregate results by. One of: partner_id
    private String aggregate;

    // partner_id(number) Partner ID to limit results by
    private int partnerID;

    //One of:true,false
    private boolean isRateEligible;






    public boolean isRateEligible() {
        return isRateEligible;
    }

    public void setRateEligible(boolean rateEligible) {
        this.isRateEligible = rateEligible;
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

    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }


    public void journalEntriesValidation() {
        if (!getStatName().equals("average_comments") && !getStatName().equals("average_recommendations")) {
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

