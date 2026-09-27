package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class yvm {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new o7a(0, iArr.length, iArr);
    }

    public static final s7h b(ita itaVar) {
        s7h s7hVar;
        itaVar.getClass();
        dwj c0 = itaVar.c0();
        if (c0 instanceof s7h) {
            s7hVar = (s7h) c0;
        } else {
            s7hVar = null;
        }
        if (s7hVar != null) {
            return s7hVar;
        }
        f05.g(itaVar, "This is should be simple type: ");
        return null;
    }

    public static int c(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        brn.d(j, "Out of range: %s", z);
        return i;
    }

    public static final s7h d(s7h s7hVar, List list, jgj jgjVar) {
        s7hVar.getClass();
        list.getClass();
        jgjVar.getClass();
        if (list.isEmpty() && jgjVar == s7hVar.L()) {
            return s7hVar;
        }
        if (list.isEmpty()) {
            return s7hVar.u0(jgjVar);
        }
        if (s7hVar instanceof qj7) {
            qj7 qj7Var = (qj7) s7hVar;
            ogj ogjVar = qj7Var.b;
            jj7 jj7Var = qj7Var.c;
            sj7 sj7Var = qj7Var.d;
            boolean z = qj7Var.f;
            String[] strArr = qj7Var.g;
            return new qj7(ogjVar, jj7Var, sj7Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return w2n.e(jgjVar, s7hVar.P(), list, s7hVar.a0());
    }

    public static ita e(ita itaVar, List list, ec0 ec0Var, int i) {
        if ((i & 2) != 0) {
            ec0Var = itaVar.getAnnotations();
        }
        itaVar.getClass();
        if ((list.isEmpty() || list == itaVar.K()) && ec0Var == itaVar.getAnnotations()) {
            return itaVar;
        }
        jgj L = itaVar.L();
        if ((ec0Var instanceof p18) && ((p18) ec0Var).isEmpty()) {
            ec0Var = vvn.c;
        }
        jgj b = xtm.b(L, ec0Var);
        dwj c0 = itaVar.c0();
        if (c0 instanceof s78) {
            s78 s78Var = (s78) c0;
            return w2n.a(d(s78Var.b, list, b), d(s78Var.c, list, b));
        }
        if (c0 instanceof s7h) {
            return d((s7h) c0, list, b);
        }
        dmk.a();
        return null;
    }

    public static /* synthetic */ s7h f(s7h s7hVar, List list, jgj jgjVar, int i) {
        if ((i & 1) != 0) {
            list = s7hVar.K();
        }
        if ((i & 2) != 0) {
            jgjVar = s7hVar.L();
        }
        return d(s7hVar, list, jgjVar);
    }

    public static int g(long j) {
        if (j > 2147483647L) {
            return bd0.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] h(Collection collection) {
        if (collection instanceof o7a) {
            o7a o7aVar = (o7a) collection;
            return Arrays.copyOfRange(o7aVar.a, o7aVar.b, o7aVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer i(String str) {
        byte b;
        Long valueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = hub.a[charAt];
                } else {
                    byte[] bArr = hub.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = hub.a[charAt2];
                            } else {
                                byte[] bArr2 = hub.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }
}
