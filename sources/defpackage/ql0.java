package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ql0 extends pl0 {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                if (!b((Object[]) obj, (Object[]) obj2)) {
                                }
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                }
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                }
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                }
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                }
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                }
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                }
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                }
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                }
                            } else if ((obj instanceof ujj) && (obj2 instanceof ujj)) {
                                if (!Arrays.equals(((ujj) obj).a, ((ujj) obj2).a)) {
                                }
                            } else if ((obj instanceof wsj) && (obj2 instanceof wsj)) {
                                if (!Arrays.equals(((wsj) obj).a, ((wsj) obj2).a)) {
                                }
                            } else if ((obj instanceof bkj) && (obj2 instanceof bkj)) {
                                if (!Arrays.equals(((bkj) obj).a, ((bkj) obj2).a)) {
                                }
                            } else if ((obj instanceof ikj) && (obj2 instanceof ikj)) {
                                if (!Arrays.equals(((ikj) obj).a, ((ikj) obj2).a)) {
                                }
                            } else if (!Intrinsics.areEqual(obj, obj2)) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
