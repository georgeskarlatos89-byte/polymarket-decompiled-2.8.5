package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qcn implements Comparable {
    public static final /* synthetic */ long c = oo4.a.objectFieldOffset(qcn.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ qcn(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        qcn qcnVar;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (obj instanceof byte[]) {
                byte[] bArr3 = (byte[]) obj;
                if (!Arrays.equals(bArr, bArr3)) {
                    i = 1;
                    bArr2 = new byte[][]{bArr3, bArr};
                } else {
                    return;
                }
            } else {
                byte[][] bArr4 = (byte[][]) obj;
                while (true) {
                    int length = bArr4.length;
                    if (i < length) {
                        if (!Arrays.equals(bArr, bArr4[i])) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr4, length + 1);
                        bArr2[length] = bArr;
                        break;
                    }
                }
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = oo4.a;
                long j = c;
                qcnVar = this;
                if (unsafe.compareAndSwapObject(qcnVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(qcnVar, j) != obj) {
                    break;
                } else {
                    this = qcnVar;
                }
            }
            this = qcnVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
