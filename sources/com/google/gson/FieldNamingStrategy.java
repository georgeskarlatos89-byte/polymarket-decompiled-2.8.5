package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface FieldNamingStrategy {
    default List<String> alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    String translateName(Field field);
}
