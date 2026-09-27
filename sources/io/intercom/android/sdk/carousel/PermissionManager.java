package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.intercom.twig.Twig;
import defpackage.d55;
import defpackage.m9;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class PermissionManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final Twig twig = LumberMill.getLogger();
    private final Activity activity;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PermissionStatus {
        public static final int DENIED_TEMPORARILY = 1;
        public static final int GRANTED = 0;
        public static final int NEVER_ASKED_OR_DENIED_PERMANENTLY = 2;
    }

    public PermissionManager(Activity activity) {
        this.activity = activity;
    }

    public boolean anyPermissionPermanentlyDeniedInResult(String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (iArr[i] == -1 && !m9.t(this.activity, strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public int getPermissionStatus(String str) {
        if (d55.a(this.activity, str) == 0) {
            return 0;
        }
        if (m9.t(this.activity, str)) {
            return 1;
        }
        return 2;
    }

    public List<String> permissionsExistInManifest(List<String> list) {
        ArrayList arrayList = new ArrayList();
        List<String> permissionsInManifest = permissionsInManifest();
        for (String str : list) {
            if (permissionsInManifest.contains(str)) {
                BACKGROUND_LOCATION_PERMISSION.equals(str);
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public boolean permissionsGranted(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (getPermissionStatus(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public List<String> permissionsInManifest() {
        try {
            return Arrays.asList(this.activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e) {
            twig.internal("Package name is unknown, error: " + e.getMessage());
            return new ArrayList();
        }
    }

    public void requestPermissions(String[] strArr, int i) {
        m9.s(this.activity, strArr, i);
    }
}
