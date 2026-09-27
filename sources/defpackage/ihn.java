package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ihn {
    public static final kjc a(kjc kjcVar, float f, long j, z0h z0hVar) {
        return b(kjcVar, f, new zdh(j), z0hVar);
    }

    public static final kjc b(kjc kjcVar, float f, zo1 zo1Var, z0h z0hVar) {
        return kjcVar.e(new rh1(f, zo1Var, z0hVar));
    }

    public static final long e(float f, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static String f(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(g(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(g(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String g(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String p = ix2.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(p.length() + 8 + name2.length() + 1);
            k84.q(sb, "<", p, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public abstract boolean c(hgf hgfVar);

    public abstract Object d(hgf hgfVar);
}
