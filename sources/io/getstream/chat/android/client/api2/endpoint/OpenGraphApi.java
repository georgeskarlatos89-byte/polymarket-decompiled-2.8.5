package io.getstream.chat.android.client.api2.endpoint;

import defpackage.ar8;
import defpackage.fu0;
import defpackage.zif;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.call.RetrofitCall;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@fu0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lio/getstream/chat/android/client/api2/endpoint/OpenGraphApi;", "", "get", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "url", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OpenGraphApi {
    @ar8("/og")
    RetrofitCall<AttachmentDto> get(@zif("url") String url);
}
