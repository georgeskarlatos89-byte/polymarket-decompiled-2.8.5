package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.ui.inappmessage.InAppMessageOperation;
import defpackage.acc;
import defpackage.jj9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "", "Ljj9;", "inAppMessage", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "beforeInAppMessageDisplayed", "(Ljj9;)Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "onInAppMessageClicked", "(Ljj9;)Z", "Lacc;", "button", "onInAppMessageButtonClicked", "(Ljj9;Lacc;)Z", "", "onInAppMessageDismissed", "(Ljj9;)V", "Landroid/view/View;", "inAppMessageView", "beforeInAppMessageViewOpened", "(Landroid/view/View;Ljj9;)V", "afterInAppMessageViewOpened", "beforeInAppMessageViewClosed", "afterInAppMessageViewClosed", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(jj9 inAppMessage) {
        inAppMessage.getClass();
    }

    default void afterInAppMessageViewOpened(View inAppMessageView, jj9 inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    InAppMessageOperation beforeInAppMessageDisplayed(jj9 inAppMessage);

    default void beforeInAppMessageViewClosed(View inAppMessageView, jj9 inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    default void beforeInAppMessageViewOpened(View inAppMessageView, jj9 inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
    }

    default boolean onInAppMessageButtonClicked(jj9 inAppMessage, acc button) {
        inAppMessage.getClass();
        button.getClass();
        return false;
    }

    default boolean onInAppMessageClicked(jj9 inAppMessage) {
        inAppMessage.getClass();
        return false;
    }

    default void onInAppMessageDismissed(jj9 inAppMessage) {
        inAppMessage.getClass();
    }
}
