package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gch extends jch {
    public final pob c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gch(pob pobVar, int i) {
        super(pobVar, i);
        pobVar.getClass();
        this.c = pobVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gch)) {
            return false;
        }
        gch gchVar = (gch) obj;
        if (Intrinsics.areEqual(this.c, gchVar.c) && this.d == gchVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.a.hashCode() * 31);
    }

    public final String toString() {
        return "DayOfMonth(localDate=" + this.c + ", index=" + this.d + ")";
    }
}
