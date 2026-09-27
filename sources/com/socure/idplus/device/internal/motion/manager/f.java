package com.socure.idplus.device.internal.motion.manager;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f {
    public final com.socure.idplus.device.internal.thread.e a;
    public final com.socure.idplus.device.internal.behavior.coordinator.c b;
    public final com.socure.idplus.device.internal.input.producer.e c;
    public final SensorManager d;
    public final Handler e;
    public final Lazy f;
    public final com.socure.idplus.device.internal.motion.capture.b g;
    public int h;

    public f(Context context, com.socure.idplus.device.internal.thread.e eVar, com.socure.idplus.device.internal.behavior.coordinator.c cVar, com.socure.idplus.device.internal.input.producer.e eVar2, SensorManager sensorManager) {
        context.getClass();
        eVar.getClass();
        cVar.getClass();
        eVar2.getClass();
        sensorManager.getClass();
        this.a = eVar;
        this.b = cVar;
        this.c = eVar2;
        this.d = sensorManager;
        Handler handler = new Handler(Looper.getMainLooper());
        this.e = handler;
        this.f = LazyKt.lazy(new a(this));
        this.g = new com.socure.idplus.device.internal.motion.capture.b(handler, new b(this), new c(this), new d(this), new e(this), com.socure.idplus.device.internal.motion.capture.a.a);
        this.h = -1;
    }

    public final void a(long j, int i) {
        com.socure.idplus.device.internal.motion.capture.b bVar = this.g;
        com.socure.idplus.device.internal.behavior.capture.a aVar = bVar.g;
        com.socure.idplus.device.internal.behavior.capture.a aVar2 = com.socure.idplus.device.internal.behavior.capture.a.RUNNING;
        if (aVar == aVar2) {
            if (aVar == aVar2) {
                bVar.a.removeCallbacks(bVar.i);
                long longValue = ((Number) bVar.f.invoke()).longValue() + j;
                bVar.h = longValue;
                bVar.a.postAtTime(bVar.i, longValue);
            }
            if (i != this.h) {
                Iterator it = ((List) this.f.getValue()).iterator();
                while (it.hasNext()) {
                    ((com.socure.idplus.device.internal.motion.producer.c) it.next()).b();
                }
                for (com.socure.idplus.device.internal.motion.producer.c cVar : (List) this.f.getValue()) {
                    cVar.getClass();
                    cVar.g = 1000000 / i;
                }
                Iterator it2 = ((List) this.f.getValue()).iterator();
                while (it2.hasNext()) {
                    ((com.socure.idplus.device.internal.motion.producer.c) it2.next()).a();
                }
                this.h = i;
                return;
            }
            return;
        }
        if (aVar == com.socure.idplus.device.internal.behavior.capture.a.PAUSED) {
            com.socure.idplus.device.internal.logger.a aVar3 = com.socure.idplus.device.internal.logger.a.D;
            return;
        }
        this.c.a(LifeCycleType.MOTION_CAPTURE_STARTED);
        for (com.socure.idplus.device.internal.motion.producer.c cVar2 : (List) this.f.getValue()) {
            cVar2.getClass();
            cVar2.g = 1000000 / i;
        }
        Iterator it3 = ((List) this.f.getValue()).iterator();
        while (it3.hasNext()) {
            ((com.socure.idplus.device.internal.motion.producer.c) it3.next()).a();
        }
        this.h = i;
        com.socure.idplus.device.internal.behavior.coordinator.c cVar3 = this.b;
        com.socure.idplus.device.internal.behavior.coordinator.a aVar4 = com.socure.idplus.device.internal.behavior.coordinator.a.MOTION;
        aVar4.getClass();
        cVar3.d.add(aVar4);
        cVar3.c.a();
        com.socure.idplus.device.internal.motion.capture.b bVar2 = this.g;
        if (bVar2.g != com.socure.idplus.device.internal.behavior.capture.a.STOPPED) {
            return;
        }
        bVar2.a.removeCallbacks(bVar2.i);
        long longValue2 = ((Number) bVar2.f.invoke()).longValue() + j;
        bVar2.h = longValue2;
        bVar2.a.postAtTime(bVar2.i, longValue2);
        bVar2.g = aVar2;
    }

    public final void b(long j, int i) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            a(j, i);
        } else {
            this.e.post(new g(i, 0, j, this));
        }
    }

    public final void b() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            a();
        } else {
            this.e.post(new com.appsflyer.a(this, 6));
        }
    }

    public final void a() {
        if (this.g.g == com.socure.idplus.device.internal.behavior.capture.a.STOPPED) {
            return;
        }
        Iterator it = ((List) this.f.getValue()).iterator();
        while (it.hasNext()) {
            ((com.socure.idplus.device.internal.motion.producer.c) it.next()).b();
        }
        com.socure.idplus.device.internal.motion.capture.b bVar = this.g;
        com.socure.idplus.device.internal.behavior.capture.a aVar = bVar.g;
        com.socure.idplus.device.internal.behavior.capture.a aVar2 = com.socure.idplus.device.internal.behavior.capture.a.STOPPED;
        if (aVar == aVar2) {
            return;
        }
        bVar.a.removeCallbacks(bVar.i);
        bVar.h = 0L;
        bVar.g = aVar2;
        bVar.e.invoke();
    }

    public static final void a(f fVar, long j, int i) {
        fVar.a(j, i);
    }

    public static final void a(f fVar) {
        fVar.a();
    }
}
