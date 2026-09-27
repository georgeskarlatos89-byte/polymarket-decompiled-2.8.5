package com.socure.docv.capturesdk.common.animation;

import android.animation.ValueAnimator;
import android.content.res.Resources;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b {
    public final Resources a;
    public ValueAnimator b;

    public b(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.b = null;
    }
}
