package com.prashsoft.javakiva;

/**
 * @author becca@bhardy.net on 7/10/14.
 */
public class LoanStatistics {
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

    //Required.Statistic to return. One of:One of: total, count, average_per_entrep,
    // num_entreps, gender_num_male, gender_num_female, gender_num_specified
    public String stat_name;

    // Argument to aggregate results by. One of: partner_id, gender
    public String aggregate;

    // partner_id(number) Partner ID to limit results by
    public int partnerID;

    //One of AF, AL, AM, AZ, BA, BD, BF, BG, BI, BJ, BO, BR, BW, BZ, CD, CG,
    // CI, CL, CM, CO, CR, CV, DO, EC, GE, GH, GT, GZ, HN, HT, ID, IL, IN, IQ, JO,
    // KE, KG, KH, LA, LB, LK, LR, MD, ML, MN, MR, MW, MX, MZ, NA, NG, NI, NP, PA, PE,
    // PG, PH, PK, PS, PY, QS, RW, SL, SN, SO, SR, SV, TD, TG, TH, TJ, TL, TR, TZ, UA,
    // UG, US, VC, VN, VU, WS, XK, YE, ZA, ZM, ZW
    public String countryCode;

    public boolean isRaised;

    public boolean isRefunded;

    public boolean isEnded;


}
