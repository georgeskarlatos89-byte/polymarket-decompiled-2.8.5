package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rag {
    public static final qag a = a(50);

    /* JADX WARN: Type inference failed for: r1v2, types: [w75, qag] */
    public static final qag a(int i) {
        lje ljeVar = new lje(i);
        return new w75(ljeVar, ljeVar, ljeVar, ljeVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w75, qag] */
    public static final qag b(float f) {
        iy6 iy6Var = new iy6(f);
        return new w75(iy6Var, iy6Var, iy6Var, iy6Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w75, qag] */
    public static final qag c(float f, float f2, float f3, float f4) {
        return new w75(new iy6(f), new iy6(f2), new iy6(f3), new iy6(f4));
    }

    public static qag d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return c(f, f2, f3, f4);
    }
}
