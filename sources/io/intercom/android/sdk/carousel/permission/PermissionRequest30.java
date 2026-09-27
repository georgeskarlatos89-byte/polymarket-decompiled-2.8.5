package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class PermissionRequest30 extends PermissionRequestBefore30 {
    public PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    private boolean askForBackgroundPermission(List<String> list) {
        if (isLocationPermission(list) && isBackgroundPermissionInManifest()) {
            return true;
        }
        return false;
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        if (this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2) {
            return true;
        }
        return false;
    }

    private boolean isBackgroundPermissionInManifest() {
        return !this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty();
    }

    private boolean isLocationPermission(List<String> list) {
        if (!list.contains("android.permission.ACCESS_COARSE_LOCATION") && !list.contains("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    public void handleGranted(String[] strArr) {
        if (askForBackgroundPermission(Arrays.asList(strArr))) {
            if (isBackgroundPermissionDeniedPermanently()) {
                getListener().showDeniedPermanently();
                return;
            } else {
                getListener().requestBackgroundLocationPermission();
                return;
            }
        }
        getListener().showGranted();
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    public void handleRequest(List<String> list, int i) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, i);
    }
}
