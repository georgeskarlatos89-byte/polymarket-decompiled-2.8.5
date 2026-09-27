package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gkk {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                gkk gkkVar = (gkk) arrayList.get(i);
                if (this.e == gkkVar.b) {
                    c(this.c, gkkVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(a9b a9bVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        oz4 oz4Var = ((nz4) arrayList.get(0)).U;
        a9bVar.t();
        oz4Var.b(a9bVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((nz4) arrayList.get(i2)).b(a9bVar, false);
        }
        if (i == 0 && oz4Var.z0 > 0) {
            amn.a(oz4Var, a9bVar, arrayList, 0);
        }
        if (i == 1 && oz4Var.A0 > 0) {
            amn.a(oz4Var, a9bVar, arrayList, 1);
        }
        try {
            a9bVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            nz4 nz4Var = (nz4) arrayList.get(i3);
            xvj xvjVar = new xvj(3);
            new WeakReference(nz4Var);
            a9b.n(nz4Var.I);
            a9b.n(nz4Var.J);
            a9b.n(nz4Var.K);
            a9b.n(nz4Var.L);
            a9b.n(nz4Var.M);
            this.d.add(xvjVar);
        }
        if (i == 0) {
            n = a9b.n(oz4Var.I);
            n2 = a9b.n(oz4Var.K);
            a9bVar.t();
        } else {
            n = a9b.n(oz4Var.J);
            n2 = a9b.n(oz4Var.L);
            a9bVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, gkk gkkVar) {
        int i2 = gkkVar.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nz4 nz4Var = (nz4) it.next();
            ArrayList arrayList = gkkVar.a;
            if (!arrayList.contains(nz4Var)) {
                arrayList.add(nz4Var);
            }
            if (i == 0) {
                nz4Var.o0 = i2;
            } else {
                nz4Var.p0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String i2 = ix2.i(this.b, "] <", sb);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nz4 nz4Var = (nz4) it.next();
            StringBuilder t = sv6.t(i2, ApiConstant.SPACE);
            t.append(nz4Var.i0);
            i2 = t.toString();
        }
        return i2.concat(" >");
    }
}
