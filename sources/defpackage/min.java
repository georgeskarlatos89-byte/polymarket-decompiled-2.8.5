package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class min {
    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(vv1 vv1Var) {
        int i;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = vv1Var.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = min;
            if (min < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            long j2 = j * i;
            if (j2 > 2147483647L) {
                min = bd0.API_PRIORITY_OTHER;
            } else if (j2 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j2;
            }
        }
        if (vv1Var.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final n6a c(SerialDescriptor serialDescriptor) {
        String s = e.s(serialDescriptor.h(), "?", "");
        if (Intrinsics.areEqual(serialDescriptor.getKind(), cxg.g)) {
            if (serialDescriptor.b()) {
                return n6a.ENUM_NULLABLE;
            }
            return n6a.ENUM;
        }
        if (Intrinsics.areEqual(s, "kotlin.Int")) {
            if (serialDescriptor.b()) {
                return n6a.INT_NULLABLE;
            }
            return n6a.INT;
        }
        if (Intrinsics.areEqual(s, "kotlin.Boolean")) {
            if (serialDescriptor.b()) {
                return n6a.BOOL_NULLABLE;
            }
            return n6a.BOOL;
        }
        if (Intrinsics.areEqual(s, "kotlin.Double")) {
            if (serialDescriptor.b()) {
                return n6a.DOUBLE_NULLABLE;
            }
            return n6a.DOUBLE;
        }
        if (Intrinsics.areEqual(s, "kotlin.Float")) {
            if (serialDescriptor.b()) {
                return n6a.FLOAT_NULLABLE;
            }
            return n6a.FLOAT;
        }
        if (Intrinsics.areEqual(s, "kotlin.Long")) {
            if (serialDescriptor.b()) {
                return n6a.LONG_NULLABLE;
            }
            return n6a.LONG;
        }
        if (Intrinsics.areEqual(s, "kotlin.String")) {
            if (serialDescriptor.b()) {
                return n6a.STRING_NULLABLE;
            }
            return n6a.STRING;
        }
        if (Intrinsics.areEqual(s, "kotlin.IntArray")) {
            return n6a.INT_ARRAY;
        }
        if (Intrinsics.areEqual(s, "kotlin.DoubleArray")) {
            return n6a.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual(s, "kotlin.BooleanArray")) {
            return n6a.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual(s, "kotlin.FloatArray")) {
            return n6a.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual(s, "kotlin.LongArray")) {
            return n6a.LONG_ARRAY;
        }
        if (Intrinsics.areEqual(s, "kotlin.Array")) {
            return n6a.ARRAY;
        }
        if (e.u(s, "kotlin.collections.ArrayList", false)) {
            return n6a.LIST;
        }
        return n6a.UNKNOWN;
    }
}
