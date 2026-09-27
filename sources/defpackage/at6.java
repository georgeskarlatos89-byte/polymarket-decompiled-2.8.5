package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class at6 implements et6 {
    public final int a;

    public /* synthetic */ at6(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        dmk.v("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof at6) {
            if (this.a != ((at6) obj).a) {
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
        return sv6.j(this.a, "Pixels(px=", ")");
    }
}
