package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class wh4 implements p1c {
    public static final wh4 e = new wh4(new int[0], new char[0], new boolean[0], 0);
    public final int[] a;
    public final char[] b;
    public final boolean[] c;
    public final int d;

    public wh4(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        this.a = iArr;
        this.b = cArr;
        this.c = zArr;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wh4 a(wub wubVar) {
        int i;
        wh4 wh4Var;
        wh4 wh4Var2;
        if (wubVar != null) {
            String str = wubVar.d;
            int i2 = wubVar.b;
            if (i2 != -1 && !cwl.e(str, i2)) {
                int i3 = 0;
                if (i2 > 0 && str.charAt(i2 - 1) == '\t') {
                    i = (4 - (g() % 4)) % 4;
                } else {
                    i = 0;
                }
                int i4 = i2;
                while (i4 < str.length() && str.charAt(i4) == ' ' && i < 3) {
                    i++;
                    i4++;
                }
                if (i4 != str.length()) {
                    wub e2 = wubVar.e(i4 - i2);
                    e2.getClass();
                    sh4 e3 = e(e2);
                    if (e3 != null) {
                        char c = e3.b;
                        int i5 = e3.c;
                        int i6 = i4 + e3.a;
                        int i7 = 0;
                        int i8 = i6;
                        while (i8 < str.length()) {
                            char charAt = str.charAt(i8);
                            if (charAt == ' ') {
                                i7++;
                            } else {
                                if (charAt != '\t') {
                                    break;
                                }
                                i7 = (4 - (i7 % 4)) + i7;
                            }
                            i8++;
                        }
                        if (1 <= i7 && i7 < 5) {
                            wh4Var = null;
                            if (i8 < str.length()) {
                                wh4Var2 = cqn.a(this, i + i5 + i7, c, true, i8);
                                if (wh4Var2 == null) {
                                    int i9 = 0;
                                    while (i2 < str.length() && str.charAt(i2) == ' ' && i9 < 3) {
                                        i9++;
                                        i2++;
                                    }
                                    if (i2 != str.length() && str.charAt(i2) == '>') {
                                        int i10 = i2 + 1;
                                        if (i10 >= str.length() || str.charAt(i10) == ' ' || str.charAt(i10) == '\t') {
                                            if (i10 < str.length()) {
                                                i10 = i2 + 2;
                                            }
                                            i3 = 1;
                                        }
                                        return cqn.a(this, i9 + 1 + i3, '>', true, i10);
                                    }
                                    return wh4Var;
                                }
                                return wh4Var2;
                            }
                        } else {
                            wh4Var = null;
                        }
                        if ((i7 >= 5 && i8 < str.length()) || i8 == str.length()) {
                            wh4Var2 = cqn.a(this, i + i5 + 1, c, true, Math.min(i8, i6 + 1));
                        } else {
                            wh4Var2 = wh4Var;
                        }
                        if (wh4Var2 == null) {
                        }
                    }
                }
                wh4Var2 = null;
                wh4Var = null;
                if (wh4Var2 == null) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$b] */
    public final wh4 b(wub wubVar) {
        if (wubVar == null) {
            return f();
        }
        if (wubVar.b == -1) {
            String str = wubVar.d;
            uh4 uh4Var = new uh4(new Object(), this.a.length, str, this, new vh4(str, 0));
            wh4 f = f();
            while (true) {
                wh4 wh4Var = (wh4) uh4Var.invoke(f);
                if (Intrinsics.areEqual(wh4Var, f)) {
                    return f;
                }
                f = wh4Var;
            }
        } else {
            throw new IllegalStateException("given " + wubVar);
        }
    }

    public final boolean c(int i) {
        Iterable k = lnf.k(0, i);
        if (!(k instanceof Collection) || !((Collection) k).isEmpty()) {
            Iterator it = k.iterator();
            while (((g1a) it).c) {
                int nextInt = ((y0a) it).nextInt();
                if (this.b[nextInt] != '>' && this.c[nextInt]) {
                    return true;
                }
            }
        }
        return false;
    }

    public wh4 d(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        return new wh4(iArr, cArr, zArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if ((r4 - r0) > 9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r4 >= r3.length()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r3.charAt(r4) == '.') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r3.charAt(r4) != ')') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r2 = (r4 + 1) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return new defpackage.sh4(r3.charAt(r4), r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sh4 e(wub wubVar) {
        char charAt;
        wubVar.getClass();
        char charAt2 = ((CharSequence) wubVar.e.b).charAt(wubVar.c);
        int i = wubVar.b;
        if (charAt2 != '*' && charAt2 != '-' && charAt2 != '+') {
            String str = wubVar.d;
            int i2 = i;
            while (i2 < str.length() && '0' <= (charAt = str.charAt(i2)) && charAt < ':') {
                i2++;
            }
            return null;
        }
        return new sh4(charAt2, 1, 1);
    }

    public wh4 f() {
        return e;
    }

    public final int g() {
        Integer valueOf;
        int[] iArr = this.a;
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(iArr[iArr.length - 1]);
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final boolean h(p1c p1cVar) {
        p1cVar.getClass();
        if (p1cVar instanceof wh4) {
            int length = this.a.length;
            wh4 wh4Var = (wh4) p1cVar;
            int length2 = wh4Var.a.length;
            if (length >= length2) {
                Iterable k = lnf.k(0, length2);
                if (!(k instanceof Collection) || !((Collection) k).isEmpty()) {
                    Iterator it = k.iterator();
                    while (((g1a) it).c) {
                        int nextInt = ((y0a) it).nextInt();
                        if (this.b[nextInt] != wh4Var.b[nextInt]) {
                        }
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MdConstraints: " + new String(this.b) + '(' + g() + ')';
    }
}
