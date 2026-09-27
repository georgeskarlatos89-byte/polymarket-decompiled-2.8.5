package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qu0 {
    public final String a;
    public final ru0 b;

    public qu0(String str, ru0 ru0Var) {
        str.getClass();
        ru0Var.getClass();
        this.a = str;
        this.b = ru0Var;
    }

    public static qu0 a(qu0 qu0Var, ru0 ru0Var) {
        String str = qu0Var.a;
        qu0Var.getClass();
        str.getClass();
        ru0Var.getClass();
        return new qu0(str, ru0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        if (Intrinsics.areEqual(this.a, qu0Var.a) && this.b == qu0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticationViewState(email=" + this.a + ", viewType=" + this.b + ")";
    }
}
