package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.Carousel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface CarouselView {
    void logEmptyCarouselError();

    void logUserNotRegisteredError();

    void showGenericError();

    void showLoading();

    void showNotFoundError();

    void showSuccess(Carousel carousel);
}
