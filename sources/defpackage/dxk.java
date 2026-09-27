package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dxk extends Handler {
    public static dxk c;
    public final /* synthetic */ int a = 1;
    public WeakReference b;

    public /* synthetic */ dxk() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        wvk a;
        switch (this.a) {
            case 0:
                if (((dyb) this.b.get()) != null && (a = wvk.a(message.what)) != null) {
                    switch (xwk.a[a.ordinal()]) {
                        case 1:
                            wsk.a(0, dxk.class, "GET request to " + xvk.RAMP_CONFIG_URL.toString());
                            break;
                        case 2:
                            break;
                        case 3:
                            wsk.a(3, dxk.class, "GET request to " + message.obj + " error.");
                            return;
                        case 4:
                            wsk.a(0, dxk.class, "POST request to " + message.obj + " started.");
                            return;
                        case 5:
                            wsk.a(0, dxk.class, "POST request to " + message.obj + " successfully.");
                            return;
                        case 6:
                            wsk.a(3, dxk.class, "POST request to " + message.obj + " error.");
                            return;
                        default:
                            return;
                    }
                    wsk.a(0, dxk.class, "GET request to " + message.obj + " succeeded");
                    return;
                }
                return;
            default:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                return;
        }
    }

    public /* synthetic */ dxk(Looper looper) {
        super(looper);
    }
}
