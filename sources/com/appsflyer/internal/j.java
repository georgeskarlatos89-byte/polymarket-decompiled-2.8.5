package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFd1wSDK b;

    public /* synthetic */ j(AFd1wSDK aFd1wSDK, int i) {
        this.a = i;
        this.b = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AFd1wSDK aFd1wSDK = this.b;
        switch (i) {
            case 0:
                AFd1wSDK.c(aFd1wSDK);
                return;
            case 1:
                AFd1wSDK.b(aFd1wSDK);
                return;
            default:
                AFd1wSDK.d(aFd1wSDK);
                return;
        }
    }
}
