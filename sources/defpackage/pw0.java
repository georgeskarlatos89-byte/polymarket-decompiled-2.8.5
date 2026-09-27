package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pw0 extends kd5 {
    public final Context a;
    public final g74 b;
    public final g74 c;
    public final String d;

    public pw0(Context context, g74 g74Var, g74 g74Var2, String str) {
        if (context != null) {
            this.a = context;
            if (g74Var != null) {
                this.b = g74Var;
                if (g74Var2 != null) {
                    this.c = g74Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        dmk.s("Null backendName");
                        throw null;
                    }
                }
                dmk.s("Null monotonicClock");
                throw null;
            }
            dmk.s("Null wallClock");
            throw null;
        }
        dmk.s("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kd5) {
            pw0 pw0Var = (pw0) ((kd5) obj);
            if (this.a.equals(pw0Var.a) && this.b.equals(pw0Var.b) && this.c.equals(pw0Var.c) && this.d.equals(pw0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return woa.r(sb, this.d, "}");
    }
}
