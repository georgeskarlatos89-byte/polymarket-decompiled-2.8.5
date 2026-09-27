package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ax0 {
    public final String a;
    public final ArrayList b;

    public ax0(ArrayList arrayList, String str) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
        } else {
            dmk.s("Null userAgent");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ax0) {
                ax0 ax0Var = (ax0) obj;
                if (this.a.equals(ax0Var.a) && this.b.equals(ax0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
