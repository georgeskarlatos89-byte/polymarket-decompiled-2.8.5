package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.Context;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "b", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class r3 extends Lambda implements Function0<ActivityManager> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Context context) {
        super(0);
        this.h = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r0 = (android.app.ActivityManager) r0;
        java.lang.System.identityHashCode(r3);
        com.fingerprintjs.android.fpjs_pro_internal.bc.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r0 instanceof android.app.ActivityManager) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ((r0 instanceof android.app.ActivityManager) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.r3.j + 89;
        com.fingerprintjs.android.fpjs_pro_internal.r3.i = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r3 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActivityManager b() {
        Object systemService;
        int i2 = i + 113;
        j = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.h;
        if (i3 == 0) {
            systemService = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
            int i4 = 52 / 0;
        } else {
            systemService = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ActivityManager invoke() {
        int i2 = i;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        j = i3 % 128;
        if (i3 % 2 != 0) {
            return b();
        }
        b();
        throw null;
    }
}
