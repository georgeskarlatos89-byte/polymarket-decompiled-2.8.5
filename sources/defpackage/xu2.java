package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xu2 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final int c;
    public final ArrayList d;

    public xu2(Locale locale) {
        this.a = locale;
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        wg7 wg7Var = wu2.a;
        ArrayList arrayList = new ArrayList(wg7Var.size());
        int size = wg7Var.size();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) wg7Var.get(i);
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    public final uu2 a(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new uu2(1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC), localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public final yu2 b(long j) {
        return c(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    public final yu2 c(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        int i = value;
        return new yu2(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli(), i);
    }

    public final uu2 d() {
        LocalDate now = LocalDate.now();
        return new uu2(now.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli(), now.getYear(), now.getMonthValue(), now.getDayOfMonth());
    }

    public final uu2 e(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, fkn.b(str2, locale, this.b));
            return new uu2(parse.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli(), parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "CalendarModel";
    }
}
