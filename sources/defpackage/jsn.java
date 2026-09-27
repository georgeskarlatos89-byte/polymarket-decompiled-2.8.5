package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class jsn {
    public static final StackTraceElement a(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final do6 b(kff kffVar) {
        int i;
        if (kffVar == null) {
            i = -1;
        } else {
            i = rff.b[kffVar.ordinal()];
        }
        switch (i) {
            case 1:
                do6 do6Var = eo6.d;
                do6Var.getClass();
                return do6Var;
            case 2:
                do6 do6Var2 = eo6.a;
                do6Var2.getClass();
                return do6Var2;
            case 3:
                do6 do6Var3 = eo6.b;
                do6Var3.getClass();
                return do6Var3;
            case 4:
                do6 do6Var4 = eo6.c;
                do6Var4.getClass();
                return do6Var4;
            case 5:
                do6 do6Var5 = eo6.e;
                do6Var5.getClass();
                return do6Var5;
            case 6:
                do6 do6Var6 = eo6.f;
                do6Var6.getClass();
                return do6Var6;
            default:
                do6 do6Var7 = eo6.a;
                do6Var7.getClass();
                return do6Var7;
        }
    }

    public static final pv2 c(eef eefVar) {
        int i;
        if (eefVar == null) {
            i = -1;
        } else {
            i = rff.a[eefVar.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return pv2.DECLARATION;
                    }
                    return pv2.SYNTHESIZED;
                }
                return pv2.DELEGATION;
            }
            return pv2.FAKE_OVERRIDE;
        }
        return pv2.DECLARATION;
    }
}
