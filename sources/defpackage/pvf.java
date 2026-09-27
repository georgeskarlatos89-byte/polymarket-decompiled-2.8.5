package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class pvf {
    public static final pvf a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [pvf] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r1;
        if (eca.a >= 9) {
            try {
                r1 = new nvf(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (r1 == 0) {
                r1 = new Object();
            }
            a = r1;
        }
        r1 = 0;
        if (r1 == 0) {
        }
        a = r1;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
