package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;
    private final UnreadTickets unreadTickets;

    public UsersResponse(Builder builder) {
        super(builder);
        ConversationList build;
        ConversationList.Builder builder2 = builder.unread_conversations;
        if (builder2 == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder2.build();
        }
        this.unreadConversations = build;
        UnreadTickets unreadTickets = builder.unread_tickets;
        this.unreadTickets = unreadTickets == null ? UnreadTickets.INSTANCE.getNULL() : unreadTickets;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }

    public UnreadTickets getUnreadTickets() {
        return this.unreadTickets;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class Builder extends BaseResponse.Builder {
        ConversationList.Builder unread_conversations;
        UnreadTickets unread_tickets;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public UsersResponse build() {
            return new UsersResponse(this);
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }
    }
}
