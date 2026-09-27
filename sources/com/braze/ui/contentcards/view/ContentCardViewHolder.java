package com.braze.ui.contentcards.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Landroidx/recyclerview/widget/g;", "Landroid/view/View;", "view", "", "showUnreadIndicator", "<init>", "(Landroid/view/View;Z)V", "isVisible", "", "setPinnedIconVisible", "(Z)V", "setUnreadBarVisible", "setActionHintVisible", "", "text", "setActionHintText", "(Ljava/lang/String;)V", "unreadBar", "Landroid/view/View;", "Landroid/widget/ImageView;", "pinnedIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "actionHint", "Landroid/widget/TextView;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class ContentCardViewHolder extends g {
    private final TextView actionHint;
    private final ImageView pinnedIcon;
    private final View unreadBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardViewHolder(View view, boolean z) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R$id.com_braze_content_cards_unread_bar);
        this.unreadBar = findViewById;
        this.pinnedIcon = (ImageView) view.findViewById(R$id.com_braze_content_cards_pinned_icon);
        this.actionHint = (TextView) view.findViewById(R$id.com_braze_content_cards_action_hint);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(R$drawable.com_braze_content_cards_unread_bar_background, null));
                return;
            }
            return;
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void setActionHintText(String text) {
        text.getClass();
        TextView textView = this.actionHint;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public final void setActionHintVisible(boolean isVisible) {
        int i;
        TextView textView = this.actionHint;
        if (textView != null) {
            if (isVisible) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public final void setPinnedIconVisible(boolean isVisible) {
        ImageView imageView;
        int i;
        ImageView imageView2 = this.pinnedIcon;
        if (imageView2 != null) {
            if (isVisible) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
        }
        if (isVisible) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1 && (imageView = this.pinnedIcon) != null) {
                imageView.setScaleX(-1.0f);
            }
        }
    }

    public final void setUnreadBarVisible(boolean isVisible) {
        int i;
        View view = this.unreadBar;
        if (view != null) {
            if (isVisible) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
