package io.sentry.android.replay;

import defpackage.eag;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r implements Closeable {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final io.sentry.util.a b = new Object();
    public final io.sentry.android.core.d0 c = new io.sentry.android.core.d0(this, 1);
    public final eag d = new eag(this, 1);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(true);
        this.c.clear();
    }
}
