package com.braze.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import defpackage.jj9;
import defpackage.sl1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JM\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010Jg\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "", "Landroid/view/View;", "inAppMessageView", "Ljj9;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lsl1;", "configurationProvider", "Landroid/view/animation/Animation;", "openingAnimation", "closingAnimation", "clickableInAppMessageView", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "createInAppMessageViewWrapper", "(Landroid/view/View;Ljj9;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lsl1;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "", "buttons", "closeButton", "(Landroid/view/View;Ljj9;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lsl1;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IInAppMessageViewWrapperFactory {
    IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, jj9 inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, sl1 configurationProvider, Animation openingAnimation, Animation closingAnimation, View clickableInAppMessageView);

    IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, jj9 inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, sl1 configurationProvider, Animation openingAnimation, Animation closingAnimation, View clickableInAppMessageView, List<? extends View> buttons, View closeButton);
}
