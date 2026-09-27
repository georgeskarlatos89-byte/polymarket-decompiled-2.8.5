package com.google.gson.internal;

import com.google.gson.stream.JsonReader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class JsonReaderInternalAccess {
    public static volatile JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader);
}
