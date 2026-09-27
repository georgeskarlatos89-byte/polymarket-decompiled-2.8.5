package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class l66 extends f7h {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<g> mAddAnimations;
    ArrayList<ArrayList<g>> mAdditionsList;
    ArrayList<g> mChangeAnimations;
    ArrayList<ArrayList<j66>> mChangesList;
    ArrayList<g> mMoveAnimations;
    ArrayList<ArrayList<k66>> mMovesList;
    private ArrayList<g> mPendingAdditions;
    private ArrayList<j66> mPendingChanges;
    private ArrayList<k66> mPendingMoves;
    private ArrayList<g> mPendingRemovals;
    ArrayList<g> mRemoveAnimations;

    public l66() {
        this.mSupportsChangeAnimations = true;
        this.mPendingRemovals = new ArrayList<>();
        this.mPendingAdditions = new ArrayList<>();
        this.mPendingMoves = new ArrayList<>();
        this.mPendingChanges = new ArrayList<>();
        this.mAdditionsList = new ArrayList<>();
        this.mMovesList = new ArrayList<>();
        this.mChangesList = new ArrayList<>();
        this.mAddAnimations = new ArrayList<>();
        this.mMoveAnimations = new ArrayList<>();
        this.mRemoveAnimations = new ArrayList<>();
        this.mChangeAnimations = new ArrayList<>();
    }

    public final void a(g gVar, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            j66 j66Var = (j66) list.get(size);
            if (b(j66Var, gVar) && j66Var.a == null && j66Var.b == null) {
                list.remove(j66Var);
            }
        }
    }

    @Override // defpackage.f7h
    public boolean animateAdd(g gVar) {
        c(gVar);
        gVar.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(gVar);
        return true;
    }

    public void animateAddImpl(g gVar) {
        View view = gVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(gVar);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new g66(this, gVar, view, animate)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, j66] */
    @Override // defpackage.f7h
    public boolean animateChange(g gVar, g gVar2, int i, int i2, int i3, int i4) {
        if (gVar == gVar2) {
            return animateMove(gVar, i, i2, i3, i4);
        }
        float translationX = gVar.itemView.getTranslationX();
        float translationY = gVar.itemView.getTranslationY();
        float alpha = gVar.itemView.getAlpha();
        c(gVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        gVar.itemView.setTranslationX(translationX);
        gVar.itemView.setTranslationY(translationY);
        gVar.itemView.setAlpha(alpha);
        if (gVar2 != null) {
            c(gVar2);
            gVar2.itemView.setTranslationX(-i5);
            gVar2.itemView.setTranslationY(-i6);
            gVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<j66> arrayList = this.mPendingChanges;
        ?? obj = new Object();
        obj.a = gVar;
        obj.b = gVar2;
        obj.c = i;
        obj.d = i2;
        obj.e = i3;
        obj.f = i4;
        arrayList.add(obj);
        return true;
    }

    public void animateChangeImpl(j66 j66Var) {
        View view;
        l66 l66Var;
        j66 j66Var2;
        g gVar = j66Var.a;
        View view2 = null;
        if (gVar == null) {
            view = null;
        } else {
            view = gVar.itemView;
        }
        g gVar2 = j66Var.b;
        if (gVar2 != null) {
            view2 = gVar2.itemView;
        }
        View view3 = view2;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(j66Var.a);
            duration.translationX(j66Var.e - j66Var.c);
            duration.translationY(j66Var.f - j66Var.d);
            l66Var = this;
            j66Var2 = j66Var;
            duration.alpha(0.0f).setListener(new i66(l66Var, j66Var2, duration, view, 0)).start();
        } else {
            l66Var = this;
            j66Var2 = j66Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            l66Var.mChangeAnimations.add(j66Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(l66Var.getChangeDuration()).alpha(1.0f).setListener(new i66(l66Var, j66Var2, animate, view3, 1)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k66] */
    @Override // defpackage.f7h
    public boolean animateMove(g gVar, int i, int i2, int i3, int i4) {
        View view = gVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) gVar.itemView.getTranslationY());
        c(gVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(gVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList<k66> arrayList = this.mPendingMoves;
        ?? obj = new Object();
        obj.a = gVar;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public void animateMoveImpl(g gVar, int i, int i2, int i3, int i4) {
        View view = gVar.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(gVar);
        animate.setDuration(getMoveDuration()).setListener(new h66(this, gVar, i5, view, i6, animate)).start();
    }

    @Override // defpackage.f7h
    public boolean animateRemove(g gVar) {
        c(gVar);
        this.mPendingRemovals.add(gVar);
        return true;
    }

    public final boolean b(j66 j66Var, g gVar) {
        boolean z = false;
        if (j66Var.b == gVar) {
            j66Var.b = null;
        } else {
            if (j66Var.a != gVar) {
                return false;
            }
            j66Var.a = null;
            z = true;
        }
        gVar.itemView.setAlpha(1.0f);
        gVar.itemView.setTranslationX(0.0f);
        gVar.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(gVar, z);
        return true;
    }

    public final void c(g gVar) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        gVar.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(gVar);
    }

    @Override // androidx.recyclerview.widget.d
    public boolean canReuseUpdatedViewHolder(g gVar, List<Object> list) {
        if (list.isEmpty() && !canReuseUpdatedViewHolder(gVar)) {
            return false;
        }
        return true;
    }

    public void cancelAll(List<g> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.d
    public void endAnimation(g gVar) {
        View view = gVar.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).a == gVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(gVar);
                this.mPendingMoves.remove(size);
            }
        }
        a(gVar, this.mPendingChanges);
        if (this.mPendingRemovals.remove(gVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(gVar);
        }
        if (this.mPendingAdditions.remove(gVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(gVar);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<j66> arrayList = this.mChangesList.get(size2);
            a(gVar, arrayList);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<k66> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).a == gVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(gVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<g> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(gVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(gVar);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(gVar);
        this.mAddAnimations.remove(gVar);
        this.mChangeAnimations.remove(gVar);
        this.mMoveAnimations.remove(gVar);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.d
    public void endAnimations() {
        ArrayList<j66> arrayList;
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k66 k66Var = this.mPendingMoves.get(size);
            View view = k66Var.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(k66Var.a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g gVar = this.mPendingAdditions.get(size3);
            gVar.itemView.setAlpha(1.0f);
            dispatchAddFinished(gVar);
            this.mPendingAdditions.remove(size3);
        }
        int size4 = this.mPendingChanges.size();
        while (true) {
            size4--;
            arrayList = this.mPendingChanges;
            if (size4 < 0) {
                break;
            }
            j66 j66Var = arrayList.get(size4);
            g gVar2 = j66Var.a;
            if (gVar2 != null) {
                b(j66Var, gVar2);
            }
            g gVar3 = j66Var.b;
            if (gVar3 != null) {
                b(j66Var, gVar3);
            }
        }
        arrayList.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
            ArrayList<k66> arrayList2 = this.mMovesList.get(size5);
            for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                k66 k66Var2 = arrayList2.get(size6);
                View view2 = k66Var2.a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(k66Var2.a);
                arrayList2.remove(size6);
                if (arrayList2.isEmpty()) {
                    this.mMovesList.remove(arrayList2);
                }
            }
        }
        for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
            ArrayList<g> arrayList3 = this.mAdditionsList.get(size7);
            for (int size8 = arrayList3.size() - 1; size8 >= 0; size8--) {
                g gVar4 = arrayList3.get(size8);
                gVar4.itemView.setAlpha(1.0f);
                dispatchAddFinished(gVar4);
                arrayList3.remove(size8);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(arrayList3);
                }
            }
        }
        for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
            ArrayList<j66> arrayList4 = this.mChangesList.get(size9);
            for (int size10 = arrayList4.size() - 1; size10 >= 0; size10--) {
                j66 j66Var2 = arrayList4.get(size10);
                g gVar5 = j66Var2.a;
                if (gVar5 != null) {
                    b(j66Var2, gVar5);
                }
                g gVar6 = j66Var2.b;
                if (gVar6 != null) {
                    b(j66Var2, gVar6);
                }
                if (arrayList4.isEmpty()) {
                    this.mChangesList.remove(arrayList4);
                }
            }
        }
        cancelAll(this.mRemoveAnimations);
        cancelAll(this.mMoveAnimations);
        cancelAll(this.mAddAnimations);
        cancelAll(this.mChangeAnimations);
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.d
    public boolean isRunning() {
        if (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.d
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<g> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                g next = it.next();
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.mRemoveAnimations.add(next);
                animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new g66(this, next, animate, view)).start();
            }
            this.mPendingRemovals.clear();
            if (!isEmpty2) {
                ArrayList<k66> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                f66 f66Var = new f66(this, arrayList, 0);
                if (!isEmpty) {
                    View view2 = arrayList.get(0).a.itemView;
                    long removeDuration = getRemoveDuration();
                    WeakHashMap weakHashMap = k9k.a;
                    view2.postOnAnimationDelayed(f66Var, removeDuration);
                } else {
                    f66Var.run();
                }
            }
            if (!isEmpty3) {
                ArrayList<j66> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                ptl ptlVar = new ptl(this, arrayList2, false, 1);
                if (!isEmpty) {
                    View view3 = arrayList2.get(0).a.itemView;
                    long removeDuration2 = getRemoveDuration();
                    WeakHashMap weakHashMap2 = k9k.a;
                    view3.postOnAnimationDelayed(ptlVar, removeDuration2);
                } else {
                    ptlVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList<g> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                f66 f66Var2 = new f66(this, arrayList3, 1);
                if (isEmpty && isEmpty2 && isEmpty3) {
                    f66Var2.run();
                    return;
                }
                long j3 = 0;
                if (!isEmpty) {
                    j = getRemoveDuration();
                } else {
                    j = 0;
                }
                if (!isEmpty2) {
                    j2 = getMoveDuration();
                } else {
                    j2 = 0;
                }
                if (!isEmpty3) {
                    j3 = getChangeDuration();
                }
                long max = Math.max(j2, j3) + j;
                View view4 = arrayList3.get(0).itemView;
                WeakHashMap weakHashMap3 = k9k.a;
                view4.postOnAnimationDelayed(f66Var2, max);
            }
        }
    }
}
