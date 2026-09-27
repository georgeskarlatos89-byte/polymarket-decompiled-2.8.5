package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zt5 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z) {
        String str;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        if (z) {
            str = "yMMMMEEEEd";
        } else {
            str = "yMMMd";
        }
        return gkn.a(longValue, str, locale, this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zt5) || !Intrinsics.areEqual("yMMMM", "yMMMM") || !Intrinsics.areEqual("yMMMd", "yMMMd") || !Intrinsics.areEqual("yMMMMEEEEd", "yMMMMEEEEd")) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 436998964;
    }
}
