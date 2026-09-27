package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hh3 {
    public static final fh3 b = new fh3(null);
    public static final gh3 c = new Object();
    public final Object a;

    public /* synthetic */ hh3(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        eh3 eh3Var;
        if (obj instanceof eh3) {
            eh3Var = (eh3) obj;
        } else {
            eh3Var = null;
        }
        if (eh3Var == null) {
            return null;
        }
        return eh3Var.a;
    }

    public static final Object b(Object obj) {
        if (!(obj instanceof gh3)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hh3) {
            if (!Intrinsics.areEqual(this.a, ((hh3) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof eh3) {
            return ((eh3) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
