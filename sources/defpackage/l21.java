package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l21 {
    public static /* bridge */ /* synthetic */ int a() {
        return Build.VERSION.SDK_INT_FULL;
    }

    public static /* bridge */ /* synthetic */ long b(BackEvent backEvent) {
        return backEvent.getFrameTimeMillis();
    }

    public static /* bridge */ /* synthetic */ long c(Thread thread) {
        return thread.threadId();
    }
}
