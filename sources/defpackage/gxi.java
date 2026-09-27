package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gxi {
    public final vfh a;
    public final vfh b;
    public final vfh c;
    public final vfh d;

    public gxi(vfh vfhVar, vfh vfhVar2, vfh vfhVar3, vfh vfhVar4) {
        this.a = vfhVar;
        this.b = vfhVar2;
        this.c = vfhVar3;
        this.d = vfhVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gxi)) {
            return false;
        }
        gxi gxiVar = (gxi) obj;
        if (Intrinsics.areEqual(this.a, gxiVar.a) && Intrinsics.areEqual(this.b, gxiVar.b) && Intrinsics.areEqual(this.c, gxiVar.c) && Intrinsics.areEqual(this.d, gxiVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        vfh vfhVar = this.a;
        if (vfhVar != null) {
            i = vfhVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        vfh vfhVar2 = this.b;
        if (vfhVar2 != null) {
            i2 = vfhVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        vfh vfhVar3 = this.c;
        if (vfhVar3 != null) {
            i3 = vfhVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        vfh vfhVar4 = this.d;
        if (vfhVar4 != null) {
            i4 = vfhVar4.hashCode();
        }
        return i7 + i4;
    }

    public /* synthetic */ gxi(vfh vfhVar, vfh vfhVar2, int i) {
        this(vfhVar, null, null, (i & 8) != 0 ? null : vfhVar2);
    }
}
