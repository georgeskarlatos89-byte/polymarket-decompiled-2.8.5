package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener(null);
    protected final PermissionManager permissionManager;
    private PermissionResultListener permissionResultListener;

    public PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    private void handleRequestResult(String[] strArr, int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void attach(PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void detach() {
        this.permissionResultListener = null;
    }

    public PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener = this.permissionResultListener;
        if (permissionResultListener == null) {
            return this.nullListener;
        }
        return permissionResultListener;
    }

    public void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    public void handleRequest(List<String> list, int i) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void handleResult(String[] strArr, int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void request(ScreenAction screenAction, int i) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (!validPermissions.isEmpty()) {
            handleRequest(validPermissions, i);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class NullPermissionResultListener implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        public /* synthetic */ NullPermissionResultListener(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void requestBackgroundLocationPermission() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedPermanently() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedTemporarily() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showGranted() {
        }
    }
}
