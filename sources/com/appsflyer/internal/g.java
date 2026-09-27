package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AFb1lSDK.a((AFb1lSDK) obj2, (AFh1oSDK) obj);
                return;
            case 1:
                AFa1tSDK.b((AFa1tSDK) obj2, (AFh1sSDK) obj);
                return;
            case 2:
                AFi1aSDK.a((AFi1aSDK) obj2, (Context) obj);
                return;
            case 3:
                AFi1eSDK.a((AFi1eSDK) obj2, (Context) obj);
                return;
            case 4:
                AFj1qSDK.a((AFj1qSDK) obj2, (Context) obj);
                return;
            case 5:
                AFj1tSDK.a((AFj1tSDK) obj2, (SensorEvent) obj);
                return;
            default:
                AFj1xSDK.a((AFj1xSDK) obj2, (Context) obj);
                return;
        }
    }
}
