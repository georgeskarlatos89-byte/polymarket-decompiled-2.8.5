package com.socure.idplus.device.callback;

import com.socure.idplus.device.error.SilentNetworkAuthError;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/socure/idplus/device/callback/SilentNetworkAuthCallback;", "", "onError", "", "errorType", "Lcom/socure/idplus/device/error/SilentNetworkAuthError;", "errorMessage", "", "onSuccess", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SilentNetworkAuthCallback {
    void onError(SilentNetworkAuthError errorType, String errorMessage);

    void onSuccess();
}
