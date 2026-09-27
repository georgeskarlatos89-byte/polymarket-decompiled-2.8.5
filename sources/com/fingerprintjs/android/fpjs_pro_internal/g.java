package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g extends Lambda implements Function0<String> {
    public static int i = 0;
    public static int j = 0;
    public static int k = 0;
    public static int l = 1;
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(0);
        this.h = iVar;
    }

    public static int setPivotYN16904() {
        int i2 = i;
        int i3 = i2 % 7744671;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int a = hdi.a();
        j = a;
        return a;
    }

    public final String b() {
        int i2 = k;
        l = ((i2 ^ 59) + ((i2 & 59) << 1)) % 128;
        String valueOf = String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance((Context) i.g(new Object[]{this.h}, com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), 643084615, com.fingerprintjs.android.fpjs_pro.u.component9(), -643084614)), null)).doubleValue());
        int i3 = k;
        l = ((i3 ^ 67) + ((i3 & 67) << 1)) % 128;
        return valueOf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = l + 59;
        k = i2 % 128;
        int i3 = i2 % 2;
        String b = b();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = l;
        k = (((i5 | 111) << 1) - (i5 ^ 111)) % 128;
        return b;
    }
}
