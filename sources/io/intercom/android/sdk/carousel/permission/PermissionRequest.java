package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface PermissionRequest {
    void attach(PermissionResultListener permissionResultListener);

    void detach();

    void handleResult(String[] strArr, int[] iArr);

    void request(ScreenAction screenAction, int i);
}
