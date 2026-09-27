package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m31 {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m31) || Float.compare(1.5f, 1.5f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(1.5f) + woa.d(woa.d(Long.hashCode(8L) * 31, 31, 500L), 31, 10000L);
    }

    public final String toString() {
        return "BackoffConfig(attempts=8, min=500, max=10000, scalar=1.5)";
    }
}
