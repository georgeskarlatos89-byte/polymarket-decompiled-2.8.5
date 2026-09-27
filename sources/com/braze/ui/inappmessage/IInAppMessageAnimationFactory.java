package com.braze.ui.inappmessage;

import android.view.animation.Animation;
import defpackage.jj9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "", "Ljj9;", "inAppMessage", "Landroid/view/animation/Animation;", "getOpeningAnimation", "(Ljj9;)Landroid/view/animation/Animation;", "getClosingAnimation", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IInAppMessageAnimationFactory {
    Animation getClosingAnimation(jj9 inAppMessage);

    Animation getOpeningAnimation(jj9 inAppMessage);
}
