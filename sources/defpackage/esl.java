package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class esl implements ServiceConnection {
    public final int a;
    public final /* synthetic */ z81 b;

    public esl(z81 z81Var, int i) {
        this.b = z81Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cj9 e5lVar;
        z81 z81Var = this.b;
        if (iBinder == null) {
            z81Var.zzf(16);
            return;
        }
        synchronized (z81Var.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof cj9)) {
                    e5lVar = (cj9) queryLocalInterface;
                } else {
                    e5lVar = new e5l(iBinder);
                }
                z81Var.zzi(e5lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.zzb(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z81 z81Var = this.b;
        synchronized (z81Var.zzh()) {
            z81Var.zzi(null);
        }
        z81 z81Var2 = this.b;
        int i = this.a;
        Handler handler = z81Var2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
