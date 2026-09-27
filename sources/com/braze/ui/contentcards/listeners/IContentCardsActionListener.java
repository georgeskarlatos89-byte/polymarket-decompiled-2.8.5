package com.braze.ui.contentcards.listeners;

import android.content.Context;
import com.braze.ui.actions.IAction;
import defpackage.g43;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "", "Landroid/content/Context;", "context", "Lg43;", "card", "Lcom/braze/ui/actions/IAction;", "cardAction", "", "onContentCardClicked", "(Landroid/content/Context;Lg43;Lcom/braze/ui/actions/IAction;)Z", "", "onContentCardDismissed", "(Landroid/content/Context;Lg43;)V", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IContentCardsActionListener {
    default boolean onContentCardClicked(Context context, g43 card, IAction cardAction) {
        context.getClass();
        card.getClass();
        return false;
    }

    default void onContentCardDismissed(Context context, g43 card) {
        context.getClass();
        card.getClass();
    }
}
