package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ddi implements lcg {
    public final sci a;
    public final String b;
    public boolean c;

    public ddi(sci sciVar, String str) {
        this.a = sciVar;
        this.b = str;
    }

    public final void e() {
        if (!this.c) {
            return;
        }
        swn.d(21, "statement is closed");
        throw null;
    }
}
