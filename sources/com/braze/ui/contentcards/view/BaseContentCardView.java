package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.ui.R$drawable;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;
import defpackage.g43;
import defpackage.k81;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0004¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lg43;", "T", "Lcom/braze/ui/widget/BaseCardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "card", "", "bindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;Lg43;)V", "Landroid/widget/ImageView;", "imageView", "", "cardAspectRatio", "", "cardImageUrl", "cardAltImageText", "setOptionalCardImage", "(Landroid/widget/ImageView;FLjava/lang/String;Ljava/lang/String;Lg43;)V", "Lcom/braze/ui/actions/IAction;", "cardAction", "", "isClickHandled", "(Landroid/content/Context;Lg43;Lcom/braze/ui/actions/IAction;)Z", "safeSetClipToOutline", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "view", "setViewBackground", "(Landroid/view/View;)V", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseContentCardView<T extends g43> extends BaseCardView<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    private static final void bindViewHolder$lambda$0(BaseContentCardView baseContentCardView, g43 g43Var, UriAction uriAction, View view) {
        baseContentCardView.handleCardClick(baseContentCardView.applicationContext, g43Var, uriAction);
    }

    public static /* synthetic */ void f(BaseContentCardView baseContentCardView, g43 g43Var, UriAction uriAction, View view) {
        bindViewHolder$lambda$0(baseContentCardView, g43Var, uriAction, view);
    }

    public void bindViewHolder(ContentCardViewHolder viewHolder, g43 card) {
        boolean z;
        viewHolder.getClass();
        card.getClass();
        viewHolder.setPinnedIconVisible(card.j);
        boolean z2 = false;
        if (this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.p) {
            z = true;
        } else {
            z = false;
        }
        viewHolder.setUnreadBarVisible(z);
        UriAction uriActionForCard = BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new k81(this, card, uriActionForCard, 0));
        if (uriActionForCard != null) {
            z2 = true;
        }
        viewHolder.setActionHintVisible(z2);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, g43 card, IAction cardAction) {
        context.getClass();
        card.getClass();
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener == null || !contentCardsActionListener.onContentCardClicked(context, card, cardAction)) {
            return false;
        }
        return true;
    }

    public final void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public final void setOptionalCardImage(ImageView imageView, float cardAspectRatio, String cardImageUrl, String cardAltImageText, g43 card) {
        card.getClass();
        if (imageView != null && cardImageUrl != null) {
            setImageViewToUrl(imageView, cardImageUrl, cardAspectRatio, card);
            if (cardAltImageText != null) {
                imageView.setContentDescription(cardAltImageText);
            }
        }
    }

    public final void setViewBackground(View view) {
        view.getClass();
        view.setBackground(getResources().getDrawable(R$drawable.com_braze_content_card_background, null));
        view.setForeground(getResources().getDrawable(R$drawable.com_braze_content_card_scrim, null));
    }
}
