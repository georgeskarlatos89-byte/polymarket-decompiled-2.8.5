package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomPreviewNotificationBinding implements y8k {
    public final ComposeView chatSnippetComposeView;
    public final TextView inAppNotificationMessageSummary;
    public final FrameLayout notificationRoot;
    public final FrameLayout parentCard;
    public final ImageView previewAvatar;
    public final ComposeView previewAvatarComposeView;
    public final TextView replyFromTextview;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(FrameLayout frameLayout, ComposeView composeView, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, ComposeView composeView2, TextView textView2, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatSnippetComposeView = composeView;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.parentCard = frameLayout3;
        this.previewAvatar = imageView;
        this.previewAvatarComposeView = composeView2;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewNotificationBinding bind(View view) {
        int i = R.id.chat_snippet_compose_view;
        ComposeView composeView = (ComposeView) m4n.d(view, i);
        if (composeView != null) {
            i = R.id.in_app_notification_message_summary;
            TextView textView = (TextView) m4n.d(view, i);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.parent_card;
                FrameLayout frameLayout2 = (FrameLayout) m4n.d(view, i);
                if (frameLayout2 != null) {
                    i = R.id.preview_avatar;
                    ImageView imageView = (ImageView) m4n.d(view, i);
                    if (imageView != null) {
                        i = R.id.preview_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) m4n.d(view, i);
                        if (composeView2 != null) {
                            i = R.id.reply_from_textview;
                            TextView textView2 = (TextView) m4n.d(view, i);
                            if (textView2 != null) {
                                i = R.id.ticket_header_compose_view;
                                ComposeView composeView3 = (ComposeView) m4n.d(view, i);
                                if (composeView3 != null) {
                                    return new IntercomPreviewNotificationBinding(frameLayout, composeView, textView, frameLayout, frameLayout2, imageView, composeView2, textView2, composeView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.y8k
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @Override // defpackage.y8k
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
