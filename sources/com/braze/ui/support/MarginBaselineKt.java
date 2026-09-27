package com.braze.ui.support;

import android.view.ViewGroup;
import defpackage.fz9;
import defpackage.vlk;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/view/ViewGroup$MarginLayoutParams;", "Lvlk;", "insets", "Lcom/braze/ui/support/MarginBaseline;", "baseline", "", "applyTopInset", "", "applySafeAreaMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;Lvlk;Lcom/braze/ui/support/MarginBaseline;Z)V", "android-sdk-ui"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MarginBaselineKt {
    public static final void applySafeAreaMargins(ViewGroup.MarginLayoutParams marginLayoutParams, vlk vlkVar, MarginBaseline marginBaseline, boolean z) {
        marginLayoutParams.getClass();
        vlkVar.getClass();
        marginBaseline.getClass();
        fz9 orCapture$android_sdk_ui = marginBaseline.getOrCapture$android_sdk_ui(marginLayoutParams);
        int maxSafeLeftInset = ViewUtils.getMaxSafeLeftInset(vlkVar) + orCapture$android_sdk_ui.a;
        int i = orCapture$android_sdk_ui.b;
        if (z) {
            i += ViewUtils.getMaxSafeTopInset(vlkVar);
        }
        marginLayoutParams.setMargins(maxSafeLeftInset, i, ViewUtils.getMaxSafeRightInset(vlkVar) + orCapture$android_sdk_ui.c, ViewUtils.getMaxSafeBottomInset(vlkVar) + orCapture$android_sdk_ui.d);
    }

    public static /* synthetic */ void applySafeAreaMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, vlk vlkVar, MarginBaseline marginBaseline, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        applySafeAreaMargins(marginLayoutParams, vlkVar, marginBaseline, z);
    }
}
