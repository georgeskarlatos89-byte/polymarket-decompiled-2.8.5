package defpackage;

import android.view.View;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class nz4 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final py4 I;
    public final py4 J;
    public final py4 K;
    public final py4 L;
    public final py4 M;
    public final py4 N;
    public final py4 O;
    public final py4 P;
    public final py4[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public final mz4[] T;
    public oz4 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int a0;
    public yb3 b;
    public int b0;
    public yb3 c;
    public int c0;
    public int d0;
    public float e0;
    public float f0;
    public View g0;
    public int h0;
    public String i0;
    public String j;
    public int j0;
    public boolean k;
    public int k0;
    public boolean l;
    public final float[] l0;
    public boolean m;
    public final nz4[] m0;
    public boolean n;
    public final nz4[] n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public ad9 d = null;
    public x7k e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public nz4() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{bd0.API_PRIORITY_OTHER, bd0.API_PRIORITY_OTHER};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        py4 py4Var = new py4(this, oy4.LEFT);
        this.I = py4Var;
        py4 py4Var2 = new py4(this, oy4.TOP);
        this.J = py4Var2;
        py4 py4Var3 = new py4(this, oy4.RIGHT);
        this.K = py4Var3;
        py4 py4Var4 = new py4(this, oy4.BOTTOM);
        this.L = py4Var4;
        py4 py4Var5 = new py4(this, oy4.BASELINE);
        this.M = py4Var5;
        py4 py4Var6 = new py4(this, oy4.CENTER_X);
        this.N = py4Var6;
        py4 py4Var7 = new py4(this, oy4.CENTER_Y);
        this.O = py4Var7;
        py4 py4Var8 = new py4(this, oy4.CENTER);
        this.P = py4Var8;
        this.Q = new py4[]{py4Var, py4Var3, py4Var2, py4Var4, py4Var5, py4Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        mz4 mz4Var = mz4.FIXED;
        this.T = new mz4[]{mz4Var, mz4Var};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = null;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = new float[]{-1.0f, -1.0f};
        this.m0 = new nz4[]{null, null};
        this.n0 = new nz4[]{null, null};
        this.o0 = -1;
        this.p0 = -1;
        arrayList.add(py4Var);
        arrayList.add(py4Var2);
        arrayList.add(py4Var3);
        arrayList.add(py4Var4);
        arrayList.add(py4Var6);
        arrayList.add(py4Var7);
        arrayList.add(py4Var8);
        arrayList.add(py4Var5);
    }

    public static void G(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        k84.l(i, str, " :   ", ",\n", sb);
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, mz4 mz4Var) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = mz4Var.toString();
        if (!mz4.FIXED.toString().equals(obj)) {
            k84.q(sb, "      behavior", " :   ", obj, ",\n");
        }
        H(sb, "      size", i, 0);
        H(sb, "      min", i2, 0);
        H(sb, "      max", i3, bd0.API_PRIORITY_OTHER);
        H(sb, "      matchMin", i4, 0);
        H(sb, "      matchDef", i5, 0);
        G(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, py4 py4Var) {
        if (py4Var.f == null) {
            return;
        }
        ix2.C(sb, "    ", str, " : [ '");
        sb.append(py4Var.f);
        sb.append("'");
        if (py4Var.h != Integer.MIN_VALUE || py4Var.g != 0) {
            sb.append(",");
            sb.append(py4Var.g);
            if (py4Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(py4Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.k) {
            if (!this.I.c || !this.K.c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean B() {
        if (!this.l) {
            if (!this.J.c || !this.L.c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.U = null;
        this.D = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        mz4 mz4Var = mz4.FIXED;
        mz4[] mz4VarArr = this.T;
        mz4VarArr[0] = mz4Var;
        mz4VarArr[1] = mz4Var;
        this.g0 = null;
        this.h0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        float[] fArr = this.l0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = bd0.API_PRIORITY_OTHER;
        this.y = bd0.API_PRIORITY_OTHER;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((py4) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            py4 py4Var = (py4) arrayList.get(i);
            py4Var.c = false;
            py4Var.b = 0;
        }
    }

    public void F(m64 m64Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        boolean z;
        this.b0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Z = i;
        this.V = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        if (this.E) {
            this.M.l(i + this.b0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public final void M(mz4 mz4Var) {
        this.T[0] = mz4Var;
    }

    public final void N(mz4 mz4Var) {
        this.T[1] = mz4Var;
    }

    public final void O(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        ad9 ad9Var = this.d;
        boolean z3 = z & ad9Var.g;
        x7k x7kVar = this.e;
        boolean z4 = z2 & x7kVar.g;
        int i3 = ad9Var.h.g;
        int i4 = x7kVar.h.g;
        int i5 = ad9Var.i.g;
        int i6 = x7kVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.a0 = i4;
        }
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        mz4[] mz4VarArr = this.T;
        if (z3) {
            if (mz4VarArr[0] == mz4.FIXED && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (mz4VarArr[1] == mz4.FIXED && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void Q(a9b a9bVar, boolean z) {
        int i;
        int i2;
        x7k x7kVar;
        ad9 ad9Var;
        a9bVar.getClass();
        int n = a9b.n(this.I);
        int n2 = a9b.n(this.J);
        int n3 = a9b.n(this.K);
        int n4 = a9b.n(this.L);
        if (z && (ad9Var = this.d) != null) {
            xl6 xl6Var = ad9Var.h;
            if (xl6Var.j) {
                xl6 xl6Var2 = ad9Var.i;
                if (xl6Var2.j) {
                    n = xl6Var.g;
                    n3 = xl6Var2.g;
                }
            }
        }
        if (z && (x7kVar = this.e) != null) {
            xl6 xl6Var3 = x7kVar.h;
            if (xl6Var3.j) {
                xl6 xl6Var4 = x7kVar.i;
                if (xl6Var4.j) {
                    n2 = xl6Var3.g;
                    n4 = xl6Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Z = n;
        this.a0 = n2;
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        mz4[] mz4VarArr = this.T;
        mz4 mz4Var = mz4VarArr[0];
        mz4 mz4Var2 = mz4.FIXED;
        if (mz4Var == mz4Var2 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (mz4VarArr[1] == mz4Var2 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i4;
        this.W = i5;
        int i6 = this.d0;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.c0;
        if (i4 < i7) {
            this.V = i7;
        } else {
            i7 = i4;
        }
        int i8 = this.v;
        if (i8 > 0 && mz4Var == mz4.MATCH_CONSTRAINT) {
            this.V = Math.min(i7, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && mz4VarArr[1] == mz4.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(oz4 oz4Var, a9b a9bVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                vom.a(oz4Var, a9bVar, this);
                hashSet.remove(this);
                b(a9bVar, oz4Var.W(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((py4) it.next()).d.a(oz4Var, a9bVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((py4) it2.next()).d.a(oz4Var, a9bVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((py4) it3.next()).d.a(oz4Var, a9bVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((py4) it4.next()).d.a(oz4Var, a9bVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((py4) it5.next()).d.a(oz4Var, a9bVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05f1, code lost:
    
        if (r60.h0 == r9) goto L379;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [int] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r13v44, types: [oz4] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r60v0, types: [nz4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(a9b a9bVar, boolean z) {
        boolean z2;
        boolean z3;
        ?? r19;
        ?? r17;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        oz4 oz4Var;
        oz4 oz4Var2;
        boolean[] zArr;
        py4 py4Var;
        boolean[] zArr2;
        py4 py4Var2;
        py4 py4Var3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        mz4 mz4Var;
        mz4 mz4Var2;
        boolean z11;
        mz4 mz4Var3;
        boolean z12;
        float f;
        ceh cehVar;
        ceh cehVar2;
        py4 py4Var4;
        int i7;
        int i8;
        int i9;
        boolean z13;
        boolean z14;
        boolean z15;
        mz4 mz4Var4;
        mz4 mz4Var5;
        mz4 mz4Var6;
        boolean z16;
        py4 py4Var5;
        int i10;
        int[] iArr;
        py4 py4Var6;
        ceh cehVar3;
        mz4 mz4Var7;
        ceh cehVar4;
        mz4 mz4Var8;
        py4 py4Var7;
        boolean z17;
        int[] iArr2;
        boolean z18;
        py4 py4Var8;
        ceh cehVar5;
        ceh cehVar6;
        ceh cehVar7;
        boolean[] zArr3;
        int i11;
        boolean z19;
        ceh cehVar8;
        ceh cehVar9;
        ceh cehVar10;
        int i12;
        int i13;
        int i14;
        int i15;
        ceh cehVar11;
        ceh cehVar12;
        int i16;
        int i17;
        ceh cehVar13;
        ?? r27;
        ?? r18;
        x7k x7kVar;
        xl6 xl6Var;
        oz4 oz4Var3;
        py4 py4Var9;
        ceh cehVar14;
        ceh cehVar15;
        boolean z20;
        ad9 ad9Var;
        int i18;
        boolean x;
        ?? r12;
        boolean y;
        ad9 ad9Var2;
        x7k x7kVar2;
        boolean z21;
        a9b a9bVar2 = a9bVar;
        py4 py4Var10 = this.I;
        ceh k = a9bVar2.k(py4Var10);
        py4 py4Var11 = this.K;
        ceh k2 = a9bVar2.k(py4Var11);
        py4 py4Var12 = this.J;
        ceh k3 = a9bVar2.k(py4Var12);
        py4 py4Var13 = this.L;
        ceh k4 = a9bVar2.k(py4Var13);
        py4 py4Var14 = this.M;
        ceh k5 = a9bVar2.k(py4Var14);
        oz4 oz4Var4 = this.U;
        if (oz4Var4 != null) {
            mz4[] mz4VarArr = oz4Var4.T;
            r17 = 0;
            r17 = 0;
            z3 = false;
            r17 = 0;
            mz4 mz4Var9 = mz4VarArr[0];
            mz4 mz4Var10 = mz4.WRAP_CONTENT;
            if (mz4Var9 == mz4Var10) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (mz4VarArr[1] == mz4Var10) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i19 = this.q;
            if (i19 != 1) {
                boolean z22 = true;
                if (i19 != 2) {
                    z2 = z22;
                    r19 = z22;
                } else {
                    z4 = false;
                    r19 = z22;
                }
            } else {
                r19 = 1;
                z5 = false;
            }
            i = this.h0;
            boolean[] zArr4 = this.S;
            boolean z23 = z5;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z6 = z4;
                int i20 = r17;
                while (true) {
                    if (i20 < size) {
                        int i21 = size;
                        HashSet hashSet = ((py4) arrayList.get(i20)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i20++;
                        size = i21;
                    } else if (!zArr4[r17] && !zArr4[r19]) {
                        return;
                    }
                }
            } else {
                z6 = z4;
            }
            z7 = this.k;
            if (!z7 || this.l) {
                if (z7) {
                    a9bVar2.d(k, this.Z);
                    a9bVar2.d(k2, this.Z + this.V);
                    if (z6 && (oz4Var2 = this.U) != null) {
                        WeakReference weakReference = oz4Var2.H0;
                        if (weakReference == null || weakReference.get() == null || py4Var10.d() > ((py4) oz4Var2.H0.get()).d()) {
                            oz4Var2.H0 = new WeakReference(py4Var10);
                        }
                        WeakReference weakReference2 = oz4Var2.J0;
                        if (weakReference2 == null || weakReference2.get() == null || py4Var11.d() > ((py4) oz4Var2.J0.get()).d()) {
                            oz4Var2.J0 = new WeakReference(py4Var11);
                        }
                    }
                }
                if (this.l) {
                    a9bVar2.d(k3, this.a0);
                    a9bVar2.d(k4, this.a0 + this.W);
                    HashSet hashSet2 = py4Var14.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        a9bVar2.d(k5, this.a0 + this.b0);
                    }
                    if (z23 && (oz4Var = this.U) != null) {
                        WeakReference weakReference3 = oz4Var.G0;
                        if (weakReference3 == null || weakReference3.get() == null || py4Var12.d() > ((py4) oz4Var.G0.get()).d()) {
                            oz4Var.G0 = new WeakReference(py4Var12);
                        }
                        WeakReference weakReference4 = oz4Var.I0;
                        if (weakReference4 == null || weakReference4.get() == null || py4Var13.d() > ((py4) oz4Var.I0.get()).d()) {
                            oz4Var.I0 = new WeakReference(py4Var13);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z24 = r17;
                    this.k = z24;
                    this.l = z24;
                    return;
                }
            }
            zArr = this.f;
            if (!z && (ad9Var2 = this.d) != null && (x7kVar2 = this.e) != null) {
                py4Var = py4Var14;
                xl6 xl6Var2 = ad9Var2.h;
                zArr2 = zArr;
                if (xl6Var2.j && ad9Var2.i.j && x7kVar2.h.j && x7kVar2.i.j) {
                    a9bVar2.d(k, xl6Var2.g);
                    a9bVar2.d(k2, this.d.i.g);
                    a9bVar2.d(k3, this.e.h.g);
                    a9bVar2.d(k4, this.e.i.g);
                    a9bVar2.d(k5, this.e.k.g);
                    if (this.U != null) {
                        if (z6 && zArr2[0] && !x()) {
                            a9bVar2.f(a9bVar2.k(this.U.K), k2, 0, 8);
                        }
                        if (z23 && zArr2[r19] && !y()) {
                            z21 = false;
                            a9bVar2.f(a9bVar2.k(this.U.L), k4, 0, 8);
                            this.k = z21;
                            this.l = z21;
                            return;
                        }
                    }
                    z21 = false;
                    this.k = z21;
                    this.l = z21;
                    return;
                }
            } else {
                py4Var = py4Var14;
                zArr2 = zArr;
            }
            if (this.U == null) {
                if (w(0)) {
                    this.U.R(this, 0);
                    x = r19;
                    r12 = x;
                } else {
                    x = x();
                    r12 = r19;
                }
                if (w(r12)) {
                    this.U.R(this, r12);
                    y = true;
                } else {
                    y = y();
                }
                if (!x && z6 && this.h0 != 8 && py4Var10.f == null && py4Var11.f == null) {
                    py4Var2 = py4Var10;
                    a9bVar2.f(a9bVar2.k(this.U.K), k2, 0, 1);
                } else {
                    py4Var2 = py4Var10;
                }
                if (!y && z23 && this.h0 != 8 && py4Var12.f == null && py4Var13.f == null && py4Var == null) {
                    a9bVar2.f(a9bVar2.k(this.U.L), k4, 0, 1);
                }
                py4Var3 = py4Var11;
                z8 = z23;
                z10 = y;
                z9 = x;
            } else {
                py4Var2 = py4Var10;
                py4Var3 = py4Var11;
                z8 = z23;
                z9 = false;
                z10 = false;
            }
            i2 = this.V;
            i3 = this.c0;
            if (i2 >= i3) {
                i3 = i2;
            }
            i4 = this.W;
            py4 py4Var15 = py4Var3;
            i5 = this.d0;
            if (i4 >= i5) {
                i6 = i5;
            } else {
                i6 = i4;
            }
            mz4[] mz4VarArr2 = this.T;
            mz4Var = mz4VarArr2[0];
            boolean z25 = z8;
            mz4Var2 = mz4.MATCH_CONSTRAINT;
            if (mz4Var == mz4Var2) {
                z11 = true;
            } else {
                z11 = false;
            }
            mz4Var3 = mz4VarArr2[1];
            if (mz4Var3 == mz4Var2) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i22 = this.Y;
            this.A = i22;
            float f2 = this.X;
            this.B = f2;
            f = f2;
            int i23 = this.r;
            int i24 = this.s;
            if (f <= 0.0f) {
                cehVar = k4;
                if (this.h0 != 8) {
                    if (mz4Var == mz4Var2 && i23 == 0) {
                        i8 = 3;
                    } else {
                        i8 = i23;
                    }
                    if (mz4Var3 == mz4Var2 && i24 == 0) {
                        i18 = 3;
                    } else {
                        i18 = i24;
                    }
                    if (mz4Var == mz4Var2 && mz4Var3 == mz4Var2) {
                        cehVar2 = k5;
                        if (i8 == 3 && i18 == 3) {
                            if (i22 == -1) {
                                if (z11 && !z12) {
                                    this.A = 0;
                                    i22 = 0;
                                } else if (!z11 && z12) {
                                    this.A = 1;
                                    if (i22 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                    i22 = 1;
                                }
                            }
                            if (i22 == 0 && (!py4Var12.h() || !py4Var13.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!py4Var2.h() || !py4Var15.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!py4Var12.h() || !py4Var13.h() || !py4Var2.h() || !py4Var15.h())) {
                                if (py4Var12.h() && py4Var13.h()) {
                                    this.A = 0;
                                } else if (py4Var2.h() && py4Var15.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            int i25 = this.A;
                            if (i25 == -1) {
                                int i26 = this.u;
                                if (i26 > 0 && this.x == 0) {
                                    this.A = 0;
                                    i25 = 0;
                                } else if (i26 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                    i25 = 1;
                                }
                            }
                            i22 = i25;
                            py4Var4 = py4Var;
                            i7 = i6;
                            z13 = true;
                            i9 = i18;
                            int[] iArr3 = this.t;
                            iArr3[0] = i8;
                            iArr3[1] = i9;
                            if (!z13 && (i22 == 0 || i22 == -1)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z13 && (i22 == 1 || i22 == -1)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            mz4Var4 = mz4VarArr2[0];
                            mz4Var5 = mz4.WRAP_CONTENT;
                            if (mz4Var4 != mz4Var5 && (this instanceof oz4)) {
                                mz4Var6 = mz4Var5;
                                z16 = true;
                            } else {
                                mz4Var6 = mz4Var5;
                                z16 = false;
                            }
                            if (z16) {
                                i3 = 0;
                            }
                            py4Var5 = this.P;
                            boolean z26 = !py4Var5.h();
                            boolean z27 = zArr4[0];
                            boolean z28 = zArr4[1];
                            i10 = this.o;
                            iArr = this.C;
                            ceh cehVar16 = null;
                            if (i10 == 2 && !this.k) {
                                if (z && (ad9Var = this.d) != null) {
                                    xl6 xl6Var3 = ad9Var.h;
                                    py4Var9 = py4Var4;
                                    if (xl6Var3.j && ad9Var.i.j) {
                                        if (z) {
                                            a9bVar2.d(k, xl6Var3.g);
                                            a9bVar2.d(k2, this.d.i.g);
                                            if (this.U != null && z6 && zArr2[0] && !x()) {
                                                a9bVar2.f(a9bVar2.k(this.U.K), k2, 0, 8);
                                            }
                                        }
                                        cehVar3 = k;
                                        mz4Var7 = mz4Var2;
                                        cehVar4 = k2;
                                        mz4Var8 = mz4Var6;
                                        py4Var7 = py4Var5;
                                        z17 = z9;
                                        iArr2 = iArr;
                                        z18 = z6;
                                        py4Var6 = py4Var9;
                                    }
                                } else {
                                    py4Var9 = py4Var4;
                                }
                                oz4 oz4Var5 = this.U;
                                if (oz4Var5 != null) {
                                    cehVar14 = a9bVar2.k(oz4Var5.K);
                                } else {
                                    cehVar14 = null;
                                }
                                oz4 oz4Var6 = this.U;
                                if (oz4Var6 != null) {
                                    cehVar15 = a9bVar2.k(oz4Var6.I);
                                } else {
                                    cehVar15 = null;
                                }
                                boolean z29 = zArr2[0];
                                z18 = z6;
                                i11 = i8;
                                mz4 mz4Var11 = mz4VarArr2[0];
                                z17 = z9;
                                int i27 = this.Z;
                                int i28 = this.c0;
                                iArr2 = iArr;
                                int i29 = iArr2[0];
                                float f3 = this.e0;
                                if (mz4VarArr2[1] == mz4Var2) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                py4Var7 = py4Var5;
                                mz4Var7 = mz4Var2;
                                cehVar4 = k2;
                                py4Var6 = py4Var9;
                                cehVar3 = k;
                                z19 = z25;
                                cehVar7 = k3;
                                py4Var8 = py4Var13;
                                cehVar6 = cehVar;
                                cehVar5 = cehVar2;
                                mz4Var8 = mz4Var6;
                                zArr3 = zArr2;
                                a9bVar2 = a9bVar;
                                d(a9bVar2, true, z18, z19, z29, cehVar15, cehVar14, mz4Var11, z16, this.I, this.K, i27, i3, i28, i29, f3, z14, z20, z17, z10, z27, i11, i9, this.u, this.v, this.w, z26);
                                if (z && (x7kVar = this.e) != null) {
                                    xl6Var = x7kVar.h;
                                    if (xl6Var.j && x7kVar.i.j) {
                                        int i30 = xl6Var.g;
                                        cehVar8 = cehVar7;
                                        a9bVar2.d(cehVar8, i30);
                                        cehVar9 = cehVar6;
                                        a9bVar2.d(cehVar9, this.e.i.g);
                                        cehVar10 = cehVar5;
                                        a9bVar2.d(cehVar10, this.e.k.g);
                                        oz4Var3 = this.U;
                                        if (oz4Var3 == null && !z10 && z19) {
                                            i14 = 1;
                                            if (zArr3[1]) {
                                                i12 = 0;
                                                i13 = 8;
                                                a9bVar2.f(a9bVar2.k(oz4Var3.L), cehVar9, 0, 8);
                                            } else {
                                                i12 = 0;
                                                i13 = 8;
                                            }
                                        } else {
                                            i12 = 0;
                                            i13 = 8;
                                            i14 = 1;
                                        }
                                        i15 = i12;
                                        if (this.p == 2) {
                                            i15 = i12;
                                        }
                                        if (i15 == 0 && !this.l) {
                                            if (mz4VarArr2[i14] == mz4Var8 && (this instanceof oz4)) {
                                                i16 = i14;
                                            } else {
                                                i16 = i12;
                                            }
                                            if (i16 != 0) {
                                                i17 = i12;
                                            } else {
                                                i17 = i7;
                                            }
                                            oz4 oz4Var7 = this.U;
                                            if (oz4Var7 != null) {
                                                cehVar13 = a9bVar2.k(oz4Var7.L);
                                            } else {
                                                cehVar13 = null;
                                            }
                                            oz4 oz4Var8 = this.U;
                                            if (oz4Var8 != null) {
                                                cehVar16 = a9bVar2.k(oz4Var8.J);
                                            }
                                            int i31 = this.b0;
                                            if (i31 <= 0) {
                                                r27 = z26;
                                            }
                                            py4 py4Var16 = py4Var6;
                                            if (py4Var16.f != null) {
                                                a9bVar2.e(cehVar10, cehVar8, i31, i13);
                                                a9bVar2.e(cehVar10, a9bVar2.k(py4Var16.f), py4Var16.e(), i13);
                                                if (z19) {
                                                    a9bVar2.f(cehVar13, a9bVar2.k(py4Var8), i12, 5);
                                                }
                                                r27 = i12;
                                            } else if (this.h0 == i13) {
                                                a9bVar2.e(cehVar10, cehVar8, py4Var16.e(), i13);
                                                r27 = z26;
                                            } else {
                                                a9bVar2.e(cehVar10, cehVar8, i31, i13);
                                                r27 = z26;
                                            }
                                            boolean z30 = zArr3[i14];
                                            int i32 = i12;
                                            mz4 mz4Var12 = mz4VarArr2[i14];
                                            int i33 = this.a0;
                                            int i34 = i14;
                                            int i35 = this.d0;
                                            int i36 = iArr2[i34];
                                            float f4 = this.f0;
                                            if (mz4VarArr2[i32] == mz4Var7) {
                                                r18 = i34;
                                            } else {
                                                r18 = i32;
                                            }
                                            cehVar12 = cehVar9;
                                            cehVar11 = cehVar8;
                                            a9bVar2 = a9bVar;
                                            d(a9bVar2, false, z19, z18, z30, cehVar16, cehVar13, mz4Var12, i16, this.J, this.L, i33, i17, i35, i36, f4, z15, r18, z10, z17, z28, i9, i11, this.x, this.y, this.z, r27);
                                        } else {
                                            cehVar11 = cehVar8;
                                            cehVar12 = cehVar9;
                                        }
                                        if (z13) {
                                            int i37 = this.A;
                                            float f5 = this.B;
                                            if (i37 == 1) {
                                                jl0 l = a9bVar2.l();
                                                l.d.g(cehVar12, -1.0f);
                                                l.d.g(cehVar11, 1.0f);
                                                l.d.g(cehVar4, f5);
                                                l.d.g(cehVar3, -f5);
                                                a9bVar2.c(l);
                                            } else {
                                                jl0 l2 = a9bVar2.l();
                                                l2.d.g(cehVar4, -1.0f);
                                                l2.d.g(cehVar3, 1.0f);
                                                l2.d.g(cehVar12, f5);
                                                l2.d.g(cehVar11, -f5);
                                                a9bVar2.c(l2);
                                            }
                                        }
                                        if (py4Var7.h()) {
                                            py4 py4Var17 = py4Var7;
                                            nz4 nz4Var = py4Var17.f.d;
                                            float radians = (float) Math.toRadians(this.D + 90.0f);
                                            int e = py4Var17.e();
                                            oy4 oy4Var = oy4.LEFT;
                                            ceh k6 = a9bVar2.k(i(oy4Var));
                                            oy4 oy4Var2 = oy4.TOP;
                                            ceh k7 = a9bVar2.k(i(oy4Var2));
                                            oy4 oy4Var3 = oy4.RIGHT;
                                            ceh k8 = a9bVar2.k(i(oy4Var3));
                                            oy4 oy4Var4 = oy4.BOTTOM;
                                            ceh k9 = a9bVar2.k(i(oy4Var4));
                                            ceh k10 = a9bVar2.k(nz4Var.i(oy4Var));
                                            ceh k11 = a9bVar2.k(nz4Var.i(oy4Var2));
                                            ceh k12 = a9bVar2.k(nz4Var.i(oy4Var3));
                                            ceh k13 = a9bVar2.k(nz4Var.i(oy4Var4));
                                            jl0 l3 = a9bVar2.l();
                                            double d = radians;
                                            double sin = Math.sin(d);
                                            double d2 = e;
                                            l3.d.g(k11, 0.5f);
                                            l3.d.g(k13, 0.5f);
                                            l3.d.g(k7, -0.5f);
                                            l3.d.g(k9, -0.5f);
                                            l3.b = -((float) (sin * d2));
                                            a9bVar2.c(l3);
                                            jl0 l4 = a9bVar2.l();
                                            float cos = (float) (Math.cos(d) * d2);
                                            l4.d.g(k10, 0.5f);
                                            l4.d.g(k12, 0.5f);
                                            l4.d.g(k6, -0.5f);
                                            l4.d.g(k8, -0.5f);
                                            l4.b = -cos;
                                            a9bVar2.c(l4);
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                }
                                cehVar8 = cehVar7;
                                cehVar9 = cehVar6;
                                cehVar10 = cehVar5;
                                i12 = 0;
                                i13 = 8;
                                i14 = 1;
                                i15 = 1;
                                if (this.p == 2) {
                                }
                                if (i15 == 0) {
                                }
                                cehVar11 = cehVar8;
                                cehVar12 = cehVar9;
                                if (z13) {
                                }
                                if (py4Var7.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            py4Var6 = py4Var4;
                            cehVar3 = k;
                            mz4Var7 = mz4Var2;
                            cehVar4 = k2;
                            mz4Var8 = mz4Var6;
                            py4Var7 = py4Var5;
                            z17 = z9;
                            iArr2 = iArr;
                            z18 = z6;
                            z19 = z25;
                            cehVar7 = k3;
                            py4Var8 = py4Var13;
                            cehVar6 = cehVar;
                            cehVar5 = cehVar2;
                            i11 = i8;
                            zArr3 = zArr2;
                            if (z) {
                                xl6Var = x7kVar.h;
                                if (xl6Var.j) {
                                    int i302 = xl6Var.g;
                                    cehVar8 = cehVar7;
                                    a9bVar2.d(cehVar8, i302);
                                    cehVar9 = cehVar6;
                                    a9bVar2.d(cehVar9, this.e.i.g);
                                    cehVar10 = cehVar5;
                                    a9bVar2.d(cehVar10, this.e.k.g);
                                    oz4Var3 = this.U;
                                    if (oz4Var3 == null) {
                                    }
                                    i12 = 0;
                                    i13 = 8;
                                    i14 = 1;
                                    i15 = i12;
                                    if (this.p == 2) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    cehVar11 = cehVar8;
                                    cehVar12 = cehVar9;
                                    if (z13) {
                                    }
                                    if (py4Var7.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                            }
                            cehVar8 = cehVar7;
                            cehVar9 = cehVar6;
                            cehVar10 = cehVar5;
                            i12 = 0;
                            i13 = 8;
                            i14 = 1;
                            i15 = 1;
                            if (this.p == 2) {
                            }
                            if (i15 == 0) {
                            }
                            cehVar11 = cehVar8;
                            cehVar12 = cehVar9;
                            if (z13) {
                            }
                            if (py4Var7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        cehVar2 = k5;
                    }
                    if (mz4Var == mz4Var2 && i8 == 3) {
                        this.A = 0;
                        i3 = (int) (i4 * f);
                        py4Var4 = py4Var;
                        i7 = i6;
                        i22 = 0;
                        if (mz4Var3 != mz4Var2) {
                            i8 = 4;
                            z13 = false;
                            i9 = i18;
                            int[] iArr32 = this.t;
                            iArr32[0] = i8;
                            iArr32[1] = i9;
                            if (!z13) {
                            }
                            z14 = false;
                            if (!z13) {
                            }
                            z15 = false;
                            mz4Var4 = mz4VarArr2[0];
                            mz4Var5 = mz4.WRAP_CONTENT;
                            if (mz4Var4 != mz4Var5) {
                            }
                            mz4Var6 = mz4Var5;
                            z16 = false;
                            if (z16) {
                            }
                            py4Var5 = this.P;
                            boolean z262 = !py4Var5.h();
                            boolean z272 = zArr4[0];
                            boolean z282 = zArr4[1];
                            i10 = this.o;
                            iArr = this.C;
                            ceh cehVar162 = null;
                            if (i10 == 2) {
                            }
                            py4Var6 = py4Var4;
                            cehVar3 = k;
                            mz4Var7 = mz4Var2;
                            cehVar4 = k2;
                            mz4Var8 = mz4Var6;
                            py4Var7 = py4Var5;
                            z17 = z9;
                            iArr2 = iArr;
                            z18 = z6;
                            z19 = z25;
                            cehVar7 = k3;
                            py4Var8 = py4Var13;
                            cehVar6 = cehVar;
                            cehVar5 = cehVar2;
                            i11 = i8;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            cehVar8 = cehVar7;
                            cehVar9 = cehVar6;
                            cehVar10 = cehVar5;
                            i12 = 0;
                            i13 = 8;
                            i14 = 1;
                            i15 = 1;
                            if (this.p == 2) {
                            }
                            if (i15 == 0) {
                            }
                            cehVar11 = cehVar8;
                            cehVar12 = cehVar9;
                            if (z13) {
                            }
                            if (py4Var7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        if (mz4Var3 == mz4Var2 && i18 == 3) {
                            this.A = 1;
                            if (i22 == -1) {
                                float f6 = 1.0f / f;
                                this.B = f6;
                                f = f6;
                            }
                            i7 = (int) (i2 * f);
                            if (mz4Var != mz4Var2) {
                                py4Var4 = py4Var;
                                i22 = 1;
                                i9 = 4;
                                z13 = false;
                                int[] iArr322 = this.t;
                                iArr322[0] = i8;
                                iArr322[1] = i9;
                                if (!z13) {
                                }
                                z14 = false;
                                if (!z13) {
                                }
                                z15 = false;
                                mz4Var4 = mz4VarArr2[0];
                                mz4Var5 = mz4.WRAP_CONTENT;
                                if (mz4Var4 != mz4Var5) {
                                }
                                mz4Var6 = mz4Var5;
                                z16 = false;
                                if (z16) {
                                }
                                py4Var5 = this.P;
                                boolean z2622 = !py4Var5.h();
                                boolean z2722 = zArr4[0];
                                boolean z2822 = zArr4[1];
                                i10 = this.o;
                                iArr = this.C;
                                ceh cehVar1622 = null;
                                if (i10 == 2) {
                                }
                                py4Var6 = py4Var4;
                                cehVar3 = k;
                                mz4Var7 = mz4Var2;
                                cehVar4 = k2;
                                mz4Var8 = mz4Var6;
                                py4Var7 = py4Var5;
                                z17 = z9;
                                iArr2 = iArr;
                                z18 = z6;
                                z19 = z25;
                                cehVar7 = k3;
                                py4Var8 = py4Var13;
                                cehVar6 = cehVar;
                                cehVar5 = cehVar2;
                                i11 = i8;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                cehVar8 = cehVar7;
                                cehVar9 = cehVar6;
                                cehVar10 = cehVar5;
                                i12 = 0;
                                i13 = 8;
                                i14 = 1;
                                i15 = 1;
                                if (this.p == 2) {
                                }
                                if (i15 == 0) {
                                }
                                cehVar11 = cehVar8;
                                cehVar12 = cehVar9;
                                if (z13) {
                                }
                                if (py4Var7.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            py4Var4 = py4Var;
                            i22 = 1;
                        }
                        py4Var4 = py4Var;
                        i7 = i6;
                    }
                    z13 = true;
                    i9 = i18;
                    int[] iArr3222 = this.t;
                    iArr3222[0] = i8;
                    iArr3222[1] = i9;
                    if (!z13) {
                    }
                    z14 = false;
                    if (!z13) {
                    }
                    z15 = false;
                    mz4Var4 = mz4VarArr2[0];
                    mz4Var5 = mz4.WRAP_CONTENT;
                    if (mz4Var4 != mz4Var5) {
                    }
                    mz4Var6 = mz4Var5;
                    z16 = false;
                    if (z16) {
                    }
                    py4Var5 = this.P;
                    boolean z26222 = !py4Var5.h();
                    boolean z27222 = zArr4[0];
                    boolean z28222 = zArr4[1];
                    i10 = this.o;
                    iArr = this.C;
                    ceh cehVar16222 = null;
                    if (i10 == 2) {
                    }
                    py4Var6 = py4Var4;
                    cehVar3 = k;
                    mz4Var7 = mz4Var2;
                    cehVar4 = k2;
                    mz4Var8 = mz4Var6;
                    py4Var7 = py4Var5;
                    z17 = z9;
                    iArr2 = iArr;
                    z18 = z6;
                    z19 = z25;
                    cehVar7 = k3;
                    py4Var8 = py4Var13;
                    cehVar6 = cehVar;
                    cehVar5 = cehVar2;
                    i11 = i8;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    cehVar8 = cehVar7;
                    cehVar9 = cehVar6;
                    cehVar10 = cehVar5;
                    i12 = 0;
                    i13 = 8;
                    i14 = 1;
                    i15 = 1;
                    if (this.p == 2) {
                    }
                    if (i15 == 0) {
                    }
                    cehVar11 = cehVar8;
                    cehVar12 = cehVar9;
                    if (z13) {
                    }
                    if (py4Var7.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                cehVar = k4;
            }
            cehVar2 = k5;
            py4Var4 = py4Var;
            i7 = i6;
            i8 = i23;
            i9 = i24;
            z13 = false;
            int[] iArr32222 = this.t;
            iArr32222[0] = i8;
            iArr32222[1] = i9;
            if (!z13) {
            }
            z14 = false;
            if (!z13) {
            }
            z15 = false;
            mz4Var4 = mz4VarArr2[0];
            mz4Var5 = mz4.WRAP_CONTENT;
            if (mz4Var4 != mz4Var5) {
            }
            mz4Var6 = mz4Var5;
            z16 = false;
            if (z16) {
            }
            py4Var5 = this.P;
            boolean z262222 = !py4Var5.h();
            boolean z272222 = zArr4[0];
            boolean z282222 = zArr4[1];
            i10 = this.o;
            iArr = this.C;
            ceh cehVar162222 = null;
            if (i10 == 2) {
            }
            py4Var6 = py4Var4;
            cehVar3 = k;
            mz4Var7 = mz4Var2;
            cehVar4 = k2;
            mz4Var8 = mz4Var6;
            py4Var7 = py4Var5;
            z17 = z9;
            iArr2 = iArr;
            z18 = z6;
            z19 = z25;
            cehVar7 = k3;
            py4Var8 = py4Var13;
            cehVar6 = cehVar;
            cehVar5 = cehVar2;
            i11 = i8;
            zArr3 = zArr2;
            if (z) {
            }
            cehVar8 = cehVar7;
            cehVar9 = cehVar6;
            cehVar10 = cehVar5;
            i12 = 0;
            i13 = 8;
            i14 = 1;
            i15 = 1;
            if (this.p == 2) {
            }
            if (i15 == 0) {
            }
            cehVar11 = cehVar8;
            cehVar12 = cehVar9;
            if (z13) {
            }
            if (py4Var7.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = true;
        z3 = false;
        z5 = z3 ? 1 : 0;
        z4 = z5;
        r17 = z3;
        r19 = z2;
        i = this.h0;
        boolean[] zArr42 = this.S;
        boolean z232 = z5;
        if (i != 8) {
        }
        z7 = this.k;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z242 = r17;
            this.k = z242;
            this.l = z242;
            return;
        }
        zArr = this.f;
        if (!z) {
        }
        py4Var = py4Var14;
        zArr2 = zArr;
        if (this.U == null) {
        }
        i2 = this.V;
        i3 = this.c0;
        if (i2 >= i3) {
        }
        i4 = this.W;
        py4 py4Var152 = py4Var3;
        i5 = this.d0;
        if (i4 >= i5) {
        }
        mz4[] mz4VarArr22 = this.T;
        mz4Var = mz4VarArr22[0];
        boolean z252 = z8;
        mz4Var2 = mz4.MATCH_CONSTRAINT;
        if (mz4Var == mz4Var2) {
        }
        mz4Var3 = mz4VarArr22[1];
        if (mz4Var3 == mz4Var2) {
        }
        int i222 = this.Y;
        this.A = i222;
        float f22 = this.X;
        this.B = f22;
        f = f22;
        int i232 = this.r;
        int i242 = this.s;
        if (f <= 0.0f) {
        }
        cehVar2 = k5;
        py4Var4 = py4Var;
        i7 = i6;
        i8 = i232;
        i9 = i242;
        z13 = false;
        int[] iArr322222 = this.t;
        iArr322222[0] = i8;
        iArr322222[1] = i9;
        if (!z13) {
        }
        z14 = false;
        if (!z13) {
        }
        z15 = false;
        mz4Var4 = mz4VarArr22[0];
        mz4Var5 = mz4.WRAP_CONTENT;
        if (mz4Var4 != mz4Var5) {
        }
        mz4Var6 = mz4Var5;
        z16 = false;
        if (z16) {
        }
        py4Var5 = this.P;
        boolean z2622222 = !py4Var5.h();
        boolean z2722222 = zArr42[0];
        boolean z2822222 = zArr42[1];
        i10 = this.o;
        iArr = this.C;
        ceh cehVar1622222 = null;
        if (i10 == 2) {
        }
        py4Var6 = py4Var4;
        cehVar3 = k;
        mz4Var7 = mz4Var2;
        cehVar4 = k2;
        mz4Var8 = mz4Var6;
        py4Var7 = py4Var5;
        z17 = z9;
        iArr2 = iArr;
        z18 = z6;
        z19 = z252;
        cehVar7 = k3;
        py4Var8 = py4Var13;
        cehVar6 = cehVar;
        cehVar5 = cehVar2;
        i11 = i8;
        zArr3 = zArr2;
        if (z) {
        }
        cehVar8 = cehVar7;
        cehVar9 = cehVar6;
        cehVar10 = cehVar5;
        i12 = 0;
        i13 = 8;
        i14 = 1;
        i15 = 1;
        if (this.p == 2) {
        }
        if (i15 == 0) {
        }
        cehVar11 = cehVar8;
        cehVar12 = cehVar9;
        if (z13) {
        }
        if (py4Var7.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        if (this.h0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(a9b a9bVar, boolean z, boolean z2, boolean z3, boolean z4, ceh cehVar, ceh cehVar2, mz4 mz4Var, boolean z5, py4 py4Var, py4 py4Var2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        ceh k;
        ceh k2;
        py4 py4Var3;
        ceh cehVar3;
        boolean z14;
        int i12;
        ceh cehVar4;
        ceh cehVar5;
        ceh cehVar6;
        ceh cehVar7;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        nz4 nz4Var;
        int i16;
        int i17;
        py4 py4Var4;
        boolean z19;
        int i18;
        boolean z20;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        a9b a9bVar2 = a9bVar;
        int i28 = i7;
        int i29 = i8;
        ceh k3 = a9bVar2.k(py4Var);
        ceh k4 = a9bVar2.k(py4Var2);
        ceh k5 = a9bVar2.k(py4Var.f);
        ceh k6 = a9bVar2.k(py4Var2.f);
        boolean h = py4Var.h();
        boolean h2 = py4Var2.h();
        boolean h3 = this.P.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i5;
        int ordinal = mz4Var.ordinal();
        boolean z24 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 != -1 && z) {
            this.h = -1;
            i2 = i33;
            z24 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            i34 = i2;
        } else {
            this.i = -1;
            z24 = false;
        }
        int i35 = i34;
        if (this.h0 == 8) {
            z24 = false;
            i9 = 0;
        } else {
            i9 = i35;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                a9bVar2.d(k3, i);
            } else if (h && !h2) {
                z12 = z24;
                i10 = 8;
                a9bVar2.e(k3, k5, py4Var.e(), 8);
            }
            z12 = z24;
            i10 = 8;
        } else {
            z12 = z24;
            i10 = 8;
        }
        if (z12) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i29 == -2) {
                    i29 = i9;
                }
                if (i9 > 0 && i32 != 1) {
                    i9 = 0;
                }
                if (i28 > 0) {
                    a9bVar2.f(k4, k3, i28, 8);
                    i9 = Math.max(i9, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        a9bVar2.g(k4, k3, i29, 8);
                    }
                    i9 = Math.min(i9, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        a9bVar2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        a9bVar2.e(k4, k3, i9, 5);
                        a9bVar2.g(k4, k3, i9, 8);
                    } else {
                        a9bVar2.e(k4, k3, i9, 5);
                        a9bVar2.g(k4, k3, i9, 8);
                    }
                } else if (i32 == 2) {
                    oy4 oy4Var = py4Var.e;
                    oy4 oy4Var2 = oy4.TOP;
                    if (oy4Var != oy4Var2 && oy4Var != oy4.BOTTOM) {
                        k = a9bVar2.k(this.U.i(oy4.LEFT));
                        k2 = a9bVar2.k(this.U.i(oy4.RIGHT));
                    } else {
                        k = a9bVar2.k(this.U.i(oy4Var2));
                        k2 = a9bVar2.k(this.U.i(oy4.BOTTOM));
                    }
                    jl0 l = a9bVar2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    a9bVar2.c(l);
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                    i11 = i36;
                } else {
                    i11 = i28;
                    z13 = true;
                }
            } else {
                int max = Math.max(i28, i9);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                a9bVar2.e(k4, k3, max, 8);
                z13 = z4;
                i11 = i28;
                z12 = false;
            }
            if (z11 || z8) {
                boolean z25 = z13;
                if (i31 >= 2 && z2 && z25) {
                    a9bVar2.f(k3, cehVar, 0, 8);
                    py4 py4Var5 = this.M;
                    boolean z26 = z || py4Var5.f == null;
                    if (!z && (py4Var3 = py4Var5.f) != null) {
                        nz4 nz4Var2 = py4Var3.d;
                        if (nz4Var2.X != 0.0f) {
                            mz4[] mz4VarArr = nz4Var2.T;
                            mz4 mz4Var2 = mz4VarArr[0];
                            mz4 mz4Var3 = mz4.MATCH_CONSTRAINT;
                            if (mz4Var2 == mz4Var3 && mz4VarArr[1] == mz4Var3) {
                                z26 = true;
                            }
                        }
                        z26 = false;
                    }
                    if (z26) {
                        a9bVar2.f(cehVar2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                py4Var4 = py4Var2;
                cehVar6 = k4;
                z14 = z13;
                cehVar3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    cehVar3 = k6;
                    if (h && h2) {
                        nz4 nz4Var3 = py4Var.f.d;
                        nz4 nz4Var4 = py4Var2.f.d;
                        z14 = z13;
                        oz4 oz4Var = this.U;
                        int i37 = 6;
                        if (z12) {
                            if (i32 == 0) {
                                if (i29 != 0 || i11 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z22 = true;
                                    z23 = false;
                                    z16 = true;
                                } else if (k5.f && cehVar3.f) {
                                    a9bVar2.e(k3, k5, py4Var.e(), 8);
                                    a9bVar2.e(k4, cehVar3, -py4Var2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z22 = false;
                                    z23 = true;
                                    z16 = false;
                                }
                                if ((nz4Var3 instanceof a81) || (nz4Var4 instanceof a81)) {
                                    i14 = i25;
                                    cehVar7 = k5;
                                    a9bVar2 = a9bVar;
                                    i12 = i32;
                                    cehVar5 = k3;
                                    cehVar6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    cehVar4 = cehVar2;
                                    z15 = z22;
                                    i15 = 4;
                                    if (z16 || cehVar7 != cehVar3 || nz4Var3 == oz4Var) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        nz4Var = nz4Var4;
                                        i16 = i11;
                                        i17 = i12;
                                        py4Var4 = py4Var2;
                                        z19 = z2;
                                    } else {
                                        if (z12 || z7 || z9 || cehVar7 != cehVar || cehVar3 != cehVar4) {
                                            z19 = z2;
                                            z21 = z18;
                                            i21 = i14;
                                            i22 = i13;
                                        } else {
                                            i22 = 8;
                                            z19 = false;
                                            i21 = 8;
                                            z21 = false;
                                        }
                                        ceh cehVar8 = cehVar7;
                                        i16 = i11;
                                        i17 = i12;
                                        nz4Var = nz4Var4;
                                        py4Var4 = py4Var2;
                                        a9bVar2.b(cehVar5, cehVar8, py4Var.e(), f, cehVar3, cehVar6, py4Var2.e(), i22);
                                        cehVar7 = cehVar8;
                                        i14 = i21;
                                        z18 = z21;
                                    }
                                    if (this.h0 != 8 && ((hashSet = py4Var4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z16) {
                                        if (z19 && cehVar7 != cehVar3 && !z12 && ((nz4Var3 instanceof a81) || (nz4Var instanceof a81))) {
                                            i14 = 6;
                                        }
                                        a9bVar2.f(cehVar5, cehVar7, py4Var.e(), i14);
                                        a9bVar2.g(cehVar6, cehVar3, -py4Var4.e(), i14);
                                    }
                                    if (z19 || !z10 || (nz4Var3 instanceof a81) || (nz4Var instanceof a81) || nz4Var == oz4Var) {
                                        i18 = i15;
                                        z20 = z18;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z17 && (!z9 || z3)) {
                                            if (nz4Var3 != oz4Var && nz4Var != oz4Var) {
                                                i37 = i18;
                                            }
                                            if ((nz4Var3 instanceof s19) || (nz4Var instanceof s19)) {
                                                i37 = 5;
                                            }
                                            if ((nz4Var3 instanceof a81) || (nz4Var instanceof a81)) {
                                                i37 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i37, i18);
                                        }
                                        if (z19) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (nz4Var3 == oz4Var || nz4Var == oz4Var)) {
                                                i20 = 4;
                                                a9bVar2.e(cehVar5, cehVar7, py4Var.e(), i20);
                                                a9bVar2.e(cehVar6, cehVar3, -py4Var4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        a9bVar2.e(cehVar5, cehVar7, py4Var.e(), i20);
                                        a9bVar2.e(cehVar6, cehVar3, -py4Var4.e(), i20);
                                    }
                                    if (z19) {
                                        int e = cehVar == cehVar7 ? py4Var.e() : 0;
                                        if (cehVar7 != cehVar) {
                                            a9bVar2.f(cehVar5, cehVar, e, 5);
                                        }
                                    }
                                    if (z19 && z12 && i3 == 0 && i16 == 0) {
                                        if (!z12 && i17 == 3) {
                                            a9bVar2.f(cehVar6, cehVar5, 0, 8);
                                        } else {
                                            i19 = 5;
                                            a9bVar2.f(cehVar6, cehVar5, 0, 5);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    i14 = i25;
                                    cehVar7 = k5;
                                    a9bVar2 = a9bVar;
                                    cehVar5 = k3;
                                    cehVar6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z15 = z22;
                                    i15 = i26;
                                    i12 = i32;
                                    cehVar4 = cehVar2;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                        if (!z12) {
                                        }
                                        i19 = 5;
                                        a9bVar2.f(cehVar6, cehVar5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((nz4Var3 instanceof a81) || (nz4Var4 instanceof a81)) {
                                        a9bVar2 = a9bVar;
                                        i12 = i32;
                                        cehVar5 = k3;
                                        cehVar6 = k4;
                                        cehVar7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        a9bVar2 = a9bVar;
                                        i12 = i32;
                                        cehVar5 = k3;
                                        cehVar6 = k4;
                                        cehVar7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z15 = true;
                                        z16 = true;
                                        z17 = false;
                                        cehVar4 = cehVar2;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i32 == 1) {
                                    a9bVar2 = a9bVar;
                                    i12 = i32;
                                    cehVar5 = k3;
                                    cehVar6 = k4;
                                    cehVar7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i32 == 3) {
                                    i12 = i32;
                                    if (this.A == -1) {
                                        if (z9) {
                                            a9bVar2 = a9bVar;
                                            cehVar4 = cehVar2;
                                            cehVar5 = k3;
                                            cehVar6 = k4;
                                            cehVar7 = k5;
                                            i13 = z2 ? 5 : 4;
                                        } else {
                                            a9bVar2 = a9bVar;
                                            cehVar4 = cehVar2;
                                            cehVar5 = k3;
                                            cehVar6 = k4;
                                            cehVar7 = k5;
                                            i13 = 8;
                                        }
                                        i14 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i15 = i24;
                                            cehVar5 = k3;
                                            cehVar6 = k4;
                                            cehVar7 = k5;
                                            i13 = 6;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            cehVar4 = cehVar2;
                                        } else if (i29 > 0) {
                                            a9bVar2 = a9bVar;
                                            cehVar4 = cehVar2;
                                            cehVar5 = k3;
                                            cehVar6 = k4;
                                            cehVar7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i29 != 0 || i11 != 0) {
                                                a9bVar2 = a9bVar;
                                                cehVar4 = cehVar2;
                                                cehVar5 = k3;
                                                cehVar6 = k4;
                                                cehVar7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i23 = (nz4Var3 == oz4Var || nz4Var4 == oz4Var) ? 5 : 4;
                                                cehVar4 = cehVar2;
                                                cehVar5 = k3;
                                                cehVar6 = k4;
                                                cehVar7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else {
                                                a9bVar2 = a9bVar;
                                                cehVar4 = cehVar2;
                                                cehVar5 = k3;
                                                cehVar6 = k4;
                                                cehVar7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            if (z16) {
                                            }
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.h0 != 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z19) {
                                            }
                                            i18 = i15;
                                            z20 = z18;
                                            if (z20) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i23;
                                        a9bVar2 = a9bVar;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                    i15 = 5;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i32;
                                    a9bVar2 = a9bVar;
                                    cehVar4 = cehVar2;
                                    cehVar5 = k3;
                                    cehVar6 = k4;
                                    cehVar7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z15 = false;
                                    z16 = false;
                                }
                                i15 = 4;
                                z15 = true;
                                z16 = true;
                                z17 = false;
                                cehVar4 = cehVar2;
                                if (z16) {
                                }
                                z18 = true;
                                if (z15) {
                                }
                                if (this.h0 != 8) {
                                }
                                if (z16) {
                                }
                                if (z19) {
                                }
                                i18 = i15;
                                z20 = z18;
                                if (z20) {
                                }
                                if (z19) {
                                }
                                if (z19) {
                                }
                                i19 = 5;
                            }
                            i27 = i19;
                            if (z19 && z14) {
                                int e2 = py4Var4.f != null ? py4Var4.e() : 0;
                                if (cehVar3 != cehVar2) {
                                    a9bVar2.f(cehVar2, cehVar6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i32;
                        if (k5.f && cehVar3.f) {
                            a9bVar.b(k3, k5, py4Var.e(), f, cehVar3, k4, py4Var2.e(), 8);
                            if (z2 && z14) {
                                int e3 = py4Var2.f != null ? py4Var2.e() : 0;
                                if (cehVar3 != cehVar2) {
                                    a9bVar.f(cehVar2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        a9bVar2 = a9bVar;
                        cehVar4 = cehVar2;
                        cehVar5 = k3;
                        cehVar6 = k4;
                        cehVar7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z15 = true;
                        z16 = true;
                        z17 = false;
                        if (z16) {
                        }
                        z18 = true;
                        if (z15) {
                        }
                        if (this.h0 != 8) {
                        }
                        if (z16) {
                        }
                        if (z19) {
                        }
                        i18 = i15;
                        z20 = z18;
                        if (z20) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                        i19 = 5;
                        i27 = i19;
                        if (z19) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    cehVar3 = k6;
                    a9bVar2.e(k4, cehVar3, -py4Var2.e(), 8);
                    if (z2) {
                        a9bVar2.f(k3, cehVar, 0, 5);
                        py4Var4 = py4Var2;
                        i19 = 5;
                        cehVar6 = k4;
                        z14 = z13;
                        z19 = z2;
                        i27 = i19;
                        if (z19) {
                        }
                    }
                }
                py4Var4 = py4Var2;
                cehVar6 = k4;
                z14 = z13;
            } else {
                py4Var4 = py4Var2;
                cehVar6 = k4;
                z14 = z13;
                cehVar3 = k6;
                z19 = z2;
                i27 = (z2 && (py4Var.f.d instanceof a81)) ? 8 : 5;
                if (z19) {
                }
            }
            i19 = 5;
            z19 = z2;
            i27 = i19;
            if (z19) {
            }
        } else if (z5) {
            a9bVar2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                a9bVar2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                a9bVar2.g(k4, k3, i4, i10);
            }
        } else {
            a9bVar2.e(k4, k3, i9, i10);
        }
        z13 = z4;
        i11 = i28;
        if (z11) {
        }
        boolean z252 = z13;
        if (i31 >= 2) {
        }
    }

    public final void e(oy4 oy4Var, nz4 nz4Var, oy4 oy4Var2, int i) {
        oy4 oy4Var3;
        oy4 oy4Var4;
        boolean z;
        oy4 oy4Var5 = oy4.CENTER;
        if (oy4Var == oy4Var5) {
            if (oy4Var2 == oy4Var5) {
                oy4 oy4Var6 = oy4.LEFT;
                py4 i2 = i(oy4Var6);
                oy4 oy4Var7 = oy4.RIGHT;
                py4 i3 = i(oy4Var7);
                oy4 oy4Var8 = oy4.TOP;
                py4 i4 = i(oy4Var8);
                oy4 oy4Var9 = oy4.BOTTOM;
                py4 i5 = i(oy4Var9);
                boolean z2 = true;
                if ((i2 != null && i2.h()) || (i3 != null && i3.h())) {
                    z = false;
                } else {
                    e(oy4Var6, nz4Var, oy4Var6, 0);
                    e(oy4Var7, nz4Var, oy4Var7, 0);
                    z = true;
                }
                if ((i4 != null && i4.h()) || (i5 != null && i5.h())) {
                    z2 = false;
                } else {
                    e(oy4Var8, nz4Var, oy4Var8, 0);
                    e(oy4Var9, nz4Var, oy4Var9, 0);
                }
                if (z && z2) {
                    i(oy4Var5).a(nz4Var.i(oy4Var5), 0);
                    return;
                }
                if (z) {
                    oy4 oy4Var10 = oy4.CENTER_X;
                    i(oy4Var10).a(nz4Var.i(oy4Var10), 0);
                    return;
                } else {
                    if (z2) {
                        oy4 oy4Var11 = oy4.CENTER_Y;
                        i(oy4Var11).a(nz4Var.i(oy4Var11), 0);
                        return;
                    }
                    return;
                }
            }
            oy4 oy4Var12 = oy4.LEFT;
            if (oy4Var2 != oy4Var12 && oy4Var2 != oy4.RIGHT) {
                oy4 oy4Var13 = oy4.TOP;
                if (oy4Var2 == oy4Var13 || oy4Var2 == oy4.BOTTOM) {
                    e(oy4Var13, nz4Var, oy4Var2, 0);
                    e(oy4.BOTTOM, nz4Var, oy4Var2, 0);
                    i(oy4Var5).a(nz4Var.i(oy4Var2), 0);
                    return;
                }
                return;
            }
            e(oy4Var12, nz4Var, oy4Var2, 0);
            e(oy4.RIGHT, nz4Var, oy4Var2, 0);
            i(oy4Var5).a(nz4Var.i(oy4Var2), 0);
            return;
        }
        oy4 oy4Var14 = oy4.CENTER_X;
        if (oy4Var == oy4Var14 && (oy4Var2 == (oy4Var4 = oy4.LEFT) || oy4Var2 == oy4.RIGHT)) {
            py4 i6 = i(oy4Var4);
            py4 i7 = nz4Var.i(oy4Var2);
            py4 i8 = i(oy4.RIGHT);
            i6.a(i7, 0);
            i8.a(i7, 0);
            i(oy4Var14).a(i7, 0);
            return;
        }
        oy4 oy4Var15 = oy4.CENTER_Y;
        if (oy4Var == oy4Var15 && (oy4Var2 == (oy4Var3 = oy4.TOP) || oy4Var2 == oy4.BOTTOM)) {
            py4 i9 = nz4Var.i(oy4Var2);
            i(oy4Var3).a(i9, 0);
            i(oy4.BOTTOM).a(i9, 0);
            i(oy4Var15).a(i9, 0);
            return;
        }
        if (oy4Var == oy4Var14 && oy4Var2 == oy4Var14) {
            oy4 oy4Var16 = oy4.LEFT;
            i(oy4Var16).a(nz4Var.i(oy4Var16), 0);
            oy4 oy4Var17 = oy4.RIGHT;
            i(oy4Var17).a(nz4Var.i(oy4Var17), 0);
            i(oy4Var14).a(nz4Var.i(oy4Var2), 0);
            return;
        }
        if (oy4Var == oy4Var15 && oy4Var2 == oy4Var15) {
            oy4 oy4Var18 = oy4.TOP;
            i(oy4Var18).a(nz4Var.i(oy4Var18), 0);
            oy4 oy4Var19 = oy4.BOTTOM;
            i(oy4Var19).a(nz4Var.i(oy4Var19), 0);
            i(oy4Var15).a(nz4Var.i(oy4Var2), 0);
            return;
        }
        py4 i10 = i(oy4Var);
        py4 i11 = nz4Var.i(oy4Var2);
        if (i10.i(i11)) {
            oy4 oy4Var20 = oy4.BASELINE;
            if (oy4Var == oy4Var20) {
                py4 i12 = i(oy4.TOP);
                py4 i13 = i(oy4.BOTTOM);
                if (i12 != null) {
                    i12.j();
                }
                if (i13 != null) {
                    i13.j();
                }
            } else if (oy4Var != oy4.TOP && oy4Var != oy4.BOTTOM) {
                if (oy4Var == oy4.LEFT || oy4Var == oy4.RIGHT) {
                    py4 i14 = i(oy4Var5);
                    if (i14.f != i11) {
                        i14.j();
                    }
                    py4 f = i(oy4Var).f();
                    py4 i15 = i(oy4Var14);
                    if (i15.h()) {
                        f.j();
                        i15.j();
                    }
                }
            } else {
                py4 i16 = i(oy4Var20);
                if (i16 != null) {
                    i16.j();
                }
                py4 i17 = i(oy4Var5);
                if (i17.f != i11) {
                    i17.j();
                }
                py4 f2 = i(oy4Var).f();
                py4 i18 = i(oy4Var15);
                if (i18.h()) {
                    f2.j();
                    i18.j();
                }
            }
            i10.a(i11, i);
        }
    }

    public final void f(py4 py4Var, py4 py4Var2, int i) {
        if (py4Var.d == this) {
            e(py4Var.e, py4Var2.d, py4Var2.e, i);
        }
    }

    public final void g(a9b a9bVar) {
        a9bVar.k(this.I);
        a9bVar.k(this.J);
        a9bVar.k(this.K);
        a9bVar.k(this.L);
        if (this.b0 > 0) {
            a9bVar.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [jkk, x7k] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ad9, jkk] */
    public final void h() {
        if (this.d == null) {
            ?? jkkVar = new jkk(this);
            jkkVar.h.e = wl6.LEFT;
            jkkVar.i.e = wl6.RIGHT;
            jkkVar.f = 0;
            this.d = jkkVar;
        }
        if (this.e == null) {
            ?? jkkVar2 = new jkk(this);
            xl6 xl6Var = new xl6(jkkVar2);
            jkkVar2.k = xl6Var;
            jkkVar2.l = null;
            jkkVar2.h.e = wl6.TOP;
            jkkVar2.i.e = wl6.BOTTOM;
            xl6Var.e = wl6.BASELINE;
            jkkVar2.f = 1;
            this.e = jkkVar2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public py4 i(oy4 oy4Var) {
        switch (lz4.a[oy4Var.ordinal()]) {
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                dmk.i(oy4Var.name());
            case 9:
                return null;
        }
    }

    public final mz4 j(int i) {
        mz4[] mz4VarArr = this.T;
        if (i == 0) {
            return mz4VarArr[0];
        }
        if (i == 1) {
            return mz4VarArr[1];
        }
        return null;
    }

    public final int k() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final nz4 l(int i) {
        py4 py4Var;
        py4 py4Var2;
        if (i == 0) {
            py4 py4Var3 = this.K;
            py4 py4Var4 = py4Var3.f;
            if (py4Var4 != null && py4Var4.f == py4Var3) {
                return py4Var4.d;
            }
            return null;
        }
        if (i == 1 && (py4Var2 = (py4Var = this.L).f) != null && py4Var2.f == py4Var) {
            return py4Var2.d;
        }
        return null;
    }

    public final nz4 m(int i) {
        py4 py4Var;
        py4 py4Var2;
        if (i == 0) {
            py4 py4Var3 = this.I;
            py4 py4Var4 = py4Var3.f;
            if (py4Var4 != null && py4Var4.f == py4Var3) {
                return py4Var4.d;
            }
            return null;
        }
        if (i == 1 && (py4Var2 = (py4Var = this.J).f) != null && py4Var2.f == py4Var) {
            return py4Var2.d;
        }
        return null;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.W);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Z);
        sb.append("\n");
        sb.append("    actualTop:" + this.a0);
        sb.append("\n");
        p(sb, BlockAlignment.LEFT, this.I);
        p(sb, VerticalAlignment.TOP, this.J);
        p(sb, BlockAlignment.RIGHT, this.K);
        p(sb, VerticalAlignment.BOTTOM, this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.V;
        int i2 = this.c0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        mz4[] mz4VarArr = this.T;
        mz4 mz4Var = mz4VarArr[0];
        float[] fArr = this.l0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, mz4Var);
        int i6 = this.W;
        int i7 = this.d0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        mz4 mz4Var2 = mz4VarArr[1];
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3, mz4Var2);
        float f5 = this.X;
        int i11 = this.Y;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        G(sb, "    horizontalBias", this.e0, 0.5f);
        G(sb, "    verticalBias", this.f0, 0.5f);
        H(sb, "    horizontalChainStyle", this.j0, 0);
        H(sb, "    verticalChainStyle", this.k0, 0);
        sb.append("  }");
    }

    public final int q() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int r() {
        oz4 oz4Var = this.U;
        if (oz4Var != null) {
            return oz4Var.x0 + this.Z;
        }
        return this.Z;
    }

    public final int s() {
        oz4 oz4Var = this.U;
        if (oz4Var != null) {
            return oz4Var.y0 + this.a0;
        }
        return this.a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.I.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.K.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.J.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.L.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.M.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.i0 != null) {
            str = woa.r(new StringBuilder("id: "), this.i0, ApiConstant.SPACE);
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(this.a0);
        sb.append(") - (");
        sb.append(this.V);
        sb.append(" x ");
        return ix2.i(this.W, ")", sb);
    }

    public final boolean u(int i, int i2) {
        py4 py4Var;
        py4 py4Var2;
        py4 py4Var3;
        py4 py4Var4;
        if (i == 0) {
            py4 py4Var5 = this.I;
            py4 py4Var6 = py4Var5.f;
            if (py4Var6 != null && py4Var6.c && (py4Var4 = (py4Var3 = this.K).f) != null && py4Var4.c) {
                if ((py4Var4.d() - py4Var3.e()) - (py4Var5.e() + py4Var5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        py4 py4Var7 = this.J;
        py4 py4Var8 = py4Var7.f;
        if (py4Var8 != null && py4Var8.c && (py4Var2 = (py4Var = this.L).f) != null && py4Var2.c) {
            if ((py4Var2.d() - py4Var.e()) - (py4Var7.e() + py4Var7.f.d()) >= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v(oy4 oy4Var, nz4 nz4Var, oy4 oy4Var2, int i, int i2) {
        i(oy4Var).b(nz4Var.i(oy4Var2), i, i2, true);
    }

    public final boolean w(int i) {
        py4 py4Var;
        py4 py4Var2;
        int i2 = i * 2;
        py4[] py4VarArr = this.Q;
        py4 py4Var3 = py4VarArr[i2];
        py4 py4Var4 = py4Var3.f;
        if (py4Var4 != null && py4Var4.f != py4Var3 && (py4Var2 = (py4Var = py4VarArr[i2 + 1]).f) != null && py4Var2.f == py4Var) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        py4 py4Var = this.I;
        py4 py4Var2 = py4Var.f;
        if (py4Var2 == null || py4Var2.f != py4Var) {
            py4 py4Var3 = this.K;
            py4 py4Var4 = py4Var3.f;
            if (py4Var4 != null && py4Var4.f == py4Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean y() {
        py4 py4Var = this.J;
        py4 py4Var2 = py4Var.f;
        if (py4Var2 == null || py4Var2.f != py4Var) {
            py4 py4Var3 = this.L;
            py4 py4Var4 = py4Var3.f;
            if (py4Var4 != null && py4Var4.f == py4Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (this.g && this.h0 != 8) {
            return true;
        }
        return false;
    }
}
