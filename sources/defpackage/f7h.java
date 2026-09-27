package defpackage;

import android.view.View;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class f7h extends d {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations;

    public abstract boolean animateAdd(g gVar);

    @Override // androidx.recyclerview.widget.d
    public boolean animateAppearance(g gVar, qsf qsfVar, qsf qsfVar2) {
        int i;
        int i2;
        if (qsfVar != null && ((i = qsfVar.a) != (i2 = qsfVar2.a) || qsfVar.b != qsfVar2.b)) {
            return animateMove(gVar, i, qsfVar.b, i2, qsfVar2.b);
        }
        return animateAdd(gVar);
    }

    public abstract boolean animateChange(g gVar, g gVar2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.d
    public boolean animateChange(g gVar, g gVar2, qsf qsfVar, qsf qsfVar2) {
        int i;
        int i2 = qsfVar.a;
        int i3 = qsfVar.b;
        if (gVar2.shouldIgnore()) {
            i = qsfVar.a;
        } else {
            i = qsfVar2.a;
            qsfVar = qsfVar2;
        }
        return animateChange(gVar, gVar2, i2, i3, i, qsfVar.b);
    }

    @Override // androidx.recyclerview.widget.d
    public boolean animateDisappearance(g gVar, qsf qsfVar, qsf qsfVar2) {
        int i;
        int i2;
        int i3 = qsfVar.a;
        int i4 = qsfVar.b;
        View view = gVar.itemView;
        if (qsfVar2 == null) {
            i = view.getLeft();
        } else {
            i = qsfVar2.a;
        }
        int i5 = i;
        if (qsfVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = qsfVar2.b;
        }
        int i6 = i2;
        if (!gVar.isRemoved() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return animateMove(gVar, i3, i4, i5, i6);
        }
        return animateRemove(gVar);
    }

    public abstract boolean animateMove(g gVar, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.d
    public boolean animatePersistence(g gVar, qsf qsfVar, qsf qsfVar2) {
        int i = qsfVar.a;
        int i2 = qsfVar2.a;
        if (i == i2 && qsfVar.b == qsfVar2.b) {
            dispatchMoveFinished(gVar);
            return false;
        }
        return animateMove(gVar, i, qsfVar.b, i2, qsfVar2.b);
    }

    public abstract boolean animateRemove(g gVar);

    public boolean canReuseUpdatedViewHolder(g gVar) {
        if (this.mSupportsChangeAnimations && !gVar.isInvalid()) {
            return false;
        }
        return true;
    }

    public final void dispatchAddFinished(g gVar) {
        onAddFinished(gVar);
        dispatchAnimationFinished(gVar);
    }

    public final void dispatchAddStarting(g gVar) {
        onAddStarting(gVar);
    }

    public final void dispatchChangeFinished(g gVar, boolean z) {
        onChangeFinished(gVar, z);
        dispatchAnimationFinished(gVar);
    }

    public final void dispatchChangeStarting(g gVar, boolean z) {
        onChangeStarting(gVar, z);
    }

    public final void dispatchMoveFinished(g gVar) {
        onMoveFinished(gVar);
        dispatchAnimationFinished(gVar);
    }

    public final void dispatchMoveStarting(g gVar) {
        onMoveStarting(gVar);
    }

    public final void dispatchRemoveFinished(g gVar) {
        onRemoveFinished(gVar);
        dispatchAnimationFinished(gVar);
    }

    public final void dispatchRemoveStarting(g gVar) {
        onRemoveStarting(gVar);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    public void onAddFinished(g gVar) {
    }

    public void onAddStarting(g gVar) {
    }

    public void onMoveFinished(g gVar) {
    }

    public void onMoveStarting(g gVar) {
    }

    public void onRemoveFinished(g gVar) {
    }

    public void onRemoveStarting(g gVar) {
    }

    public void onChangeFinished(g gVar, boolean z) {
    }

    public void onChangeStarting(g gVar, boolean z) {
    }
}
