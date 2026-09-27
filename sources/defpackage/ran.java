package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ran implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final p5n e;
    public ComponentName f;
    public final /* synthetic */ bjn g;

    public ran(bjn bjnVar, p5n p5nVar) {
        this.g = bjnVar;
        this.e = p5nVar;
    }

    public final qw4 a(Executor executor, String str) {
        try {
            Intent a = sal.a(this.g.e, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(zil.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            try {
                bjn bjnVar = this.g;
                nhk nhkVar = bjnVar.g;
                Context context = bjnVar.e;
                p5n p5nVar = this.e;
                boolean x = nhkVar.x(context, str, a, this, 4225, executor);
                this.c = x;
                if (x) {
                    bjnVar.f.sendMessageDelayed(bjnVar.f.obtainMessage(1, p5nVar), bjnVar.i);
                    qw4 qw4Var = qw4.f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return qw4Var;
                }
                this.b = 2;
                try {
                    bjnVar.g.w(bjnVar.e, this);
                } catch (IllegalArgumentException unused) {
                }
                qw4 qw4Var2 = new qw4(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return qw4Var2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (z8l e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bjn bjnVar = this.g;
        synchronized (bjnVar.d) {
            try {
                bjnVar.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bjn bjnVar = this.g;
        synchronized (bjnVar.d) {
            try {
                bjnVar.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
