package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class cwl {
    public static d7g a;

    public static final void a(vli vliVar, Function0 function0, Function0 function02, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        vliVar.getClass();
        function0.getClass();
        function02.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(2010783568);
        if ((i & 6) == 0) {
            if (sr8Var.h(mc4.a)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.j(vliVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (sr8Var.j(function0)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (sr8Var.j(function02)) {
                i3 = 2048;
            } else {
                i3 = Barcode.FORMAT_UPC_E;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i2 & 1, z)) {
            Unit unit = Unit.INSTANCE;
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            Object Q = sr8Var.Q();
            if (z2 || Q == oq4.a) {
                Q = new nr3(function02, null, 4);
                sr8Var.o0(Q);
            }
            hrl.d(sr8Var, unit, (Function2) Q);
            gzl.a(vliVar.a, vliVar.b, vun.b(vliVar.c, sr8Var), sel.d(439072355, new nph(7, vliVar, function0), sr8Var), sr8Var, (i2 & 14) | 24576);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new fhh(vliVar, function0, function02, i, 9);
        }
    }

    public static final kjc b(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new vf1(function1));
    }

    public static kjc c(kjc kjcVar, float f, float f2, float f3, float f4, z0h z0hVar, int i) {
        float f5;
        float f6;
        float f7;
        float f8;
        z0h z0hVar2;
        if ((i & 1) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i & 2) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i & 4) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f3;
        }
        if ((i & 32) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f4;
        }
        long j = hbj.b;
        if ((i & 2048) != 0) {
            z0hVar2 = nym.a;
        } else {
            z0hVar2 = z0hVar;
        }
        long j2 = l09.a;
        return kjcVar.e(new j09(f5, f6, f7, f8, 0.0f, j, z0hVar2, false, null, j2, j2, 0));
    }

    public static kjc d(kjc kjcVar, float f, float f2, float f3, float f4, z0h z0hVar, hzf hzfVar, int i) {
        float f5;
        float f6;
        float f7;
        float f8;
        z0h z0hVar2;
        boolean z;
        hzf hzfVar2;
        int i2;
        if ((i & 1) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i & 2) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i & 4) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f3;
        }
        if ((i & 256) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f4;
        }
        long j = hbj.b;
        if ((i & 2048) != 0) {
            z0hVar2 = nym.a;
        } else {
            z0hVar2 = z0hVar;
        }
        if ((i & 4096) != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 8192) != 0) {
            hzfVar2 = null;
        } else {
            hzfVar2 = hzfVar;
        }
        long j2 = l09.a;
        if ((i & 65536) != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return kjcVar.e(new j09(f5, f6, f7, 0.0f, f8, j, z0hVar2, z, hzfVar2, j2, j2, i2));
    }

    public static boolean e(CharSequence charSequence, int i) {
        charSequence.getClass();
        int length = charSequence.length();
        Character ch = null;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (ch == null) {
                    if (charAt != '*' && charAt != '-' && charAt != '_') {
                        if (i2 >= 3 || charAt != ' ') {
                            break;
                        }
                        i2++;
                    } else {
                        ch = Character.valueOf(charAt);
                    }
                    i++;
                } else {
                    if (charAt == ch.charValue()) {
                        i3++;
                    } else if (charAt != ' ' && charAt != '\t') {
                        break;
                    }
                    i++;
                }
            } else if (i3 >= 3) {
                return true;
            }
        }
        return false;
    }
}
