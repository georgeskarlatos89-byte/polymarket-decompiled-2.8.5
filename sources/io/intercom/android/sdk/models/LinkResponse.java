package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Link;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    public LinkResponse(Builder builder) {
        super(builder);
        Link build;
        Link.Builder builder2 = builder.article;
        if (builder2 == null) {
            build = new Link.Builder().build();
        } else {
            build = builder2.build();
        }
        this.link = build;
    }

    public Link getLink() {
        return this.link;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }
    }
}
