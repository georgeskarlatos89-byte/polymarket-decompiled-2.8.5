package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cfa extends cea {
    public final fib a;

    public cfa() {
        tv4 tv4Var = fib.i;
        this.a = new fib(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof cfa) || !((cfa) obj).a.equals(this.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
