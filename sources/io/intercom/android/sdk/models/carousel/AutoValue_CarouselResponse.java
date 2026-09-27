package io.intercom.android.sdk.models.carousel;

import defpackage.dmk;
import io.intercom.android.sdk.models.carousel.Carousel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_CarouselResponse extends CarouselResponse {
    private final Carousel.Builder carousel;

    public AutoValue_CarouselResponse(Carousel.Builder builder) {
        if (builder != null) {
            this.carousel = builder;
        } else {
            dmk.s("Null carousel");
            throw null;
        }
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselResponse
    public Carousel.Builder carousel() {
        return this.carousel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselResponse) {
            return this.carousel.equals(((CarouselResponse) obj).carousel());
        }
        return false;
    }

    public int hashCode() {
        return this.carousel.hashCode() ^ 1000003;
    }

    public String toString() {
        return "CarouselResponse{carousel=" + this.carousel + "}";
    }
}
