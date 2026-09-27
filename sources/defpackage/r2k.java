package defpackage;

import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r2k {
    public final q2k a;
    public ByteBuffer b;
    public int c;
    public short d;
    public short e;

    public r2k(q2k q2kVar, short s) {
        String str;
        boolean z;
        int i;
        this.c = -1;
        asb asbVar = q2k.h;
        byte[] bArr = q2kVar.b;
        byte[] bArr2 = q2kVar.e;
        byte[] bArr3 = q2kVar.c;
        byte[] bArr4 = q2kVar.a;
        int i2 = s + 4;
        boolean[] zArr = new boolean[259];
        for (int i3 = 0; i3 < i2; i3++) {
            zArr[i3] = false;
        }
        boolean z2 = true;
        for (int i4 = 0; i4 < 256; i4++) {
            if (q2k.a(i4, (short) (bArr4[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (bArr3[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (bArr2[i4] & MessagePack.Code.EXT_TIMESTAMP), s, "first") && z2) {
                z = true;
            } else {
                z = false;
            }
            if (q2k.a(i4, (short) (bArr[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (q2kVar.d[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (q2kVar.f[i4] & MessagePack.Code.EXT_TIMESTAMP), s, "second") && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bArr3[i4] == 0 && bArr[i4] == 0 && (i = (bArr4[i4] & MessagePack.Code.EXT_TIMESTAMP) + (bArr2[i4] & MessagePack.Code.EXT_TIMESTAMP)) < i2) {
                zArr[i] = true;
            }
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 != 0 && !zArr[i5]) {
                if (i5 >= 3) {
                    asbVar.i(Integer.valueOf(i5 - 3), "VCDiff: Bad code table; there is no opcode for inst COPY, size 0, mode {}");
                } else {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    str = "";
                                } else {
                                    str = "COPY";
                                }
                            } else {
                                str = "RUN";
                            }
                        } else {
                            str = "ADD";
                        }
                    } else {
                        str = "NOOP";
                    }
                    asbVar.i(str, "VCDiff: Bad code table; there is no opcode for inst {}, size -,  mode 0");
                }
                z2 = false;
            }
        }
        if (z2) {
            this.a = q2kVar;
        } else {
            dmk.v("Invalid code table data.");
            throw null;
        }
    }

    public final void a() {
        int i = this.c;
        if (i >= 0) {
            if (i <= this.b.position()) {
                this.b.position(this.c);
                if (this.d != 256 && this.e != 256) {
                    dmk.n("Internal error: two pending instructions in a row in unGetInstruction");
                    return;
                } else {
                    this.d = this.e;
                    return;
                }
            }
            dmk.n("Internal error: last_instruction_start past end of instructions_and_sizes in unGetInstruction");
        }
    }

    public r2k() {
        this.c = -1;
        this.a = q2k.i;
    }
}
