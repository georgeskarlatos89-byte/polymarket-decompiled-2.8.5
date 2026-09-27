package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFj1rSDK b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o(AFj1rSDK aFj1rSDK, Runnable runnable, int i) {
        this.a = i;
        this.b = aFj1rSDK;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        AFj1rSDK aFj1rSDK = this.b;
        switch (i) {
            case 0:
                AFj1rSDK.d(aFj1rSDK, runnable);
                return;
            case 1:
                AFj1rSDK.g(aFj1rSDK, runnable);
                return;
            case 2:
                AFj1rSDK.b(aFj1rSDK, runnable);
                return;
            default:
                AFj1rSDK.f(aFj1rSDK, runnable);
                return;
        }
    }
}
