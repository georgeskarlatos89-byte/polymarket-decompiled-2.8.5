package io.ably.lib.http;

import io.ably.lib.util.CurrentThreadExecutor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class SyncHttpScheduler extends HttpScheduler {
    public SyncHttpScheduler(HttpCore httpCore) {
        super(httpCore, CurrentThreadExecutor.INSTANCE);
    }
}
