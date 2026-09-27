package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class h1l implements Runnable {
    public final epi a;

    public h1l() {
        this.a = null;
    }

    public void a(Exception exc) {
        epi epiVar = this.a;
        if (epiVar != null) {
            epiVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public h1l(epi epiVar) {
        this.a = epiVar;
    }
}
