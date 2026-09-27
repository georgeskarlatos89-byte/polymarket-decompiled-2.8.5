package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ud0 {
    private final int a;
    private final nd0 b;
    private final ad0 c;
    private final String d;

    public ud0(nd0 nd0Var, ad0 ad0Var, String str) {
        this.b = nd0Var;
        this.c = ad0Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{nd0Var, ad0Var, str});
    }

    public final String a() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ud0)) {
            return false;
        }
        ud0 ud0Var = (ud0) obj;
        if (!dkn.b(this.b, ud0Var.b) || !dkn.b(this.c, ud0Var.c) || !dkn.b(this.d, ud0Var.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
