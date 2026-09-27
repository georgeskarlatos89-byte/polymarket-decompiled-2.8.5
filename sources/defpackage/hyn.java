package defpackage;

import android.text.TextUtils;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class hyn implements Closeable {
    public final hyn a = null;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public hyn(String str, UUID uuid, String str2, vzn vznVar) {
        this.d = str;
        this.b = uuid;
        this.c = str2;
        vznVar.getClass();
        this.e = Thread.currentThread();
    }

    public static String e(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vzn c = xyn.c();
        hyn hynVar = c.b;
        String str = this.d;
        if (hynVar != null) {
            if (this == hynVar) {
                xyn.b(c, hynVar.a);
                this.e = null;
                return;
            }
            String str2 = hynVar.d;
            StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
            k84.q(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException(ix2.p(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
    }

    public abstract qzn g();

    public abstract qzn o();

    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
    
        r9 = r9.d;
        r15 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a4, code lost:
    
        if (r9.containsKey(r15) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a6, code lost:
    
        ((defpackage.szn) r1.g).d.put(r15, new defpackage.szn(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b4, code lost:
    
        if (r14 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        r14.c = (defpackage.szn) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
    
        r14.c = (defpackage.szn) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        r1.b = r7;
        r1.c++;
        r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r1.h(r13, r14, r15, (r15 + r14) - r13) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        int i2;
        h6 h6Var;
        Iterator it;
        rzn rznVar;
        int i3;
        String str;
        String str2;
        AtomicReference atomicReference = xyn.a;
        int i4 = 0;
        int i5 = 0;
        hyn hynVar = this;
        while (hynVar != null) {
            i4++;
            i5 += hynVar.d.length();
            hynVar = hynVar.a;
            if (hynVar != null) {
                i5 += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            hyn hynVar2 = this;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                strArr[i6] = hynVar2.d;
                hynVar2 = hynVar2.a;
            }
            vt1 a = mr9.a();
            tuj i7 = tr9.m(strArr).i();
            int i8 = 0;
            while (i7.hasNext()) {
                a.w(i7.next(), Integer.valueOf(i8));
                i8++;
            }
            int i9 = 1;
            bxf f = a.f(true);
            int i10 = f.f;
            int i11 = i4 >> 2;
            if (i10 <= i11) {
                int i12 = i4 + 1;
                int[] iArr = new int[i12];
                for (int i13 = 0; i13 < i4; i13++) {
                    iArr[i13] = ((Integer) f.get(strArr[i13])).intValue();
                }
                iArr[i4] = i10;
                rc0 rc0Var = new rc0(iArr);
                int i14 = 0;
                while (true) {
                    int i15 = -1;
                    if (i14 >= i12) {
                        break;
                    }
                    rc0Var.d += i9;
                    int i16 = iArr[i14];
                    while (true) {
                        szn sznVar = null;
                        while (true) {
                            if (rc0Var.d > 0) {
                                int i17 = rc0Var.c;
                                szn sznVar2 = (szn) rc0Var.g;
                                i3 = i9;
                                if (i17 == 0) {
                                    break;
                                }
                                int i18 = ((szn) sznVar2.d.get(Integer.valueOf(iArr[rc0Var.b]))).a;
                                int i19 = rc0Var.c;
                                if (iArr[i18 + i19] == i16) {
                                    if (sznVar != null) {
                                        sznVar.c = (szn) rc0Var.g;
                                    }
                                    rc0Var.c = i19 + 1;
                                    rc0Var.c();
                                } else {
                                    szn sznVar3 = (szn) ((szn) rc0Var.g).d.get(Integer.valueOf(iArr[rc0Var.b]));
                                    int i20 = i15;
                                    szn sznVar4 = new szn(sznVar3.a, (rc0Var.c + r0) - 1);
                                    ((szn) rc0Var.g).d.put(Integer.valueOf(iArr[rc0Var.b]), sznVar4);
                                    int i21 = sznVar4.b + 1;
                                    Integer valueOf = Integer.valueOf(iArr[i21]);
                                    HashMap hashMap = sznVar4.d;
                                    hashMap.put(valueOf, sznVar3);
                                    sznVar3.a = i21;
                                    if (sznVar != null) {
                                        sznVar.c = sznVar4;
                                    }
                                    hashMap.put(Integer.valueOf(i16), new szn(i14, 1073741824));
                                    rc0Var.d--;
                                    rc0Var.d();
                                    sznVar = sznVar4;
                                    i9 = i3;
                                    i15 = i20;
                                }
                            } else {
                                i3 = i9;
                                break;
                            }
                        }
                        rc0Var.d += i15;
                        rc0Var.d();
                        i9 = i3;
                    }
                    i14++;
                    i9 = i3;
                }
                int i22 = i9;
                ArrayDeque arrayDeque = new ArrayDeque();
                szn sznVar5 = (szn) rc0Var.f;
                rzn rznVar2 = new rzn(sznVar5, 0, -1, -1);
                arrayDeque.push(rznVar2);
                while (!arrayDeque.isEmpty()) {
                    rzn rznVar3 = (rzn) arrayDeque.pop();
                    Iterator it2 = rznVar3.d.d.values().iterator();
                    while (it2.hasNext()) {
                        szn sznVar6 = (szn) it2.next();
                        int i23 = rznVar3.b;
                        int i24 = rznVar3.c;
                        int i25 = sznVar6.a;
                        szn sznVar7 = sznVar5;
                        int i26 = sznVar6.b;
                        if (!rc0Var.h(i23, i24, i25, i26)) {
                            if (sznVar6.d.isEmpty()) {
                                int i27 = sznVar6.a;
                                it = it2;
                            } else {
                                it = it2;
                            }
                            rznVar = new rzn(sznVar6, i22, sznVar6.a, i26);
                            if (rznVar2.a >= rznVar.a) {
                                rznVar2 = rznVar;
                            }
                            arrayDeque.push(rznVar);
                            sznVar5 = sznVar7;
                            it2 = it;
                            i22 = 1;
                        } else {
                            it = it2;
                        }
                        rznVar = new rzn(sznVar6, rznVar3.a + i22, i23, i24);
                        if (rznVar2.a >= rznVar.a) {
                        }
                        arrayDeque.push(rznVar);
                        sznVar5 = sznVar7;
                        it2 = it;
                        i22 = 1;
                    }
                    i22 = 1;
                }
                int min = Math.min(iArr.length, rznVar2.c + 1);
                int i28 = 0;
                loop9: while (true) {
                    i = rznVar2.b;
                    i2 = min - i;
                    sznVar5 = (szn) sznVar5.d.get(Integer.valueOf(iArr[(i28 % i2) + i]));
                    if (sznVar5 == null) {
                        break;
                    }
                    for (int i29 = sznVar5.a; i29 < sznVar5.b + 1 && i29 < iArr.length; i29++) {
                        if (iArr[(i28 % i2) + i] != iArr[i29]) {
                            break loop9;
                        }
                        i28++;
                    }
                }
                int i30 = i28 / i2;
                h6 h6Var2 = new h6(i, min, i30);
                if (i2 * i30 >= i11) {
                    h6Var = h6Var2;
                    str = "";
                    if (h6Var != null) {
                        int i31 = h6Var.a;
                        if (i31 <= 0) {
                            str2 = "";
                        } else {
                            str2 = String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i31))).concat(" -> ");
                        }
                        int i32 = h6Var.b;
                        int i33 = h6Var.c;
                        int i34 = ((i32 - i31) * i33) + i31;
                        if (i34 < i4) {
                            str = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i34, i4))));
                        }
                        String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i31, i32));
                        Locale locale = Locale.US;
                        str = str2 + "{" + join + "}x" + i33 + str;
                    }
                    if (!str.isEmpty()) {
                        return str;
                    }
                }
            }
            h6Var = null;
            str = "";
            if (h6Var != null) {
            }
            if (!str.isEmpty()) {
            }
        }
        char[] cArr = new char[i5];
        hyn hynVar3 = this;
        while (hynVar3 != null) {
            String str3 = hynVar3.d;
            i5 -= str3.length();
            str3.getChars(0, str3.length(), cArr, i5);
            hynVar3 = hynVar3.a;
            if (hynVar3 != null) {
                i5 -= 4;
                " -> ".getChars(0, 4, cArr, i5);
            }
        }
        return new String(cArr);
    }
}
