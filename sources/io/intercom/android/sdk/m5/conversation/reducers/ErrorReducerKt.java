package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"reduceError", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "networkResponse", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorReducerKt {
    public static final ConversationUiState reduceError(NetworkResponse<? extends Object> networkResponse, TopAppBarUiState topAppBarUiState) {
        networkResponse.getClass();
        topAppBarUiState.getClass();
        return new ConversationUiState.Error(NetworkResponseKt.isRetryable(networkResponse), topAppBarUiState);
    }
}
