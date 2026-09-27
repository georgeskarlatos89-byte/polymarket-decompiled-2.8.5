package io.sentry.android.replay.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f implements Runnable {
    public final String a;
    public final /* synthetic */ Runnable b;

    public f(Runnable runnable, String str) {
        runnable.getClass();
        this.a = str;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
