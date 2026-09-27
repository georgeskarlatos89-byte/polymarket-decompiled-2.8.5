package com.socure.idplus.device.internal.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.mlkit.common.MlKitException;
import com.socure.idplus.device.internal.behavior.model.CustomEvent;
import com.socure.idplus.device.internal.behavior.model.FocusChangeEvent;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import com.socure.idplus.device.internal.behavior.model.KeyPressEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import com.socure.idplus.device.internal.behavior.model.PointerEvent;
import com.socure.idplus.device.internal.behavior.model.SessionData;
import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import com.socure.idplus.device.internal.mediaDevice.model.MediaDeviceEvent;
import com.socure.idplus.device.internal.motion.model.AccelerometerEvent;
import com.socure.idplus.device.internal.motion.model.GyroscopeEvent;
import com.socure.idplus.device.internal.motion.model.LinearAccelerometerEvent;
import com.socure.idplus.device.internal.motion.model.MagnetometerEvent;
import com.socure.idplus.device.internal.motion.model.OrientationEvent;
import defpackage.zh4;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends HandlerThread implements Handler.Callback, d {
    public Handler a;
    public Handler b;
    public com.socure.idplus.device.internal.behavior.manager.f c;

    public e() {
        super("SocureThread");
    }

    public final void a() {
        quitSafely();
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        message.getClass();
        com.socure.idplus.device.internal.behavior.manager.f fVar = this.c;
        int i = 0;
        if (fVar != null) {
            int i2 = message.what;
            Object obj = message.obj;
            Bundle data = message.getData();
            switch (i2) {
                case 1:
                    if (data != null) {
                        String string = data.getString("keySessionToken");
                        String string2 = data.getString("keyHostUrl");
                        if (string != null && string2 != null) {
                            com.socure.idplus.device.internal.api.b bVar = fVar.b;
                            com.socure.idplus.device.internal.api.a aVar = bVar.d;
                            if (aVar == null) {
                                aVar = bVar.a(string2);
                                bVar.d = aVar;
                            }
                            fVar.w = aVar;
                            fVar.d = string;
                            ArrayList arrayList = fVar.f;
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                fVar.a(aVar, string, (SessionData) obj2);
                            }
                            fVar.f.clear();
                        }
                        return true;
                    }
                    break;
                case 2:
                    com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
                    Handler handler = fVar.a.a;
                    if (handler != null) {
                        handler.removeMessages(3);
                    }
                    Handler handler2 = fVar.a.a;
                    if (handler2 != null) {
                        handler2.removeMessages(2);
                    }
                    if (fVar.d == null) {
                        fVar.f.clear();
                        fVar.g.clear();
                        fVar.h.clear();
                        fVar.i.clear();
                        fVar.j.clear();
                        fVar.k.clear();
                        fVar.l.clear();
                        fVar.m.clear();
                        fVar.n.clear();
                        fVar.o.clear();
                        fVar.p.clear();
                        fVar.q.clear();
                        fVar.r.clear();
                        fVar.s.clear();
                        fVar.t.clear();
                    } else {
                        fVar.a(false);
                    }
                    return true;
                case 3:
                    fVar.a(false);
                    fVar.a();
                    return true;
                case 4:
                    if (obj instanceof KeyPressEvent) {
                        fVar.a((KeyPressEvent) obj);
                        return true;
                    }
                    break;
                case 5:
                    if (obj instanceof PointerEvent) {
                        fVar.a((PointerEvent) obj);
                        return true;
                    }
                    break;
                case 6:
                    if (obj instanceof FocusChangeEvent) {
                        fVar.a((FocusChangeEvent) obj);
                        return true;
                    }
                    break;
                case 7:
                    Handler handler3 = fVar.a.a;
                    if (handler3 != null) {
                        handler3.removeMessages(3);
                    }
                    fVar.a(false);
                    return true;
                case 8:
                    fVar.a();
                    return true;
                case 9:
                    if (obj instanceof InputChangeEvent) {
                        fVar.a((InputChangeEvent) obj);
                        return true;
                    }
                    break;
                case 10:
                    if (obj instanceof LocationEvent) {
                        fVar.a((LocationEvent) obj);
                        return true;
                    }
                    break;
                case 11:
                    if (obj instanceof LifeCycleEvent) {
                        fVar.a((LifeCycleEvent) obj);
                        return true;
                    }
                    break;
                case 12:
                    if (obj instanceof ViewportSizeEvent) {
                        fVar.a((ViewportSizeEvent) obj);
                        return true;
                    }
                    break;
                case 13:
                    if (obj instanceof MediaDeviceEvent) {
                        fVar.a((MediaDeviceEvent) obj);
                        return true;
                    }
                    break;
                case 14:
                    if (obj instanceof NavigationContext) {
                        fVar.a((NavigationContext) obj);
                        return true;
                    }
                    break;
                case 15:
                    if (obj instanceof AccelerometerEvent) {
                        fVar.a((AccelerometerEvent) obj);
                        return true;
                    }
                    break;
                case 16:
                    if (obj instanceof GyroscopeEvent) {
                        fVar.a((GyroscopeEvent) obj);
                        return true;
                    }
                    break;
                case 17:
                    if (obj instanceof MagnetometerEvent) {
                        fVar.a((MagnetometerEvent) obj);
                        return true;
                    }
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    if (obj instanceof LinearAccelerometerEvent) {
                        fVar.a((LinearAccelerometerEvent) obj);
                        return true;
                    }
                    break;
                case zh4.REMOTE_EXCEPTION /* 19 */:
                    if (obj instanceof OrientationEvent) {
                        fVar.a((OrientationEvent) obj);
                        return true;
                    }
                    break;
                case 20:
                    if (obj instanceof CustomEvent) {
                        fVar.a((CustomEvent) obj);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @Override // java.lang.Thread
    public final void start() {
        super.start();
        this.a = new Handler(getLooper(), this);
        this.b = new Handler(getLooper());
    }
}
