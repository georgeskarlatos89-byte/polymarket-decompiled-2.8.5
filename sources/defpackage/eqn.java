package defpackage;

import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class eqn {
    public static Object a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        dmk.v(ace.f(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final int b(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        boolean z;
        boolean z2;
        int i;
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.h().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int d = serialDescriptor.d();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (d > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = d - 1;
            int i5 = i2 * 31;
            String h = serialDescriptor.g(serialDescriptor.d() - d).h();
            if (h != null) {
                i3 = h.hashCode();
            }
            i2 = i5 + i3;
            d = i4;
        }
        int d2 = serialDescriptor.d();
        int i6 = 1;
        while (true) {
            if (d2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = d2 - 1;
                int i8 = i6 * 31;
                o5l kind = serialDescriptor.g(serialDescriptor.d() - d2).getKind();
                if (kind != null) {
                    i = kind.hashCode();
                } else {
                    i = 0;
                }
                i6 = i8 + i;
                d2 = i7;
            } else {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
        }
    }

    public static int c(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        f(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = c(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int e = xtl.e(obj);
        int i2 = e & i;
        int e2 = e(i2, obj3);
        if (e2 != 0) {
            int i3 = ~i;
            int i4 = e & i3;
            int i5 = -1;
            while (true) {
                int i6 = e2 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !ckn.a(obj, objArr[i6]) || (objArr2 != null && !ckn.a(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    e2 = i8;
                }
            }
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & MessagePack.Code.EXT_TIMESTAMP;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void f(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final String g(SerialDescriptor serialDescriptor) {
        return CollectionsKt.N(lnf.k(0, serialDescriptor.d()), ", ", serialDescriptor.h() + '(', ")", new e1d(serialDescriptor, 15), 24);
    }
}
