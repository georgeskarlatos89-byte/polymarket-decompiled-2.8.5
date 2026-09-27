package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ccj {
    Object a();

    Object c();

    default boolean d(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj, c()) && Intrinsics.areEqual(obj2, a())) {
            return true;
        }
        return false;
    }
}
