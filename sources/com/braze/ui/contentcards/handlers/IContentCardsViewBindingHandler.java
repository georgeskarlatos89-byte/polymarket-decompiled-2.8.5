package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import defpackage.g43;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "", "Lg43;", "cards", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "onCreateViewHolder", "(Landroid/content/Context;Ljava/util/List;Landroid/view/ViewGroup;I)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "adapterPosition", "", "onBindViewHolder", "(Landroid/content/Context;Ljava/util/List;Lcom/braze/ui/contentcards/view/ContentCardViewHolder;I)V", "getItemViewType", "(Landroid/content/Context;Ljava/util/List;I)I", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(Context context, List<? extends g43> cards, int adapterPosition);

    void onBindViewHolder(Context context, List<? extends g43> cards, ContentCardViewHolder viewHolder, int adapterPosition);

    ContentCardViewHolder onCreateViewHolder(Context context, List<? extends g43> cards, ViewGroup viewGroup, int viewType);
}
