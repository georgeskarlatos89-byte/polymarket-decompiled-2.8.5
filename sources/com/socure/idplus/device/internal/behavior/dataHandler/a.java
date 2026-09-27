package com.socure.idplus.device.internal.behavior.dataHandler;

import com.socure.idplus.device.internal.behavior.model.SessionDataRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function0 {
    public final /* synthetic */ com.socure.idplus.device.internal.api.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ SessionDataRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.socure.idplus.device.internal.api.a aVar, String str, SessionDataRequest sessionDataRequest) {
        super(0);
        this.a = aVar;
        this.b = str;
        this.c = sessionDataRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.a(this.b, this.c);
    }
}
