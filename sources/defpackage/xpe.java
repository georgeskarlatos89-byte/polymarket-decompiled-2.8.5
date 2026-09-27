package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xpe {
    public final f78 a;

    static {
        new SparseBooleanArray();
        pfn.f(!false);
        u1k.G(0);
    }

    public xpe(f78 f78Var) {
        this.a = f78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpe)) {
            return false;
        }
        return this.a.equals(((xpe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
