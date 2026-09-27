package io.sentry;

import defpackage.m51;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f2 {
    public final ArrayList a;

    public f2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public a2 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (a2) m51.h(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        a2 a = a();
        d();
        if (a() instanceof d2) {
            d2 d2Var = (d2) a();
            d();
            c2 c2Var = (c2) a();
            if (d2Var != null && a != null && c2Var != null) {
                c2Var.a.put(d2Var.a, a.getValue());
                return false;
            }
            return false;
        }
        if (a() instanceof b2) {
            b2 b2Var = (b2) a();
            if (a != null && b2Var != null) {
                b2Var.a.add(a.getValue());
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean c(z1 z1Var) {
        Object d = z1Var.d();
        if (a() == null && d != null) {
            this.a.add(new e2(d));
            return true;
        }
        if (a() instanceof d2) {
            d2 d2Var = (d2) a();
            d();
            ((c2) a()).a.put(d2Var.a, d);
            return false;
        }
        if (a() instanceof b2) {
            ((b2) a()).a.add(d);
            return false;
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public f2() {
        this.a = new ArrayList();
    }
}
