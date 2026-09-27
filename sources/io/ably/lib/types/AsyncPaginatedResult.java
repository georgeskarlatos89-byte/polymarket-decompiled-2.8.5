package io.ably.lib.types;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface AsyncPaginatedResult<T> {
    void current(Callback<AsyncPaginatedResult<T>> callback);

    void first(Callback<AsyncPaginatedResult<T>> callback);

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    T[] items();

    void next(Callback<AsyncPaginatedResult<T>> callback);
}
