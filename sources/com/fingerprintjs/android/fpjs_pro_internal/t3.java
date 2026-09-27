package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.Context;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "b", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class t3 extends Lambda implements Function0<ActivityManager> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context) {
        super(0);
        this.h = context;
    }

    public final ActivityManager b() {
        j = (i + 67) % 128;
        ActivityManager activityManager = (ActivityManager) this.h.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        j = (i + 83) % 128;
        return activityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ActivityManager invoke() {
        int i2 = j;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        i = i3 % 128;
        int i4 = i3 % 2;
        ActivityManager b = b();
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        return b;
    }
}
