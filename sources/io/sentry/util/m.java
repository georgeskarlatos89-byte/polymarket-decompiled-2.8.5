package io.sentry.util;

import io.sentry.j1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements j1 {
    @Override // java.lang.AutoCloseable
    public final void close() {
        ThreadLocal threadLocal = n.a;
        Integer num = (Integer) threadLocal.get();
        if (num != null && num.intValue() > 1) {
            threadLocal.set(Integer.valueOf(num.intValue() - 1));
        } else {
            threadLocal.remove();
        }
    }
}
