package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class o8d {
    public o8d a = null;
    public o8d b = null;
    public o8d c = null;
    public o8d d = null;
    public o8d e = null;
    public ArrayList f = null;

    public void a(o8d o8dVar) {
        o8dVar.f();
        o8dVar.c(this);
        o8d o8dVar2 = this.c;
        if (o8dVar2 != null) {
            o8dVar2.e = o8dVar;
            o8dVar.d = o8dVar2;
        } else {
            this.b = o8dVar;
        }
        this.c = o8dVar;
    }

    public final List b() {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public void c(o8d o8dVar) {
        this.a = o8dVar;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            this.f = null;
        } else {
            this.f = new ArrayList(list);
        }
    }

    public String e() {
        return "";
    }

    public final void f() {
        o8d o8dVar = this.d;
        if (o8dVar != null) {
            o8dVar.e = this.e;
        } else {
            o8d o8dVar2 = this.a;
            if (o8dVar2 != null) {
                o8dVar2.b = this.e;
            }
        }
        o8d o8dVar3 = this.e;
        if (o8dVar3 != null) {
            o8dVar3.d = o8dVar;
        } else {
            o8d o8dVar4 = this.a;
            if (o8dVar4 != null) {
                o8dVar4.c = o8dVar;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return m51.k(getClass().getSimpleName(), "{", e(), "}");
    }
}
