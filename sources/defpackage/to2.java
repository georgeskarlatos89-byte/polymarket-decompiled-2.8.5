package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class to2 implements vo2 {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof to2) || !hy6.c(44.0f, 44.0f) || !hy6.c(44.0f, 44.0f) || !hy6.c(12.0f, 12.0f) || !hy6.c(23.0f, 23.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(23.0f) + sv6.a(sv6.a(Float.hashCode(44.0f) * 31, 44.0f, 31), 12.0f, 31);
    }

    public final String toString() {
        String d = hy6.d(44.0f);
        String d2 = hy6.d(44.0f);
        return sv6.p(m51.r("FixedRoundedRect(width=", d, ", height=", d2, ", cornerRadius="), hy6.d(12.0f), ", centerYOffset=", hy6.d(23.0f), ")");
    }
}
