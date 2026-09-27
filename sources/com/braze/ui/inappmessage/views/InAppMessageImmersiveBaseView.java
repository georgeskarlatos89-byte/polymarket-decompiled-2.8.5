package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.braze.ui.R$dimen;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import defpackage.acc;
import defpackage.ace;
import defpackage.b69;
import defpackage.js9;
import defpackage.kqi;
import defpackage.ns9;
import defpackage.om1;
import defpackage.pm1;
import defpackage.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0011J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0004\u0018\u0001048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u0001048&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "imageRetrievalSuccessful", "", "resetMessageMargins", "(Z)V", "", "numButtons", "setupDirectionalNavigation", "(I)V", "", "Lacc;", "messageButtons", "setMessageButtons", "(Ljava/util/List;)V", "color", "setMessageCloseButtonColor", "setMessageHeaderTextColor", "", "text", "setMessageHeaderText", "(Ljava/lang/String;)V", "setMessage", "Lkqi;", "textAlign", "setMessageHeaderTextAlignment", "(Lkqi;)V", "setFrameColor", "Landroid/view/View;", "getMessageButtonViews", "(I)Ljava/util/List;", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "closeButtonView", "setLargerCloseButtonClickArea", "(Landroid/view/View;)V", "getFrameView", "()Landroid/view/View;", "frameView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void b(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) {
        setLargerCloseButtonClickArea$lambda$1(view, inAppMessageImmersiveBaseView, viewParent);
    }

    public static /* synthetic */ String c(int i) {
        return setupDirectionalNavigation$lambda$1(i);
    }

    public static /* synthetic */ void d(View view) {
        setupDirectionalNavigation$lambda$2(view);
    }

    public static /* synthetic */ String e() {
        return setupDirectionalNavigation$lambda$0();
    }

    public static /* synthetic */ String f() {
        return setLargerCloseButtonClickArea$lambda$0();
    }

    private static final String setLargerCloseButtonClickArea$lambda$0() {
        return "Cannot increase click area for view if view and/or parent are null.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void setLargerCloseButtonClickArea$lambda$1(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    private static final String setupDirectionalNavigation$lambda$0() {
        return "closeButtonId is null. Cannot continue setting up navigation.";
    }

    private static final String setupDirectionalNavigation$lambda$1(int i) {
        return ace.f(i, "Cannot setup directional navigation. Got unsupported number of buttons: ");
    }

    private static final void setupDirectionalNavigation$lambda$2(View view) {
        view.requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        event.getClass();
        if (InAppMessageViewUtils.isApiBelowBaklava() && !isInTouchMode() && event.getKeyCode() == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int numButtons);

    public abstract /* synthetic */ View getMessageCloseButtonView();

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        event.getClass();
        if (InAppMessageViewUtils.isApiBelowBaklava() && keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence charSequence;
        super.resetMessageMargins(imageRetrievalSuccessful);
        TextView messageTextView = getMessageTextView();
        CharSequence charSequence2 = null;
        if (messageTextView != null) {
            charSequence = messageTextView.getText();
        } else {
            charSequence = null;
        }
        if (StringsKt.T(String.valueOf(charSequence))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            charSequence2 = messageHeaderTextView.getText();
        }
        if (StringsKt.T(String.valueOf(charSequence2))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int color) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(color));
        }
    }

    public void setLargerCloseButtonClickArea(View closeButtonView) {
        if (closeButtonView != null && closeButtonView.getParent() != null) {
            Object parent = closeButtonView.getParent();
            if (parent instanceof View) {
                ((View) parent).post(new w0(closeButtonView, this, parent, 20));
                return;
            }
            return;
        }
        b69.h(this, pm1.W, null, false, new js9(13), 6);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessage(String text) {
        text.getClass();
        super.setMessage(text);
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setContentDescription(text);
        }
    }

    public void setMessageButtons(List<? extends acc> messageButtons) {
        messageButtons.getClass();
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(messageButtons.size()), messageButtons);
    }

    public void setMessageCloseButtonColor(int color) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, color);
        }
    }

    public void setMessageHeaderText(String text) {
        text.getClass();
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            messageHeaderTextView.setText(text);
        }
        TextView messageHeaderTextView2 = getMessageHeaderTextView();
        if (messageHeaderTextView2 != null) {
            messageHeaderTextView2.setContentDescription(text);
        }
    }

    public void setMessageHeaderTextAlignment(kqi textAlign) {
        textAlign.getClass();
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    public void setMessageHeaderTextColor(int color) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, color);
        }
    }

    public void setupDirectionalNavigation(int numButtons) {
        Integer num;
        List<View> messageButtonViews = getMessageButtonViews(numButtons);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            num = Integer.valueOf(messageCloseButtonView.getId());
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 == null) {
            b69.h(this, pm1.W, null, false, new js9(12), 6);
            return;
        }
        if (numButtons != 0) {
            if (numButtons != 1) {
                if (numButtons != 2) {
                    b69.h(this, pm1.W, null, false, new om1(numButtons, 15), 6);
                } else {
                    View view = messageButtonViews.get(1);
                    View view2 = messageButtonViews.get(0);
                    int id = view.getId();
                    Integer valueOf = Integer.valueOf(id);
                    int id2 = view2.getId();
                    view.setNextFocusLeftId(id2);
                    view.setNextFocusRightId(id2);
                    view.setNextFocusUpId(num2.intValue());
                    view.setNextFocusDownId(num2.intValue());
                    view2.setNextFocusLeftId(id);
                    view2.setNextFocusRightId(id);
                    view2.setNextFocusUpId(num2.intValue());
                    view2.setNextFocusDownId(num2.intValue());
                    messageCloseButtonView.setNextFocusUpId(id);
                    messageCloseButtonView.setNextFocusDownId(id);
                    messageCloseButtonView.setNextFocusRightId(id);
                    messageCloseButtonView.setNextFocusLeftId(id2);
                    messageCloseButtonView = view;
                    num2 = valueOf;
                }
            } else {
                View view3 = messageButtonViews.get(0);
                int id3 = view3.getId();
                Integer valueOf2 = Integer.valueOf(id3);
                view3.setNextFocusLeftId(num2.intValue());
                view3.setNextFocusRightId(num2.intValue());
                view3.setNextFocusUpId(num2.intValue());
                view3.setNextFocusDownId(num2.intValue());
                messageCloseButtonView.setNextFocusUpId(id3);
                messageCloseButtonView.setNextFocusDownId(id3);
                messageCloseButtonView.setNextFocusRightId(id3);
                messageCloseButtonView.setNextFocusLeftId(id3);
                messageCloseButtonView = view3;
                num2 = valueOf2;
            }
        } else {
            messageCloseButtonView.setNextFocusUpId(num2.intValue());
            messageCloseButtonView.setNextFocusDownId(num2.intValue());
            messageCloseButtonView.setNextFocusRightId(num2.intValue());
            messageCloseButtonView.setNextFocusLeftId(num2.intValue());
        }
        setNextFocusUpId(num2.intValue());
        setNextFocusDownId(num2.intValue());
        setNextFocusRightId(num2.intValue());
        setNextFocusLeftId(num2.intValue());
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new ns9(messageCloseButtonView, 0));
        }
    }
}
