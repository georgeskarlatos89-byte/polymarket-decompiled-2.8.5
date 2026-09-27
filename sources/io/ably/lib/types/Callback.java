package io.ably.lib.types;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface Callback<T> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static abstract class Map<T, U> implements Callback<T> {
        private final Callback<U> callback;

        public Map(Callback<U> callback) {
            this.callback = callback;
        }

        public abstract U map(T t);

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            this.callback.onSuccess(map(t));
        }
    }

    void onError(ErrorInfo errorInfo);

    void onSuccess(T t);
}
