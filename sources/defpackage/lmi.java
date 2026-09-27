package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lmi {
    public final d3g a;
    public final kmi b;
    public final boolean c;

    public lmi(d3g d3gVar, kmi kmiVar, boolean z) {
        kmiVar.getClass();
        this.a = d3gVar;
        this.b = kmiVar;
        this.c = z;
    }

    public static lmi a(lmi lmiVar, kmi kmiVar, boolean z, int i) {
        d3g d3gVar = lmiVar.a;
        if ((i & 4) != 0) {
            kmiVar = lmiVar.b;
        }
        if ((i & 8) != 0) {
            z = lmiVar.c;
        }
        kmiVar.getClass();
        return new lmi(d3gVar, kmiVar, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lmi) {
                lmi lmiVar = (lmi) obj;
                if (!Intrinsics.areEqual(this.a, lmiVar.a) || this.b != lmiVar.b || this.c != lmiVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + hdi.g(this.a.hashCode() * 31, 31, true)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryButton(label=");
        sb.append(this.a);
        sb.append(", locked=true, state=");
        sb.append(this.b);
        sb.append(", enabled=");
        return ix2.r(sb, this.c, ")");
    }
}
