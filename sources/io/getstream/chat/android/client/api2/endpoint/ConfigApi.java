package io.getstream.chat.android.client.api2.endpoint;

import defpackage.ar8;
import defpackage.fu0;
import io.getstream.chat.android.client.call.RetrofitCall;
import io.getstream.chat.android.network.models.GetApplicationResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@fu0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;", "", "getAppSettings", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/network/models/GetApplicationResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfigApi {
    @ar8("/app")
    RetrofitCall<GetApplicationResponse> getAppSettings();
}
