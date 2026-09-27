package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class u8j {
    public int a = bd0.API_PRIORITY_OTHER;
    public int b = bd0.API_PRIORITY_OTHER;
    public int c = bd0.API_PRIORITY_OTHER;
    public int d = bd0.API_PRIORITY_OTHER;
    public int e = bd0.API_PRIORITY_OTHER;
    public int f = bd0.API_PRIORITY_OTHER;
    public boolean g = true;
    public boolean h = true;
    public jr9 i;
    public jr9 j;
    public jr9 k;
    public int l;
    public int m;
    public jr9 n;
    public t8j o;
    public jr9 p;
    public boolean q;
    public int r;
    public HashMap s;
    public HashSet t;

    public u8j() {
        we8 we8Var = jr9.b;
        wwf wwfVar = wwf.e;
        this.i = wwfVar;
        this.j = wwfVar;
        this.k = wwfVar;
        this.l = bd0.API_PRIORITY_OTHER;
        this.m = bd0.API_PRIORITY_OTHER;
        this.n = wwfVar;
        this.o = t8j.a;
        this.p = wwfVar;
        this.q = true;
        this.r = 0;
        this.s = new HashMap();
        this.t = new HashSet();
    }

    public void a(int i) {
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            if (((s8j) it.next()).a.c == i) {
                it.remove();
            }
        }
    }

    public final void b(v8j v8jVar) {
        this.a = v8jVar.a;
        this.b = v8jVar.b;
        this.c = v8jVar.c;
        this.d = v8jVar.d;
        this.e = v8jVar.e;
        this.f = v8jVar.f;
        this.g = v8jVar.g;
        this.h = v8jVar.h;
        this.i = v8jVar.i;
        this.j = v8jVar.j;
        this.k = v8jVar.k;
        this.l = v8jVar.l;
        this.m = v8jVar.m;
        this.n = v8jVar.n;
        this.o = v8jVar.o;
        this.p = v8jVar.p;
        this.q = v8jVar.q;
        this.r = v8jVar.r;
        this.t = new HashSet(v8jVar.t);
        this.s = new HashMap(v8jVar.s);
    }

    public u8j c(String... strArr) {
        dr9 k = jr9.k();
        for (String str : strArr) {
            str.getClass();
            k.a(u1k.M(str));
        }
        this.p = k.g();
        this.q = false;
        return this;
    }
}
