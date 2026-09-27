package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ldi {
    public final ArrayList a;

    public ldi(qdi... qdiVarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Collections.addAll(arrayList, qdiVarArr);
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public final void a(qdi qdiVar) {
        this.a.add(qdiVar);
    }

    public final List c(List list) {
        p0i p0iVar;
        p0i p0iVar2;
        boolean z;
        p0i p0iVar3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size == arrayList.size()) {
            int size2 = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            b(arrayList2, size2, new int[size2], 0);
            qdi[] qdiVarArr = new qdi[list.size()];
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                boolean z2 = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (iArr[i] < list.size()) {
                        qdi qdiVar = (qdi) arrayList.get(i);
                        qdi qdiVar2 = (qdi) list.get(iArr[i]);
                        qdiVar.getClass();
                        qdiVar2.getClass();
                        if (qdiVar2.b.a() > qdiVar.b.a() || qdiVar2.a != qdiVar.a || ((p0iVar = qdiVar.c) != (p0iVar2 = p0i.DEFAULT) && (p0iVar3 = qdiVar2.c) != p0iVar2 && p0iVar3 != p0iVar)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 &= z;
                        if (!z2) {
                            break;
                        }
                        qdiVarArr[iArr[i]] = (qdi) arrayList.get(i);
                    }
                }
                if (z2) {
                    return Arrays.asList(qdiVarArr);
                }
            }
            return null;
        }
        return null;
    }

    public ldi() {
        this.a = new ArrayList();
    }
}
