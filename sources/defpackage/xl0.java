package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xl0 {
    public final char a;
    public final List b;
    public final ArrayList c;

    public xl0(char c, List list, ArrayList arrayList) {
        list.getClass();
        this.a = c;
        this.b = list;
        this.c = arrayList;
        xl0[] xl0VarArr = new xl0[256];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.c.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((xl0) next).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            xl0VarArr[i] = obj;
        }
    }
}
