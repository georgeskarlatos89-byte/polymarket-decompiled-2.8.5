package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface PrefetchOperationCallbackBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PrefetchResultTypeBoundaryInterface {
        public static final int DUPLICATE = 1;
        public static final int SUCCESS = 0;
    }

    void onFailure(int i, String str, int i2);

    void onResult(int i);

    @Deprecated
    default void onSuccess() {
        throw new UnsupportedOperationException("http://crbug.com/483041824 Replaced by onResult.");
    }
}
