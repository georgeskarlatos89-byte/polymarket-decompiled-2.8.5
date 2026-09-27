package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h9j {
    public static final h9j b;
    public final jr9 a;

    static {
        we8 we8Var = jr9.b;
        b = new h9j(wwf.e);
        u1k.G(0);
    }

    public h9j(wwf wwfVar) {
        this.a = jr9.m(wwfVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            jr9 jr9Var = this.a;
            if (i2 >= jr9Var.size()) {
                return false;
            }
            g9j g9jVar = (g9j) jr9Var.get(i2);
            boolean[] zArr = g9jVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (zArr[i3]) {
                    if (g9jVar.b.c == i) {
                        return true;
                    }
                } else {
                    i3++;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h9j.class == obj.getClass()) {
            return this.a.equals(((h9j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
