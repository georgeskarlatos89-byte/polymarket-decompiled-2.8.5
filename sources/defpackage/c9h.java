package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c9h {
    public static final c9h c;
    public final et6 a;
    public final et6 b;

    static {
        ct6 ct6Var = ct6.a;
        c = new c9h(ct6Var, ct6Var);
    }

    public c9h(et6 et6Var, et6 et6Var2) {
        this.a = et6Var;
        this.b = et6Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c9h) {
                c9h c9hVar = (c9h) obj;
                if (!Intrinsics.areEqual(this.a, c9hVar.a) || !Intrinsics.areEqual(this.b, c9hVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
