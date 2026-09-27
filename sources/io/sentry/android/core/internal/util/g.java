package io.sentry.android.core.internal.util;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ h b;

    public g(h hVar, View view) {
        this.b = hVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getViewTreeObserver().removeOnDrawListener(this.b);
    }
}
