package io.getstream.chat.android.models;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lio/getstream/chat/android/models/NoOpMessageTransformer;", "Lio/getstream/chat/android/models/MessageTransformer;", "<init>", "()V", "transform", "Lio/getstream/chat/android/models/Message;", "message", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoOpMessageTransformer implements MessageTransformer {
    public static final NoOpMessageTransformer INSTANCE = new NoOpMessageTransformer();

    private NoOpMessageTransformer() {
    }

    @Override // io.getstream.chat.android.models.MessageTransformer
    public Message transform(Message message) {
        message.getClass();
        return message;
    }
}
