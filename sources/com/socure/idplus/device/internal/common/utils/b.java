package com.socure.idplus.device.internal.common.utils;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ b(Function0 function0, int i) {
        this.a = i;
        this.b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                a.a(function0);
                return;
            default:
                com.socure.idplus.device.internal.utils.timer.a.a(function0);
                return;
        }
    }
}
