package io.intercom.android.sdk.utilities.commons;

import java.util.Collection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class CollectionUtils {
    public static int capacityFor(Collection<?> collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }
}
