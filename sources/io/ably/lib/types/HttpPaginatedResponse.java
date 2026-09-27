package io.ably.lib.types;

import com.google.gson.JsonElement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class HttpPaginatedResponse {
    public int errorCode;
    public String errorMessage;
    public Param[] headers;
    public int statusCode;
    public boolean success;

    public abstract HttpPaginatedResponse current();

    public abstract HttpPaginatedResponse first();

    public abstract boolean hasCurrent();

    public abstract boolean hasFirst();

    public abstract boolean hasNext();

    public abstract boolean isLast();

    public abstract JsonElement[] items();

    public abstract HttpPaginatedResponse next();
}
