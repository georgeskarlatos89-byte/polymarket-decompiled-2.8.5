package io.sentry.android.core.performance;

import android.view.Window;
import defpackage.qmf;
import io.sentry.android.core.internal.gestures.j;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h extends j {
    public final qmf b;

    public h(Window.Callback callback, qmf qmfVar) {
        super(callback);
        this.b = qmfVar;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.b.run();
    }
}
