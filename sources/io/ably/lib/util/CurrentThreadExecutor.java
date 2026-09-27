package io.ably.lib.util;

import io.ably.lib.http.CloseableExecutor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class CurrentThreadExecutor implements CloseableExecutor {
    public static CurrentThreadExecutor INSTANCE = new CurrentThreadExecutor();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
