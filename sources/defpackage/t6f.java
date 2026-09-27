package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t6f {
    public final int a;

    public t6f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t6f)) {
            return false;
        }
        if (this.a != ((t6f) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
