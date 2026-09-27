package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zr implements u6 {
    public final AccessibilityManager a;

    public zr(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
