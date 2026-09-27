package com.socure.idplus.device.internal.motion.manager;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends Lambda implements Function0 {
    public final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(0);
        this.a = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator it = ((List) this.a.f.getValue()).iterator();
        while (it.hasNext()) {
            ((com.socure.idplus.device.internal.motion.producer.c) it.next()).a();
        }
        return Unit.INSTANCE;
    }
}
