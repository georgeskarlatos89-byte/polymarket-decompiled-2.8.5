package androidx.recyclerview.widget;

import android.view.View;
import defpackage.dmk;
import defpackage.etf;
import defpackage.me7;
import defpackage.osf;
import defpackage.psf;
import defpackage.qsf;
import defpackage.rn6;
import defpackage.v14;
import defpackage.x8j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class d {
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_CHANGED = 2;
    public static final int FLAG_INVALIDATED = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_REMOVED = 8;
    private psf mListener = null;
    private ArrayList<osf> mFinishedListeners = new ArrayList<>();
    private long mAddDuration = 120;
    private long mRemoveDuration = 120;
    private long mMoveDuration = 250;
    private long mChangeDuration = 250;

    public static int buildAdapterChangeFlagsForAnimations(g gVar) {
        int i = gVar.mFlags;
        int i2 = i & 14;
        if (gVar.isInvalid()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int oldPosition = gVar.getOldPosition();
            int absoluteAdapterPosition = gVar.getAbsoluteAdapterPosition();
            if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                return i2 | 2048;
            }
        }
        return i2;
    }

    public abstract boolean animateAppearance(g gVar, qsf qsfVar, qsf qsfVar2);

    public abstract boolean animateChange(g gVar, g gVar2, qsf qsfVar, qsf qsfVar2);

    public abstract boolean animateDisappearance(g gVar, qsf qsfVar, qsf qsfVar2);

    public abstract boolean animatePersistence(g gVar, qsf qsfVar, qsf qsfVar2);

    public abstract boolean canReuseUpdatedViewHolder(g gVar, List list);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchAnimationFinished(g gVar) {
        onAnimationFinished(gVar);
        psf psfVar = this.mListener;
        if (psfVar != null) {
            RecyclerView recyclerView = (RecyclerView) ((me7) psfVar).a;
            boolean z = true;
            gVar.setIsRecyclable(true);
            if (gVar.mShadowedHolder != null && gVar.mShadowingHolder == null) {
                gVar.mShadowedHolder = null;
            }
            gVar.mShadowingHolder = null;
            if (!gVar.shouldBeKeptAsChild()) {
                View view = gVar.itemView;
                f fVar = recyclerView.c;
                recyclerView.o0();
                x8j x8jVar = recyclerView.f;
                v14 v14Var = (v14) x8jVar.d;
                rn6 rn6Var = (rn6) x8jVar.c;
                int i = x8jVar.b;
                if (i == 1) {
                    if (((View) x8jVar.f) != view) {
                        dmk.n("Cannot call removeViewIfHidden within removeView(At) for a different view");
                        return;
                    }
                } else {
                    if (i != 2) {
                        try {
                            x8jVar.b = 2;
                            int indexOfChild = ((RecyclerView) rn6Var.a).indexOfChild(view);
                            if (indexOfChild == -1) {
                                x8jVar.z(view);
                            } else if (v14Var.t(indexOfChild)) {
                                v14Var.x(indexOfChild);
                                x8jVar.z(view);
                                rn6Var.E(indexOfChild);
                            }
                            if (z) {
                                g O = RecyclerView.O(view);
                                fVar.m(O);
                                fVar.j(O);
                                if (RecyclerView.Q1) {
                                    Objects.toString(view);
                                    recyclerView.toString();
                                }
                            }
                            recyclerView.q0(!z);
                            if (z && gVar.isTmpDetached()) {
                                recyclerView.removeDetachedView(gVar.itemView, false);
                                return;
                            }
                        } finally {
                            x8jVar.b = 0;
                        }
                    }
                    dmk.n("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                z = false;
                if (z) {
                }
                recyclerView.q0(!z);
                if (z) {
                }
            }
        }
    }

    public final void dispatchAnimationStarted(g gVar) {
        onAnimationStarted(gVar);
    }

    public final void dispatchAnimationsFinished() {
        int size = this.mFinishedListeners.size();
        ArrayList<osf> arrayList = this.mFinishedListeners;
        if (size <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            dmk.p();
        }
    }

    public abstract void endAnimation(g gVar);

    public abstract void endAnimations();

    public long getAddDuration() {
        return this.mAddDuration;
    }

    public long getChangeDuration() {
        return this.mChangeDuration;
    }

    public long getMoveDuration() {
        return this.mMoveDuration;
    }

    public long getRemoveDuration() {
        return this.mRemoveDuration;
    }

    public abstract boolean isRunning();

    public final boolean isRunning(osf osfVar) {
        boolean isRunning = isRunning();
        if (osfVar != null) {
            if (!isRunning) {
                osfVar.a();
                return isRunning;
            }
            this.mFinishedListeners.add(osfVar);
        }
        return isRunning;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [qsf, java.lang.Object] */
    public qsf obtainHolderInfo() {
        return new Object();
    }

    public qsf recordPostLayoutInformation(etf etfVar, g gVar) {
        qsf obtainHolderInfo = obtainHolderInfo();
        obtainHolderInfo.getClass();
        View view = gVar.itemView;
        obtainHolderInfo.a = view.getLeft();
        obtainHolderInfo.b = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    public qsf recordPreLayoutInformation(etf etfVar, g gVar, int i, List<Object> list) {
        qsf obtainHolderInfo = obtainHolderInfo();
        obtainHolderInfo.getClass();
        View view = gVar.itemView;
        obtainHolderInfo.a = view.getLeft();
        obtainHolderInfo.b = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    public abstract void runPendingAnimations();

    public void setAddDuration(long j) {
        this.mAddDuration = j;
    }

    public void setChangeDuration(long j) {
        this.mChangeDuration = j;
    }

    public void setListener(psf psfVar) {
        this.mListener = psfVar;
    }

    public void setMoveDuration(long j) {
        this.mMoveDuration = j;
    }

    public void setRemoveDuration(long j) {
        this.mRemoveDuration = j;
    }

    public void onAnimationFinished(g gVar) {
    }

    public void onAnimationStarted(g gVar) {
    }
}
