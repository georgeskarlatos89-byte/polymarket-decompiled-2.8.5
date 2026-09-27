package defpackage;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zv5 {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");
    public static final String b = "Braze v43.1.1 .".concat("DateTimeUtils");
    public static boolean c = true;
    public static final Lazy d = LazyKt.lazy(new k65(24));

    public static Date a(int i, int i2, int i3) {
        if (i > 0) {
            if (i2 >= 0 && i2 < 12) {
                if (i3 >= 1) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, 1);
                    TimeZone timeZone = a;
                    gregorianCalendar.setTimeZone(timeZone);
                    int actualMaximum = gregorianCalendar.getActualMaximum(5);
                    if (i3 <= actualMaximum) {
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(i, i2, i3, 0, 0, 0);
                        gregorianCalendar2.setTimeZone(timeZone);
                        Date time = gregorianCalendar2.getTime();
                        time.getClass();
                        return time;
                    }
                    StringBuilder n = m51.n(actualMaximum, "Day must not exceed ", i2, " for month ", " of year ");
                    n.append(i);
                    n.append(", was ");
                    n.append(i3);
                    throw new IllegalArgumentException(n.toString().toString());
                }
                f27.q(ace.f(i3, "Day must be at least 1, was "));
                return null;
            }
            f27.q(ace.f(i2, "Month must be between 0 and 11, was "));
            return null;
        }
        f27.q(ace.f(i, "Year must be positive, was "));
        return null;
    }

    public static final String b(Date date, ul1 ul1Var, TimeZone timeZone) {
        ul1Var.getClass();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ul1Var.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        format.getClass();
        return format;
    }

    public static /* synthetic */ String c(Date date, ul1 ul1Var) {
        TimeZone timeZone = a;
        timeZone.getClass();
        return b(date, ul1Var, timeZone);
    }

    public static String d(long j) {
        ul1 ul1Var = ul1.ANDROID_LOGCAT;
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        ul1Var.getClass();
        return b(new Date(j), ul1Var, timeZone);
    }

    public static final long e() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && c) {
                long millis = ((Clock) d.getValue()).millis();
                if (millis >= 1691768838316L) {
                    return millis;
                }
            }
            return currentTimeMillis;
        } catch (Exception e) {
            b69.o(b, pm1.D, e, false, new k65(23), 8);
            c = false;
            return currentTimeMillis;
        }
    }

    public static final long f() {
        return e() / 1000;
    }

    public static final Date g(String str, ul1 ul1Var) {
        ul1Var.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ul1Var.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(a);
        try {
            Date parse = simpleDateFormat.parse(str);
            parse.getClass();
            return parse;
        } catch (Exception e) {
            b69.o(b, pm1.E, e, false, new ln1(str, 29), 8);
            throw e;
        }
    }
}
