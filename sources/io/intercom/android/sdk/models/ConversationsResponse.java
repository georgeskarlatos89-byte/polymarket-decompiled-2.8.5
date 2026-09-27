package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    public ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList build;
        ConversationList.Builder builder2 = builder.conversation_page;
        if (builder2 == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder2.build();
        }
        this.conversationPage = build;
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder extends BaseResponse.Builder {
        ConversationList.Builder conversation_page;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }
    }
}
