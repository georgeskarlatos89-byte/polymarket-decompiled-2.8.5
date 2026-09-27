package io.sentry.util.thread;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c implements a {
    public static final long a = Thread.currentThread().getId();
    public static final c b = new Object();

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        if (a == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.util.thread.a
    public final String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long c() {
        return Thread.currentThread().getId();
    }
}
