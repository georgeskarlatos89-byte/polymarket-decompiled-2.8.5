package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class pg1 implements ServiceConnection {
    public boolean a = false;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();

    public final IBinder a() {
        arn.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.a) {
            this.a = true;
            IBinder iBinder = (IBinder) this.b.poll(10000L, TimeUnit.MILLISECONDS);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        dmk.n("Cannot call get on this connection more than once");
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
