package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.braze.ui.R$layout;
import defpackage.g43;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/view/DefaultContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lg43;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "card", "", "bindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;Lg43;)V", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultContentCardView extends BaseContentCardView<g43> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, g43 card) {
        viewHolder.getClass();
        card.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_default_content_card, viewGroup, false);
        inflate.getClass();
        return new ContentCardViewHolder(inflate, false);
    }
}
