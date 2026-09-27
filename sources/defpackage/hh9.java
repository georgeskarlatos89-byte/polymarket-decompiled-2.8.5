package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hh9 {
    public final zgj a;
    public final Object b;

    public hh9(zgj zgjVar, Object obj) {
        zgjVar.getClass();
        obj.getClass();
        this.a = zgjVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh9)) {
            return false;
        }
        hh9 hh9Var = (hh9) obj;
        if (Intrinsics.areEqual(this.a, hh9Var.a) && Intrinsics.areEqual(this.b, hh9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.a);
        sb.append(", response=");
        return woa.q(sb, this.b, ')');
    }
}
