package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fr6 extends gr6 {
    public final Boolean a;
    public final Double b;

    public fr6(Boolean bool, Double d) {
        this.a = bool;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr6)) {
            return false;
        }
        fr6 fr6Var = (fr6) obj;
        if (Intrinsics.areEqual(this.a, fr6Var.a) && Intrinsics.areEqual(this.b, fr6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Double d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "UpdateConfig(enabled=" + this.a + ", sampleRate=" + this.b + ')';
    }
}
