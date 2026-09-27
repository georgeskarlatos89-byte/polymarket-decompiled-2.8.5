package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class pt5 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static final mr8 a(Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        calendar.getClass();
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i4 = calendar.get(11);
        int i5 = (calendar.get(7) + 5) % 7;
        ejk.Companion.getClass();
        ejk ejkVar = (ejk) ejk.a().get(i5);
        int i6 = calendar.get(5);
        int i7 = calendar.get(6);
        gkc gkcVar = kkc.Companion;
        int i8 = calendar.get(2);
        gkcVar.getClass();
        return new mr8(i2, i3, i4, ejkVar, i6, i7, (kkc) kkc.a().get(i8), calendar.get(1), calendar.getTimeInMillis() + i);
    }
}
