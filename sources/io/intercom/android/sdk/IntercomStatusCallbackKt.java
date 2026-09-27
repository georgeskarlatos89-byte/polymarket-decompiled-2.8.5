package io.intercom.android.sdk;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"noStatusCallback", "Lio/intercom/android/sdk/IntercomStatusCallback;", "getNoStatusCallback", "()Lio/intercom/android/sdk/IntercomStatusCallback;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomStatusCallbackKt {
    private static final IntercomStatusCallback noStatusCallback = new IntercomStatusCallback() { // from class: io.intercom.android.sdk.IntercomStatusCallbackKt$noStatusCallback$1
        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onFailure(IntercomError intercomError) {
            intercomError.getClass();
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onSuccess() {
        }
    };

    public static final IntercomStatusCallback getNoStatusCallback() {
        return noStatusCallback;
    }
}
