package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dwb {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;

    public dwb(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Integer num = ((ewb) obj).a;
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num2 = ((ewb) it.next()).a;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num3 = ((ewb) it2.next()).a;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Integer num4 = ((ewb) it3.next()).a;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            Integer num5 = ((ewb) it4.next()).a;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list2) {
            if (((ewb) obj2).a instanceof Object[]) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            Integer num6 = ((ewb) it5.next()).a;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            Integer num7 = ((ewb) it6.next()).a;
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : list2) {
            if (((ewb) obj3).a instanceof CharSequence) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            Integer num8 = ((ewb) it7.next()).a;
        }
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.g = arrayList7;
        this.h = arrayList8;
        this.i = arrayList9;
        this.j = arrayList10;
    }
}
