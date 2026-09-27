package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bkb implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final kvd a = ikl.c(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
