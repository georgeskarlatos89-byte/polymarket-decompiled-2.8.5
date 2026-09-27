package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ofn {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.lang.AssertionError, oi4] */
    public static void a(Object obj, Object obj2, String str) {
        boolean equals;
        if (obj == null) {
            if (obj2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = obj.equals(obj2);
        }
        if (equals) {
            return;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (str == null) {
                str = "";
            }
            ?? assertionError = new AssertionError(str);
            assertionError.a = (String) obj;
            assertionError.b = (String) obj2;
            throw assertionError;
        }
        k(l(obj, obj2, str));
        throw null;
    }

    public static void b(String str, boolean z) {
        h(str, !z);
    }

    public static void c(Object obj, Object obj2, String str) {
        boolean equals;
        String str2;
        if (obj == null) {
            if (obj2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = obj.equals(obj2);
        }
        if (equals) {
            if (str != null) {
                str2 = str.concat(". ");
            } else {
                str2 = "Values should be different. ";
            }
            k(str2 + "Actual: " + obj2);
            throw null;
        }
    }

    public static void d(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        h(str, z);
    }

    public static void e(Object obj, Object obj2, String str) {
        String str2;
        if (obj == obj2) {
            if (str != null) {
                str2 = str.concat(ApiConstant.SPACE);
            } else {
                str2 = "";
            }
            k(str2.concat("expected not same"));
            throw null;
        }
    }

    public static void f(Object obj, String str) {
        String str2;
        if (obj == null) {
            return;
        }
        if (str != null) {
            str2 = str.concat(ApiConstant.SPACE);
        } else {
            str2 = "";
        }
        k(str2 + "expected null, but was:<" + obj + ">");
        throw null;
    }

    public static void g(Object obj, Object obj2, String str) {
        String str2;
        if (obj == obj2) {
            return;
        }
        if (str != null) {
            str2 = str.concat(ApiConstant.SPACE);
        } else {
            str2 = "";
        }
        k(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
        throw null;
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        k(str);
        throw null;
    }

    public static void i(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void j(boolean z) {
        if (z) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void k(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    public static String l(Object obj, Object obj2, String str) {
        String str2 = "";
        if (str != null && !"".equals(str)) {
            str2 = str.concat(ApiConstant.SPACE);
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            StringBuilder t = sv6.t(str2, "expected: ");
            t.append(m(obj, valueOf));
            t.append(" but was: ");
            t.append(m(obj2, valueOf2));
            return t.toString();
        }
        StringBuilder r = m51.r(str2, "expected:<", valueOf, "> but was:<", valueOf2);
        r.append(">");
        return r.toString();
    }

    public static String m(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        return m51.k(name, "<", str, ">");
    }

    public abstract qrl n(wrl wrlVar);

    public abstract vrl o(wrl wrlVar);

    public abstract void p(vrl vrlVar, vrl vrlVar2);

    public abstract void q(vrl vrlVar, Thread thread);

    public abstract boolean r(wrl wrlVar, qrl qrlVar, qrl qrlVar2);

    public abstract boolean s(wrl wrlVar, Object obj, Object obj2);

    public abstract boolean t(wrl wrlVar, vrl vrlVar, vrl vrlVar2);
}
