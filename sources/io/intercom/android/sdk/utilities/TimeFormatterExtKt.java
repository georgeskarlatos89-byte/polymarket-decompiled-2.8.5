package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.text.format.DateFormat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.text.e;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"formattedDateFromLong", "", "", "context", "Landroid/content/Context;", "formattedDateForDayDivider", "toISOFormat", "toISOFormatApi26", "toISOFormatPreApi26", "toHourOfDay", "toHourOfDayApi26", "zoneId", "Ljava/time/ZoneId;", "toHourOfDayPreApi26", "timeZone", "Ljava/util/TimeZone;", "getFormattedTime", AttributeType.DATE, "Ljava/util/Date;", "getDifferenceInMinutes", "getDifferenceInHours", "getDifferenceInDays", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeFormatterExtKt {
    public static final String formattedDateForDayDivider(long j, Context context) {
        context.getClass();
        if (j <= 0) {
            return "";
        }
        Date date = new Date(j * 1000);
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        format.getClass();
        return format;
    }

    public static final String formattedDateFromLong(long j, Context context) {
        context.getClass();
        if (j <= 0) {
            return "";
        }
        return getFormattedTime(context, new Date(j * 1000));
    }

    private static final long getDifferenceInDays(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / 86400000;
    }

    private static final long getDifferenceInHours(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / 3600000;
    }

    private static final long getDifferenceInMinutes(Date date) {
        return (System.currentTimeMillis() - date.getTime()) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / 7;
        if (j > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", String.valueOf(j)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString();
        }
        if (differenceInMinutes >= 1) {
            return Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString();
        }
        return context.getText(R.string.intercom_time_just_now).toString();
    }

    public static final String toHourOfDay(long j) {
        return toHourOfDayApi26$default(j, null, 1, null);
    }

    public static final String toHourOfDayApi26(long j, ZoneId zoneId) {
        zoneId.getClass();
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j * 1000), zoneId);
        String format = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH).format(ofInstant);
        if (ofInstant.getHour() == 0) {
            format.getClass();
            return e.s(format, "12:00", "00:00");
        }
        format.getClass();
        return format;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j, zoneId);
    }

    public static final String toHourOfDayPreApi26(long j, TimeZone timeZone) {
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j2 = j * 1000;
        String format = simpleDateFormat.format(Long.valueOf(j2));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        if (calendar.get(11) == 0) {
            format.getClass();
            return e.s(format, "12:00", "00:00");
        }
        format.getClass();
        return format;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j, timeZone);
    }

    public static final String toISOFormat(long j) {
        return toISOFormatApi26(j);
    }

    public static final String toISOFormatApi26(long j) {
        String format = DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(j * 1000));
        format.getClass();
        return format;
    }

    public static final String toISOFormatPreApi26(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        format.getClass();
        return format;
    }
}
