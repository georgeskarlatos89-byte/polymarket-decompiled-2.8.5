package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v19 implements meh {
    public byte a;
    public final ipf b;
    public final Inflater c;
    public final tu9 d;
    public final CRC32 e;

    public v19(kq1 kq1Var) {
        kq1Var.getClass();
        ipf ipfVar = new ipf(kq1Var);
        this.b = ipfVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new tu9(ipfVar, inflater);
        this.e = new CRC32();
    }

    public static void e(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder t = sv6.t(str, ": actual 0x");
        t.append(StringsKt.X(8, l6n.i(i2)));
        t.append(" != expected 0x");
        t.append(StringsKt.X(8, l6n.i(i)));
        throw new IOException(t.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void g(tp1 tp1Var, long j, long j2) {
        eog eogVar = tp1Var.a;
        eogVar.getClass();
        while (true) {
            long j3 = eogVar.c - eogVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            eogVar = eogVar.f;
            eogVar.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(eogVar.c - r6, j2);
            this.e.update(eogVar.a, (int) (eogVar.b + j), min);
            j2 -= min;
            eogVar = eogVar.f;
            eogVar.getClass();
            j = 0;
        }
    }

    @Override // defpackage.meh
    public final long read(tp1 tp1Var, long j) {
        byte b;
        boolean z;
        tp1 tp1Var2;
        v19 v19Var = this;
        ipf ipfVar = v19Var.b;
        tp1 tp1Var3 = ipfVar.b;
        tp1Var.getClass();
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            byte b2 = v19Var.a;
            CRC32 crc32 = v19Var.e;
            if (b2 == 0) {
                ipfVar.i(10L);
                byte y = tp1Var3.y(3L);
                if (((y >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    v19Var.g(tp1Var3, 0L, 10L);
                }
                e(8075, ipfVar.readShort(), "ID1ID2");
                ipfVar.skip(8L);
                if (((y >> 2) & 1) == 1) {
                    ipfVar.i(2L);
                    if (z) {
                        g(tp1Var3, 0L, 2L);
                    }
                    long K = tp1Var3.K() & 65535;
                    ipfVar.i(K);
                    if (z) {
                        g(tp1Var3, 0L, K);
                    }
                    tp1Var2 = tp1Var3;
                    ipfVar.skip(K);
                } else {
                    tp1Var2 = tp1Var3;
                }
                if (((y >> 3) & 1) == 1) {
                    long e = ipfVar.e((byte) 0, 0L, Long.MAX_VALUE);
                    if (e != -1) {
                        if (z) {
                            g(tp1Var2, 0L, e + 1);
                        }
                        ipfVar.skip(e + 1);
                    } else {
                        f27.r();
                        return 0L;
                    }
                }
                if (((y >> 4) & 1) == 1) {
                    long e2 = ipfVar.e((byte) 0, 0L, Long.MAX_VALUE);
                    if (e2 != -1) {
                        if (z) {
                            v19Var = this;
                            v19Var.g(tp1Var2, 0L, e2 + 1);
                        } else {
                            v19Var = this;
                        }
                        ipfVar.skip(e2 + 1);
                    } else {
                        f27.r();
                        return 0L;
                    }
                } else {
                    v19Var = this;
                }
                if (z) {
                    e(ipfVar.p(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                v19Var.a = (byte) 1;
                b2 = 1;
            }
            if (b2 == 1) {
                long j2 = tp1Var.b;
                long read = v19Var.d.read(tp1Var, j);
                if (read != -1) {
                    v19Var.g(tp1Var, j2, read);
                    return read;
                }
                b = 2;
                v19Var.a = (byte) 2;
                b2 = 2;
            } else {
                b = 2;
            }
            if (b2 == b) {
                e(ipfVar.g(), (int) crc32.getValue(), "CRC");
                e(ipfVar.g(), (int) v19Var.c.getBytesWritten(), "ISIZE");
                v19Var.a = (byte) 3;
                if (!ipfVar.j()) {
                    dmk.x("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        f27.q(woa.m(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.meh
    public final b3j timeout() {
        return this.b.a.timeout();
    }
}
