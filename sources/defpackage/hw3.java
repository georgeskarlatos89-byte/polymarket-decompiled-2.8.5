package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hw3 extends rw3 {
    public final ey3 a;
    public final gw3 b;

    public hw3(ey3 ey3Var, gw3 gw3Var) {
        ey3Var.getClass();
        gw3Var.getClass();
        this.a = ey3Var;
        this.b = gw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw3)) {
            return false;
        }
        hw3 hw3Var = (hw3) obj;
        if (Intrinsics.areEqual(this.a, hw3Var.a) && this.b == hw3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Connect(connectionConf=" + this.a + ", connectionType=" + this.b + ")";
    }
}
