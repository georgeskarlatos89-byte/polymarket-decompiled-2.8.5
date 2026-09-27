package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface d {
    default Long a(String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    Map b();

    default List c(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(","));
        }
        return Collections.EMPTY_LIST;
    }

    default Boolean d(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    String getProperty(String str);
}
