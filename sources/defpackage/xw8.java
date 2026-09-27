package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class xw8 {
    public static final Object a = new Object();
    public static bjn b;
    public static HandlerThread c;

    public static bjn a(Context context) {
        bjn bjnVar;
        synchronized (a) {
            try {
                bjnVar = b;
                if (bjnVar == null) {
                    bjnVar = new bjn(context.getApplicationContext(), context.getMainLooper());
                    b = bjnVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bjnVar;
    }

    public abstract qw4 b(p5n p5nVar, esl eslVar, String str, Executor executor);

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        p5n p5nVar = new p5n(str, str2, z);
        bjn bjnVar = (bjn) this;
        arn.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = bjnVar.d;
        synchronized (hashMap) {
            try {
                ran ranVar = (ran) hashMap.get(p5nVar);
                if (ranVar != null) {
                    if (ranVar.a.containsKey(serviceConnection)) {
                        ranVar.a.remove(serviceConnection);
                        if (ranVar.a.isEmpty()) {
                            bjnVar.f.sendMessageDelayed(bjnVar.f.obtainMessage(0, p5nVar), bjnVar.h);
                        }
                    } else {
                        String p5nVar2 = p5nVar.toString();
                        StringBuilder sb = new StringBuilder(p5nVar2.length() + 76);
                        sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb.append(p5nVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    String p5nVar3 = p5nVar.toString();
                    StringBuilder sb2 = new StringBuilder(p5nVar3.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(p5nVar3);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
