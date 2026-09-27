package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class atc {
    public final e0d a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public atc(e0d e0dVar, boolean z, Object obj, boolean z2, boolean z3) {
        boolean z4;
        if (!e0dVar.isNullableAllowed() && z) {
            qp7.o(e0dVar.getName(), " does not allow nullable values");
            throw null;
        }
        if (!z && z2 && obj == null) {
            omf.r(e0dVar.getName(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = e0dVar;
        this.b = z;
        this.e = obj;
        if (!z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.c = z4;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && atc.class == obj.getClass()) {
                atc atcVar = (atc) obj;
                if (this.b == atcVar.b && this.c == atcVar.c && Intrinsics.areEqual(this.a, atcVar.a)) {
                    Object obj2 = atcVar.e;
                    Object obj3 = this.e;
                    if (obj3 != null) {
                        return Intrinsics.areEqual(obj3, obj2);
                    }
                    if (obj2 == null) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(lvf.a.getOrCreateKotlinClass(atc.class).getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }
}
