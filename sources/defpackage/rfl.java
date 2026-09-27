package defpackage;

import java.util.Calendar;
import java.util.Locale;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rfl extends mlm {
    public long c;
    public String d;

    @Override // defpackage.mlm
    public final boolean h1() {
        Calendar calendar = Calendar.getInstance();
        this.c = (calendar.get(16) + calendar.get(15)) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = ix2.p(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long k1() {
        i1();
        return this.c;
    }

    public final String l1() {
        i1();
        return this.d;
    }
}
