package defpackage;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o44 extends ClassValue {
    /* JADX WARN: Type inference failed for: r1v1, types: [pqc, java.lang.Object] */
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        cls.getClass();
        ?? obj = new Object();
        obj.a = new SoftReference(null);
        return obj;
    }
}
