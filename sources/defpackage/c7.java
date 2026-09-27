package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c7 implements kgf {
    public Object a;

    public /* synthetic */ c7(Object obj) {
        this.a = obj;
    }

    public static c7 a(boolean z, int i, int i2, int i3, int i4) {
        return new c7(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    @Override // defpackage.kgf
    public Object get() {
        return this.a;
    }
}
