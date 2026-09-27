package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kfl extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c;

    public kfl(AdvertisingIdClient advertisingIdClient, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.a = new WeakReference(advertisingIdClient);
        this.b = j;
        this.c = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.a;
        try {
            if (!this.c.await(this.b, TimeUnit.MILLISECONDS) && (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) != null) {
                advertisingIdClient.c();
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.c();
            }
        }
    }
}
