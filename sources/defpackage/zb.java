package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zb implements ac {
    public final f48 a;

    public zb(f48 f48Var) {
        this.a = f48Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zb) && Intrinsics.areEqual(this.a, ((zb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        f48 f48Var = this.a;
        if (f48Var == null) {
            return 0;
        }
        return f48Var.hashCode();
    }

    public final String toString() {
        return "Processing(configToPresent=" + this.a + ")";
    }
}
