package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import defpackage.d1c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/j4;", "p0", "", "a", "(Lcom/fingerprintjs/android/fpjs_pro_internal/j4;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u4 extends Lambda implements Function1<j4, Object> {
    public static final u4 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.u4, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 - (-18)) - 1) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public u4() {
        super(1);
    }

    public final Object a(j4 j4Var) {
        int i2 = j;
        i = ((i2 & 85) + (i2 | 85)) % 128;
        Map e = d1c.e(new Pair(C1722.h5.e.setPivotYN16904(), j4Var.a), new Pair(C1722.hc.e.setPivotYN16904(), j4Var.b));
        int i3 = j + 37;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            return e;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(j4 j4Var) {
        int i2 = j;
        i = ((i2 & 49) + (i2 | 49)) % 128;
        Object a = a(j4Var);
        int i3 = i + 109;
        j = i3 % 128;
        if (i3 % 2 != 0) {
            return a;
        }
        throw null;
    }
}
