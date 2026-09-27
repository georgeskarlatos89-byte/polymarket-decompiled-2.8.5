package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c implements io.sentry.transport.f {
    public static final c a = new Object();

    @Override // io.sentry.transport.f
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
