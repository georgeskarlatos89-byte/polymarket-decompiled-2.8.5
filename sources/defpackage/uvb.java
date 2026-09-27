package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uvb {
    public final int a;

    public /* synthetic */ uvb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uvb) {
            if (this.a != ((uvb) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return sv6.j(this.a, "RawRes(resId=", ")");
    }
}
