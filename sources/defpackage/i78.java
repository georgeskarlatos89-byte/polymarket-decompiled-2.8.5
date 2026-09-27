package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class i78 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i78(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }

    public static h78 a(i78 i78Var, x4a[] x4aVarArr) {
        return new h78(i78Var.b + i78Var.c, x4aVarArr);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [g78, i78] */
    public static g78 b(i78 i78Var) {
        return new i78(i78Var.b + i78Var.c, 1, 0, (byte) 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g78, i78] */
    public static g78 c() {
        return new i78(0, 1, 0, (byte) 0);
    }

    public abstract void d(gg1 gg1Var, qj0 qj0Var, iah iahVar, cd6 cd6Var, vkd vkdVar);

    public abstract Object e(int i);

    public nr8 f(gg1 gg1Var) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String simpleName = lvf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
                if (simpleName == null) {
                    return "";
                }
                return simpleName;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i78(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
