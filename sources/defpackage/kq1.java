package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface kq1 extends meh, ReadableByteChannel {
    long F(iw1 iw1Var);

    long F0(jq1 jq1Var);

    String I(long j);

    String K0(Charset charset);

    long L0(long j, iw1 iw1Var);

    iw1 O0();

    void U(tp1 tp1Var, long j);

    String W();

    byte[] Z(long j);

    tp1 c();

    boolean c1(long j, iw1 iw1Var);

    int g0(jld jldVar);

    boolean h(long j);

    void i(long j);

    boolean j();

    iw1 k0(long j);

    long l1();

    InputStream n1();

    ipf peek();

    long q(iw1 iw1Var);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    byte[] t0();

    long x0();
}
