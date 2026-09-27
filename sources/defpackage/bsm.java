package defpackage;

import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class bsm {
    public static final w97 a = new w97(27);

    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] d(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt.p(0, i, 6, objArr, objArr2);
        ArraysKt.l(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt.p(0, i, 6, objArr, objArr2);
        ArraysKt.l(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.p(0, i, 6, objArr, objArr2);
        ArraysKt.l(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final long g(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long h(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }
}
