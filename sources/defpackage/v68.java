package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v68 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a35 k;
    public final bfc l;

    public v68(int i, byte[] bArr) {
        wa3 wa3Var = new wa3(bArr.length, bArr);
        wa3Var.q(i * 8);
        this.a = wa3Var.i(16);
        this.b = wa3Var.i(16);
        this.c = wa3Var.i(24);
        this.d = wa3Var.i(24);
        int i2 = wa3Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = wa3Var.i(3) + 1;
        int i3 = wa3Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = wa3Var.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            if (i != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case AudioConstants.AUDIO_SAMPLE_RATE /* 44100 */:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final el8 c(byte[] bArr, bfc bfcVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        bfc bfcVar2 = this.l;
        if (bfcVar2 != null) {
            bfcVar = bfcVar2.b(bfcVar);
        }
        dl8 dl8Var = new dl8();
        dl8Var.m = ggc.m("audio/flac");
        dl8Var.n = i;
        dl8Var.C = this.g;
        dl8Var.D = this.e;
        dl8Var.E = u1k.y(this.h);
        dl8Var.p = Collections.singletonList(bArr);
        dl8Var.k = bfcVar;
        return new el8(dl8Var);
    }

    public v68(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a35 a35Var, bfc bfcVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = a35Var;
        this.l = bfcVar;
    }
}
