package defpackage;

import android.text.TextUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class el8 {
    public final int A;
    public final mb4 B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public final String a;
    public final String b;
    public final jr9 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final bfc l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final z17 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final int x;
    public final float y;
    public final byte[] z;

    static {
        new el8(new dl8());
        u1k.G(0);
        u1k.G(1);
        u1k.G(2);
        u1k.G(3);
        ix2.v(4, 5, 6, 7, 8);
        ix2.v(9, 10, 11, 12, 13);
        ix2.v(14, 15, 16, 17, 18);
        ix2.v(19, 20, 21, 22, 23);
        ix2.v(24, 25, 26, 27, 28);
        ix2.v(29, 30, 31, 32, 33);
        u1k.G(34);
    }

    public el8(dl8 dl8Var) {
        boolean z;
        String str;
        boolean z2;
        this.a = dl8Var.a;
        String M = u1k.M(dl8Var.d);
        this.d = M;
        if (dl8Var.c.isEmpty() && dl8Var.b != null) {
            this.c = jr9.s(new kva(M, dl8Var.b));
            this.b = dl8Var.b;
        } else if (!dl8Var.c.isEmpty() && dl8Var.b == null) {
            jr9 jr9Var = dl8Var.c;
            this.c = jr9Var;
            Iterator it = jr9Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    kva kvaVar = (kva) it.next();
                    if (TextUtils.equals(kvaVar.a, M)) {
                        str = kvaVar.b;
                        break;
                    }
                } else {
                    str = ((kva) jr9Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!dl8Var.c.isEmpty() || dl8Var.b != null) {
                for (int i = 0; i < dl8Var.c.size(); i++) {
                    if (!((kva) dl8Var.c.get(i)).b.equals(dl8Var.b)) {
                    }
                }
                z = false;
                pfn.f(z);
                this.c = dl8Var.c;
                this.b = dl8Var.b;
            }
            z = true;
            pfn.f(z);
            this.c = dl8Var.c;
            this.b = dl8Var.b;
        }
        this.e = dl8Var.e;
        if (dl8Var.g != 0 && (dl8Var.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        pfn.e("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = dl8Var.f;
        this.g = dl8Var.g;
        int i2 = dl8Var.h;
        this.h = i2;
        int i3 = dl8Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = dl8Var.j;
        this.l = dl8Var.k;
        this.m = dl8Var.l;
        this.n = dl8Var.m;
        this.o = dl8Var.n;
        this.p = dl8Var.o;
        List list = dl8Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        z17 z17Var = dl8Var.q;
        this.r = z17Var;
        this.s = dl8Var.r;
        this.t = dl8Var.s;
        this.u = dl8Var.t;
        this.v = dl8Var.u;
        this.w = dl8Var.v;
        int i4 = dl8Var.w;
        this.x = i4 == -1 ? 0 : i4;
        float f = dl8Var.x;
        this.y = f == -1.0f ? 1.0f : f;
        this.z = dl8Var.y;
        this.A = dl8Var.z;
        this.B = dl8Var.A;
        this.C = dl8Var.B;
        this.D = dl8Var.C;
        this.E = dl8Var.D;
        this.F = dl8Var.E;
        int i5 = dl8Var.F;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = dl8Var.G;
        this.H = i6 != -1 ? i6 : 0;
        this.I = dl8Var.H;
        this.J = dl8Var.I;
        this.K = dl8Var.J;
        this.L = dl8Var.K;
        int i7 = dl8Var.L;
        if (i7 == 0 && z17Var != null) {
            this.M = 1;
        } else {
            this.M = i7;
        }
    }

    public static String c(el8 el8Var) {
        int i;
        String str;
        String str2;
        String str3;
        z17 z17Var;
        if (el8Var == null) {
            return "null";
        }
        int i2 = el8Var.e;
        jr9 jr9Var = el8Var.c;
        String str4 = el8Var.d;
        int i3 = el8Var.E;
        int i4 = el8Var.D;
        int i5 = el8Var.C;
        float f = el8Var.w;
        mb4 mb4Var = el8Var.B;
        float f2 = el8Var.y;
        int i6 = el8Var.v;
        int i7 = el8Var.u;
        z17 z17Var2 = el8Var.r;
        String str5 = el8Var.k;
        int i8 = el8Var.j;
        String str6 = el8Var.m;
        int i9 = el8Var.f;
        wca wcaVar = new wca(String.valueOf(','));
        StringBuilder s = sv6.s("id=");
        s.append(el8Var.a);
        s.append(", mimeType=");
        s.append(el8Var.n);
        if (str6 != null) {
            s.append(", container=");
            s.append(str6);
        }
        int i10 = -1;
        if (i8 != -1) {
            s.append(", bitrate=");
            s.append(i8);
        }
        if (str5 != null) {
            s.append(", codecs=");
            s.append(str5);
        }
        if (z17Var2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < z17Var2.d) {
                UUID uuid = z17Var2.a[i11].b;
                if (uuid.equals(uw1.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(uw1.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(uw1.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(uw1.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(uw1.a)) {
                    linkedHashSet.add("universal");
                } else {
                    z17Var = z17Var2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i11++;
                    z17Var2 = z17Var;
                }
                z17Var = z17Var2;
                i11++;
                z17Var2 = z17Var;
            }
            s.append(", drm=[");
            wcaVar.b(s, linkedHashSet.iterator());
            s.append(']');
            i10 = -1;
        }
        if (i7 != i10 && i6 != i10) {
            sv6.w(i7, i6, ", res=", "x", s);
        }
        double d = f2;
        int i12 = ux6.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            s.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i13 = u1k.a;
            s.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (mb4Var != null) {
            int i14 = mb4Var.f;
            int i15 = mb4Var.e;
            if ((i15 != -1 && i14 != -1) || mb4Var.d()) {
                s.append(", color=");
                if (mb4Var.d()) {
                    String b = mb4.b(mb4Var.a);
                    String a = mb4.a(mb4Var.b);
                    String c = mb4.c(mb4Var.c);
                    Locale locale = Locale.US;
                    str2 = hdi.p(b, AgentHeaderCreator.AGENT_DIVIDER, a, AgentHeaderCreator.AGENT_DIVIDER, c);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i15 != -1 && i14 != -1) {
                    str3 = i15 + AgentHeaderCreator.AGENT_DIVIDER + i14;
                } else {
                    str3 = "NA/NA";
                }
                s.append(str2 + AgentHeaderCreator.AGENT_DIVIDER + str3);
            }
        }
        if (f != -1.0f) {
            s.append(", fps=");
            s.append(f);
        }
        if (i5 != -1) {
            s.append(", maxSubLayers=");
            s.append(i5);
        }
        if (i4 != -1) {
            s.append(", channels=");
            s.append(i4);
        }
        if (i3 != -1) {
            s.append(", sample_rate=");
            s.append(i3);
        }
        if (str4 != null) {
            s.append(", language=");
            s.append(str4);
        }
        if (!jr9Var.isEmpty()) {
            s.append(", labels=[");
            wcaVar.b(s, u8n.e(jr9Var, new jr1(5)).iterator());
            s.append("]");
        }
        if (i2 != 0) {
            s.append(", selectionFlags=[");
            int i16 = u1k.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            wcaVar.b(s, arrayList.iterator());
            s.append("]");
        }
        if (i9 != 0) {
            s.append(", roleFlags=[");
            int i17 = u1k.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i9;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            wcaVar.b(s, arrayList2.iterator());
            s.append("]");
        } else {
            i = i9;
        }
        if ((i & 32768) != 0) {
            s.append(", auxiliaryTrackType=");
            int i18 = el8Var.g;
            int i19 = u1k.a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                str = "depth metadata";
                            } else {
                                dmk.n("Unsupported auxiliary track type");
                                return null;
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            s.append(str);
        }
        return s.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dl8, java.lang.Object] */
    public final dl8 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        obj.K = this.L;
        obj.L = this.M;
        return obj;
    }

    public final boolean b(el8 el8Var) {
        List list = this.q;
        if (list.size() != el8Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) el8Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final el8 d(el8 el8Var) {
        String str;
        String str2;
        z17 z17Var;
        int i;
        int i2;
        if (this == el8Var) {
            return this;
        }
        int h = ggc.h(this.n);
        String str3 = el8Var.a;
        jr9 jr9Var = el8Var.c;
        int i3 = el8Var.K;
        int i4 = el8Var.L;
        String str4 = el8Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (jr9Var.isEmpty()) {
            jr9Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = el8Var.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = el8Var.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = el8Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String u = u1k.u(h, el8Var.k);
            if (u1k.V(u).length == 1) {
                str5 = u;
            }
        }
        bfc bfcVar = el8Var.l;
        bfc bfcVar2 = this.l;
        if (bfcVar2 != null) {
            bfcVar = bfcVar2.b(bfcVar);
        }
        float f = this.w;
        if (f == -1.0f && h == 2) {
            f = el8Var.w;
        }
        int i7 = this.e | el8Var.e;
        int i8 = this.f | el8Var.f;
        z17 z17Var2 = el8Var.r;
        ArrayList arrayList = new ArrayList();
        jr9 jr9Var2 = jr9Var;
        if (z17Var2 != null) {
            String str6 = z17Var2.c;
            y17[] y17VarArr = z17Var2.a;
            int length = y17VarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                y17 y17Var = y17VarArr[i10];
                int i11 = length;
                if (y17Var.e != null) {
                    arrayList.add(y17Var);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        z17 z17Var3 = this.r;
        if (z17Var3 != null) {
            if (str2 == null) {
                str2 = z17Var3.c;
            }
            int size = arrayList.size();
            y17[] y17VarArr2 = z17Var3.a;
            String str7 = str2;
            int length2 = y17VarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                y17 y17Var2 = y17VarArr2[i13];
                int i14 = length2;
                if (y17Var2.e != null) {
                    UUID uuid = y17Var2.b;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i = size;
                            if (((y17) arrayList.get(i15)).b.equals(uuid)) {
                                break;
                            }
                            i15++;
                            size = i;
                        } else {
                            i = size;
                            arrayList.add(y17Var2);
                            break;
                        }
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        if (arrayList.isEmpty()) {
            z17Var = null;
        } else {
            z17Var = new z17(str2, false, (y17[]) arrayList.toArray(new y17[0]));
        }
        dl8 a = a();
        a.a = str3;
        a.b = str4;
        a.c = jr9.m(jr9Var2);
        a.d = str;
        a.e = i7;
        a.f = i8;
        a.h = i5;
        a.i = i6;
        a.j = str5;
        a.k = bfcVar;
        a.q = z17Var;
        a.v = f;
        a.J = i3;
        a.K = i16;
        return new el8(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && el8.class == obj.getClass()) {
            el8 el8Var = (el8) obj;
            int i2 = this.N;
            if ((i2 == 0 || (i = el8Var.N) == 0 || i2 == i) && this.e == el8Var.e && this.f == el8Var.f && this.g == el8Var.g && this.h == el8Var.h && this.i == el8Var.i && this.o == el8Var.o && this.s == el8Var.s && this.u == el8Var.u && this.v == el8Var.v && this.x == el8Var.x && this.A == el8Var.A && this.C == el8Var.C && this.D == el8Var.D && this.E == el8Var.E && this.F == el8Var.F && this.G == el8Var.G && this.H == el8Var.H && this.I == el8Var.I && this.K == el8Var.K && this.L == el8Var.L && this.M == el8Var.M && Float.compare(this.w, el8Var.w) == 0 && Float.compare(this.y, el8Var.y) == 0 && Objects.equals(this.a, el8Var.a) && Objects.equals(this.b, el8Var.b) && this.c.equals(el8Var.c) && Objects.equals(this.k, el8Var.k) && Objects.equals(this.m, el8Var.m) && Objects.equals(this.n, el8Var.n) && Objects.equals(this.d, el8Var.d) && Arrays.equals(this.z, el8Var.z) && Objects.equals(this.l, el8Var.l) && Objects.equals(this.B, el8Var.B) && Objects.equals(this.r, el8Var.r) && b(el8Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.N;
        if (i == 0) {
            int i2 = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.c.hashCode() + ((i3 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            bfc bfcVar = this.l;
            if (bfcVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = bfcVar.hashCode();
            }
            int i6 = (i5 + hashCode5) * 961;
            String str5 = this.m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            String str6 = this.n;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.y) + ((((Float.floatToIntBits(this.w) + ((((((((((i7 + i2) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31)) * 31) + this.x) * 31)) * 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.K) * 31) + this.L) * 31) + this.M;
            this.N = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.B);
        sb.append("], [");
        sb.append(this.D);
        sb.append(", ");
        return ix2.i(this.E, "])", sb);
    }
}
