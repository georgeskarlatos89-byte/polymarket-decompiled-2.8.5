package io.getstream.chat.android.models;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lio/getstream/chat/android/models/CustomObject;", "", "extraData", "", "", "getExtraData", "()Ljava/util/Map;", "getExtraValue", "T", "key", "default", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/models/MemberData;", "Lio/getstream/chat/android/models/MemberInfo;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/models/ThreadInfo;", "Lio/getstream/chat/android/models/User;", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CustomObject {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getExtraValue(CustomObject customObject, String str, T t) {
            str.getClass();
            return (T) CustomObject.access$getExtraValue$jd(customObject, str, t);
        }
    }

    static /* synthetic */ Object access$getExtraValue$jd(CustomObject customObject, String str, Object obj) {
        return super.getExtraValue(str, obj);
    }

    Map<String, Object> getExtraData();

    default <T> T getExtraValue(String key, T r3) {
        key.getClass();
        if (getExtraData().containsKey(key)) {
            return (T) getExtraData().get(key);
        }
        return r3;
    }
}
