package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.Process;
import defpackage.dmk;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ax<T> implements f2 {
    public static int c;
    public static int d;
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile Object b;

    public static int D8871() {
        int i = c;
        int i2 = i % 9957960;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int myTid = Process.myTid();
        d = myTid;
        return myTid;
    }

    public final Object a() {
        this.a.await();
        if (this.a.getCount() == 0) {
            return this.b;
        }
        dmk.n("Check failed.");
        return null;
    }

    public final void b(Location location) {
        if (this.a.getCount() == 0) {
            return;
        }
        this.b = location;
        this.a.countDown();
    }
}
