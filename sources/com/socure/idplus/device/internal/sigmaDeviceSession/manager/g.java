package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g extends Lambda implements Function2 {
    public final /* synthetic */ k a;
    public final /* synthetic */ Lambda b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(k kVar, Function2 function2) {
        super(2);
        this.a = kVar;
        this.b = (Lambda) function2;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SigmaDeviceError sigmaDeviceError = (SigmaDeviceError) obj;
        String str = (String) obj2;
        sigmaDeviceError.getClass();
        str.getClass();
        k kVar = this.a;
        kVar.h = null;
        kVar.i = null;
        kVar.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.STOPPED;
        ArrayList arrayList = new ArrayList(kVar.g);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            SessionTokenCallback sessionTokenCallback = (SessionTokenCallback) obj3;
            sessionTokenCallback.getClass();
            sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, "Unable to fetch session");
        }
        kVar.g.clear();
        this.b.invoke(sigmaDeviceError, str);
        return Unit.INSTANCE;
    }
}
