package androidx.recyclerview.widget;

import android.view.View;
import defpackage.dmk;
import defpackage.k9k;
import defpackage.sv6;
import defpackage.tsf;
import defpackage.xbc;
import io.sentry.android.core.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class g {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    c mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    g mShadowedHolder = null;
    g mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    f mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public g(View view) {
        if (view != null) {
            this.itemView = view;
        } else {
            dmk.v("itemView may not be null");
            throw null;
        }
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i) {
        this.mFlags = i | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) == 0) {
            View view = this.itemView;
            WeakHashMap weakHashMap = k9k.a;
            if (view.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
        addFlags(8);
        offsetPosition(i2, z);
        this.mPosition = i;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.K(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final c getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        c adapter;
        int K;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.mOwnerRecyclerView.K(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, K);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) == 0) {
            List<Object> list = this.mPayloads;
            if (list != null && list.size() != 0) {
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int i) {
        if ((this.mFlags & i) != 0) {
            return true;
        }
        return false;
    }

    public boolean isAdapterPositionUnknown() {
        if ((this.mFlags & 512) == 0 && !isInvalid()) {
            return false;
        }
        return true;
    }

    public boolean isAttachedToTransitionOverlay() {
        if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        if ((this.mFlags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isInvalid() {
        if ((this.mFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0) {
            View view = this.itemView;
            WeakHashMap weakHashMap = k9k.a;
            if (!view.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isRemoved() {
        if ((this.mFlags & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isScrap() {
        if (this.mScrapContainer != null) {
            return true;
        }
        return false;
    }

    public boolean isTmpDetached() {
        if ((this.mFlags & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean isUpdated() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean needsUpdate() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        int i2 = this.mPreLayoutPosition;
        if (i2 == -1) {
            i2 = this.mPosition;
            this.mPreLayoutPosition = i2;
        }
        if (z) {
            this.mPreLayoutPosition = i2 + i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((tsf) this.itemView.getLayoutParams()).c = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i = this.mPendingAccessibilityState;
        if (i != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i;
        } else {
            this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
        }
        if (recyclerView.S()) {
            this.mPendingAccessibilityState = 4;
            recyclerView.H1.add(this);
        } else {
            this.itemView.setImportantForAccessibility(4);
        }
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        int i = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.S()) {
            this.mPendingAccessibilityState = i;
            recyclerView.H1.add(this);
        } else {
            this.itemView.setImportantForAccessibility(i);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.P1 && isTmpDetached()) {
            xbc.o(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.l(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (~i2));
    }

    public final void setIsRecyclable(boolean z) {
        int i;
        int i2 = this.mIsRecyclableCount;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.mIsRecyclableCount = i;
        if (i < 0) {
            this.mIsRecyclableCount = 0;
            if (!RecyclerView.P1) {
                m0.d("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i == 1) {
            this.mFlags |= 16;
        } else if (z && i == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.Q1) {
            toString();
        }
    }

    public void setScrapContainer(f fVar, boolean z) {
        this.mScrapContainer = fVar;
        this.mInChangeScrap = z;
    }

    public boolean shouldBeKeptAsChild() {
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean shouldIgnore() {
        if ((this.mFlags & 128) != 0) {
            return true;
        }
        return false;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder t = sv6.t(simpleName, "{");
        t.append(Integer.toHexString(hashCode()));
        t.append(" position=");
        t.append(this.mPosition);
        t.append(" id=");
        t.append(this.mItemId);
        t.append(", oldPos=");
        t.append(this.mOldPosition);
        t.append(", pLpos:");
        t.append(this.mPreLayoutPosition);
        StringBuilder sb = new StringBuilder(t.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            if (this.mInChangeScrap) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m(this);
    }

    public boolean wasReturnedFromScrap() {
        if ((this.mFlags & 32) != 0) {
            return true;
        }
        return false;
    }
}
