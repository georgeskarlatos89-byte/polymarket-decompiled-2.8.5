package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appsflyer.internal.q;
import defpackage.l21;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d implements io.sentry.util.thread.a {
    public static final d a;
    public static volatile long b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.android.core.internal.util.d] */
    static {
        ?? obj = new Object();
        new Handler(Looper.getMainLooper()).post(new q(1));
        a = obj;
        b = Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        long id;
        long id2;
        Thread currentThread = Thread.currentThread();
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            id = l21.c(currentThread);
        } else {
            id = currentThread.getId();
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (i >= 36) {
            id2 = l21.c(thread);
        } else {
            id2 = thread.getId();
        }
        if (id2 == id) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.util.thread.a
    public final String b() {
        if (a()) {
            return "main";
        }
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long c() {
        return Process.myTid();
    }
}
