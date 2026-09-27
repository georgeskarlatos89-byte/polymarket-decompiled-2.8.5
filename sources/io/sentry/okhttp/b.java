package io.sentry.okhttp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Call;
import okhttp3.EventListener;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ EventListener.Factory h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EventListener.Factory factory) {
        super(1);
        this.h = factory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Call call = (Call) obj;
        call.getClass();
        return this.h.create(call);
    }
}
