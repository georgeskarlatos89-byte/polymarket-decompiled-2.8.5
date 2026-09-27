package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class mlm extends x4 {
    public boolean b;

    public mlm(kfm kfmVar) {
        super(kfmVar);
        ((kfm) this.a).A++;
    }

    public abstract boolean h1();

    public final void i1() {
        if (this.b) {
            return;
        }
        dmk.n("Not initialized");
    }

    public final void j1() {
        if (!this.b) {
            if (!h1()) {
                ((kfm) this.a).C.incrementAndGet();
                this.b = true;
                return;
            }
            return;
        }
        dmk.n("Can't initialize twice");
    }
}
