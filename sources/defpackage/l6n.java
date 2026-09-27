package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class l6n {
    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(tu7 tu7Var) {
        svd svdVar = new svd(8);
        int i = m0a.c(tu7Var, svdVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        tu7Var.o(svdVar.a, 0, 4);
        svdVar.F(0);
        int g = svdVar.g();
        if (g != 1463899717) {
            q7m.c("WavHeaderReader", "Unsupported form type: " + g);
            return false;
        }
        return true;
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder p = ace.p(j, "size=", " offset=");
        p.append(j2);
        p.append(" byteCount=");
        p.append(j3);
        throw new ArrayIndexOutOfBoundsException(p.toString());
    }

    public static final o9b d(j9b j9bVar) {
        j9bVar.getClass();
        return (o9b) ((s76) j9bVar).a.b.a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(j9b j9bVar, q55 q55Var) {
        p9b p9bVar;
        int i;
        d25 d25Var;
        Object i2;
        Object obj;
        if (q55Var instanceof p9b) {
            p9b p9bVar2 = (p9b) q55Var;
            int i3 = p9bVar2.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p9bVar2.m = i3 - Integer.MIN_VALUE;
                p9bVar = p9bVar2;
                Object obj2 = p9bVar.l;
                Object obj3 = u85.COROUTINE_SUSPENDED;
                i = p9bVar.m;
                String str = null;
                if (i == 0) {
                    if (i == 1) {
                        j9bVar = p9bVar.k;
                        ResultKt.a(obj2);
                        i2 = ((Result) obj2).a;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    d25Var = ((s76) j9bVar).j;
                    if (d25Var == null) {
                        p9bVar.k = j9bVar;
                        p9bVar.m = 1;
                        i2 = ((s76) j9bVar).i(p9bVar);
                        if (i2 == obj3) {
                            return obj3;
                        }
                    }
                    ArrayList arrayList = d25Var.a;
                    ((s76) j9bVar).j = d25Var;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((c25) obj).b) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    c25 c25Var = (c25) obj;
                    if (c25Var == null) {
                        c25Var = (c25) CollectionsKt.firstOrNull(arrayList);
                    }
                    if (c25Var != null) {
                        h9b h9bVar = ((n9b) ((s76) j9bVar).a.b.a.getValue()).a;
                        if (h9bVar != null) {
                            str = h9bVar.e();
                        }
                        String str2 = c25Var.a;
                        boolean z = c25Var.b;
                        n05 n05Var = c25Var.c;
                        str2.getClass();
                        n05Var.getClass();
                        return new c25(str2, z, n05Var, str);
                    }
                    return null;
                }
                Result.Companion companion = Result.INSTANCE;
                if (i2 instanceof r5g) {
                    i2 = null;
                }
                d25Var = (d25) i2;
            }
        }
        p9bVar = new q55(q55Var);
        Object obj22 = p9bVar.l;
        Object obj32 = u85.COROUTINE_SUSPENDED;
        i = p9bVar.m;
        String str3 = null;
        if (i == 0) {
        }
        Result.Companion companion2 = Result.INSTANCE;
        if (i2 instanceof r5g) {
        }
        d25Var = (d25) i2;
    }

    public static final int f(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static m0a g(int i, tu7 tu7Var, svd svdVar) {
        m0a c = m0a.c(tu7Var, svdVar);
        while (true) {
            int i2 = c.a;
            if (i2 != i) {
                k84.k(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j = c.b;
                long j2 = 8 + j;
                if (j % 2 != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    tu7Var.l((int) j2);
                    c = m0a.c(tu7Var, svdVar);
                } else {
                    throw dwd.c("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return c;
            }
        }
    }

    public static final String h(byte b) {
        char[] cArr = c.a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final String i(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = c.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return e.j(cArr2, i2, 8);
    }
}
