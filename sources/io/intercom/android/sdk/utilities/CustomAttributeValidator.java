package io.intercom.android.sdk.utilities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class CustomAttributeValidator {
    private static final List<? extends Class<? extends Serializable>> ACCEPTED_CUSTOM_ATTRIBUTE_TYPES = Arrays.asList(String.class, Character.class, Short.class, Long.class, Float.class, Double.class, Integer.class, Byte.class, Boolean.class);

    public static String getAcceptedTypes() {
        StringBuilder sb = new StringBuilder();
        for (Class<? extends Serializable> cls : ACCEPTED_CUSTOM_ATTRIBUTE_TYPES) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(cls.getSimpleName());
        }
        return sb.toString();
    }

    public static boolean isValid(Object obj) {
        if (obj != null && !ACCEPTED_CUSTOM_ATTRIBUTE_TYPES.contains(obj.getClass())) {
            return false;
        }
        return true;
    }
}
