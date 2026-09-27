package com.socure.idplus.device.internal.thread;

import android.os.Handler;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a extends Lambda implements Function0 {
    public static final a a = new a();

    public a() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public static ThreadPoolExecutor a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors < 2) {
            availableProcessors = 2;
        }
        return new ThreadPoolExecutor(0, availableProcessors * 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(50), (ThreadFactory) new Object());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }

    public static final Thread a(Runnable runnable) {
        Handler handler = b.a;
        return new Thread(runnable, "b");
    }
}
