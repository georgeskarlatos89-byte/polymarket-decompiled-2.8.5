package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ty9 {
    public final int a;

    public /* synthetic */ ty9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ty9) {
            if (this.a != ((ty9) obj).a) {
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
        int i = this.a;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
