package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zfl {
    public static final vl4 a = new vl4(new t54(10, (byte) 0), false, -267568320);

    public static void a(String str, boolean z) {
        if (z) {
        } else {
            throw dwd.a(null, str);
        }
    }

    public static final kjc b(kjc kjcVar, float f, z0h z0hVar, boolean z, long j, long j2) {
        if (hy6.b(f, 0.0f) <= 0 && !z) {
            return kjcVar;
        }
        return kjcVar.e(new u0h(f, z0hVar, z, j, j2));
    }

    public static kjc c(kjc kjcVar, float f, z0h z0hVar, long j, long j2, int i) {
        boolean z = false;
        if ((i & 4) != 0 && hy6.b(f, 0.0f) > 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = l09.a;
        }
        if ((i & 16) != 0) {
            j2 = l09.a;
        }
        long j3 = j;
        return b(kjcVar, f, z0hVar, z, j3, j2);
    }
}
