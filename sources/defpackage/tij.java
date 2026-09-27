package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tij {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final fyg b;
    public volatile int c = 0;

    public tij(fyg fygVar, int i) {
        this.b = fygVar;
        this.a = i;
    }

    public final int a(int i) {
        hfc b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.d;
            int i2 = a + b.a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wzb] */
    public final hfc b() {
        ThreadLocal threadLocal = d;
        hfc hfcVar = (hfc) threadLocal.get();
        hfc hfcVar2 = hfcVar;
        if (hfcVar == null) {
            ?? wzbVar = new wzb();
            threadLocal.set(wzbVar);
            hfcVar2 = wzbVar;
        }
        ifc ifcVar = (ifc) this.b.b;
        int a = ifcVar.a(6);
        if (a != 0) {
            int i = a + ifcVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) ifcVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ifcVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ifcVar.d;
            hfcVar2.d = byteBuffer;
            if (byteBuffer != null) {
                hfcVar2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                hfcVar2.b = i4;
                hfcVar2.c = ((ByteBuffer) hfcVar2.d).getShort(i4);
                return hfcVar2;
            }
            hfcVar2.a = 0;
            hfcVar2.b = 0;
            hfcVar2.c = 0;
        }
        return hfcVar2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        hfc b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.d).getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        hfc b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.a;
            i2 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(ApiConstant.SPACE);
        }
        return sb.toString();
    }
}
