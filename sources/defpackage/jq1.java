package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface jq1 extends y8h, WritableByteChannel {
    jq1 E();

    jq1 M0(long j);

    jq1 O(String str);

    jq1 R0(int i, int i2, String str);

    jq1 b0(iw1 iw1Var);

    tp1 c();

    jq1 c0(long j);

    @Override // defpackage.y8h, java.io.Flushable
    void flush();

    long i1(meh mehVar);

    jq1 u(int i);

    jq1 write(byte[] bArr);

    jq1 write(byte[] bArr, int i, int i2);

    jq1 writeByte(int i);

    jq1 writeInt(int i);

    jq1 writeShort(int i);
}
