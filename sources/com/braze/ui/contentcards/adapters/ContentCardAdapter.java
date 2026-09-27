package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.g;
import bo.app.r2;
import bo.app.t9;
import bo.app.v9;
import bo.app.w1;
import bo.app.z9;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import defpackage.ace;
import defpackage.b35;
import defpackage.b69;
import defpackage.c35;
import defpackage.cm1;
import defpackage.f93;
import defpackage.g43;
import defpackage.j81;
import defpackage.kd0;
import defpackage.m4l;
import defpackage.om1;
import defpackage.pm1;
import defpackage.pql;
import defpackage.qs6;
import defpackage.ro4;
import defpackage.ss6;
import defpackage.sv6;
import defpackage.us1;
import defpackage.woa;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020 2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b1\u0010\"J\u0019\u00103\u001a\u0004\u0018\u00010\t2\u0006\u00102\u001a\u00020\u0011H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020 2\u0006\u00100\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010\"J\u0019\u00107\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020 2\u0006\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010E\u001a\b\u0012\u0004\u0012\u00020B0*2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020B0*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010-¨\u0006J"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/c;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "Lg43;", "cardData", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "position", "", "onBindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onItemDismiss", "(I)V", "", "isItemDismissable", "(I)Z", "holder", "onViewAttachedToWindow", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;)V", "onViewDetachedFromWindow", "", "getItemId", "(I)J", "", "newCardData", "replaceCards", "(Ljava/util/List;)V", "markOnScreenCardsAsRead", "()V", "adapterPosition", "isControlCardAtPosition", "index", "getCardAtIndex", "(I)Lg43;", "isAdapterPositionOnScreen", "card", "logImpression", "(Lg43;)V", "isInvalidIndex", "Landroid/content/Context;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ljava/util/List;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "", "impressedCardIdsInternal", "Ljava/util/Set;", "impressedCardIds", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "CardListDiffCallback", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class ContentCardAdapter extends c implements ItemTouchHelperAdapter {
    private final List<g43> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Lqs6;", "", "Lg43;", "oldCards", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "doItemsShareIds", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areItemsTheSame", "areContentsTheSame", "Ljava/util/List;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CardListDiffCallback extends qs6 {
        private final List<g43> newCards;
        private final List<g43> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends g43> list, List<? extends g43> list2) {
            list.getClass();
            list2.getClass();
            this.oldCards = list;
            this.newCards = list2;
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return Intrinsics.areEqual(this.oldCards.get(oldItemPosition).f, this.newCards.get(newItemPosition).f);
        }

        @Override // defpackage.qs6
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // defpackage.qs6
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // defpackage.qs6
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // defpackage.qs6
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<g43> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        context.getClass();
        linearLayoutManager.getClass();
        list.getClass();
        iContentCardsViewBindingHandler.getClass();
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    public static /* synthetic */ String a(int i) {
        return onViewAttachedToWindow$lambda$0(i);
    }

    public static /* synthetic */ String b(int i, ContentCardAdapter contentCardAdapter) {
        return onItemDismiss$lambda$0(i, contentCardAdapter);
    }

    public static /* synthetic */ String c(g43 g43Var) {
        return logImpression$lambda$1(g43Var);
    }

    public static /* synthetic */ String d(int i, int i2) {
        return markOnScreenCardsAsRead$lambda$1(i, i2);
    }

    public static /* synthetic */ String e() {
        return markOnScreenCardsAsRead$lambda$0();
    }

    public static /* synthetic */ void f(int i, ContentCardAdapter contentCardAdapter) {
        onViewDetachedFromWindow$lambda$1(contentCardAdapter, i);
    }

    public static /* synthetic */ String g(int i) {
        return onViewDetachedFromWindow$lambda$0(i);
    }

    private static final String getCardAtIndex$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        StringBuilder o = ace.o(i, "Cannot return card at index: ", " in cards list of size: ");
        o.append(contentCardAdapter.cardData.size());
        return o.toString();
    }

    public static /* synthetic */ String h(g43 g43Var) {
        return logImpression$lambda$0(g43Var);
    }

    public static /* synthetic */ void i(int i, int i2, ContentCardAdapter contentCardAdapter) {
        markOnScreenCardsAsRead$lambda$2(i, i2, contentCardAdapter);
    }

    private final boolean isInvalidIndex(int index) {
        if (index >= 0 && index < this.cardData.size()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String j(int i, ContentCardAdapter contentCardAdapter) {
        return getCardAtIndex$lambda$0(i, contentCardAdapter);
    }

    private static final String logImpression$lambda$0(g43 g43Var) {
        return "Logged impression for card ".concat(g43Var.f);
    }

    private static final String logImpression$lambda$1(g43 g43Var) {
        return "Already counted impression for card ".concat(g43Var.f);
    }

    private static final String markOnScreenCardsAsRead$lambda$0() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    private static final String markOnScreenCardsAsRead$lambda$1(int i, int i2) {
        return woa.l(i, i2, "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ", " . Last visible: ");
    }

    private static final void markOnScreenCardsAsRead$lambda$2(int i, int i2, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    private static final String onItemDismiss$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        StringBuilder o = ace.o(i, "Cannot dismiss card at index: ", " in cards list of size: ");
        o.append(contentCardAdapter.cardData.size());
        return o.toString();
    }

    private static final String onViewAttachedToWindow$lambda$0(int i) {
        return sv6.j(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not logging impression.");
    }

    private static final String onViewDetachedFromWindow$lambda$0(int i) {
        return sv6.j(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not marking as read.");
    }

    private static final void onViewDetachedFromWindow$lambda$1(ContentCardAdapter contentCardAdapter, int i) {
        contentCardAdapter.notifyItemChanged(i);
    }

    public final g43 getCardAtIndex(int index) {
        if (isInvalidIndex(index)) {
            b69.h(this, null, null, false, new c35(index, 1, this), 7);
            return null;
        }
        return this.cardData.get(index);
    }

    public final List<String> getImpressedCardIds() {
        return CollectionsKt.M0(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.c
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.c
    public long getItemId(int position) {
        if (getCardAtIndex(position) != null) {
            return r0.f.hashCode();
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.c
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        int K;
        int S0 = this.layoutManager.S0();
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        View V0 = linearLayoutManager.V0(0, linearLayoutManager.v(), true, false);
        int i = -1;
        if (V0 == null) {
            K = -1;
        } else {
            K = e.K(V0);
        }
        int min = Math.min(S0, K);
        int T0 = this.layoutManager.T0();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        View V02 = linearLayoutManager2.V0(linearLayoutManager2.v() - 1, -1, true, false);
        if (V02 != null) {
            i = e.K(V02);
        }
        int max = Math.max(T0, i);
        if (min > adapterPosition || adapterPosition > max) {
            return false;
        }
        return true;
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        g43 cardAtIndex = getCardAtIndex(adapterPosition);
        if (cardAtIndex != null && cardAtIndex.b() == f93.CONTROL) {
            return true;
        }
        return false;
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (!this.cardData.isEmpty() && !isInvalidIndex(position)) {
            return this.cardData.get(position).m;
        }
        return false;
    }

    public final void logImpression(g43 card) {
        if (card != null) {
            String str = card.f;
            if (!this.impressedCardIdsInternal.contains(str)) {
                card.h();
                this.impressedCardIdsInternal.add(str);
                b69.h(this, pm1.V, null, false, new j81(card, 5), 6);
            } else {
                b69.h(this, pm1.V, null, false, new j81(card, 6), 6);
            }
            if (!card.o) {
                card.o = true;
                card.c.markCardAsViewed(str);
            }
        }
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            b69.h(this, null, null, false, new ro4(27), 7);
            return;
        }
        int S0 = this.layoutManager.S0();
        int T0 = this.layoutManager.T0();
        if (S0 >= 0 && T0 >= 0) {
            if (S0 <= T0) {
                int i = S0;
                while (true) {
                    g43 cardAtIndex = getCardAtIndex(i);
                    if (cardAtIndex != null) {
                        cardAtIndex.j();
                    }
                    if (i == T0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.handler.post(new b35(T0, S0, this));
            return;
        }
        b69.h(this, null, null, false, new cm1(S0, T0, 3), 7);
    }

    public void onBindViewHolder(ContentCardViewHolder viewHolder, int position) {
        viewHolder.getClass();
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.c
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        viewGroup.getClass();
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        if (isInvalidIndex(position)) {
            b69.h(this, null, null, false, new c35(position, 0, this), 7);
            return;
        }
        g43 remove = this.cardData.remove(position);
        z9 z9Var = remove.d;
        v9 v9Var = remove.b;
        String str = remove.f;
        if (remove.q) {
            b69.h(remove, pm1.W, null, false, new us1(23), 6);
        } else {
            remove.q = true;
            remove.c.markCardAsDismissed(str);
            try {
                if (remove.d()) {
                    t9 i = w1.g.i(str);
                    if (i != null) {
                        ((r2) v9Var).a(i);
                    }
                }
            } catch (Exception e) {
                b69.h(remove, pm1.W, e, false, new us1(24), 4);
            }
        }
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, remove);
        }
    }

    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewAttachedToWindow((g) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        } else {
            b69.h(this, pm1.V, null, false, new om1(bindingAdapterPosition, 7), 6);
        }
    }

    public void onViewDetachedFromWindow(ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewDetachedFromWindow((g) holder);
        if (!this.cardData.isEmpty()) {
            int bindingAdapterPosition = holder.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
                g43 cardAtIndex = getCardAtIndex(bindingAdapterPosition);
                if (cardAtIndex != null && !cardAtIndex.p) {
                    cardAtIndex.j();
                    this.handler.post(new kd0(this, bindingAdapterPosition, 4));
                    return;
                }
                return;
            }
            b69.h(this, pm1.V, null, false, new om1(bindingAdapterPosition, 8), 6);
        }
    }

    public final synchronized void replaceCards(List<? extends g43> newCardData) {
        newCardData.getClass();
        ss6 b = pql.b(new CardListDiffCallback(this.cardData, newCardData));
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        b.a(new m4l(this));
    }

    public final void setImpressedCardIds(List<String> list) {
        list.getClass();
        this.impressedCardIdsInternal = CollectionsKt.P0(list);
    }

    @Override // androidx.recyclerview.widget.c
    public /* bridge */ /* synthetic */ void onBindViewHolder(g gVar, int i) {
        onBindViewHolder((ContentCardViewHolder) gVar, i);
    }

    @Override // androidx.recyclerview.widget.c
    public /* bridge */ /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.c
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(g gVar) {
        onViewAttachedToWindow((ContentCardViewHolder) gVar);
    }

    @Override // androidx.recyclerview.widget.c
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(g gVar) {
        onViewDetachedFromWindow((ContentCardViewHolder) gVar);
    }
}
