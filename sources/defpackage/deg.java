package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class deg implements ceg {
    public final Function1 a;
    public final iqc b;
    public iqc c;

    public deg(Map map, Function1 function1) {
        iqc iqcVar;
        this.a = function1;
        if (map != null && !map.isEmpty()) {
            iqcVar = new iqc(map.size());
            for (Map.Entry entry : map.entrySet()) {
                iqcVar.m(entry.getKey(), entry.getValue());
            }
        } else {
            iqcVar = null;
        }
        this.b = iqcVar;
    }

    @Override // defpackage.ceg
    public final beg a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.c(str.charAt(i))) {
                iqc iqcVar = this.c;
                if (iqcVar == null) {
                    iqcVar = eig.b();
                    this.c = iqcVar;
                }
                Object d = iqcVar.d(str);
                if (d == null) {
                    d = new ArrayList();
                    iqcVar.m(str, d);
                }
                ((List) d).add(function0);
                return new bm9(iqcVar, str, function0, 21);
            }
        }
        dmk.v("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.ceg
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // defpackage.ceg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map e() {
        int i;
        int i2;
        char c;
        long j;
        long j2;
        long j3;
        iqc iqcVar;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i4;
        char c2;
        long j4;
        iqc iqcVar2 = this.b;
        if (iqcVar2 == null && this.c == null) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            return zc7Var;
        }
        int i5 = 0;
        if (iqcVar2 != null) {
            i = iqcVar2.e;
        } else {
            i = 0;
        }
        iqc iqcVar3 = this.c;
        if (iqcVar3 != null) {
            i2 = iqcVar3.e;
        } else {
            i2 = 0;
        }
        HashMap hashMap = new HashMap(i + i2);
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i6 = 8;
        if (iqcVar2 != null) {
            Object[] objArr = iqcVar2.b;
            Object[] objArr2 = iqcVar2.c;
            long[] jArr3 = iqcVar2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i7];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j6 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i10], (List) objArr2[i10]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i9++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    c3 = c;
                    j5 = j;
                }
                iqcVar = this.c;
                if (iqcVar != null) {
                    Object[] objArr3 = iqcVar.b;
                    Object[] objArr4 = iqcVar.c;
                    long[] jArr4 = iqcVar.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j7 = jArr4[i11];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                int i13 = i5;
                                while (i13 < i12) {
                                    if ((j7 & j3) < j2) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr3[i14];
                                        List list = (List) objArr4[i14];
                                        String str = (String) obj;
                                        i4 = i6;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i5)).invoke();
                                            if (invoke != null) {
                                                if (d(invoke)) {
                                                    hashMap.put(str, CollectionsKt.q(invoke));
                                                } else {
                                                    f27.k(jun.c(invoke));
                                                    return null;
                                                }
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i5 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i5)).invoke();
                                                if (invoke2 != null && !d(invoke2)) {
                                                    f27.k(jun.c(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i5++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i4 = i6;
                                    }
                                    j7 >>= i4;
                                    i13++;
                                    i6 = i4;
                                    jArr4 = jArr2;
                                    i5 = 0;
                                }
                                jArr = jArr4;
                                i3 = i6;
                                if (i12 != i3) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i3 = i6;
                            }
                            if (i11 == length2) {
                                break;
                            }
                            i11++;
                            i6 = i3;
                            jArr4 = jArr;
                            i5 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        iqcVar = this.c;
        if (iqcVar != null) {
        }
        return hashMap;
    }

    @Override // defpackage.ceg
    public final Object f(String str) {
        List list;
        iqc iqcVar = this.b;
        if (iqcVar != null) {
            list = (List) iqcVar.k(str);
        } else {
            list = null;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && iqcVar != null) {
            List subList = list.subList(1, list.size());
            int i = iqcVar.i(str);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = iqcVar.c;
            Object obj = objArr[i];
            iqcVar.b[i] = str;
            objArr[i] = subList;
        }
        return list.get(0);
    }
}
