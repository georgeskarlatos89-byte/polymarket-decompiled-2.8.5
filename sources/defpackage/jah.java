package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jah {
    public final long a;
    public final long b;
    public final int c;

    public jah(int i, long j, long j2) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jah.class == obj.getClass()) {
            jah jahVar = (jah) obj;
            if (this.a == jahVar.a && this.b == jahVar.b && this.c == jahVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = u1k.a;
        Locale locale = Locale.US;
        StringBuilder p = ace.p(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        p.append(this.b);
        p.append(", speedDivisor=");
        p.append(this.c);
        return p.toString();
    }
}
