package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l3d {
    public final int a;
    public final long b;
    public final long c;
    public final c3d d;
    public final mfh e;
    public final Object f;

    public l3d(int i, long j, long j2, c3d c3dVar, mfh mfhVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = c3dVar;
        this.e = mfhVar;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3d)) {
            return false;
        }
        l3d l3dVar = (l3d) obj;
        if (this.a == l3dVar.a && this.b == l3dVar.b && this.c == l3dVar.c && Intrinsics.areEqual(this.d, l3dVar.d) && Intrinsics.areEqual(this.e, l3dVar.e) && Intrinsics.areEqual(this.f, l3dVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = sv6.c(this.d.a, woa.d(woa.d(this.a * 31, 31, this.b), 31, this.c), 31);
        int i = 0;
        mfh mfhVar = this.e;
        if (mfhVar == null) {
            hashCode = 0;
        } else {
            hashCode = mfhVar.a.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        ix2.A(sb, ", responseMillis=", this.c, ", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        return ix2.o(sb, this.f, ")");
    }
}
