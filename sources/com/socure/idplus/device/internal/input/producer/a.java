package com.socure.idplus.device.internal.input.producer;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class a {
    public final int a;
    public final com.socure.idplus.device.internal.thread.e b;
    public boolean c;

    public a(int i, com.socure.idplus.device.internal.thread.e eVar) {
        eVar.getClass();
        this.a = i;
        this.b = eVar;
    }

    public final void a(Object obj) {
        if (this.c) {
            com.socure.idplus.device.internal.thread.e eVar = this.b;
            int i = this.a;
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            Handler handler = eVar.a;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
    }
}
