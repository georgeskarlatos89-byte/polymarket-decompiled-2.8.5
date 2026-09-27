package io.intercom.android.sdk.utilities;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ViewUtils {
    public static void removeGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void waitForViewAttachment(final View view, final Runnable runnable) {
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.utilities.ViewUtils.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewUtils.removeGlobalLayoutListener(view, this);
                    runnable.run();
                }
            });
        } else {
            runnable.run();
        }
    }
}
