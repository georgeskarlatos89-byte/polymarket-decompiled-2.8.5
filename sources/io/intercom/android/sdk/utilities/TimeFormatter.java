package io.intercom.android.sdk.utilities;

import android.content.Context;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class TimeFormatter {
    private SimpleDateFormat absoluteDateFormatter;
    private SimpleDateFormat absoluteTimeFormatter;
    private final Context context;
    private final TimeProvider timeProvider;

    public TimeFormatter(Context context, TimeProvider timeProvider) {
        this.context = context;
        this.timeProvider = timeProvider;
    }

    public static String formatFromUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(time);
    }

    public static String formatTimeForTickets(long j, Context context) {
        Phrase put;
        Date date = new Date(j * 1000);
        long currentTimeMillis = (System.currentTimeMillis() - date.getTime()) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        long currentTimeMillis2 = (System.currentTimeMillis() - date.getTime()) / 3600000;
        long currentTimeMillis3 = (System.currentTimeMillis() - date.getTime()) / 86400000;
        long j2 = currentTimeMillis3 / 7;
        if (j2 > 0) {
            put = Phrase.from(context, R.string.intercom_time_week_ago).put("delta", Long.toString(j2));
        } else if (currentTimeMillis3 > 0) {
            put = Phrase.from(context, R.string.intercom_time_day_ago).put("delta", Long.toString(currentTimeMillis3));
        } else if (currentTimeMillis2 > 0) {
            put = Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", Long.toString(currentTimeMillis2));
        } else if (currentTimeMillis >= 1) {
            put = Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", Long.toString(currentTimeMillis));
        } else {
            return context.getString(R.string.intercom_time_just_now);
        }
        return put.format().toString();
    }

    public static String formatTimeInMillisAsDate(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static String formatToUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(time);
    }

    private CharSequence getAdminActiveStatus(Date date) {
        Phrase put;
        long differenceInMinutes = getDifferenceInMinutes(date);
        if (differenceInMinutes > 8640) {
            return this.context.getText(R.string.intercom_active_week_ago);
        }
        if (differenceInMinutes >= 1411) {
            put = Phrase.from(this.context, R.string.intercom_active_day_ago).put("days", Long.toString((((differenceInMinutes / 60) - 13) / 24) + 1));
        } else if (differenceInMinutes >= 53) {
            put = Phrase.from(this.context, R.string.intercom_active_hour_ago).put("hours", Long.toString(((differenceInMinutes - 31) / 60) + 1));
        } else if (differenceInMinutes >= 38) {
            put = Phrase.from(this.context, R.string.intercom_active_minute_ago).put("minutes", Long.toString(45L));
        } else {
            Context context = this.context;
            if (differenceInMinutes >= 16) {
                put = Phrase.from(context, R.string.intercom_active_minute_ago).put("minutes", Long.toString(30L));
            } else {
                put = Phrase.from(context, R.string.intercom_active_15m_ago).put("minutes", Long.toString(15L));
            }
        }
        return put.format();
    }

    private Date getDateFromTimeStamp(long j) {
        return new Date(j * 1000);
    }

    private long getDifferenceInMinutes(Date date) {
        return (this.timeProvider.currentTimeMillis() - date.getTime()) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
    }

    public static int getHour(long j) {
        return new Date(j).getHours();
    }

    public static int getMinute(long j) {
        return new Date(j).getMinutes();
    }

    public boolean shouldShowActiveOrAwayState(String str) {
        return str.equals("en");
    }

    public CharSequence getAdminActiveStatus(LastParticipatingAdmin lastParticipatingAdmin, Provider<AppConfig> provider) {
        if (!shouldShowActiveOrAwayState(provider.get().getLocale())) {
            if (lastParticipatingAdmin.getLastActiveAt() <= 0) {
                return "";
            }
            return getAdminActiveStatus(getDateFromTimeStamp(lastParticipatingAdmin.getLastActiveAt()));
        }
        boolean isActive = lastParticipatingAdmin.isActive();
        Context context = this.context;
        if (isActive) {
            return context.getString(R.string.intercom_active_state);
        }
        return context.getString(R.string.intercom_away_state);
    }
}
