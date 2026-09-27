package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hqd implements iqd {
    @Override // defpackage.iqd
    public final float a() {
        return 2.0f;
    }

    @Override // defpackage.iqd
    public final float b(owa owaVar) {
        return 4.0f;
    }

    @Override // defpackage.iqd
    public final float c(owa owaVar) {
        return 4.0f;
    }

    @Override // defpackage.iqd
    public final float d() {
        return 2.0f;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hqd) && hy6.c(4.0f, 4.0f) && hy6.c(2.0f, 2.0f) && hy6.c(4.0f, 4.0f) && hy6.c(2.0f, 2.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + sv6.a(sv6.a(Float.hashCode(4.0f) * 31, 2.0f, 31), 4.0f, 31);
    }

    public final String toString() {
        return "PaddingValues.Absolute(left=" + ((Object) hy6.d(4.0f)) + ", top=" + ((Object) hy6.d(2.0f)) + ", right=" + ((Object) hy6.d(4.0f)) + ", bottom=" + ((Object) hy6.d(2.0f)) + ')';
    }
}
