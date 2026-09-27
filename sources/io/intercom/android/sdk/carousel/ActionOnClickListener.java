package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    public ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.screenAction.isPermissionAction()) {
            this.listener.requestPermissions(this.screenAction);
            return;
        }
        String type = this.screenAction.getType();
        switch (type.hashCode()) {
            case -1573653227:
                if (type.equals(ActionType.START_CHAT)) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.startChat();
                    return;
                }
                break;
            case -567202649:
                type.equals(ActionType.CONTINUE);
                break;
            case 3321850:
                if (type.equals(ActionType.LINK)) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.openLink(this.screenAction.getUri());
                    return;
                }
                break;
            case 3532159:
                if (type.equals(ActionType.SKIP)) {
                    this.listener.skipPermissionScreen();
                    return;
                }
                break;
            case 1671672458:
                if (type.equals(ActionType.DISMISS)) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.dismissCarousel(MetricTracker.Context.FROM_CTA);
                    return;
                }
                break;
        }
        this.listener.selectNextScreen(MetricTracker.Context.FROM_CTA);
    }
}
