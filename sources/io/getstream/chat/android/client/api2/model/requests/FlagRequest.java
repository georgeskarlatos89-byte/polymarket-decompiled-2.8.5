package io.getstream.chat.android.client.api2.model.requests;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", "", "<init>", "()V", "reason", "", "getReason", "()Ljava/lang/String;", "custom", "", "getCustom", "()Ljava/util/Map;", "Lio/getstream/chat/android/client/api2/model/requests/FlagMessageRequest;", "Lio/getstream/chat/android/client/api2/model/requests/FlagUserRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FlagRequest {
    public /* synthetic */ FlagRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, String> getCustom();

    public abstract String getReason();

    private FlagRequest() {
    }
}
