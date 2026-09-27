package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tui extends vui {
    public final nz7 a;

    public tui(mz7 mz7Var) {
        this.a = mz7Var;
    }

    @Override // defpackage.vui, defpackage.oui
    public final boolean b(boolean z, boolean z2) {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oui
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tui) && Intrinsics.areEqual(this.a, ((tui) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        nz7 nz7Var = this.a;
        if (nz7Var == null) {
            return 0;
        }
        return nz7Var.hashCode();
    }

    @Override // defpackage.vui, defpackage.oui
    public final nz7 i() {
        return this.a;
    }

    public final String toString() {
        return "Full(validationMessage=" + this.a + ")";
    }
}
