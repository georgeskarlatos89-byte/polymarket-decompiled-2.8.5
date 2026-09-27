package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ SessionTokenCallback a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, SessionTokenCallback sessionTokenCallback) {
        super(1);
        this.a = sessionTokenCallback;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((ResponseBody) obj).getClass();
        SessionTokenCallback sessionTokenCallback = this.a;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onComplete(this.b);
        }
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        return Unit.INSTANCE;
    }
}
