package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class jod {
    public final Object a;

    public jod(Object obj) {
        this.a = obj;
    }

    public Object a() {
        Object obj = this.a;
        grn.c(obj instanceof iod);
        return ((iod) obj).a;
    }

    public void b(long j) {
        ((iod) this.a).b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jod)) {
            return false;
        }
        return this.a.equals(((jod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public void c(int i) {
    }

    public void d(long j) {
    }
}
