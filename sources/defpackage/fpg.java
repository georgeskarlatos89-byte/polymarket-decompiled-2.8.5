package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fpg {
    public final epg a;
    public final epg b;
    public final boolean c;

    public fpg(epg epgVar, epg epgVar2, boolean z) {
        this.a = epgVar;
        this.b = epgVar2;
        this.c = z;
    }

    public static fpg a(fpg fpgVar, epg epgVar, epg epgVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            epgVar = fpgVar.a;
        }
        if ((i & 2) != 0) {
            epgVar2 = fpgVar.b;
        }
        fpgVar.getClass();
        return new fpg(epgVar, epgVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpg)) {
            return false;
        }
        fpg fpgVar = (fpg) obj;
        if (Intrinsics.areEqual(this.a, fpgVar.a) && Intrinsics.areEqual(this.b, fpgVar.b) && this.c == fpgVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return hdi.t(sb, this.c, ')');
    }
}
