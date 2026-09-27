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
public final class IntercomPreviewChatSnippetOverlayBinding implements y8k {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatSnippetComposeView;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final TextView chatheadTextBody;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, TextView textView, LinearLayout linearLayout, TextView textView2, FrameLayout frameLayout5, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = frameLayout5;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewChatSnippetOverlayBinding bind(View view) {
        int i = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) m4n.d(view, i);
        if (frameLayout != null) {
            i = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) m4n.d(view, i);
            if (frameLayout2 != null) {
                i = R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) m4n.d(view, i);
                if (composeView != null) {
                    i = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) m4n.d(view, i);
                    if (imageView != null) {
                        i = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) m4n.d(view, i);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = R.id.chathead_text_body;
                            TextView textView = (TextView) m4n.d(view, i);
                            if (textView != null) {
                                i = R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
                                if (linearLayout != null) {
                                    i = R.id.chathead_text_header;
                                    TextView textView2 = (TextView) m4n.d(view, i);
                                    if (textView2 != null) {
                                        i = R.id.parent_card;
                                        FrameLayout frameLayout4 = (FrameLayout) m4n.d(view, i);
                                        if (frameLayout4 != null) {
                                            i = R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) m4n.d(view, i);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, frameLayout4, composeView3);
                                            }
                                        }
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

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
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

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
