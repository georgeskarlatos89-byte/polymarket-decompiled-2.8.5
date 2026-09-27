package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
abstract class ChatNotification extends InAppNotification {
    private static final int ANIMATION_DURATION = 170;
    private static final int GROWTH_WIDTH = 355;

    public ChatNotification(Context context, Conversation conversation, int i, int i2, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i, i2, listener, provider);
    }

    public static /* synthetic */ void c(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        lambda$getWidthAnimator$1(viewGroup, valueAnimator);
    }

    public static /* synthetic */ void d(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        lambda$getMarginAnimator$0(viewGroup, valueAnimator);
    }

    private void expandChat(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.chathead_text_container);
        if (viewGroup2 == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.chathead_text_header);
        View contentContainer = getContentContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
        View findViewById = viewGroup.findViewById(R.id.chat_avatar_container);
        float translationX = findViewById.getTranslationX();
        float translationY = findViewById.getTranslationY();
        Property property = View.ALPHA;
        ObjectAnimator.ofPropertyValuesHolder(findViewById, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.8f), PropertyValuesHolder.ofFloat("translationX", translationX, 100.0f + translationX), PropertyValuesHolder.ofFloat("translationY", translationY, translationY - 40.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.8f)).setDuration(170L).start();
        ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f, 0.0f).setDuration(170L).start();
        ObjectAnimator.ofFloat(contentContainer, (Property<View, Float>) property, 1.0f, 0.0f).setDuration(170L).start();
        getWidthAnimator(viewGroup2, animatorListenerAdapter).start();
        getWidthAnimator(this.overlayRoot).start();
        getMarginAnimator(viewGroup2, marginLayoutParams).start();
    }

    private Animator getMarginAnimator(ViewGroup viewGroup, ViewGroup.MarginLayoutParams marginLayoutParams) {
        ValueAnimator ofInt = ValueAnimator.ofInt(marginLayoutParams.leftMargin, 0);
        ofInt.addUpdateListener(new a(viewGroup, 1));
        ofInt.setDuration(170L);
        return ofInt;
    }

    private ValueAnimator getWidthAnimator(ViewGroup viewGroup) {
        ValueAnimator ofInt = ValueAnimator.ofInt(viewGroup.getMeasuredWidth(), ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ofInt.addUpdateListener(new a(viewGroup, 0));
        ofInt.setDuration(170L);
        return ofInt;
    }

    private static /* synthetic */ void lambda$getMarginAnimator$0(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.leftMargin = intValue;
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    private static /* synthetic */ void lambda$getWidthAnimator$1(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = intValue;
        viewGroup.setLayoutParams(layoutParams);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, int i) {
        if (this.overlayRoot == null) {
            this.overlayRoot = inflateChatRootView(viewGroup, layoutInflater);
        }
        if (!isAttached()) {
            viewGroup.addView(this.overlayRoot, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, calculateBottomMargin(this.position, i, this.overlayRoot.getContext()));
        this.overlayRoot.setLayoutParams(layoutParams);
        this.bottomPadding = i;
        populateViewsWithData();
        this.overlayRoot.setVisibility(0);
        beginListeningForTouchEvents();
    }

    public abstract View getContentContainer();

    public abstract ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater);

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
        expandChat(viewGroup, animatorListenerAdapter);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void onNotificationPressed(View view) {
        view.animate().scaleX(0.9f).scaleY(0.9f).alpha(0.9f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(50L).start();
    }

    public abstract void populateViewsWithData();

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public abstract void updateViewDataDuringReplyPulse(int i);

    private Animator getWidthAnimator(ViewGroup viewGroup, final Animator.AnimatorListener animatorListener) {
        final int abs = Math.abs(viewGroup.getMeasuredWidth() - ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ValueAnimator widthAnimator = getWidthAnimator(viewGroup);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.1
            boolean hasSentUpdate = false;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = abs;
                int i2 = 100;
                if (i > 0) {
                    i2 = 100 * (intValue / i);
                }
                if (i2 > 80 && !this.hasSentUpdate) {
                    this.hasSentUpdate = true;
                    animatorListener.onAnimationEnd(null);
                }
            }
        });
        return widthAnimator;
    }
}
