package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.dmk;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0003"}, d2 = {"isRetryable", "", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkResponseKt {
    public static final boolean isRetryable(NetworkResponse<?> networkResponse) {
        networkResponse.getClass();
        if (networkResponse instanceof NetworkResponse.Success) {
            return false;
        }
        if (networkResponse instanceof NetworkResponse.NetworkError) {
            return true;
        }
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return false;
        }
        if (networkResponse instanceof NetworkResponse.ServerError) {
            if (((NetworkResponse.ServerError) networkResponse).getCode() < 500) {
                return false;
            }
            return true;
        }
        dmk.a();
        return false;
    }
}
