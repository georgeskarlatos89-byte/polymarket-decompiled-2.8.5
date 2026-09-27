package com.socure.idplus.device.internal.viewModel.deviceV2;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return e.a();
            case 1:
                return InetAddress.getLocalHost();
            case 2:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.e.c.a();
        }
    }
}
