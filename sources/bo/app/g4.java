package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g4 {
    public final tf a;
    public final tf b;

    public g4(tf tfVar, tf tfVar2) {
        tfVar.getClass();
        tfVar2.getClass();
        this.a = tfVar;
        this.b = tfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        if (Intrinsics.areEqual(this.a, g4Var.a) && Intrinsics.areEqual(this.b, g4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.a + ", newConfig=" + this.b + ')';
    }
}
