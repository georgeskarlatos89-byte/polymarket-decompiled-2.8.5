package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vkc extends p2 implements Runnable {
    public final Runnable a;

    public vkc(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.u2
    public final String pendingToString() {
        return "task=[" + this.a + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
