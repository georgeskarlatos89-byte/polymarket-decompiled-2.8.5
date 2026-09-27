package io.ably.lib.types;

import io.ably.lib.http.Http;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface BasePaginatedResult<T> {
    Http.Request<BasePaginatedResult<T>> current();

    Http.Request<BasePaginatedResult<T>> first();

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    Http.Request<BasePaginatedResult<T>> next();
}
