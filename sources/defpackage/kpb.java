package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kpb {
    public static final kpb b = e(new LocaleList(new Locale[0]));
    public final lpb a;

    public kpb(lpb lpbVar) {
        this.a = lpbVar;
    }

    public static kpb a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return e(new LocaleList(localeArr));
        }
        return b;
    }

    public static kpb e(LocaleList localeList) {
        return new kpb(new lpb(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean c() {
        return this.a.a.isEmpty();
    }

    public final int d() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kpb) {
            if (this.a.equals(((kpb) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
