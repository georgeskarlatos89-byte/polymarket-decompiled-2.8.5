package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qsi {
    public final String a;
    public final d3g b;
    public final int c;
    public final boolean d;

    public qsi(String str, d3g d3gVar, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = d3gVar;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsi)) {
            return false;
        }
        qsi qsiVar = (qsi) obj;
        if (Intrinsics.areEqual(this.a, qsiVar.a) && Intrinsics.areEqual(this.b, qsiVar.b) && this.c == qsiVar.c && this.d == qsiVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + woa.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Item(id=" + this.a + ", label=" + this.b + ", icon=" + this.c + ", enabled=" + this.d + ")";
    }
}
