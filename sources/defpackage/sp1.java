package defpackage;

import java.io.EOFException;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sp1 implements leh, z8h {
    public dog a;
    public dog b;
    public long c;

    public final /* synthetic */ dog A(int i) {
        if (i >= 1 && i <= 8192) {
            dog dogVar = this.b;
            if (dogVar == null) {
                dog b = iog.b();
                this.a = b;
                this.b = b;
                return b;
            }
            if (dogVar.c + i <= 8192 && dogVar.e) {
                return dogVar;
            }
            dog b2 = iog.b();
            dogVar.e(b2);
            this.b = b2;
            return b2;
        }
        f27.q(sv6.j(i, "unexpected capacity (", "), should be in range [1, 8192]"));
        return null;
    }

    public final void D(int i, byte[] bArr) {
        bArr.getClass();
        g4n.b(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            dog A = A(1);
            int min = Math.min(i - i2, A.a()) + i2;
            ArraysKt.m(bArr, A.c, A.a, i2, min);
            A.c = (min - i2) + A.c;
            i2 = min;
        }
        this.c += i;
    }

    public final void G(sp1 sp1Var, long j) {
        dog b;
        int i;
        if (sp1Var != this) {
            long j2 = sp1Var.c;
            if (0 <= j2 && j2 >= j && j >= 0) {
                while (j > 0) {
                    sp1Var.a.getClass();
                    int i2 = 0;
                    if (j < r0.b()) {
                        dog dogVar = this.b;
                        if (dogVar != null && dogVar.e) {
                            long j3 = dogVar.c + j;
                            rtf rtfVar = dogVar.d;
                            if (rtfVar != null && rtfVar.a > 0) {
                                i = 0;
                            } else {
                                i = dogVar.b;
                            }
                            if (j3 - i <= 8192) {
                                dog dogVar2 = sp1Var.a;
                                dogVar2.getClass();
                                dogVar2.g(dogVar, (int) j);
                                sp1Var.c -= j;
                                this.c += j;
                                return;
                            }
                        }
                        dog dogVar3 = sp1Var.a;
                        dogVar3.getClass();
                        int i3 = (int) j;
                        if (i3 > 0 && i3 <= dogVar3.c - dogVar3.b) {
                            if (i3 >= 1024) {
                                b = dogVar3.f();
                            } else {
                                b = iog.b();
                                byte[] bArr = dogVar3.a;
                                byte[] bArr2 = b.a;
                                int i4 = dogVar3.b;
                                ArraysKt.m(bArr, 0, bArr2, i4, i4 + i3);
                            }
                            b.c = b.b + i3;
                            dogVar3.b += i3;
                            dog dogVar4 = dogVar3.g;
                            if (dogVar4 != null) {
                                dogVar4.e(b);
                            } else {
                                b.f = dogVar3;
                                dogVar3.g = b;
                            }
                            sp1Var.a = b;
                        } else {
                            dmk.v("byteCount out of range");
                            return;
                        }
                    }
                    dog dogVar5 = sp1Var.a;
                    dogVar5.getClass();
                    long b2 = dogVar5.b();
                    dog d = dogVar5.d();
                    sp1Var.a = d;
                    if (d == null) {
                        sp1Var.b = null;
                    }
                    if (this.a == null) {
                        this.a = dogVar5;
                        this.b = dogVar5;
                    } else {
                        dog dogVar6 = this.b;
                        dogVar6.getClass();
                        dogVar6.e(dogVar5);
                        dog dogVar7 = dogVar5.g;
                        if (dogVar7 != null) {
                            if (dogVar7.e) {
                                int i5 = dogVar5.c - dogVar5.b;
                                int i6 = 8192 - dogVar7.c;
                                dogVar7.getClass();
                                rtf rtfVar2 = dogVar7.d;
                                if (rtfVar2 == null || rtfVar2.a <= 0) {
                                    dog dogVar8 = dogVar5.g;
                                    dogVar8.getClass();
                                    i2 = dogVar8.b;
                                }
                                if (i5 <= i6 + i2) {
                                    dog dogVar9 = dogVar5.g;
                                    dogVar9.getClass();
                                    dogVar5.g(dogVar9, i5);
                                    if (dogVar5.d() == null) {
                                        iog.a(dogVar5);
                                        dogVar5 = dogVar9;
                                    } else {
                                        dmk.n("Check failed.");
                                        return;
                                    }
                                }
                            }
                            this.b = dogVar5;
                            if (dogVar5.g == null) {
                                this.a = dogVar5;
                            }
                        } else {
                            dmk.n("cannot compact");
                            return;
                        }
                    }
                    sp1Var.c -= b2;
                    this.c += b2;
                    j -= b2;
                }
                return;
            }
            dmk.v(woa.n(j2, "))", ace.p(j, "offset (0) and byteCount (", ") are not within the range [0..size(")));
            return;
        }
        dmk.v("source == this");
    }

    public final void K(byte b) {
        dog A = A(1);
        byte[] bArr = A.a;
        int i = A.c;
        A.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        g4n.b(bArr.length, i, i2);
        dog dogVar = this.a;
        if (dogVar == null) {
            return -1;
        }
        int min = Math.min(i2 - i, dogVar.b());
        int i3 = (i + min) - i;
        byte[] bArr2 = dogVar.a;
        int i4 = dogVar.b;
        ArraysKt.m(bArr2, i, bArr, i4, i4 + i3);
        dogVar.b += i3;
        this.c -= min;
        if (jl7.j(dogVar)) {
            o();
        }
        return min;
    }

    public final void g(z8h z8hVar, long j) {
        z8hVar.getClass();
        if (j >= 0) {
            long j2 = this.c;
            if (j2 >= j) {
                ((sp1) z8hVar).G(this, j);
                return;
            } else {
                ((sp1) z8hVar).G(this, j2);
                throw new EOFException(woa.n(this.c, " bytes were written.", ace.p(j, "Buffer exhausted before writing ", " bytes. Only ")));
            }
        }
        f27.q(ace.g(j, "byteCount (", ") < 0"));
    }

    @Override // defpackage.leh
    public final boolean h(long j) {
        if (j >= 0) {
            if (this.c >= j) {
                return true;
            }
            return false;
        }
        f27.q(ace.g(j, "byteCount: ", " < 0"));
        return false;
    }

    @Override // defpackage.leh
    public final void i(long j) {
        if (j >= 0) {
            if (this.c >= j) {
                return;
            }
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
        }
        f27.q(woa.m(j, "byteCount: "));
    }

    @Override // defpackage.leh
    public final boolean j() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final void o() {
        dog dogVar = this.a;
        dogVar.getClass();
        dog dogVar2 = dogVar.f;
        this.a = dogVar2;
        if (dogVar2 == null) {
            this.b = null;
        } else {
            dogVar2.g = null;
        }
        dogVar.f = null;
        iog.a(dogVar);
    }

    public final /* synthetic */ void p() {
        dog dogVar = this.b;
        dogVar.getClass();
        dog dogVar2 = dogVar.g;
        this.b = dogVar2;
        if (dogVar2 == null) {
            this.a = null;
        } else {
            dogVar2.f = null;
        }
        dogVar.g = null;
        iog.a(dogVar);
    }

    @Override // defpackage.leh
    public final kqf peek() {
        return new kqf(new gje(this));
    }

    @Override // defpackage.leh
    public final byte readByte() {
        dog dogVar = this.a;
        if (dogVar != null) {
            int b = dogVar.b();
            if (b == 0) {
                o();
                return readByte();
            }
            byte[] bArr = dogVar.a;
            int i = dogVar.b;
            dogVar.b = i + 1;
            byte b2 = bArr[i];
            this.c--;
            if (b == 1) {
                o();
            }
            return b2;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: 1)");
    }

    public final void skip(long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                dog dogVar = this.a;
                if (dogVar != null) {
                    int min = (int) Math.min(j2, dogVar.c - dogVar.b);
                    long j3 = min;
                    this.c -= j3;
                    j2 -= j3;
                    int i = dogVar.b + min;
                    dogVar.b = i;
                    if (i == dogVar.c) {
                        o();
                    }
                } else {
                    throw new EOFException(ace.g(j, "Buffer exhausted before skipping ", " bytes."));
                }
            }
            return;
        }
        f27.q(ace.g(j, "byteCount (", ") < 0"));
    }

    public final String toString() {
        int i;
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int min = (int) Math.min(64L, j);
        int i2 = min * 2;
        if (this.c > 64) {
            i = 1;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(i2 + i);
        int i3 = 0;
        for (dog dogVar = this.a; dogVar != null; dogVar = dogVar.f) {
            int i4 = 0;
            while (i3 < min && i4 < dogVar.b()) {
                int i5 = i4 + 1;
                byte c = dogVar.c(i4);
                i3++;
                char[] cArr = g4n.a;
                sb.append(cArr[(c >> 4) & 15]);
                sb.append(cArr[c & 15]);
                i4 = i5;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    @Override // defpackage.tnf
    public final long v0(sp1 sp1Var, long j) {
        if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            sp1Var.G(this, j);
            return j;
        }
        f27.q(ace.g(j, "byteCount (", ") < 0"));
        return 0L;
    }

    public final long y(tnf tnfVar) {
        tnfVar.getClass();
        long j = 0;
        while (true) {
            long v0 = tnfVar.v0(this, 8192L);
            if (v0 != -1) {
                j += v0;
            } else {
                return j;
            }
        }
    }

    public final long z(z8h z8hVar) {
        z8hVar.getClass();
        long j = this.c;
        if (j > 0) {
            ((sp1) z8hVar).G(this, j);
        }
        return j;
    }

    @Override // defpackage.leh
    public final sp1 c() {
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
