package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xl8 {
    public static final xl8 c = new xl8("");
    public final yl8 a;
    public transient xl8 b;

    public xl8(String str) {
        str.getClass();
        this.a = new yl8(this, str);
    }

    public final xl8 a(csc cscVar) {
        cscVar.getClass();
        return new xl8(this.a.a(cscVar), this);
    }

    public final xl8 b() {
        xl8 xl8Var = this.b;
        if (xl8Var != null) {
            return xl8Var;
        }
        yl8 yl8Var = this.a;
        if (!yl8Var.c()) {
            xl8 xl8Var2 = new xl8(yl8Var.e());
            this.b = xl8Var2;
            return xl8Var2;
        }
        dmk.n("root");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl8)) {
            return false;
        }
        if (Intrinsics.areEqual(this.a, ((xl8) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public xl8(yl8 yl8Var) {
        yl8Var.getClass();
        this.a = yl8Var;
    }

    public xl8(yl8 yl8Var, xl8 xl8Var) {
        this.a = yl8Var;
        this.b = xl8Var;
    }
}
