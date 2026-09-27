package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class kq8 {
    public final xl8 a;
    public final String b;
    public final int c;

    public kq8(xl8 xl8Var, String str, int i) {
        xl8Var.getClass();
        this.a = xl8Var;
        this.b = str;
        this.c = i;
    }

    public final csc a(int i) {
        return csc.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return m51.m(sb, this.b, 'N');
    }
}
