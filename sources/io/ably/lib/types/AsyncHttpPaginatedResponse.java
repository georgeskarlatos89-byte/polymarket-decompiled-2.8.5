package io.ably.lib.types;

import com.google.gson.JsonElement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class AsyncHttpPaginatedResponse {
    public int errorCode;
    public String errorMessage;
    public Param[] headers;
    public int statusCode;
    public boolean success;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface Callback {
        void onError(ErrorInfo errorInfo);

        void onResponse(AsyncHttpPaginatedResponse asyncHttpPaginatedResponse);
    }

    public abstract void current(Callback callback);

    public abstract void first(Callback callback);

    public abstract boolean hasCurrent();

    public abstract boolean hasFirst();

    public abstract boolean hasNext();

    public abstract JsonElement[] items();

    public abstract void next(Callback callback);
}
