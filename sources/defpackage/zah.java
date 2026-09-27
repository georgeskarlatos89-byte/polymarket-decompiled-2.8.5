package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zah extends pa1 {
    public static final int[] D = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager B;
    public boolean C;

    public zah(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.B = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
