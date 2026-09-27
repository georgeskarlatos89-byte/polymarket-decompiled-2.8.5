package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.appsflyer.internal.l;
import defpackage.ace;
import defpackage.dmk;
import defpackage.etf;
import defpackage.gg1;
import defpackage.i9k;
import defpackage.itf;
import defpackage.jtf;
import defpackage.k9k;
import defpackage.m51;
import defpackage.m6;
import defpackage.n6;
import defpackage.py2;
import defpackage.qp7;
import defpackage.rn6;
import defpackage.tsf;
import defpackage.v14;
import defpackage.wqn;
import defpackage.x8j;
import defpackage.ysf;
import defpackage.zsf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public zsf g;
    public final /* synthetic */ RecyclerView h;

    public f(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(g gVar, boolean z) {
        n6 n6Var;
        RecyclerView.l(gVar);
        View view = gVar.itemView;
        RecyclerView recyclerView = this.h;
        jtf jtfVar = recyclerView.B1;
        if (jtfVar != null) {
            itf itfVar = jtfVar.b;
            if (itfVar != null) {
                n6Var = (n6) itfVar.b.remove(view);
            } else {
                n6Var = null;
            }
            k9k.j(view, n6Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() <= 0) {
                c cVar = recyclerView.m;
                if (cVar != null) {
                    cVar.onViewRecycled(gVar);
                }
                if (recyclerView.u1 != null) {
                    recyclerView.g.h0(gVar);
                }
                if (RecyclerView.Q1) {
                    Objects.toString(gVar);
                }
            } else {
                arrayList.get(0).getClass();
                dmk.p();
                return;
            }
        }
        gVar.mBindingAdapter = null;
        gVar.mOwnerRecyclerView = null;
        zsf c = c();
        c.getClass();
        int itemViewType = gVar.getItemViewType();
        ArrayList arrayList2 = c.a(itemViewType).a;
        ((ysf) c.a.get(itemViewType)).getClass();
        if (5 <= arrayList2.size()) {
            wqn.a(gVar.itemView);
        } else if (RecyclerView.P1 && arrayList2.contains(gVar)) {
            dmk.v("this scrap item already exists");
        } else {
            gVar.resetInternal();
            arrayList2.add(gVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        etf etfVar = recyclerView.u1;
        if (i >= 0 && i < etfVar.b()) {
            if (!etfVar.g) {
                return i;
            }
            return recyclerView.e.g(i, 0);
        }
        StringBuilder o = ace.o(i, "invalid position ", ". State item count is ");
        o.append(etfVar.b());
        o.append(recyclerView.C());
        throw new IndexOutOfBoundsException(o.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zsf] */
    public final zsf c() {
        if (this.g == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            obj.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = obj;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).itemView;
    }

    public final void e() {
        RecyclerView recyclerView;
        c cVar;
        zsf zsfVar = this.g;
        if (zsfVar != null && (cVar = (recyclerView = this.h).m) != null && recyclerView.s) {
            zsfVar.c.add(cVar);
        }
    }

    public final void f(c cVar, boolean z) {
        zsf zsfVar = this.g;
        if (zsfVar != null) {
            SparseArray sparseArray = zsfVar.a;
            Set set = zsfVar.c;
            set.remove(cVar);
            if (set.size() == 0 && !z) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((ysf) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        wqn.a(((g) arrayList.get(i2)).itemView);
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.U1) {
            gg1 gg1Var = this.h.t1;
            int[] iArr = (int[]) gg1Var.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            gg1Var.d = 0;
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.P1;
        ArrayList arrayList = this.c;
        g gVar = (g) arrayList.get(i);
        if (RecyclerView.Q1) {
            Objects.toString(gVar);
        }
        a(gVar, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        g O = RecyclerView.O(view);
        boolean isTmpDetached = O.isTmpDetached();
        RecyclerView recyclerView = this.h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (O.isScrap()) {
            O.unScrap();
        } else if (O.wasReturnedFromScrap()) {
            O.clearReturnedFromScrapFlag();
        }
        j(O);
        if (recyclerView.M != null && !O.isRecyclable()) {
            recyclerView.M.endAnimation(O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c4, code lost:
    
        r5 = r5 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        gg1 gg1Var = recyclerView.t1;
        boolean z3 = false;
        boolean z4 = true;
        if (!gVar.isScrap() && gVar.itemView.getParent() == null) {
            if (!gVar.isTmpDetached()) {
                if (!gVar.shouldIgnore()) {
                    boolean doesTransientStatePreventRecycling = gVar.doesTransientStatePreventRecycling();
                    c cVar = recyclerView.m;
                    if (cVar != null && doesTransientStatePreventRecycling && cVar.onFailedToRecycleView(gVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z5 = RecyclerView.P1;
                    ArrayList arrayList = this.c;
                    if (z5 && arrayList.contains(gVar)) {
                        StringBuilder sb = new StringBuilder("cached view received recycle internal? ");
                        sb.append(gVar);
                        py2.i(sb, recyclerView.C());
                        return;
                    }
                    if (!z && !gVar.isRecyclable()) {
                        if (RecyclerView.Q1) {
                            recyclerView.C();
                        }
                        z4 = false;
                    } else {
                        if (this.f > 0 && !gVar.hasAnyOfTheFlags(526)) {
                            int size = arrayList.size();
                            if (size >= this.f && size > 0) {
                                h(0);
                                size--;
                            }
                            if (RecyclerView.U1 && size > 0) {
                                int i = gVar.mPosition;
                                if (((int[]) gg1Var.e) != null) {
                                    int i2 = gg1Var.d * 2;
                                    for (int i3 = 0; i3 < i2; i3 += 2) {
                                        if (((int[]) gg1Var.e)[i3] == i) {
                                            break;
                                        }
                                    }
                                }
                                int i4 = size - 1;
                                loop1: while (i4 >= 0) {
                                    int i5 = ((g) arrayList.get(i4)).mPosition;
                                    if (((int[]) gg1Var.e) == null) {
                                        break;
                                    }
                                    int i6 = gg1Var.d * 2;
                                    for (int i7 = 0; i7 < i6; i7 += 2) {
                                        if (((int[]) gg1Var.e)[i7] == i5) {
                                            break;
                                        }
                                    }
                                    break loop1;
                                }
                                size = i4 + 1;
                            }
                            arrayList.add(size, gVar);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            a(gVar, true);
                        } else {
                            z4 = false;
                        }
                        z3 = z2;
                    }
                    recyclerView.g.h0(gVar);
                    if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                        wqn.a(gVar.itemView);
                        gVar.mBindingAdapter = null;
                        gVar.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                dmk.v("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(gVar);
            py2.i(sb2, recyclerView.C());
            return;
        }
        StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb3.append(gVar.isScrap());
        sb3.append(" isAttached:");
        if (gVar.itemView.getParent() != null) {
            z3 = true;
        }
        sb3.append(z3);
        sb3.append(recyclerView.C());
        throw new IllegalArgumentException(sb3.toString());
    }

    public final void k(View view) {
        d dVar;
        g O = RecyclerView.O(view);
        boolean hasAnyOfTheFlags = O.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!hasAnyOfTheFlags && O.isUpdated() && (dVar = recyclerView.M) != null && !dVar.canReuseUpdatedViewHolder(O, O.getUnmodifiedPayloads())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            O.setScrapContainer(this, true);
            this.b.add(O);
            return;
        }
        if (O.isInvalid() && !O.isRemoved() && !recyclerView.m.hasStableIds()) {
            dmk.v("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
        } else {
            O.setScrapContainer(this, false);
            this.a.add(O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0450, code lost:
    
        if ((r13 + r11) >= r29) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g l(int i, long j) {
        g gVar;
        int i2;
        int i3;
        long j2;
        long j3;
        int i4;
        long j4;
        AccessibilityManager accessibilityManager;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        tsf tsfVar;
        boolean z;
        RecyclerView H;
        g gVar2;
        View view;
        int i7;
        int i8;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        etf etfVar = recyclerView.u1;
        if (i >= 0 && i < etfVar.b()) {
            n6 n6Var = null;
            if (etfVar.g) {
                ArrayList arrayList = this.b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            gVar = (g) this.b.get(i9);
                            if (!gVar.wasReturnedFromScrap() && gVar.getLayoutPosition() == i) {
                                gVar.addFlags(32);
                                break;
                            }
                            i9++;
                        } else if (recyclerView.m.hasStableIds() && (g = recyclerView.e.g(i, 0)) > 0 && g < recyclerView.m.getItemCount()) {
                            long itemId = recyclerView.m.getItemId(g);
                            for (int i10 = 0; i10 < size; i10++) {
                                g gVar3 = (g) this.b.get(i10);
                                if (!gVar3.wasReturnedFromScrap() && gVar3.getItemId() == itemId) {
                                    gVar3.addFlags(32);
                                    gVar = gVar3;
                                    break;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        i2 = 1;
                        ArrayList arrayList2 = this.a;
                        ArrayList arrayList3 = this.c;
                        if (gVar != null) {
                            int size2 = arrayList2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                g gVar4 = (g) arrayList2.get(i11);
                                if (!gVar4.wasReturnedFromScrap() && gVar4.getLayoutPosition() == i && !gVar4.isInvalid() && (etfVar.g || !gVar4.isRemoved())) {
                                    gVar4.addFlags(32);
                                    gVar = gVar4;
                                    i3 = 1;
                                    break;
                                }
                            }
                            ArrayList arrayList4 = (ArrayList) recyclerView.f.e;
                            int size3 = arrayList4.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size3) {
                                    view = (View) arrayList4.get(i12);
                                    g O = RecyclerView.O(view);
                                    i3 = 1;
                                    if (O.getLayoutPosition() == i && !O.isInvalid() && !O.isRemoved()) {
                                        break;
                                    }
                                    i12++;
                                } else {
                                    i3 = 1;
                                    view = null;
                                    break;
                                }
                            }
                            if (view != null) {
                                g O2 = RecyclerView.O(view);
                                x8j x8jVar = recyclerView.f;
                                v14 v14Var = (v14) x8jVar.d;
                                int indexOfChild = ((RecyclerView) ((rn6) x8jVar.c).a).indexOfChild(view);
                                if (indexOfChild >= 0) {
                                    if (v14Var.t(indexOfChild)) {
                                        v14Var.p(indexOfChild);
                                        x8jVar.z(view);
                                        x8j x8jVar2 = recyclerView.f;
                                        v14 v14Var2 = (v14) x8jVar2.d;
                                        int indexOfChild2 = ((RecyclerView) ((rn6) x8jVar2.c).a).indexOfChild(view);
                                        if (indexOfChild2 == -1 || v14Var2.t(indexOfChild2)) {
                                            i7 = -1;
                                        } else {
                                            i7 = indexOfChild2 - v14Var2.q(indexOfChild2);
                                        }
                                        if (i7 != -1) {
                                            recyclerView.f.g(i7);
                                            k(view);
                                            O2.addFlags(8224);
                                            gVar = O2;
                                        } else {
                                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                            sb.append(O2);
                                            l.m(sb, recyclerView.C());
                                            return null;
                                        }
                                    } else {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                    }
                                } else {
                                    qp7.k(view, "view is not a child, cannot hide ");
                                    return null;
                                }
                            } else {
                                int size4 = arrayList3.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size4) {
                                        g gVar5 = (g) arrayList3.get(i13);
                                        if (!gVar5.isInvalid() && gVar5.getLayoutPosition() == i && !gVar5.isAttachedToTransitionOverlay()) {
                                            arrayList3.remove(i13);
                                            if (RecyclerView.Q1) {
                                                gVar5.toString();
                                            }
                                            gVar = gVar5;
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        gVar = null;
                                        break;
                                    }
                                }
                            }
                            if (gVar != null) {
                                if (gVar.isRemoved()) {
                                    if (RecyclerView.P1 && !etfVar.g) {
                                        dmk.n("should not receive a removed view unless it is pre layout".concat(recyclerView.C()));
                                        return null;
                                    }
                                    i8 = etfVar.g;
                                } else {
                                    int i14 = gVar.mPosition;
                                    if (i14 >= 0 && i14 < recyclerView.m.getItemCount()) {
                                        if ((!etfVar.g && recyclerView.m.getItemViewType(gVar.mPosition) != gVar.getItemViewType()) || (recyclerView.m.hasStableIds() && gVar.getItemId() != recyclerView.m.getItemId(gVar.mPosition))) {
                                            i8 = 0;
                                        } else {
                                            i8 = i3;
                                        }
                                    } else {
                                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + gVar + recyclerView.C());
                                    }
                                }
                                if (i8 == 0) {
                                    gVar.addFlags(4);
                                    if (gVar.isScrap()) {
                                        recyclerView.removeDetachedView(gVar.itemView, false);
                                        gVar.unScrap();
                                    } else if (gVar.wasReturnedFromScrap()) {
                                        gVar.clearReturnedFromScrapFlag();
                                    }
                                    j(gVar);
                                    gVar = null;
                                } else {
                                    i2 = i3;
                                }
                            }
                        } else {
                            i3 = 1;
                        }
                        if (gVar != null) {
                            int g2 = recyclerView.e.g(i, 0);
                            if (g2 >= 0) {
                                j2 = 3;
                                if (g2 < recyclerView.m.getItemCount()) {
                                    int itemViewType = recyclerView.m.getItemViewType(g2);
                                    if (recyclerView.m.hasStableIds()) {
                                        long itemId2 = recyclerView.m.getItemId(g2);
                                        int size5 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size5 >= 0) {
                                                g gVar6 = (g) arrayList2.get(size5);
                                                if (gVar6.getItemId() == itemId2 && !gVar6.wasReturnedFromScrap()) {
                                                    j3 = 4;
                                                    if (itemViewType == gVar6.getItemViewType()) {
                                                        gVar6.addFlags(32);
                                                        if (gVar6.isRemoved() && !etfVar.g) {
                                                            gVar6.setFlags(2, 14);
                                                        }
                                                        gVar = gVar6;
                                                    } else {
                                                        arrayList2.remove(size5);
                                                        recyclerView.removeDetachedView(gVar6.itemView, false);
                                                        g O3 = RecyclerView.O(gVar6.itemView);
                                                        O3.mScrapContainer = null;
                                                        O3.mInChangeScrap = false;
                                                        O3.clearReturnedFromScrapFlag();
                                                        j(O3);
                                                    }
                                                }
                                                size5--;
                                            } else {
                                                j3 = 4;
                                                int size6 = arrayList3.size() - 1;
                                                while (true) {
                                                    if (size6 < 0) {
                                                        break;
                                                    }
                                                    g gVar7 = (g) arrayList3.get(size6);
                                                    if (gVar7.getItemId() != itemId2 || gVar7.isAttachedToTransitionOverlay()) {
                                                        size6--;
                                                    } else if (itemViewType == gVar7.getItemViewType()) {
                                                        arrayList3.remove(size6);
                                                        gVar = gVar7;
                                                    } else {
                                                        h(size6);
                                                    }
                                                }
                                                gVar = null;
                                            }
                                        }
                                        if (gVar != null) {
                                            gVar.mPosition = g2;
                                            i2 = i3;
                                        }
                                    } else {
                                        j3 = 4;
                                    }
                                    if (gVar == null) {
                                        boolean z2 = RecyclerView.P1;
                                        ysf ysfVar = (ysf) c().a.get(itemViewType);
                                        if (ysfVar != null) {
                                            ArrayList arrayList5 = ysfVar.a;
                                            if (!arrayList5.isEmpty()) {
                                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                    if (!((g) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                                        gVar2 = (g) arrayList5.remove(size7);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        gVar2 = null;
                                        if (gVar2 != null) {
                                            gVar2.resetInternal();
                                            boolean z3 = RecyclerView.P1;
                                        }
                                        gVar = gVar2;
                                    }
                                    if (gVar == null) {
                                        long nanoTime = recyclerView.getNanoTime();
                                        if (j != Long.MAX_VALUE) {
                                            long j5 = this.g.a(itemViewType).b;
                                            if (j5 != 0 && j5 + nanoTime >= j) {
                                                return null;
                                            }
                                        }
                                        g createViewHolder = recyclerView.m.createViewHolder(recyclerView, itemViewType);
                                        if (RecyclerView.U1 && (H = RecyclerView.H(createViewHolder.itemView)) != null) {
                                            createViewHolder.mNestedRecyclerView = new WeakReference<>(H);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        ysf a = this.g.a(itemViewType);
                                        long j6 = a.b;
                                        if (j6 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j6 / j3) * 3);
                                        }
                                        a.b = nanoTime2;
                                        gVar = createViewHolder;
                                    }
                                }
                            }
                            StringBuilder n = m51.n(i, "Inconsistency detected. Invalid item position ", g2, "(offset:", ").state:");
                            n.append(etfVar.b());
                            n.append(recyclerView.C());
                            throw new IndexOutOfBoundsException(n.toString());
                        }
                        j2 = 3;
                        j3 = 4;
                        if (i2 != 0 && !etfVar.g && gVar.hasAnyOfTheFlags(8192)) {
                            gVar.setFlags(0, 8192);
                            if (etfVar.j) {
                                recyclerView.c0(gVar, recyclerView.M.recordPreLayoutInformation(etfVar, gVar, d.buildAdapterChangeFlagsForAnimations(gVar) | 4096, gVar.getUnmodifiedPayloads()));
                            }
                        }
                        if (!etfVar.g && gVar.isBound()) {
                            gVar.mPreLayoutPosition = i;
                        } else if (gVar.isBound() || gVar.needsUpdate() || gVar.isInvalid()) {
                            if (!RecyclerView.P1 && gVar.isRemoved()) {
                                StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                sb2.append(gVar);
                                l.m(sb2, recyclerView.C());
                                return null;
                            }
                            int g3 = recyclerView.e.g(i, 0);
                            gVar.mBindingAdapter = null;
                            gVar.mOwnerRecyclerView = recyclerView;
                            int itemViewType2 = gVar.getItemViewType();
                            long nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j7 = this.g.a(itemViewType2).c;
                                if (j7 != 0) {
                                }
                            }
                            if (!gVar.isTmpDetached()) {
                                RecyclerView.e(recyclerView, gVar.itemView, recyclerView.getChildCount(), gVar.itemView.getLayoutParams());
                                i4 = i3;
                            } else {
                                i4 = 0;
                            }
                            recyclerView.m.bindViewHolder(gVar, g3);
                            if (i4 != 0) {
                                RecyclerView.f(recyclerView, gVar.itemView);
                            }
                            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                            ysf a2 = this.g.a(gVar.getItemViewType());
                            j4 = a2.c;
                            if (j4 != 0) {
                                nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                            }
                            a2.c = nanoTime4;
                            accessibilityManager = recyclerView.B;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                View view2 = gVar.itemView;
                                if (view2.getImportantForAccessibility() == 0) {
                                    i5 = i3;
                                    view2.setImportantForAccessibility(i5);
                                } else {
                                    i5 = i3;
                                }
                                jtf jtfVar = recyclerView.B1;
                                if (jtfVar != null) {
                                    itf itfVar = jtfVar.b;
                                    if (itfVar != null) {
                                        WeakHashMap weakHashMap = k9k.a;
                                        View.AccessibilityDelegate a3 = i9k.a(view2);
                                        if (a3 != null) {
                                            if (a3 instanceof m6) {
                                                n6Var = ((m6) a3).a;
                                            } else {
                                                n6Var = new n6(a3);
                                            }
                                        }
                                        if (n6Var != null && n6Var != itfVar) {
                                            itfVar.b.put(view2, n6Var);
                                        }
                                    }
                                    k9k.j(view2, itfVar);
                                }
                            } else {
                                i5 = i3;
                            }
                            if (etfVar.g) {
                                gVar.mPreLayoutPosition = i;
                            }
                            i6 = i5;
                            layoutParams = gVar.itemView.getLayoutParams();
                            if (layoutParams == null) {
                                tsfVar = (tsf) recyclerView.generateDefaultLayoutParams();
                                gVar.itemView.setLayoutParams(tsfVar);
                            } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                                tsfVar = (tsf) recyclerView.generateLayoutParams(layoutParams);
                                gVar.itemView.setLayoutParams(tsfVar);
                            } else {
                                tsfVar = (tsf) layoutParams;
                            }
                            tsfVar.a = gVar;
                            if (i2 == 0 && i6 != 0) {
                                z = i5;
                            } else {
                                z = 0;
                            }
                            tsfVar.d = z;
                            return gVar;
                        }
                        i6 = 0;
                        i5 = i3;
                        layoutParams = gVar.itemView.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        tsfVar.a = gVar;
                        if (i2 == 0) {
                        }
                        z = 0;
                        tsfVar.d = z;
                        return gVar;
                    }
                }
                gVar = null;
                if (gVar != null) {
                }
            } else {
                gVar = null;
            }
            i2 = 0;
            ArrayList arrayList22 = this.a;
            ArrayList arrayList32 = this.c;
            if (gVar != null) {
            }
            if (gVar != null) {
            }
            if (i2 != 0) {
                gVar.setFlags(0, 8192);
                if (etfVar.j) {
                }
            }
            if (!etfVar.g) {
            }
            if (gVar.isBound()) {
            }
            if (!RecyclerView.P1) {
            }
            int g32 = recyclerView.e.g(i, 0);
            gVar.mBindingAdapter = null;
            gVar.mOwnerRecyclerView = recyclerView;
            int itemViewType22 = gVar.getItemViewType();
            long nanoTime32 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
            }
            if (!gVar.isTmpDetached()) {
            }
            recyclerView.m.bindViewHolder(gVar, g32);
            if (i4 != 0) {
            }
            long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
            ysf a22 = this.g.a(gVar.getItemViewType());
            j4 = a22.c;
            if (j4 != 0) {
            }
            a22.c = nanoTime42;
            accessibilityManager = recyclerView.B;
            if (accessibilityManager == null) {
            }
            i5 = i3;
            if (etfVar.g) {
            }
            i6 = i5;
            layoutParams = gVar.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            tsfVar.a = gVar;
            if (i2 == 0) {
            }
            z = 0;
            tsfVar.d = z;
            return gVar;
        }
        StringBuilder n2 = m51.n(i, "Invalid item position ", i, "(", "). Item count:");
        n2.append(etfVar.b());
        n2.append(recyclerView.C());
        throw new IndexOutOfBoundsException(n2.toString());
    }

    public final void m(g gVar) {
        if (gVar.mInChangeScrap) {
            this.b.remove(gVar);
        } else {
            this.a.remove(gVar);
        }
        gVar.mScrapContainer = null;
        gVar.mInChangeScrap = false;
        gVar.clearReturnedFromScrapFlag();
    }

    public final void n() {
        int i;
        e eVar = this.h.n;
        if (eVar != null) {
            i = eVar.j;
        } else {
            i = 0;
        }
        this.f = this.e + i;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
