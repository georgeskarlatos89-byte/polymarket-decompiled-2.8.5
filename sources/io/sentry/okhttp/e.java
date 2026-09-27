package io.sentry.okhttp;

import io.sentry.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(long j, int i) {
        super(1);
        this.h = i;
        this.i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        long j = this.i;
        switch (i) {
            case 0:
                m1 m1Var = (m1) obj;
                m1Var.getClass();
                if (j > 0) {
                    m1Var.r(Long.valueOf(j), "http.request_content_length");
                }
                return Unit.INSTANCE;
            default:
                m1 m1Var2 = (m1) obj;
                m1Var2.getClass();
                if (j > 0) {
                    m1Var2.r(Long.valueOf(j), "http.response_content_length");
                }
                return Unit.INSTANCE;
        }
    }
}
