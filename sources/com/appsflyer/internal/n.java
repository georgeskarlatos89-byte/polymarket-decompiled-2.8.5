package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFj1mSDK b;

    public /* synthetic */ n(AFj1mSDK aFj1mSDK, int i) {
        this.a = i;
        this.b = aFj1mSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AFj1mSDK aFj1mSDK = this.b;
        switch (i) {
            case 0:
                AFj1mSDK.b(aFj1mSDK);
                return;
            case 1:
                AFj1mSDK.c(aFj1mSDK);
                return;
            default:
                AFj1mSDK.a(aFj1mSDK);
                return;
        }
    }
}
