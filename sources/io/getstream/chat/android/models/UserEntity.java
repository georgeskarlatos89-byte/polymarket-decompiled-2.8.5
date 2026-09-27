package io.getstream.chat.android.models;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/getstream/chat/android/models/UserEntity;", "", "user", "Lio/getstream/chat/android/models/User;", "getUser", "()Lio/getstream/chat/android/models/User;", "getUserId", "", "Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/models/ThreadParticipant;", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UserEntity {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static String getUserId(UserEntity userEntity) {
            return UserEntity.access$getUserId$jd(userEntity);
        }
    }

    static /* synthetic */ String access$getUserId$jd(UserEntity userEntity) {
        return super.getUserId();
    }

    User getUser();

    default String getUserId() {
        return getUser().getId();
    }
}
