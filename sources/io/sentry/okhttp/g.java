package io.sentry.okhttp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ io.sentry.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(io.sentry.e eVar, int i) {
        super(1);
        this.h = i;
        this.i = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        io.sentry.e eVar = this.i;
        switch (i) {
            case 0:
                eVar.d(Long.valueOf(((Number) obj).longValue()), "http.request_content_length");
                return Unit.INSTANCE;
            default:
                eVar.d(Long.valueOf(((Number) obj).longValue()), "http.response_content_length");
                return Unit.INSTANCE;
        }
    }
}
