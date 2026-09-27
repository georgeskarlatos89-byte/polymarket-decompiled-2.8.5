package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class aca {
    public static final aca f = new aca(null, false);
    public final ycd a;
    public final noc b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public aca(ycd ycdVar, noc nocVar, boolean z, boolean z2, boolean z3) {
        this.a = ycdVar;
        this.b = nocVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        if (this.a == acaVar.a && this.b == acaVar.b && this.c == acaVar.c && this.d == acaVar.d && this.e == acaVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        ycd ycdVar = this.a;
        if (ycdVar == null) {
            hashCode = 0;
        } else {
            hashCode = ycdVar.hashCode();
        }
        int i2 = hashCode * 31;
        noc nocVar = this.b;
        if (nocVar != null) {
            i = nocVar.hashCode();
        }
        return Boolean.hashCode(this.e) + hdi.g(hdi.g((i2 + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.d);
        sb.append(", isMutabilityQualifierForWarning=");
        return hdi.t(sb, this.e, ')');
    }

    public /* synthetic */ aca(ycd ycdVar, boolean z) {
        this(ycdVar, null, z, false, false);
    }
}
