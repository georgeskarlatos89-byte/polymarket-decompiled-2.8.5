package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q09 {
    public final int a;

    public q09(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        nw9.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q09) {
            if (this.a == ((q09) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
