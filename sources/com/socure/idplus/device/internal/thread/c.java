package com.socure.idplus.device.internal.thread;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class c {
    public static void a(int i, e eVar) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = null;
        Handler handler = eVar.a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
    }
}
