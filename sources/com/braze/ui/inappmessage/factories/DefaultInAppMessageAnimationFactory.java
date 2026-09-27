package com.braze.ui.inappmessage.factories;

import android.R;
import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.braze.ui.inappmessage.IInAppMessageAnimationFactory;
import com.braze.ui.support.AnimationUtils;
import defpackage.jj9;
import defpackage.qs9;
import defpackage.y9h;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageAnimationFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "<init>", "()V", "Ljj9;", "inAppMessage", "Landroid/view/animation/Animation;", "getOpeningAnimation", "(Ljj9;)Landroid/view/animation/Animation;", "getClosingAnimation", "", "shortAnimationDurationMs", "J", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final long shortAnimationDurationMs = Resources.getSystem().getInteger(R.integer.config_shortAnimTime);

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getClosingAnimation(jj9 inAppMessage) {
        inAppMessage.getClass();
        if (inAppMessage instanceof qs9) {
            y9h y9hVar = ((qs9) inAppMessage).E;
            y9h y9hVar2 = y9h.TOP;
            long j = this.shortAnimationDurationMs;
            if (y9hVar == y9hVar2) {
                return AnimationUtils.createVerticalAnimation(0.0f, -1.0f, j, false);
            }
            return AnimationUtils.createVerticalAnimation(0.0f, 1.0f, j, false);
        }
        return AnimationUtils.setAnimationParams(new AlphaAnimation(1.0f, 0.0f), this.shortAnimationDurationMs, false);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getOpeningAnimation(jj9 inAppMessage) {
        inAppMessage.getClass();
        if (inAppMessage instanceof qs9) {
            y9h y9hVar = ((qs9) inAppMessage).E;
            y9h y9hVar2 = y9h.TOP;
            long j = this.shortAnimationDurationMs;
            if (y9hVar == y9hVar2) {
                return AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, j, false);
            }
            return AnimationUtils.createVerticalAnimation(1.0f, 0.0f, j, false);
        }
        return AnimationUtils.setAnimationParams(new AlphaAnimation(0.0f, 1.0f), this.shortAnimationDurationMs, true);
    }
}
