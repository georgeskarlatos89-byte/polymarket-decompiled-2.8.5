package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class gy4 {
    public final Object a;

    public gy4(Object obj) {
        this.a = obj;
    }

    public abstract ita a(ujc ujcVar);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        gy4 gy4Var;
        if (this != obj) {
            Object b = b();
            Object obj2 = null;
            if (obj instanceof gy4) {
                gy4Var = (gy4) obj;
            } else {
                gy4Var = null;
            }
            if (gy4Var != null) {
                obj2 = gy4Var.b();
            }
            if (!Intrinsics.areEqual(b, obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        Object b = b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
