package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m2f implements v1b, n2f, w1b {
    public final int a;
    public final x99 b;
    public final Function1 c;
    public rz4 d;
    public nai e;
    public mai f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public l2f l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ af9 r;

    public m2f(af9 af9Var, int i, x99 x99Var, Function1 function1) {
        this.r = af9Var;
        this.a = i;
        this.b = x99Var;
        this.c = function1;
        g2j.a.getClass();
        fkc.a.getClass();
        this.p = fkc.b();
    }

    @Override // defpackage.v1b
    public final void a() {
        this.m = true;
    }

    public final void b() {
        mai maiVar = this.f;
        if (maiVar != null) {
            maiVar.cancel();
        }
        this.f = null;
        nai naiVar = this.e;
        if (naiVar != null) {
            naiVar.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(sbi sbiVar) {
        boolean d;
        if (!this.r.b) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(sbiVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(sbiVar);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return d;
    }

    @Override // defpackage.v1b
    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe A[Catch: all -> 0x0217, LOOP:2: B:100:0x01cc->B:111:0x01fe, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x0217, blocks: (B:84:0x0183, B:86:0x018b, B:88:0x0191, B:91:0x019f, B:93:0x01ab, B:94:0x01c3, B:95:0x01b0, B:99:0x01c5, B:100:0x01cc, B:102:0x01d4, B:104:0x01de, B:106:0x01e2, B:108:0x01e9, B:109:0x01ee, B:111:0x01fe, B:118:0x0204), top: B:83:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, o11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(sbi sbiVar) {
        long j;
        int i;
        ?? r12;
        m2f m2fVar;
        List list;
        l2f l2fVar;
        int i2 = this.a;
        long j2 = i2;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
        l1b l1bVar = (l1b) ((k1b) this.r.c).b.invoke();
        if (!this.h) {
            int a = l1bVar.a();
            if (i2 >= 0 && i2 < a) {
                Object e = l1bVar.e(i2);
                Object obj = this.j;
                if (obj != null && !Intrinsics.areEqual(e, obj)) {
                    b();
                    return false;
                }
                Object c = l1bVar.c(i2);
                x99 x99Var = this.b;
                o11 o11Var = (o11) x99Var.d;
                if (x99Var.c != c || o11Var == null) {
                    iqc iqcVar = (iqc) x99Var.b;
                    Object d = iqcVar.d(c);
                    Object obj2 = d;
                    if (d == null) {
                        ?? obj3 = new Object();
                        obj3.e = -1;
                        iqcVar.m(c, obj3);
                        obj2 = obj3;
                    }
                    o11Var = (o11) obj2;
                    x99Var.c = c;
                    x99Var.d = o11Var;
                }
                e();
                long a2 = sbiVar.a();
                this.n = a2;
                g2j.a.getClass();
                fkc.a.getClass();
                this.p = fkc.b();
                this.o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a2);
                if (!e()) {
                    j = 0;
                    if (g(this.n, o11Var.a + o11Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(e, c, o11Var);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                } else {
                    j = 0;
                }
                if (this.f != null) {
                    if (!g(this.n, o11Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        mai maiVar = this.f;
                        if (maiVar != null) {
                            this.e = maiVar.apply();
                            this.f = null;
                            this.i = true;
                            Trace.endSection();
                            h();
                            o11Var.c = o11.a(this.o, o11Var.c);
                        } else {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                    } finally {
                    }
                }
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        nai naiVar = this.e;
                        if (naiVar != null) {
                            ?? obj4 = new Object();
                            naiVar.b(new qc0(obj4, 25));
                            List list2 = (List) obj4.a;
                            if (list2 != null) {
                                l2fVar = new l2f(this, list2);
                                this.l = l2fVar;
                                this.k = true;
                            }
                        } else {
                            nw9.b("Should precompose before resolving nested prefetch states");
                            f05.c();
                        }
                        l2fVar = null;
                        this.l = l2fVar;
                        this.k = true;
                    } finally {
                    }
                }
                l2f l2fVar2 = this.l;
                if (l2fVar2 != null) {
                    int i3 = o11Var.e;
                    boolean z = this.m;
                    List[] listArr = l2fVar2.b;
                    int i4 = l2fVar2.c;
                    List list3 = l2fVar2.a;
                    if (i4 < list3.size()) {
                        if (l2fVar2.f.h) {
                            nw9.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((x1b) list3.get(i5)).d = i3;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (l2fVar2.c < list3.size()) {
                                try {
                                    if (listArr[l2fVar2.c] == null) {
                                        if (sbiVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i6 = l2fVar2.c;
                                        x1b x1bVar = (x1b) list3.get(i6);
                                        Function1 function1 = x1bVar.a;
                                        if (function1 == null) {
                                            list = CollectionsKt.emptyList();
                                        } else {
                                            u1b u1bVar = new u1b(x1bVar, x1bVar.d);
                                            function1.invoke(u1bVar);
                                            ArrayList arrayList = u1bVar.b;
                                            x1bVar.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i6] = list;
                                    }
                                    List list4 = listArr[l2fVar2.c];
                                    list4.getClass();
                                    while (l2fVar2.d < list4.size()) {
                                        n2f n2fVar = (n2f) list4.get(l2fVar2.d);
                                        if (z) {
                                            if (n2fVar instanceof m2f) {
                                                m2fVar = (m2f) n2fVar;
                                            } else {
                                                m2fVar = null;
                                            }
                                            if (m2fVar != null) {
                                                r12 = 1;
                                                m2fVar.m = true;
                                                l2fVar2.e = r12;
                                                if (!((m2f) n2fVar).c(sbiVar)) {
                                                    return r12;
                                                }
                                                l2fVar2.d += r12;
                                            }
                                        }
                                        r12 = 1;
                                        l2fVar2.e = r12;
                                        if (!((m2f) n2fVar).c(sbiVar)) {
                                        }
                                    }
                                    l2fVar2.d = 0;
                                    l2fVar2.c++;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                l2f l2fVar3 = this.l;
                if (l2fVar3 != null && l2fVar3.e) {
                    h();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                    l2f l2fVar4 = this.l;
                    if (l2fVar4 != null) {
                        l2fVar4.e = false;
                    }
                }
                rz4 rz4Var = this.d;
                if (!this.g && rz4Var != null) {
                    if (!g(this.n, o11Var.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = rz4Var.a;
                        if (this.h) {
                            nw9.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            nw9.a("Request was already measured!");
                        }
                        this.g = true;
                        nai naiVar2 = this.e;
                        if (naiVar2 != null) {
                            int e2 = naiVar2.e();
                            for (int i7 = 0; i7 < e2; i7++) {
                                naiVar2.c(i7, j3);
                            }
                        } else {
                            nw9.b("performComposition() must be called before performMeasure()");
                            f05.c();
                        }
                        Trace.endSection();
                        h();
                        o11Var.d = o11.a(this.o, o11Var.d);
                        Function1 function12 = this.c;
                        if (function12 != null) {
                            function12.invoke(this);
                        }
                    } finally {
                    }
                }
                l2f l2fVar5 = this.l;
                if (this.g && this.k && l2fVar5 != null) {
                    List list5 = l2fVar5.a;
                    List list6 = list5;
                    int size2 = list6.size();
                    int i8 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size2; i9++) {
                        i8 = Math.min(i8, ((x1b) list5.get(i9)).e);
                    }
                    if (i8 == Integer.MAX_VALUE) {
                        i8 = 0;
                    }
                    int i10 = o11Var.e;
                    if (i10 == -1) {
                        i = i8;
                    } else {
                        i = ((i10 * 3) + i8) / 4;
                    }
                    o11Var.e = i;
                    int size3 = list6.size();
                    int i11 = Integer.MAX_VALUE;
                    for (int i12 = 0; i12 < size3; i12++) {
                        i11 = Math.min(i11, ((x1b) list5.get(i12)).f);
                    }
                    if (i11 == Integer.MAX_VALUE) {
                        i11 = 0;
                    }
                    if (i11 < i8) {
                        o11Var.d = j;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        mai maiVar;
        if (this.i || ((maiVar = this.f) != null && maiVar.c())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, o11 o11Var) {
        mai ss9Var;
        mai maiVar = this.f;
        if (maiVar == null) {
            af9 af9Var = this.r;
            Function2 a = ((k1b) af9Var.c).a(this.a, obj, obj2);
            wxa a2 = ((pai) af9Var.d).a();
            if (!a2.a.S()) {
                ss9Var = new n19(10, a2, obj);
            } else {
                a2.k(obj, a, true);
                ss9Var = new ss9(6, a2, obj);
            }
            maiVar = ss9Var;
            this.f = maiVar;
            this.j = obj;
        }
        this.q = false;
        while (!maiVar.c() && !this.q) {
            maiVar.k0(new vt0(24, this, o11Var));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            o11Var.b = o11.a(j, o11Var.b);
        } else {
            o11Var.a = o11.a(j, o11Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void h() {
        g2j.a.getClass();
        fkc.a.getClass();
        long b = fkc.b();
        long f = d47.f(f2j.c(b, this.p));
        this.o = f;
        long j = this.n - f;
        this.n = j;
        this.p = b;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return ix2.r(sb, this.h, " }");
    }
}
