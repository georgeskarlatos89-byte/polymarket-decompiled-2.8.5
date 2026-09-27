package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class oj0 {
    public static final ed1 a = new ed1(-1.0f);
    public static final ed1 b = new ed1(1.0f);
    public static final dd1 c = new dd1(-1.0f);
    public static final dd1 d = new dd1(1.0f);

    public static final void a(iqc iqcVar, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int i = iqcVar.i(obj);
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = iqcVar.c[i];
        }
        if (obj3 != null) {
            if (obj3 instanceof jqc) {
                ((jqc) obj3).d(obj2);
            } else if (obj3 != obj2) {
                jqc jqcVar = new jqc(0, 1, null);
                jqcVar.d(obj3);
                jqcVar.d(obj2);
                obj2 = jqcVar;
            }
            obj2 = obj3;
        }
        if (z) {
            int i2 = ~i;
            iqcVar.b[i2] = obj;
            iqcVar.c[i2] = obj2;
            return;
        }
        iqcVar.c[i] = obj2;
    }

    public static final boolean d(iqc iqcVar, Object obj, Object obj2) {
        Object d2 = iqcVar.d(obj);
        if (d2 == null) {
            return false;
        }
        if (d2 instanceof jqc) {
            jqc jqcVar = (jqc) d2;
            boolean l = jqcVar.l(obj2);
            if (l && jqcVar.b()) {
                iqcVar.k(obj);
            }
            return l;
        }
        if (!Intrinsics.areEqual(d2, obj2)) {
            return false;
        }
        iqcVar.k(obj);
        return true;
    }

    public static final void e(iqc iqcVar, Object obj) {
        boolean z;
        long[] jArr = iqcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = iqcVar.b[i4];
                            Object obj3 = iqcVar.c[i4];
                            if (obj3 instanceof jqc) {
                                jqc jqcVar = (jqc) obj3;
                                jqcVar.l(obj);
                                z = jqcVar.b();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                iqcVar.l(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void b(Throwable th);

    public abstract void c(fyg fygVar);
}
