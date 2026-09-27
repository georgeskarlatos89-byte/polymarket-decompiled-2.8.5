package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ejg {
    public final vp9 a;
    public final vp9 b;

    public ejg(vp9 vp9Var, vp9 vp9Var2) {
        this.a = vp9Var;
        this.b = vp9Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ejg) {
                ejg ejgVar = (ejg) obj;
                if (!Intrinsics.areEqual(this.a, ejgVar.a) || !Intrinsics.areEqual(this.b, ejgVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        vp9 vp9Var = this.b;
        if (vp9Var == null) {
            hashCode = 0;
        } else {
            hashCode = vp9Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SchemeImageStyle(defaultScheme=" + this.a + ", localScheme=" + this.b + ")";
    }
}
