package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k6b {
    public k6b(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static m6b a(n6b n6bVar) {
        n6bVar.getClass();
        int i = j6b.a[n6bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return m6b.ON_PAUSE;
            }
            return m6b.ON_STOP;
        }
        return m6b.ON_DESTROY;
    }

    public static m6b b(n6b n6bVar) {
        n6bVar.getClass();
        int i = j6b.a[n6bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    return null;
                }
                return m6b.ON_CREATE;
            }
            return m6b.ON_RESUME;
        }
        return m6b.ON_START;
    }

    public static m6b c(n6b n6bVar) {
        n6bVar.getClass();
        int i = j6b.a[n6bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return m6b.ON_RESUME;
            }
            return m6b.ON_START;
        }
        return m6b.ON_CREATE;
    }
}
