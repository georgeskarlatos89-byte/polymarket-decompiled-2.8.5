package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c80 implements i80 {
    public final ArrayList a;

    public c80(int i) {
        switch (i) {
            case 3:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    public static void j(c80 c80Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c80Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ykf) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    @Override // defpackage.i80
    public g91 a() {
        ArrayList arrayList = this.a;
        if (((soa) arrayList.get(0)).c()) {
            return new wz8(arrayList, 1);
        }
        return new qxd(arrayList);
    }

    @Override // defpackage.i80
    public List b() {
        return this.a;
    }

    @Override // defpackage.i80
    public boolean c() {
        ArrayList arrayList = this.a;
        if (arrayList.size() != 1 || !((soa) arrayList.get(0)).c()) {
            return false;
        }
        return true;
    }

    public void d(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sej sejVar = (sej) arrayList.get(size);
            Matrix matrix = z1k.a;
            if (sejVar != null && !sejVar.a) {
                z1k.a(path, sejVar.d.m() / 100.0f, sejVar.e.m() / 100.0f, sejVar.f.m() / 360.0f);
            }
        }
    }

    public boolean e(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((ykf) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public ykf f(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ykf ykfVar = (ykf) it.next();
            if (ykfVar.getClass() == cls) {
                return ykfVar;
            }
        }
        return null;
    }

    public ArrayList g(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ykf ykfVar = (ykf) it.next();
            if (cls.isAssignableFrom(ykfVar.getClass())) {
                arrayList.add(ykfVar);
            }
        }
        return arrayList;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (i != 0) {
                    sb.append('\n');
                }
                sb.append(((yeh) arrayList.get(i)).a);
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ofh ofhVar = ((yeh) it.next()).b;
            if (ofhVar != null) {
                arrayList.add(ofhVar);
            }
        }
        return arrayList;
    }

    public c80(ArrayList arrayList) {
        this.a = arrayList;
    }

    public c80(List list) {
        this.a = new ArrayList(list);
    }
}
