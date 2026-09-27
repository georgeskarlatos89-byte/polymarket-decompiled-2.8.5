package com.fingerprintjs.android.fpjs_pro_internal;

import android.telephony.TelephonyManager;
import com.fingerprintjs.android.fpjs_pro_internal.k1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/k1;", "b", "()Lcom/fingerprintjs/android/fpjs_pro_internal/k1;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o1 extends Lambda implements Function0<k1> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ p1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var) {
        super(0);
        this.h = p1Var;
    }

    public final k1 b() {
        int i2 = i;
        j = ((i2 ^ 87) + ((i2 & 87) << 1)) % 128;
        TelephonyManager c = p1.c(this.h);
        c.getClass();
        switch (c.getDataState()) {
            case -1:
                k1.e eVar = k1.e.b;
                int i3 = i + 31;
                j = i3 % 128;
                if (i3 % 2 != 0) {
                    return eVar;
                }
                throw null;
            case 0:
                k1.f fVar = k1.f.b;
                int i4 = j;
                i = ((i4 & HttpStatusCodesKt.HTTP_EARLY_HINTS) + (i4 | HttpStatusCodesKt.HTTP_EARLY_HINTS)) % 128;
                return fVar;
            case 1:
                k1.g gVar = k1.g.b;
                i = (j + 13) % 128;
                return gVar;
            case 2:
                return k1.a.b;
            case 3:
                return k1.b.b;
            case 4:
                k1.c cVar = k1.c.b;
                int i5 = j + 77;
                i = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 88 / 0;
                }
                return cVar;
            case 5:
                k1.d dVar = k1.d.b;
                int i7 = i;
                int i8 = (i7 & 95) + (i7 | 95);
                j = i8 % 128;
                if (i8 % 2 != 0) {
                    return dVar;
                }
                throw null;
            default:
                throw new Exception();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ k1 invoke() {
        int i2 = j + 121;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return b();
        }
        b();
        throw null;
    }
}
