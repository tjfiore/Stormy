package com.example.tjae.stormy.weather;


import com.example.tjae.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Current {
    private String mIcon;
    private long mTime;
    private double mTemp;
    private double mHumid;
    private double mPrecipChance;
    private  String mSummary;
    private String mTimezone;

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId(){
        return Forecast.getIconId(mIcon);
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemp() {
        return (int) Math.round(mTemp);
    }

    public void setTemp(double temp) {
        mTemp = temp;
    }

    public double getHumid() {
        return mHumid;
    }

    public void setHumid(double humid) {
        mHumid = humid;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int) Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
