package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r0d extends s0d {
    public final g0d a;
    public final int b;

    public r0d(g0d g0dVar, int i) {
        g0dVar.getClass();
        this.a = g0dVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r0d.class == obj.getClass()) {
                r0d r0dVar = (r0d) obj;
                if (this.b == r0dVar.b && Intrinsics.areEqual(this.a, r0dVar.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return sv6.o(sb, this.b, ')');
    }
}
