package io.ably.lib.util;

import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PublishResult;
import io.ably.lib.types.UpdateDeleteResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class Listeners {
    public static <T> Callback<T> fromCompletionListener(CompletionListener completionListener) {
        return new CompletionListenerWrapper(completionListener, null);
    }

    public static Callback<PublishResult> toPublishResultListener(Callback<UpdateDeleteResult> callback) {
        return new UpdateResultToPublishAdapter(callback, null);
    }

    public static <T> CompletionListener unwrap(Callback<T> callback) {
        if (callback instanceof CompletionListenerWrapper) {
            return CompletionListenerWrapper.access$200((CompletionListenerWrapper) callback);
        }
        return null;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class CompletionListenerWrapper<T> implements Callback<T> {
        private final CompletionListener listener;

        private CompletionListenerWrapper(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        public static /* synthetic */ CompletionListener access$200(CompletionListenerWrapper completionListenerWrapper) {
            return completionListenerWrapper.listener;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onError(errorInfo);
            }
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onSuccess();
            }
        }

        public /* synthetic */ CompletionListenerWrapper(CompletionListener completionListener, AnonymousClass1 anonymousClass1) {
            this(completionListener);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class UpdateResultToPublishAdapter implements Callback<PublishResult> {
        private final Callback<UpdateDeleteResult> listener;

        private UpdateResultToPublishAdapter(Callback<UpdateDeleteResult> callback) {
            this.listener = callback;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            Callback<UpdateDeleteResult> callback = this.listener;
            if (callback != null) {
                callback.onError(errorInfo);
            }
        }

        /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public void onSuccess2(PublishResult publishResult) {
            String str;
            String[] strArr;
            Callback<UpdateDeleteResult> callback = this.listener;
            if (callback != null) {
                if (publishResult != null && (strArr = publishResult.serials) != null && strArr.length > 0) {
                    str = strArr[0];
                } else {
                    str = null;
                }
                callback.onSuccess(new UpdateDeleteResult(str));
            }
        }

        public /* synthetic */ UpdateResultToPublishAdapter(Callback callback, AnonymousClass1 anonymousClass1) {
            this(callback);
        }

        @Override // io.ably.lib.types.Callback
        public /* bridge */ /* synthetic */ void onSuccess(PublishResult publishResult) {
            onSuccess2(publishResult);
        }
    }
}
