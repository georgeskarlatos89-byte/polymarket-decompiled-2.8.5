package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wr extends tkl {
    public final int b;

    public wr(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wr) && ((wr) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b * 31;
    }
}
