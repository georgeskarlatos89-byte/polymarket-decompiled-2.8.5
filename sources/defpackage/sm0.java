package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sm0 implements el6 {
    public final char a;

    public sm0(char c) {
        this.a = c;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [sd7, java.lang.Object] */
    @Override // defpackage.el6
    public final int a(cl6 cl6Var, cl6 cl6Var2) {
        o8d o8dVar;
        ArrayList arrayList = cl6Var.a;
        ArrayList arrayList2 = cl6Var2.a;
        if (cl6Var.e || cl6Var2.d) {
            int i = cl6Var2.c;
            if (i % 3 != 0 && (cl6Var.c + i) % 3 == 0) {
                return 0;
            }
        }
        int size = arrayList.size();
        char c = this.a;
        int i2 = 2;
        if (size >= 2 && arrayList2.size() >= 2) {
            String.valueOf(c);
            o8dVar = new o8d();
        } else {
            String.valueOf(c);
            o8dVar = new o8d();
            i2 = 1;
        }
        ?? obj = new Object();
        obj.h(cl6Var.b(i2));
        iqi iqiVar = (iqi) arrayList.get(arrayList.size() - 1);
        d9d d9dVar = new d9d(iqiVar.e, (iqi) arrayList2.get(0));
        while (d9dVar.hasNext()) {
            o8d o8dVar2 = (o8d) d9dVar.next();
            o8dVar.a(o8dVar2);
            obj.g(o8dVar2.b());
        }
        obj.h(cl6Var2.a(i2));
        List list = obj.a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        o8dVar.d(list);
        o8dVar.f();
        o8d o8dVar3 = iqiVar.e;
        o8dVar.e = o8dVar3;
        if (o8dVar3 != null) {
            o8dVar3.d = o8dVar;
        }
        o8dVar.d = iqiVar;
        iqiVar.e = o8dVar;
        o8d o8dVar4 = iqiVar.a;
        o8dVar.a = o8dVar4;
        if (o8dVar.e == null) {
            o8dVar4.c = o8dVar;
        }
        return i2;
    }

    @Override // defpackage.el6
    public final char b() {
        return this.a;
    }

    @Override // defpackage.el6
    public final int c() {
        return 1;
    }

    @Override // defpackage.el6
    public final char d() {
        return this.a;
    }
}
