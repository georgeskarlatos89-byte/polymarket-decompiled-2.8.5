package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hch extends jch {
    public final pob c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(pob pobVar, int i) {
        super(pobVar, i);
        pobVar.getClass();
        this.c = pobVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hch)) {
            return false;
        }
        hch hchVar = (hch) obj;
        if (Intrinsics.areEqual(this.c, hchVar.c) && this.d == hchVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.a.hashCode() * 31);
    }

    public final String toString() {
        return "Month(localDate=" + this.c + ", index=" + this.d + ")";
    }
}
