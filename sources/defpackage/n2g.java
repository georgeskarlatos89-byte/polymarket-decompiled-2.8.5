package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n2g extends p2g {
    public final wh9 a;
    public final Exception b;

    public n2g(vxf vxfVar) {
        this.a = null;
        this.b = vxfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2g)) {
            return false;
        }
        n2g n2gVar = (n2g) obj;
        if (Intrinsics.areEqual(this.a, n2gVar.a) && Intrinsics.areEqual(this.b, n2gVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        wh9 wh9Var = this.a;
        if (wh9Var == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(wh9Var.a);
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Failed(code=" + this.a + ", error=" + this.b + ")";
    }

    public n2g(wh9 wh9Var, Exception exc) {
        this.a = wh9Var;
        this.b = exc;
    }
}
