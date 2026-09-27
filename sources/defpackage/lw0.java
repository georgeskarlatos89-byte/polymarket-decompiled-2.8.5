package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lw0 {
    public qz2 b;
    public pq9 c;
    public pq9 d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final a67 j;
    public final a67 k;
    public qz2 a = new k33(0);
    public final pq9 e = null;

    public lw0(Size size, int i, ArrayList arrayList, boolean z, a67 a67Var, a67 a67Var2) {
        if (size != null) {
            this.f = size;
            this.g = i;
            this.h = arrayList;
            this.i = z;
            this.j = a67Var;
            this.k = a67Var2;
            return;
        }
        dmk.s("Null size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lw0) {
            lw0 lw0Var = (lw0) obj;
            if (this.f.equals(lw0Var.f) && this.g == lw0Var.g && this.h.equals(lw0Var.h) && this.i == lw0Var.i && this.j == lw0Var.j && this.k == lw0Var.k) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.k.hashCode() ^ ((((hashCode ^ i) * 583896283) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
