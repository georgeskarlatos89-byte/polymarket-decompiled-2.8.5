package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class wdi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ wdi(CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CountDownLatch countDownLatch = this.b;
        switch (i) {
            case 0:
                countDownLatch.countDown();
                return;
            default:
                countDownLatch.countDown();
                return;
        }
    }
}
