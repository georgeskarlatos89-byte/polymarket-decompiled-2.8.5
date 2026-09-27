package io.intercom.android.sdk.utilities.extensions;

import android.view.View;
import io.intercom.android.sdk.annotations.SeenState;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {SeenState.HIDE, "", "Landroid/view/View;", "show", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewExtensionsKt {
    public static final void hide(View view) {
        view.getClass();
        view.setVisibility(8);
    }

    public static final void show(View view) {
        view.getClass();
        view.setVisibility(0);
    }
}
