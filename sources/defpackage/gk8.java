package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gk8 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public gk8(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gk8 gk8Var = (gk8) obj;
        gk8Var.getClass();
        int i = this.a - gk8Var.a;
        if (i == 0) {
            return this.b - gk8Var.b;
        }
        return i;
    }
}
