package defpackage;

import java.util.Iterator;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class gsn {
    public static csc b(csc cscVar, String str, String str2, int i) {
        boolean z;
        char charAt;
        char charAt2;
        Object obj;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!cscVar.b) {
            String c = cscVar.c();
            if (e.u(c, str, false) && c.length() != str.length() && ('a' > (charAt = c.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return csc.e(str2.concat(StringsKt.Y(str, c)));
                }
                if (!z) {
                    return cscVar;
                }
                String Y = StringsKt.Y(str, c);
                if (Y.length() != 0 && aln.b(0, Y)) {
                    if (Y.length() != 1 && aln.b(1, Y)) {
                        Iterator it = new a(0, Y.length() - 1, 1).iterator();
                        while (true) {
                            if (((g1a) it).c) {
                                obj = ((y0a) it).next();
                                if (!aln.b(((Number) obj).intValue(), Y)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            Y = aln.c(Y.substring(0, intValue)).concat(Y.substring(intValue));
                        } else {
                            Y = aln.c(Y);
                        }
                    } else if (Y.length() != 0 && 'A' <= (charAt2 = Y.charAt(0)) && charAt2 < '[') {
                        Y = Character.toLowerCase(charAt2) + Y.substring(1);
                    }
                }
                if (csc.f(Y)) {
                    return csc.e(Y);
                }
            }
        }
        return null;
    }

    public abstract void a(v1h v1hVar, float f, float f2);
}
