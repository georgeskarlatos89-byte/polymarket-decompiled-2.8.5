package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hy6 implements Comparable {
    public final float a;

    public /* synthetic */ hy6(float f) {
        this.a = f;
    }

    public static final /* synthetic */ hy6 a() {
        return new hy6(0.0f);
    }

    public static int b(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            return Float.compare(f, f2);
        }
        return 0;
    }

    public static final boolean c(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((hy6) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hy6) {
            if (Float.compare(this.a, ((hy6) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
