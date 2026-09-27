package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class syg {
    public final ryg a;

    public syg(int i, ArrayList arrayList, vwg vwgVar, e03 e03Var) {
        this.a = new ryg(i, arrayList, vwgVar, e03Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof syg)) {
            return false;
        }
        return this.a.equals(((syg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
