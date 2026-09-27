package defpackage;

import android.app.ActivityOptions;
import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class z6 {
    public static int a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void e(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static void f(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
