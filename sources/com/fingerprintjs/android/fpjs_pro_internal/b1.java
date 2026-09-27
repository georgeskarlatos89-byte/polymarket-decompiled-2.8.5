package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b1 extends Lambda implements Function0<String> {
    public final /* synthetic */ c1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(0);
        this.h = c1Var;
    }

    public final String b() {
        int i = c1.c;
        int i2 = ((i | HttpStatusCodesKt.HTTP_EARLY_HINTS) << 1) - (i ^ HttpStatusCodesKt.HTTP_EARLY_HINTS);
        int i3 = i2 % 128;
        int i4 = i2 % 2;
        bc bcVar = this.h.a;
        if (i4 == 0) {
            int i5 = i3 + 51;
            c1.c = i5 % 128;
            if (i5 % 2 != 0) {
                String component9 = bcVar.component9();
                component9.getClass();
                return component9;
            }
            throw null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        return b();
    }
}
