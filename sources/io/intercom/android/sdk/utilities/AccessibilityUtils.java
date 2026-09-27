package io.intercom.android.sdk.utilities;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.d7;
import defpackage.k9k;
import defpackage.n6;
import defpackage.x6;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/utilities/AccessibilityUtils;", "", "<init>", "()V", "addClickAbilityAnnouncement", "", "view", "Landroid/view/View;", "removeClickAbilityAnnouncement", "addHeadingAnnouncement", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccessibilityUtils {
    public static final int $stable = 0;
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(View view) {
        view.getClass();
        k9k.j(view, new n6() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$addClickAbilityAnnouncement$1
            @Override // defpackage.n6
            public void onInitializeAccessibilityNodeInfo(View host, d7 info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.b(x6.e);
                info.j(true);
            }
        });
    }

    public final void addHeadingAnnouncement(View view) {
        view.getClass();
        k9k.j(view, new n6() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$addHeadingAnnouncement$1
            @Override // defpackage.n6
            public void onInitializeAccessibilityNodeInfo(View host, d7 info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.a.setHeading(true);
            }
        });
    }

    public final void removeClickAbilityAnnouncement(View view) {
        view.getClass();
        k9k.j(view, new n6() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$removeClickAbilityAnnouncement$1
            @Override // defpackage.n6
            public void onInitializeAccessibilityNodeInfo(View host, d7 info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                x6 x6Var = x6.e;
                AccessibilityNodeInfo accessibilityNodeInfo = info.a;
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) x6Var.a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) x6.f.a);
                info.j(false);
                accessibilityNodeInfo.setLongClickable(false);
            }
        });
    }
}
