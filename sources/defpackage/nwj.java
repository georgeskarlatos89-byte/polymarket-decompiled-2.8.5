package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nwj {
    public final d3g a;
    public final owj b;
    public final boolean c;
    public final boolean d;

    public nwj(d3g d3gVar, owj owjVar, boolean z, boolean z2) {
        this.a = d3gVar;
        this.b = owjVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nwj) {
                nwj nwjVar = (nwj) obj;
                if (!Intrinsics.areEqual(this.a, nwjVar.a) || this.b != nwjVar.b || this.c != nwjVar.c || this.d != nwjVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        d3g d3gVar = this.a;
        if (d3gVar == null) {
            hashCode = 0;
        } else {
            hashCode = d3gVar.hashCode();
        }
        return Boolean.hashCode(this.d) + hdi.g((this.b.hashCode() + (hashCode * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "State(error=" + this.a + ", status=" + this.b + ", setAsDefaultCheckboxChecked=" + this.c + ", isSaveButtonEnabled=" + this.d + ")";
    }
}
