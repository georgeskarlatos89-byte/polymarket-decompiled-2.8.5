package androidx.recyclerview.widget;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import defpackage.dmk;
import defpackage.fi9;
import defpackage.isf;
import defpackage.jsf;
import defpackage.ksf;
import defpackage.tsf;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class c {
    private final jsf mObservable = new Observable();
    private boolean mHasStableIds = false;
    private isf mStateRestorationPolicy = isf.ALLOW;

    public final void bindViewHolder(g gVar, int i) {
        boolean z;
        if (gVar.mBindingAdapter == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            gVar.mPosition = i;
            if (hasStableIds()) {
                gVar.mItemId = getItemId(i);
            }
            gVar.setFlags(1, 519);
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(gVar.mItemViewType)));
            }
        }
        gVar.mBindingAdapter = this;
        if (RecyclerView.P1) {
            if (gVar.itemView.getParent() == null && gVar.itemView.isAttachedToWindow() != gVar.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + gVar.isTmpDetached() + ", attached to window: " + gVar.itemView.isAttachedToWindow() + ", holder: " + gVar);
            }
            if (gVar.itemView.getParent() == null && gVar.itemView.isAttachedToWindow()) {
                fi9.q(gVar, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        onBindViewHolder(gVar, i, gVar.getUnmodifiedPayloads());
        if (z) {
            gVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = gVar.itemView.getLayoutParams();
            if (layoutParams instanceof tsf) {
                ((tsf) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final g createViewHolder(ViewGroup viewGroup, int i) {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            g onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(c cVar, g gVar, int i) {
        if (cVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final isf getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.c(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.d(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.e(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.f(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public abstract void onBindViewHolder(g gVar, int i);

    public void onBindViewHolder(g gVar, int i, List<Object> list) {
        onBindViewHolder(gVar, i);
    }

    public abstract g onCreateViewHolder(ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(g gVar) {
        return false;
    }

    public void registerAdapterDataObserver(ksf ksfVar) {
        this.mObservable.registerObserver(ksfVar);
    }

    public void setHasStableIds(boolean z) {
        if (!hasObservers()) {
            this.mHasStableIds = z;
        } else {
            dmk.n("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public void setStateRestorationPolicy(isf isfVar) {
        this.mStateRestorationPolicy = isfVar;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(ksf ksfVar) {
        this.mObservable.unregisterObserver(ksfVar);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.d(i, i2, obj);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(g gVar) {
    }

    public void onViewDetachedFromWindow(g gVar) {
    }

    public void onViewRecycled(g gVar) {
    }
}
