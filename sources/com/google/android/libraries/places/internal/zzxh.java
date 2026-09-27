package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.view.View;
import defpackage.n6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzxh extends n6 {
    final /* synthetic */ View zza;

    public zzxh(View view) {
        this.zza = view;
    }

    @Override // defpackage.n6
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        view.getClass();
        if (i == 16) {
            this.zza.performClick();
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
