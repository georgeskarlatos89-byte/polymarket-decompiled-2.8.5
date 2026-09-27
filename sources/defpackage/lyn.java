package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class lyn {
    public static final boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!a((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!ql0.b((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int b(Bundle bundle) {
        int i;
        Iterator<String> it = bundle.keySet().iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                i = b((Bundle) obj);
            } else if (obj instanceof Object[]) {
                i = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                i = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                i = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                i = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                i = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                i = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                i = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                i = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                i = Arrays.hashCode((boolean[]) obj);
            } else if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    public static final Map c(d47 d47Var) {
        Map b;
        if (d47Var != null && (b = c1c.b(new Pair("duration", Float.valueOf((float) d47.m(d47Var.a, m47.SECONDS))))) != null) {
            return b;
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }
}
