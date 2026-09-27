package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bkm implements Runnable {
    public final epi a;

    public bkm() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            epi epiVar = this.a;
            if (epiVar != null) {
                epiVar.c(e);
            }
        }
    }

    public bkm(epi epiVar) {
        this.a = epiVar;
    }
}
