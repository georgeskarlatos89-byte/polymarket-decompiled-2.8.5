package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LogEventResponse extends UsersResponse {
    private final Carousel carousel;

    public LogEventResponse(Builder builder) {
        super(builder);
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder extends UsersResponse.Builder {
        Carousel.Builder carousel;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public LogEventResponse build() {
            return new LogEventResponse(this);
        }

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ UsersResponse build() {
            return build();
        }

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }
    }
}
