package io.ably.lib.realtime;

import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface CompletionListener {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class FromCallback implements CompletionListener {
        private final Callback<Void> callback;

        public FromCallback(Callback<Void> callback) {
            this.callback = callback;
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onSuccess() {
            this.callback.onSuccess(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class Multicaster extends io.ably.lib.util.Multicaster<CompletionListener> implements CompletionListener {
        public Multicaster(CompletionListener... completionListenerArr) {
            super(completionListenerArr);
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onError(ErrorInfo errorInfo) {
            Iterator<CompletionListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onError(errorInfo);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onSuccess() {
            Iterator<CompletionListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onSuccess();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class ToCallback<T> implements Callback<T> {
        private CompletionListener listener;

        public ToCallback(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.listener.onError(errorInfo);
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            this.listener.onSuccess();
        }
    }

    void onError(ErrorInfo errorInfo);

    void onSuccess();
}
