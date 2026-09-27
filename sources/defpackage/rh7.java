package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rh7 extends sh7 {
    public final String a;
    public final Throwable b;

    public rh7(String str, Throwable th) {
        th.getClass();
        this.a = str;
        this.b = th;
    }

    public static boolean b(Throwable th, Throwable th2) {
        String str;
        String str2;
        Throwable th3;
        if ((th != null || th2 != null) && th != th2) {
            Throwable th4 = null;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            if (th2 != null) {
                str2 = th2.getMessage();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, str2)) {
                if (th != null) {
                    th3 = th.getCause();
                } else {
                    th3 = null;
                }
                if (th2 != null) {
                    th4 = th2.getCause();
                }
                if (b(th3, th4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.sh7
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        sh7 sh7Var;
        if (this != obj) {
            if (obj == null || rh7.class == obj.getClass()) {
                if (obj instanceof sh7) {
                    sh7Var = (sh7) obj;
                } else {
                    sh7Var = null;
                }
                if (sh7Var != null && Intrinsics.areEqual(this.a, sh7Var.a()) && b(this.b, yv8.a(sh7Var))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ThrowableError(message=" + this.a + ", cause=" + this.b + ")";
    }
}
