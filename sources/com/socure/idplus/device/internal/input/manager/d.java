package com.socure.idplus.device.internal.input.manager;

import com.socure.idplus.device.internal.behavior.model.AndroidNavigationContextProperties;
import defpackage.kb;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class d extends kb implements Function2 {
    public d(e eVar) {
        super(2, 0, e.class, eVar, "setNavigationContext", "setNavigationContext(Ljava/lang/String;Lcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;Z)V");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        e.a((e) this.receiver, str, (AndroidNavigationContextProperties) obj2, 4);
        return Unit.INSTANCE;
    }
}
