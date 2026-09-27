package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomPreviewChatFullOverlayBinding implements y8k {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatFullComposeView;
    public final View chatOverlayOverflowFade;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, View view, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    public static IntercomPreviewChatFullOverlayBinding bind(View view) {
        View d;
        int i = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) m4n.d(view, i);
        if (frameLayout != null) {
            i = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) m4n.d(view, i);
            if (frameLayout2 != null) {
                i = R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) m4n.d(view, i);
                if (composeView != null && (d = m4n.d(view, (i = R.id.chat_overlay_overflow_fade))) != null) {
                    i = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) m4n.d(view, i);
                    if (imageView != null) {
                        i = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) m4n.d(view, i);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
                            if (linearLayout != null) {
                                i = R.id.chathead_text_header;
                                TextView textView = (TextView) m4n.d(view, i);
                                if (textView != null) {
                                    i = R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) m4n.d(view, i);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, d, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
                                    }
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

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
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

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
