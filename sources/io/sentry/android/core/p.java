package io.sentry.android.core;

import android.os.Debug;
import io.sentry.n3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p implements io.sentry.a1 {
    @Override // io.sentry.a1
    public final void b(n3 n3Var) {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        n3Var.c = freeMemory;
        n3Var.d = true;
        n3Var.e = nativeHeapSize;
        n3Var.f = true;
    }

    @Override // io.sentry.a1
    public final void a() {
    }
}
