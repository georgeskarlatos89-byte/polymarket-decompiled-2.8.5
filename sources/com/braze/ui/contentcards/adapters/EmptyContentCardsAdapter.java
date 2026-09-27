package com.braze.ui.contentcards.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.braze.ui.R$layout;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "Landroidx/recyclerview/widget/c;", "Landroidx/recyclerview/widget/g;", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/g;", "viewHolder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/g;I)V", "getItemCount", "()I", "NetworkUnavailableViewHolder", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class EmptyContentCardsAdapter extends c {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter$NetworkUnavailableViewHolder;", "Landroidx/recyclerview/widget/g;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NetworkUnavailableViewHolder extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkUnavailableViewHolder(View view) {
            super(view);
            view.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.c
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.c
    public void onBindViewHolder(g viewHolder, int position) {
        viewHolder.getClass();
    }

    @Override // androidx.recyclerview.widget.c
    public g onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_content_cards_empty, viewGroup, false);
        inflate.getClass();
        return new NetworkUnavailableViewHolder(inflate);
    }
}
