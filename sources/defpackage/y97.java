package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y97 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y97) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + hdi.g(sv6.a(Float.hashCode(1.0f) * 31, 0.0f, 31), 31, true);
    }

    public final String toString() {
        return "EmbeddedFlatStyle(separatorThickness=1.0, separatorInsets=0.0, topSeparatorEnabled=true, bottomSeparatorEnabled=true)";
    }
}
