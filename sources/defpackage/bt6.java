package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bt6 extends ft6 {
    public final int a;

    public bt6(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        dmk.v("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bt6) {
            if (this.a == ((bt6) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
