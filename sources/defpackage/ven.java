package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ven {
    public static int a(int i, int i2) {
        return fc4.j(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(byte[] bArr, int i, tk0 tk0Var) {
        int j = j(bArr, i, tk0Var);
        int i2 = tk0Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - j) {
                if (i2 == 0) {
                    tk0Var.c = fw1.b;
                    return j;
                }
                tk0Var.c = fw1.c(bArr, j, i2);
                return j + i2;
            }
            throw z7a.g();
        }
        throw z7a.e();
    }

    public static int c(int i, byte[] bArr) {
        return ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
    }

    public static long d(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int e(wig wigVar, int i, byte[] bArr, int i2, int i3, b5a b5aVar, tk0 tk0Var) {
        Object d = wigVar.d();
        wig wigVar2 = wigVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tk0 tk0Var2 = tk0Var;
        int p = p(d, wigVar2, bArr2, i2, i4, tk0Var2);
        wigVar2.b(d);
        tk0Var2.c = d;
        b5aVar.add(d);
        while (p < i4) {
            tk0 tk0Var3 = tk0Var2;
            int i5 = i4;
            int j = j(bArr2, p, tk0Var3);
            if (i != tk0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            wig wigVar3 = wigVar2;
            Object d2 = wigVar3.d();
            p = p(d2, wigVar3, bArr3, j, i5, tk0Var3);
            wigVar2 = wigVar3;
            bArr2 = bArr3;
            i4 = i5;
            tk0Var2 = tk0Var3;
            wigVar2.b(d2);
            tk0Var2.c = d2;
            b5aVar.add(d2);
        }
        return p;
    }

    public static int f(byte[] bArr, int i, tk0 tk0Var) {
        int j = j(bArr, i, tk0Var);
        int i2 = tk0Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                tk0Var.c = "";
                return j;
            }
            tk0Var.c = new String(bArr, j, i2, d5a.a);
            return j + i2;
        }
        throw z7a.e();
    }

    public static int g(byte[] bArr, int i, tk0 tk0Var) {
        int j = j(bArr, i, tk0Var);
        int i2 = tk0Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                tk0Var.c = "";
                return j;
            }
            tk0Var.c = f1k.a.a(bArr, j, i2);
            return j + i2;
        }
        throw z7a.e();
    }

    public static int h(int i, byte[] bArr, int i2, int i3, ouj oujVar, tk0 tk0Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                oujVar.d(i, Integer.valueOf(c(i2, bArr)));
                                return i2 + 4;
                            }
                            throw z7a.a();
                        }
                        ouj c = ouj.c();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int j = j(bArr, i2, tk0Var);
                            i6 = tk0Var.a;
                            if (i6 == i5) {
                                i2 = j;
                                break;
                            }
                            i2 = h(i6, bArr, j, i3, c, tk0Var);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            oujVar.d(i, c);
                            return i2;
                        }
                        throw z7a.f();
                    }
                    int j2 = j(bArr, i2, tk0Var);
                    int i7 = tk0Var.a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - j2) {
                            if (i7 == 0) {
                                oujVar.d(i, fw1.b);
                            } else {
                                oujVar.d(i, fw1.c(bArr, j2, i7));
                            }
                            return j2 + i7;
                        }
                        throw z7a.g();
                    }
                    throw z7a.e();
                }
                oujVar.d(i, Long.valueOf(d(i2, bArr)));
                return i2 + 8;
            }
            int l = l(bArr, i2, tk0Var);
            oujVar.d(i, Long.valueOf(tk0Var.b));
            return l;
        }
        throw z7a.a();
    }

    public static int i(int i, byte[] bArr, int i2, tk0 tk0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            tk0Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            tk0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            tk0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            tk0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                tk0Var.a = i11;
                return i12;
            }
        }
    }

    public static int j(byte[] bArr, int i, tk0 tk0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            tk0Var.a = b;
            return i2;
        }
        return i(b, bArr, i2, tk0Var);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, b5a b5aVar, tk0 tk0Var) {
        r0a r0aVar = (r0a) b5aVar;
        int j = j(bArr, i2, tk0Var);
        r0aVar.b(tk0Var.a);
        while (j < i3) {
            int j2 = j(bArr, j, tk0Var);
            if (i != tk0Var.a) {
                break;
            }
            j = j(bArr, j2, tk0Var);
            r0aVar.b(tk0Var.a);
        }
        return j;
    }

    public static int l(byte[] bArr, int i, tk0 tk0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            tk0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        tk0Var.b = j2;
        return i3;
    }

    public static Integer m(Context context, int i) {
        TypedValue a = uen.a(context.getTheme(), i);
        if (a != null) {
            return Integer.valueOf(q(context, a));
        }
        return null;
    }

    public static boolean n(int i) {
        if (i != 0 && fc4.e(i) > 0.5d) {
            return true;
        }
        return false;
    }

    public static int o(int i, float f, int i2) {
        return fc4.g(fc4.j(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int p(Object obj, wig wigVar, byte[] bArr, int i, int i2, tk0 tk0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, tk0Var);
            i4 = tk0Var.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i5 + i4;
            wigVar.j(obj, bArr, i5, i6, tk0Var);
            tk0Var.c = obj;
            return i6;
        }
        throw z7a.g();
    }

    public static int q(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return d55.d(context, i);
        }
        return typedValue.data;
    }

    public static boolean r(uzg uzgVar, Collection collection) {
        collection.getClass();
        if (collection instanceof qjl) {
            collection = ((qjl) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > uzgVar.size()) {
            Iterator<E> it = uzgVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= uzgVar.remove(it2.next());
        }
        return z;
    }
}
