package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m58 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public m58(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (n58.j) {
            try {
                Iterator it = ((dl0) n58.k.values()).iterator();
                while (it.hasNext()) {
                    ((n58) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
