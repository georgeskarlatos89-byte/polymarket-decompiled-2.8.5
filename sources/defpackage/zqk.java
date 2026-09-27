package defpackage;

import java.io.Serializable;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = grk.class)
/* loaded from: classes6.dex */
public final class zqk implements Comparable<zqk>, Serializable {
    public static final yqk Companion = new Object();
    public final YearMonth a;

    public zqk(YearMonth yearMonth) {
        yearMonth.getClass();
        this.a = yearMonth;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zqk zqkVar) {
        zqk zqkVar2 = zqkVar;
        zqkVar2.getClass();
        return this.a.compareTo(zqkVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zqk) {
                if (!Intrinsics.areEqual(this.a, ((zqk) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String format = ((DateTimeFormatter) frk.a.getValue()).format(this.a);
        format.getClass();
        return format;
    }
}
