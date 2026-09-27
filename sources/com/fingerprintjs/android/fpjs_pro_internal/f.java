package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends Lambda implements Function0<String> {
    public static int i;
    public static int j;
    public final /* synthetic */ i h;

    static {
        d();
        c();
        i = 0;
        j = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(0);
        this.h = iVar;
    }

    public final String b() {
        Intent registerReceiver = ((Context) i.g(new Object[]{this.h}, com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), 643084615, com.fingerprintjs.android.fpjs_pro.u.component9(), -643084614)).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        registerReceiver.getClass();
        int intExtra = registerReceiver.getIntExtra(PlaceTypes.HEALTH, -1);
        if (intExtra != -1) {
            int i2 = i;
            int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
            j = i3 % 128;
            if (i3 % 2 != 0) {
                String str = (String) i.g(new Object[]{Integer.valueOf(intExtra)}, com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), com.fingerprintjs.android.fpjs_pro.u.component9(), -428824070, com.fingerprintjs.android.fpjs_pro.u.component9(), 428824070);
                int i4 = j;
                int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
                i = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 42 / 0;
                }
                return str;
            }
            throw null;
        }
        return "";
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = i;
        j = ((i2 ^ 13) + ((i2 & 13) << 1)) % 128;
        String b = b();
        j = (i + 81) % 128;
        return b;
    }

    public static void c() {
    }

    public static void d() {
    }
}
