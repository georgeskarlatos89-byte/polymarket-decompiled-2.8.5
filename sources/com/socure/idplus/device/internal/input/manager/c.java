package com.socure.idplus.device.internal.input.manager;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends Lambda implements Function0 {
    public static final c a = new c();

    public c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
