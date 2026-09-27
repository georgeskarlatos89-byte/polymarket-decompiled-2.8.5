package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ly6 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ly6) && hy6.c(10.0f, 10.0f) && hy6.c(40.0f, 40.0f) && hy6.c(10.0f, 10.0f) && hy6.c(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + sv6.a(sv6.a(sv6.a(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) hy6.d(10.0f)) + ", top=" + ((Object) hy6.d(40.0f)) + ", end=" + ((Object) hy6.d(10.0f)) + ", bottom=" + ((Object) hy6.d(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
