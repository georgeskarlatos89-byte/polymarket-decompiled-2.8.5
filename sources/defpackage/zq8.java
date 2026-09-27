package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zq8 extends p2 implements Runnable {
    public ujb a;

    @Override // defpackage.u2
    public final void afterDone() {
        this.a = null;
    }

    @Override // defpackage.u2
    public final String pendingToString() {
        ujb ujbVar = this.a;
        if (ujbVar != null) {
            return "delegate=[" + ujbVar + "]";
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ujb ujbVar = this.a;
        if (ujbVar != null) {
            setFuture(ujbVar);
        }
    }
}
