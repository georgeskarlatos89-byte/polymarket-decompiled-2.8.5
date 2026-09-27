package defpackage;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yu1 {
    public final fv1 a;
    public final hw1 b;
    public final kw1 c;
    public final long d;
    public final leh e;
    public final int[] f;
    public final sp1 g;
    public long h;
    public int i;

    /* JADX WARN: Type inference failed for: r3v4, types: [sp1, java.lang.Object] */
    public yu1(fv1 fv1Var, hw1 hw1Var, kw1 kw1Var, long j) {
        fv1Var.getClass();
        hw1Var.getClass();
        kw1Var.getClass();
        this.a = fv1Var;
        this.b = hw1Var;
        this.c = kw1Var;
        this.d = j;
        byte[] bArr = hw1Var.a;
        if (bArr.length > 0) {
            this.e = fv1Var.c();
            int[] iArr = new int[bArr.length];
            int length = bArr.length;
            int i = 0;
            for (int i2 = 1; i2 < length; i2++) {
                while (i > 0 && hw1Var.a(i2) != hw1Var.a(i)) {
                    i = iArr[i - 1];
                }
                if (hw1Var.a(i2) == hw1Var.a(i)) {
                    i++;
                }
                iArr[i2] = i;
            }
            this.f = iArr;
            this.g = new Object();
            return;
        }
        dmk.v("Empty match string not permitted for scanning");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r1 == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01aa, code lost:
    
        if (defpackage.pin.b(r4, r2) == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d2, code lost:
    
        if (defpackage.pin.b(r4, r2) == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
    
        if (r11 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00de, code lost:
    
        if (r16 <= r11) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        r5.getClass();
        r22 = r11;
        r6 = defpackage.jl7.i(r5, r1, java.lang.Math.max((int) (r14 - r11), 0), java.lang.Math.min(r5.b(), (int) (r16 - r22)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        if (r6 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0105, code lost:
    
        r11 = r22 + r5.b();
        r5 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        if (r5 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        if (r11 < r16) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        r5 = r22 + r6;
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
    
        defpackage.dmk.n("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        return r25;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e A[LOOP:0: B:29:0x0075->B:39:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185 A[EDGE_INSN: B:40:0x0185->B:41:0x0185 BREAK  A[LOOP:0: B:29:0x0075->B:39:0x016e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01aa -> B:18:0x01ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        vu1 vu1Var;
        int i;
        long j;
        long j2;
        dog dogVar;
        if (q55Var instanceof vu1) {
            vu1Var = (vu1) q55Var;
            int i2 = vu1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vu1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = vu1Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = vu1Var.m;
                Object obj2 = null;
                int i3 = 1;
                leh lehVar = this.e;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.a(obj);
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.a(obj);
                        Object obj3 = null;
                        char c = 2;
                        leh lehVar2 = lehVar;
                        obj2 = obj3;
                        lehVar = lehVar2;
                        i3 = 1;
                        if (lehVar.j()) {
                            vu1Var.m = i3;
                            obj = this.a.d(i3, vu1Var);
                        }
                        byte a = this.b.a(0);
                        lehVar.getClass();
                        j = 0;
                        while (j < Long.MAX_VALUE && lehVar.h(j + 1)) {
                            sp1 c2 = lehVar.c();
                            obj3 = obj2;
                            long min = Math.min(Long.MAX_VALUE, lehVar.c().c);
                            c2.getClass();
                            long min2 = Math.min(min, c2.c);
                            g4n.b(c2.c, j, min2);
                            if (j != min2 && (dogVar = c2.a) != null) {
                                long j3 = c2.c;
                                if (j3 - j >= j) {
                                    dog dogVar2 = c2.b;
                                    while (dogVar2 != null && j3 > j) {
                                        j3 -= dogVar2.c - dogVar2.b;
                                        if (j3 <= j) {
                                            break;
                                        }
                                        dogVar2 = dogVar2.g;
                                    }
                                } else {
                                    long j4 = 0;
                                    while (dogVar != null) {
                                        long j5 = (dogVar.c - dogVar.b) + j4;
                                        if (j5 > j) {
                                            break;
                                        }
                                        dogVar = dogVar.f;
                                        j4 = j5;
                                    }
                                    if (j4 != -1) {
                                        while (min2 > j4) {
                                            dogVar.getClass();
                                            lehVar2 = lehVar;
                                            int i4 = jl7.i(dogVar, a, Math.max((int) (j - j4), 0), Math.min(dogVar.b(), (int) (min2 - j4)));
                                            if (i4 != -1) {
                                                j2 = j4 + i4;
                                                if (j2 != -1) {
                                                    break;
                                                }
                                                j = lehVar2.c().c;
                                                obj2 = obj3;
                                                lehVar = lehVar2;
                                            } else {
                                                j4 += dogVar.b();
                                                dogVar = dogVar.f;
                                                if (dogVar != null && j4 < min2) {
                                                    lehVar = lehVar2;
                                                }
                                                j2 = -1;
                                                if (j2 != -1) {
                                                }
                                            }
                                        }
                                        dmk.n("Check failed.");
                                        return obj3;
                                    }
                                }
                                if (lehVar.j()) {
                                }
                                byte a2 = this.b.a(0);
                                lehVar.getClass();
                                j = 0;
                                while (j < Long.MAX_VALUE) {
                                    sp1 c22 = lehVar.c();
                                    obj3 = obj2;
                                    long min3 = Math.min(Long.MAX_VALUE, lehVar.c().c);
                                    c22.getClass();
                                    long min22 = Math.min(min3, c22.c);
                                    g4n.b(c22.c, j, min22);
                                    if (j != min22) {
                                        long j32 = c22.c;
                                        if (j32 - j >= j) {
                                        }
                                        if (lehVar.j()) {
                                        }
                                        byte a22 = this.b.a(0);
                                        lehVar.getClass();
                                        j = 0;
                                        while (j < Long.MAX_VALUE) {
                                        }
                                    }
                                }
                            }
                            lehVar2 = lehVar;
                            j2 = -1;
                            if (j2 != -1) {
                            }
                        }
                        obj3 = obj2;
                        lehVar2 = lehVar;
                        j2 = -1;
                        kw1 kw1Var = this.c;
                        if (j2 == -1) {
                            sp1 sp1Var = (sp1) lehVar2;
                            b(sp1Var.c);
                            this.h = sp1Var.z(((uu1) kw1Var).k()) + this.h;
                            c = 2;
                            vu1Var.m = 2;
                        } else {
                            b(j2);
                            long j6 = this.h;
                            sp1 k = ((uu1) kw1Var).k();
                            k.getClass();
                            this.h = lehVar2.v0(k, j2) + j6;
                            vu1Var.m = 3;
                        }
                        return u85Var;
                    }
                    ResultKt.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    byte a222 = this.b.a(0);
                    lehVar.getClass();
                    j = 0;
                    while (j < Long.MAX_VALUE) {
                    }
                    obj3 = obj2;
                    lehVar2 = lehVar;
                    j2 = -1;
                    kw1 kw1Var2 = this.c;
                    if (j2 == -1) {
                    }
                    return u85Var;
                }
                ResultKt.a(obj);
                if (lehVar.j()) {
                }
                byte a2222 = this.b.a(0);
                lehVar.getClass();
                j = 0;
                while (j < Long.MAX_VALUE) {
                }
                obj3 = obj2;
                lehVar2 = lehVar;
                j2 = -1;
                kw1 kw1Var22 = this.c;
                if (j2 == -1) {
                }
                return u85Var;
            }
        }
        vu1Var = new vu1(this, q55Var);
        Object obj4 = vu1Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = vu1Var.m;
        Object obj22 = null;
        int i32 = 1;
        leh lehVar3 = this.e;
        if (i == 0) {
        }
    }

    public final void b(long j) {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 <= j3) {
            return;
        }
        StringBuilder p = ace.p(j3, "Limit of ", " bytes exceeded while searching for \"");
        hw1 hw1Var = this.b;
        hw1Var.getClass();
        p.append(e.s(e.k(hw1Var.a), "\n", "\\n"));
        p.append('\"');
        throw new IOException(p.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r14 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x003f -> B:21:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0049 -> B:17:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q55 q55Var) {
        wu1 wu1Var;
        int i;
        int i2;
        hw1 hw1Var;
        int i3;
        int i4;
        uu1 uu1Var;
        int i5;
        Object b;
        if (q55Var instanceof wu1) {
            wu1Var = (wu1) q55Var;
            int i6 = wu1Var.m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                wu1Var.m = i6 - Integer.MIN_VALUE;
                Object obj = wu1Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wu1Var.m;
                leh lehVar = this.e;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            this.h++;
                            return Boolean.FALSE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    byte readByte = lehVar.readByte();
                    i2 = this.i;
                    sp1 sp1Var = this.g;
                    hw1Var = this.b;
                    if (i2 > 0 && readByte != hw1Var.a(i2)) {
                        int i7 = this.i;
                        while (true) {
                            i4 = this.i;
                            if (i4 <= 0 || readByte == hw1Var.a(i4)) {
                                break;
                            }
                            this.i = this.f[this.i - 1];
                        }
                        long j = i7 - this.i;
                        b(j);
                        long j2 = this.h;
                        uu1Var = (uu1) this.c;
                        sp1 k = uu1Var.k();
                        k.getClass();
                        this.h = sp1Var.v0(k, j) + j2;
                        i5 = this.i;
                        if (i5 == 0 && readByte != hw1Var.a(i5)) {
                            wu1Var.m = 2;
                            lw1 lw1Var = nw1.a;
                            uu1Var.k().K(readByte);
                            b = pin.b(uu1Var, wu1Var);
                            if (b != u85.COROUTINE_SUSPENDED) {
                                b = Unit.INSTANCE;
                            }
                        }
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == hw1Var.a.length) {
                        return Boolean.TRUE;
                    }
                    sp1Var.K(readByte);
                    if (lehVar.j()) {
                        wu1Var.m = 1;
                        obj = this.a.d(1, wu1Var);
                    }
                    byte readByte2 = lehVar.readByte();
                    i2 = this.i;
                    sp1 sp1Var2 = this.g;
                    hw1Var = this.b;
                    if (i2 > 0) {
                        int i72 = this.i;
                        while (true) {
                            i4 = this.i;
                            if (i4 <= 0) {
                                break;
                            }
                            break;
                            this.i = this.f[this.i - 1];
                        }
                        long j3 = i72 - this.i;
                        b(j3);
                        long j22 = this.h;
                        uu1Var = (uu1) this.c;
                        sp1 k2 = uu1Var.k();
                        k2.getClass();
                        this.h = sp1Var2.v0(k2, j3) + j22;
                        i5 = this.i;
                        if (i5 == 0) {
                            wu1Var.m = 2;
                            lw1 lw1Var2 = nw1.a;
                            uu1Var.k().K(readByte2);
                            b = pin.b(uu1Var, wu1Var);
                            if (b != u85.COROUTINE_SUSPENDED) {
                            }
                        }
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == hw1Var.a.length) {
                    }
                } else {
                    ResultKt.a(obj);
                    if (lehVar.j()) {
                    }
                    byte readByte22 = lehVar.readByte();
                    i2 = this.i;
                    sp1 sp1Var22 = this.g;
                    hw1Var = this.b;
                    if (i2 > 0) {
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == hw1Var.a.length) {
                    }
                }
            }
        }
        wu1Var = new wu1(this, q55Var);
        Object obj2 = wu1Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wu1Var.m;
        leh lehVar2 = this.e;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r2.h(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (a(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c4 -> B:19:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, q55 q55Var) {
        xu1 xu1Var;
        int i;
        if (q55Var instanceof xu1) {
            xu1Var = (xu1) q55Var;
            int i2 = xu1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xu1Var.n = i2 - Integer.MIN_VALUE;
                Object obj = xu1Var.l;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = xu1Var.n;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ResultKt.a(obj);
                                    return new Long(this.h);
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = xu1Var.k;
                            ResultKt.a(obj);
                            if (((Boolean) obj).booleanValue()) {
                                return new Long(this.h);
                            }
                            if (this.e.j()) {
                                xu1Var.k = z;
                                xu1Var.n = 1;
                                obj = this.a.d(1, xu1Var);
                            }
                            xu1Var.k = z;
                            xu1Var.n = 2;
                        } else {
                            z = xu1Var.k;
                            ResultKt.a(obj);
                            xu1Var.k = z;
                            xu1Var.n = 3;
                            obj = c(xu1Var);
                        }
                    } else {
                        z = xu1Var.k;
                        ResultKt.a(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            if (z) {
                                long j = this.h;
                                uu1 uu1Var = (uu1) this.c;
                                this.h = this.g.z(uu1Var.k()) + j;
                                xu1Var.n = 4;
                            } else {
                                hw1 hw1Var = this.b;
                                hw1Var.getClass();
                                xbc.g(e.s(e.k(hw1Var.a), "\n", "\\n"), "\" but encountered end of input", "Expected \"");
                                return null;
                            }
                        }
                        xu1Var.k = z;
                        xu1Var.n = 2;
                    }
                } else {
                    ResultKt.a(obj);
                    this.h = 0L;
                    if (this.e.j()) {
                    }
                    xu1Var.k = z;
                    xu1Var.n = 2;
                }
            }
        }
        xu1Var = new xu1(this, q55Var);
        Object obj3 = xu1Var.l;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = xu1Var.n;
        if (i == 0) {
        }
    }
}
