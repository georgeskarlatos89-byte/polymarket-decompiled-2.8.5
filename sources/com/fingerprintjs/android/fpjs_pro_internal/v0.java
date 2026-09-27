package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class v0 extends Lambda implements Function0<String> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ W29288 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(W29288 w29288) {
        super(0);
        this.h = w29288;
    }

    public final String b() {
        int i2 = i + 93;
        j = i2 % 128;
        int i3 = i2 % 2;
        ActivityManager f = W29288.f(this.h);
        f.getClass();
        ConfigurationInfo deviceConfigurationInfo = f.getDeviceConfigurationInfo();
        deviceConfigurationInfo.getClass();
        String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
        glEsVersion.getClass();
        if (i3 != 0) {
            return glEsVersion;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = i;
        j = ((i2 ^ 113) + ((i2 & 113) << 1)) % 128;
        String b = b();
        int i3 = j + 21;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            return b;
        }
        throw null;
    }
}
