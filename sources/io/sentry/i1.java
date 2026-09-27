package io.sentry;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface i1 {
    void a(long j);

    Future b(Runnable runnable, long j);

    boolean isClosed();

    Future submit(Runnable runnable);
}
