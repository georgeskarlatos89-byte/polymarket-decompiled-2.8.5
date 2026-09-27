package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.pC2922;
import defpackage.eb4;
import defpackage.rib;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922;", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class s0 extends Lambda implements Function1<SafeWithTimeoutProContext, List<? extends pC2922>> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ T9586V28869 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(T9586V28869 t9586v28869) {
        super(1);
        this.h = t9586v28869;
    }

    public final List<pC2922> a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i2 = i;
        j = (((i2 | 23) << 1) - (i2 ^ 23)) % 128;
        rib b = eb4.b();
        T9586V28869 t9586v28869 = this.h;
        if (T9586V28869.g(t9586v28869, "android.permission.ACCESS_FINE_LOCATION")) {
            int i3 = j;
            int i4 = (i3 ^ 61) + ((i3 & 61) << 1);
            i = i4 % 128;
            if (i4 % 2 == 0) {
                b.add(pC2922.a.e);
            } else {
                b.add(pC2922.a.e);
                throw null;
            }
        }
        if (T9586V28869.g(t9586v28869, "android.permission.ACCESS_COARSE_LOCATION")) {
            int i5 = j + 105;
            i = i5 % 128;
            if (i5 % 2 == 0) {
                b.add(pC2922.b.e);
            } else {
                b.add(pC2922.b.e);
                throw null;
            }
        }
        rib a = eb4.a(b);
        i = (j + 39) % 128;
        return a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ List<? extends pC2922> invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        j = (i + 43) % 128;
        List<pC2922> a = a(safeWithTimeoutProContext);
        int i2 = i;
        int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
        j = i3 % 128;
        if (i3 % 2 != 0) {
            return a;
        }
        throw null;
    }
}
