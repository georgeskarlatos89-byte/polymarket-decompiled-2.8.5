package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nvf extends pvf {
    public final /* synthetic */ Method b;

    public nvf(Method method) {
        this.b = method;
    }

    @Override // defpackage.pvf
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            omf.m("Failed invoking canAccess", e);
            return false;
        }
    }
}
