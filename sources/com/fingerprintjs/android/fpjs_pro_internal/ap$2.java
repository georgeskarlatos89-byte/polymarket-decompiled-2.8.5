package com.fingerprintjs.android.fpjs_pro_internal;

import android.telephony.TelephonyManager;
import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ap$2 extends Lambda implements Function0<String> {
    public static int i;
    public static int j;
    public final /* synthetic */ p1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap$2(p1 p1Var) {
        super(0);
        this.h = p1Var;
    }

    public static int component5() {
        int i2 = i;
        int i3 = i2 % 5397923;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int b = hdi.b(250422488);
        j = b;
        return b;
    }

    public final String b() {
        TelephonyManager c = p1.c(this.h);
        c.getClass();
        String simCountryIso = c.getSimCountryIso();
        simCountryIso.getClass();
        return simCountryIso;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        return b();
    }
}
