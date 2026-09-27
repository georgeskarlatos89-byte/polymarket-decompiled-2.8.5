package com.appsflyer.internal;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;
import io.sentry.ndk.NativeScope;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ q(io.sentry.android.ndk.b bVar) {
        this.a = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFj1rSDK.a();
                return;
            case 1:
                io.sentry.android.core.internal.util.d.b = Process.myTid();
                return;
            case 2:
                NativeScope.nativeClearAttachments();
                return;
            default:
                SentryNdk.a();
                return;
        }
    }

    public /* synthetic */ q(int i) {
        this.a = i;
    }
}
