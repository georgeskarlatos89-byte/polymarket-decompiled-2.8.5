package com.appsflyer;

import com.appsflyer.internal.AFg1hSDK;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFg1hSDK[] b;

    public /* synthetic */ b(AFg1hSDK[] aFg1hSDKArr, int i) {
        this.a = i;
        this.b = aFg1hSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AFg1hSDK[] aFg1hSDKArr = this.b;
        switch (i) {
            case 0:
                AFLogger.c(aFg1hSDKArr);
                return;
            default:
                AFLogger.a(aFg1hSDKArr);
                return;
        }
    }
}
