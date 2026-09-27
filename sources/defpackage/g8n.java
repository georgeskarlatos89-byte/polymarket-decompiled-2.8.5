package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class g8n {
    public static void a(int i, int i2) {
        String b;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(ace.f(i2, "negative size: "));
                return;
            }
            b = i8n.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            b = i8n.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(b);
    }

    public static void b(int i, int i2, int i3) {
        String c;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                c = i8n.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                c = c(i2, i3, "end index");
            }
        } else {
            c = c(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(c);
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return i8n.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return i8n.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }

    public static boolean d(e0 e0Var) {
        boolean areEqual;
        boolean areEqual2;
        Iterator it = e0Var.a().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            aga agaVar = ((e0) it.next()).a;
            if (Intrinsics.areEqual(agaVar, h8m.p)) {
                i++;
            } else {
                if (Intrinsics.areEqual(agaVar, h8m.z)) {
                    areEqual = true;
                } else {
                    areEqual = Intrinsics.areEqual(agaVar, h8m.C);
                }
                if (areEqual) {
                    areEqual2 = true;
                } else {
                    areEqual2 = Intrinsics.areEqual(agaVar, h8m.M);
                }
                if (areEqual2) {
                    continue;
                } else {
                    if (z && i > 1) {
                        return true;
                    }
                    i = 0;
                    z = true;
                }
            }
        }
        return false;
    }
}
