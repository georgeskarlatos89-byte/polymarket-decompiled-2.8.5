package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ome {
    public final ArrayList a;
    public int b;
    public boolean c;
    public tj d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public ome(tj... tjVarArr) {
        new os4();
        this.a = CollectionsKt.g0(Arrays.copyOf(tjVarArr, tjVarArr.length));
        this.interceptors$delegate = null;
    }

    public final Object a(Object obj, Object obj2, q55 q55Var) {
        pme mw5Var;
        ele eleVar;
        int size;
        ele eleVar2;
        CoroutineContext context = q55Var.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i = this.b;
            if (i == 0) {
                this.interceptors$delegate = CollectionsKt.emptyList();
                this.c = false;
                this.d = null;
                CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = this.a;
                if (i == 1 && (size = arrayList.size() - 1) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i2);
                        if (obj3 instanceof ele) {
                            eleVar2 = (ele) obj3;
                        } else {
                            eleVar2 = null;
                        }
                        if (eleVar2 != null && !eleVar2.c.isEmpty()) {
                            List list = eleVar2.c;
                            eleVar2.d = true;
                            this.interceptors$delegate = list;
                            this.c = false;
                            this.d = eleVar2.a;
                            break;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        if (obj4 instanceof ele) {
                            eleVar = (ele) obj4;
                        } else {
                            eleVar = null;
                        }
                        if (eleVar != null) {
                            List list2 = eleVar.c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size3 = list2.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                arrayList2.add(list2.get(i4));
                            }
                        }
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.c = false;
                this.d = null;
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean d = d();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        if (!qme.a && !d) {
            mw5Var = new wei(obj2, obj, list3);
        } else {
            mw5Var = new mw5(obj, list3, obj2, context);
        }
        return mw5Var.a(obj2, q55Var);
    }

    public final ele b(tj tjVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == tjVar) {
                ele eleVar = new ele(tjVar, tme.a);
                arrayList.set(i, eleVar);
                return eleVar;
            }
            if (obj instanceof ele) {
                ele eleVar2 = (ele) obj;
                if (eleVar2.a == tjVar) {
                    return eleVar2;
                }
            }
        }
        return null;
    }

    public final int c(tj tjVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == tjVar || ((obj instanceof ele) && ((ele) obj).a == tjVar)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(tj tjVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj != tjVar) {
                if ((obj instanceof ele) && ((ele) obj).a == tjVar) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(tj tjVar, tj tjVar2) {
        ele eleVar;
        tj tjVar3;
        tjVar.getClass();
        if (e(tjVar2)) {
            return;
        }
        int c = c(tjVar);
        if (c != -1) {
            int i = c + 1;
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 1;
            if (i <= size) {
                while (true) {
                    Object obj = arrayList.get(i);
                    rme rmeVar = null;
                    if (obj instanceof ele) {
                        eleVar = (ele) obj;
                    } else {
                        eleVar = null;
                    }
                    if (eleVar == null) {
                        break;
                    }
                    fpn fpnVar = eleVar.b;
                    if (fpnVar instanceof rme) {
                        rmeVar = (rme) fpnVar;
                    }
                    if (rmeVar != null && (tjVar3 = rmeVar.a) != null && Intrinsics.areEqual(tjVar3, tjVar)) {
                        c = i;
                    }
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            arrayList.add(c + 1, new ele(tjVar2, new rme(tjVar)));
            return;
        }
        throw new Throwable("Phase " + tjVar + " was not registered for this pipeline");
    }

    public final void g(tj tjVar, Function3 function3) {
        tjVar.getClass();
        ele b = b(tjVar);
        if (b != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.a.isEmpty() && list != null && !this.c && hhj.g(list)) {
                if (Intrinsics.areEqual(this.d, tjVar)) {
                    list.add(function3);
                } else if (Intrinsics.areEqual(tjVar, CollectionsKt.P(this.a)) || c(tjVar) == this.a.size() - 1) {
                    ele b2 = b(tjVar);
                    b2.getClass();
                    if (b2.d) {
                        b2.c = new ArrayList(b2.c);
                        b2.d = false;
                    }
                    b2.c.add(function3);
                    list.add(function3);
                }
                this.b++;
                return;
            }
            if (b.d) {
                b.c = new ArrayList(b.c);
                b.d = false;
            }
            b.c.add(function3);
            this.b++;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        throw new Throwable("Phase " + tjVar + " was not registered for this pipeline");
    }
}
