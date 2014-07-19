package com.prashsoft.javakiva;

/**
 * @author becca@bhardy.net on 7/10/14.
 */
public class LoanStatistics {
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

    //Required Statistic Returns One of: total, count, average_per_entrep,
    // num_entreps, gender_num_male, gender_num_female, gender_num_specified
    private String statName;

    // Argument to aggregate results by. One of: partner_id, gender
    private String aggregate;

    // partner_id(number) Partner ID to limit results by
    private int partnerID;

    //One of AF, AL, AM, AZ, BA, BD, BF, BG, BI, BJ, BO, BR, BW, BZ, CD, CG,
    // CI, CL, CM, CO, CR, CV, DO, EC, GE, GH, GT, GZ, HN, HT, ID, IL, IN, IQ, JO,
    // KE, KG, KH, LA, LB, LK, LR, MD, ML, MN, MR, MW, MX, MZ, NA, NG, NI, NP, PA, PE,
    // PG, PH, PK, PS, PY, QS, RW, SL, SN, SO, SR, SV, TD, TG, TH, TJ, TL, TR, TZ, UA,
    // UG, US, VC, VN, VU, WS, XK, YE, ZA, ZM, ZW
    private String countryCode;

    private boolean isRaised;

    private boolean isRefunded;

    private boolean isEnded;





    public boolean isEnded() {
        return isEnded;
    }

    public void setEnded(boolean isEnded) {
        this.isEnded = isEnded;
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

    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isRaised() {
        return isRaised;
    }

    public void setRaised(boolean isRaised) {
        this.isRaised = isRaised;
    }

    public boolean isRefunded() {
        return isRefunded;
    }

    public void setRefunded(boolean isRefunded) {
        this.isRefunded = isRefunded;
    }

    public void validate() {
        if (!getStatName().equals("total")
                && !getStatName().equals("count")
                && !getStatName().equals("average_per_entrep")
                && !getStatName().equals("num_entreps")
                && !getStatName().equals("gender_num_male")
                && !getStatName().equals("gender_num_female")
                && !getStatName().equals("gender_num_specified")
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
