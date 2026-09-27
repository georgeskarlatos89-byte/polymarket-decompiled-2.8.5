package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface CarouselListener {
    void dismissCarousel(String str);

    void openLink(String str);

    void requestPermissions(ScreenAction screenAction);

    void selectNextScreen(String str);

    void skipPermissionScreen();

    void startChat();

    void trackActionButtonTappedStats();
}
