package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zbi implements rp9 {
    public final km9 a;
    public final gp9 b;
    public final dp5 c;
    public final r9c d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public zbi(km9 km9Var, gp9 gp9Var, dp5 dp5Var, r9c r9cVar, String str, boolean z, boolean z2) {
        this.a = km9Var;
        this.b = gp9Var;
        this.c = dp5Var;
        this.d = r9cVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbi)) {
            return false;
        }
        zbi zbiVar = (zbi) obj;
        if (Intrinsics.areEqual(this.a, zbiVar.a) && Intrinsics.areEqual(this.b, zbiVar.b) && this.c == zbiVar.c && Intrinsics.areEqual(this.d, zbiVar.d) && Intrinsics.areEqual(this.e, zbiVar.e) && this.f == zbiVar.f && this.g == zbiVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rp9
    public final gp9 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        r9c r9cVar = this.d;
        if (r9cVar == null) {
            hashCode = 0;
        } else {
            hashCode = r9cVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.g) + hdi.g((i2 + i) * 31, 31, this.f);
    }

    @Override // defpackage.rp9
    public final km9 n() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        ace.A(this.e, ", isSampled=", ", isPlaceholderCached=", sb, this.f);
        return ix2.r(sb, this.g, ")");
    }
}
