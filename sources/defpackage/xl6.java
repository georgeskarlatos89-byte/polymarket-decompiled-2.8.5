package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class xl6 implements ql6 {
    public final jkk d;
    public int f;
    public int g;
    public jkk a = null;
    public boolean b = false;
    public boolean c = false;
    public wl6 e = wl6.UNKNOWN;
    public int h = 1;
    public gt6 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public xl6(jkk jkkVar) {
        this.d = jkkVar;
    }

    @Override // defpackage.ql6
    public final void a(ql6 ql6Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((xl6) it.next()).j) {
                return;
            }
        }
        this.c = true;
        jkk jkkVar = this.a;
        if (jkkVar != null) {
            jkkVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        xl6 xl6Var = null;
        int i = 0;
        while (it2.hasNext()) {
            xl6 xl6Var2 = (xl6) it2.next();
            if (!(xl6Var2 instanceof gt6)) {
                i++;
                xl6Var = xl6Var2;
            }
        }
        if (xl6Var != null && i == 1 && xl6Var.j) {
            gt6 gt6Var = this.i;
            if (gt6Var != null) {
                if (gt6Var.j) {
                    this.f = this.h * gt6Var.g;
                } else {
                    return;
                }
            }
            d(xl6Var.g + this.f);
        }
        jkk jkkVar2 = this.a;
        if (jkkVar2 != null) {
            jkkVar2.a(this);
        }
    }

    public final void b(jkk jkkVar) {
        this.k.add(jkkVar);
        if (this.j) {
            jkkVar.a(jkkVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ql6 ql6Var = (ql6) it.next();
                ql6Var.a(ql6Var);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.i0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
