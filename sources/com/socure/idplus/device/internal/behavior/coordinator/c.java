package com.socure.idplus.device.internal.behavior.coordinator;

import com.socure.idplus.device.internal.behavior.manager.f;
import com.socure.idplus.device.internal.thread.e;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c {
    public final e a;
    public com.socure.idplus.device.internal.b b;
    public final f c;
    public final CopyOnWriteArraySet d;

    public c(e eVar, com.socure.idplus.device.internal.api.b bVar) {
        eVar.getClass();
        bVar.getClass();
        this.a = eVar;
        f fVar = new f(eVar, bVar, new b(this));
        this.c = fVar;
        this.d = new CopyOnWriteArraySet();
        eVar.c = fVar;
        eVar.start();
    }
}
