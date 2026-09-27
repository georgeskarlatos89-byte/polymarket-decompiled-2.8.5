package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b9h {
    public static final b9h c;
    public final ft6 a;
    public final ft6 b;

    static {
        dt6 dt6Var = dt6.a;
        c = new b9h(dt6Var, dt6Var);
    }

    public b9h(ft6 ft6Var, ft6 ft6Var2) {
        this.a = ft6Var;
        this.b = ft6Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b9h) {
                b9h b9hVar = (b9h) obj;
                if (!Intrinsics.areEqual(this.a, b9hVar.a) || !Intrinsics.areEqual(this.b, b9hVar.b)) {
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
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
