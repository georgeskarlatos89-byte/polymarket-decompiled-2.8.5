package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import defpackage.d1c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/z2;", "p0", "", "a", "(Lcom/fingerprintjs/android/fpjs_pro_internal/z2;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class w4 extends Lambda implements Function1<z2, Object> {
    public static final w4 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    public w4() {
        super(1);
    }

    public final Object a(z2 z2Var) {
        j = (i + 65) % 128;
        String pivotYN16904 = C1722.o4.e.setPivotYN16904();
        z2Var.getClass();
        int i2 = z2.e + 49;
        z2.d = i2 % 128;
        int i3 = i2 % 2;
        String str = z2Var.a;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        Pair pair = new Pair(pivotYN16904, str);
        String pivotYN169042 = C1722.xb.e.setPivotYN16904();
        int a = y3.a();
        Pair pair2 = new Pair(pivotYN169042, (String) z2.a(new Object[]{z2Var}, -2005827001, y3.a(), y3.a(), 2005827003, y3.a(), a));
        String pivotYN169043 = C1722.r4.e.setPivotYN16904();
        int i5 = z2.e;
        int i6 = (i5 & 17) + (i5 | 17);
        z2.d = i6 % 128;
        int i7 = i6 % 2;
        String str2 = z2Var.c;
        if (i7 == 0) {
            Map e = d1c.e(pair, pair2, new Pair(pivotYN169043, str2));
            int i8 = j + 51;
            i = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 98 / 0;
            }
            return e;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(z2 z2Var) {
        int i2 = j + 101;
        i = i2 % 128;
        z2 z2Var2 = z2Var;
        if (i2 % 2 == 0) {
            return a(z2Var2);
        }
        a(z2Var2);
        throw null;
    }
}
