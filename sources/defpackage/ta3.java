package defpackage;

import com.google.mlkit.common.MlKitException;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ta3 extends ab3 {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, RadarSimpleLogBuffer.PURGE_AMOUNT, 97, 98, 99, 100, 101, 102, HttpStatusCodesKt.HTTP_EARLY_HINTS, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, MlKitException.CODE_SCANNER_CANCELLED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 235, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final svd h = new svd();
    public final ArrayList m = new ArrayList();
    public sa3 n = new sa3(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public ta3(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.i = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        q7m.g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = 1;
                        this.j = 1;
                    }
                } else {
                    this.k = 0;
                    this.j = 1;
                }
            } else {
                this.k = 1;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ab3, defpackage.vx5
    public final /* bridge */ /* synthetic */ Object b() {
        return h();
    }

    @Override // defpackage.ab3
    public final bb3 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new bb3(list);
    }

    @Override // defpackage.ab3, defpackage.vx5
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.ab3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(ya3 ya3Var) {
        int t;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        ByteBuffer byteBuffer = ya3Var.e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        svd svdVar = this.h;
        svdVar.D(limit, array);
        boolean z6 = false;
        while (true) {
            int a = svdVar.a();
            int i3 = this.i;
            if (a >= i3) {
                if (i3 == 2) {
                    t = -4;
                } else {
                    t = svdVar.t();
                }
                int t2 = svdVar.t();
                int t3 = svdVar.t();
                if ((t & 2) == 0 && (t & 1) == this.j) {
                    byte b = (byte) (t2 & 127);
                    byte b2 = (byte) (t3 & 127);
                    if (b != 0 || b2 != 0) {
                        boolean z7 = this.s;
                        if ((t & 4) == 4) {
                            boolean[] zArr = G;
                            if (zArr[t2] && zArr[t3]) {
                                z2 = true;
                                this.s = z2;
                                if (!z2 && (b & 240) == 16) {
                                    if (this.t && this.u == b && this.v == b2) {
                                        this.t = false;
                                    } else {
                                        this.t = true;
                                        this.u = b;
                                        this.v = b2;
                                    }
                                } else {
                                    this.t = false;
                                }
                                if (z2) {
                                    if (z7) {
                                        k();
                                        z6 = true;
                                    }
                                } else {
                                    if (1 <= b && b <= 15) {
                                        this.x = false;
                                    } else if ((b & 246) == 20) {
                                        if (b2 != 32 && b2 != 47) {
                                            switch (b2) {
                                                case 37:
                                                case 38:
                                                case 39:
                                                    break;
                                                default:
                                                    switch (b2) {
                                                        case 42:
                                                        case 43:
                                                            this.x = false;
                                                            break;
                                                    }
                                                    z6 = true;
                                                    break;
                                            }
                                        }
                                        this.x = true;
                                    }
                                    if (this.x) {
                                        int i4 = b & MessagePack.Code.NEGFIXINT_PREFIX;
                                        if (i4 == 0) {
                                            this.w = (b >> 3) & 1;
                                        }
                                        if (this.w == this.k) {
                                            if (i4 == 0) {
                                                int i5 = b & 247;
                                                if (i5 == 17 && (b2 & 240) == 48) {
                                                    this.n.a((char) D[b2 & 15]);
                                                } else {
                                                    int i6 = b & 246;
                                                    if (i6 == 18 && (b2 & MessagePack.Code.NEGFIXINT_PREFIX) == 32) {
                                                        this.n.b();
                                                        sa3 sa3Var = this.n;
                                                        if ((b & 1) == 0) {
                                                            i2 = E[b2 & 31];
                                                        } else {
                                                            i2 = F[b2 & 31];
                                                        }
                                                        sa3Var.a((char) i2);
                                                    } else if (i5 == 17 && (b2 & 240) == 32) {
                                                        this.n.a(' ');
                                                        if ((b2 & 1) == 1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        sa3 sa3Var2 = this.n;
                                                        sa3Var2.a.add(new ra3((b2 >> 1) & 7, z5, sa3Var2.c.length()));
                                                    } else if ((b & 240) == 16 && (b2 & MessagePack.Code.NIL) == 64) {
                                                        int i7 = z[b & 7];
                                                        if ((b2 & 32) != 0) {
                                                            i7++;
                                                        }
                                                        sa3 sa3Var3 = this.n;
                                                        if (i7 != sa3Var3.d) {
                                                            if (this.q != 1 && !sa3Var3.e()) {
                                                                sa3 sa3Var4 = new sa3(this.q, this.r);
                                                                this.n = sa3Var4;
                                                                this.m.add(sa3Var4);
                                                            }
                                                            sa3Var3 = this.n;
                                                            sa3Var3.d = i7;
                                                        }
                                                        if ((b2 & 16) == 16) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if ((b2 & 1) == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        int i8 = (b2 >> 1) & 7;
                                                        if (z3) {
                                                            i = 8;
                                                        } else {
                                                            i = i8;
                                                        }
                                                        sa3Var3.a.add(new ra3(i, z4, sa3Var3.c.length()));
                                                        if (z3) {
                                                            this.n.e = A[i8];
                                                        }
                                                    } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                        this.n.f = b2 + MessagePack.Code.NEGFIXINT_PREFIX;
                                                    } else if (i6 == 20 && (b2 & 240) == 32) {
                                                        if (b2 != 32) {
                                                            if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        int i9 = this.q;
                                                                        if (i9 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Carousel.ENTITY_TYPE /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i9 == 1 || i9 == 3) {
                                                                                            k();
                                                                                            break;
                                                                                        }
                                                                                    case 45:
                                                                                        if (i9 == 1 && !this.n.e()) {
                                                                                            sa3 sa3Var5 = this.n;
                                                                                            ArrayList arrayList = sa3Var5.b;
                                                                                            arrayList.add(sa3Var5.d());
                                                                                            sa3Var5.c.setLength(0);
                                                                                            sa3Var5.a.clear();
                                                                                            int min = Math.min(sa3Var5.h, sa3Var5.d);
                                                                                            while (arrayList.size() >= min) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        } else {
                                                            l(2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                sa3 sa3Var6 = this.n;
                                                int[] iArr = C;
                                                sa3Var6.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                                if ((b2 & MessagePack.Code.NEGFIXINT_PREFIX) != 0) {
                                                    this.n.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                                }
                                            }
                                            z6 = true;
                                        }
                                    }
                                }
                            }
                        }
                        z2 = false;
                        this.s = z2;
                        if (!z2) {
                        }
                        this.t = false;
                        if (z2) {
                        }
                    }
                }
            } else {
                if (z6) {
                    int i10 = this.q;
                    if (i10 == 1 || i10 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.ab3
    public final za3 h() {
        za3 za3Var;
        za3 h = super.h();
        if (h != null) {
            return h;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (za3Var = (za3) this.b.pollFirst()) != null) {
                this.o = Collections.EMPTY_LIST;
                this.y = -9223372036854775807L;
                bb3 f = f();
                long j3 = this.e;
                za3Var.c = j3;
                za3Var.e = f;
                za3Var.f = j3;
                return za3Var;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ab3
    public final boolean i() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            of5 c = ((sa3) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            of5 of5Var = (of5) arrayList2.get(i3);
            if (of5Var != null) {
                if (of5Var.i != i) {
                    of5Var = ((sa3) arrayList.get(i3)).c(i);
                    of5Var.getClass();
                }
                arrayList3.add(of5Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        sa3 sa3Var = this.n;
        sa3Var.g = this.q;
        sa3Var.a.clear();
        sa3Var.b.clear();
        sa3Var.c.setLength(0);
        sa3Var.d = 15;
        sa3Var.e = 0;
        sa3Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        int i2 = this.q;
        if (i2 != i) {
            this.q = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i3 < arrayList.size()) {
                        ((sa3) arrayList.get(i3)).g = i;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i2 != 3 && i != 1 && i != 0) {
                    return;
                }
                this.o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override // defpackage.ab3, defpackage.vx5
    public final void release() {
    }
}
