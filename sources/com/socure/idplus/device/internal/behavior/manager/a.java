package com.socure.idplus.device.internal.behavior.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function0 {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.a = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.b();
        return Unit.INSTANCE;
    }
}
