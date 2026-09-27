package io.ably.lib.http;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class Http implements AutoCloseable {
    private final AsyncHttpScheduler asyncHttp;
    private final SyncHttpScheduler syncHttp;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface Execute<Result> {
        void execute(HttpScheduler httpScheduler, Callback<Result> callback);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public class Request<Result> {
        private final Execute<Result> execute;

        public Request(Execute<Result> execute) {
            this.execute = execute;
        }

        public void async(Callback<Result> callback) {
            try {
                this.execute.execute(Http.access$200(Http.this), callback);
            } catch (AblyException e) {
                callback.onError(e.errorInfo);
            }
        }

        public Result sync() {
            final SyncExecuteResult syncExecuteResult = new SyncExecuteResult(null);
            this.execute.execute(Http.access$100(Http.this), new Callback<Result>() { // from class: io.ably.lib.http.Http.Request.1
                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    syncExecuteResult.error = errorInfo;
                }

                @Override // io.ably.lib.types.Callback
                public void onSuccess(Result result) {
                    syncExecuteResult.ok = result;
                }
            });
            ErrorInfo errorInfo = syncExecuteResult.error;
            if (errorInfo == null) {
                return syncExecuteResult.ok;
            }
            throw AblyException.fromErrorInfo(errorInfo);
        }
    }

    public Http(AsyncHttpScheduler asyncHttpScheduler, SyncHttpScheduler syncHttpScheduler) {
        this.asyncHttp = asyncHttpScheduler;
        this.syncHttp = syncHttpScheduler;
    }

    public static /* synthetic */ SyncHttpScheduler access$100(Http http) {
        return http.syncHttp;
    }

    public static /* synthetic */ AsyncHttpScheduler access$200(Http http) {
        return http.asyncHttp;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.asyncHttp.close();
    }

    public void connect() {
        this.asyncHttp.connect();
    }

    public Http exchangeHttpCore(HttpCore httpCore) {
        return new Http(this.asyncHttp.exchangeHttpCore(httpCore), new SyncHttpScheduler(httpCore));
    }

    public <Result> Request<Result> failedRequest(final AblyException ablyException) {
        return new Request<>(new Execute<Result>() { // from class: io.ably.lib.http.Http.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, final Callback<Result> callback) {
                httpScheduler.execute(new Runnable() { // from class: io.ably.lib.http.Http.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.onError(ablyException.errorInfo);
                    }
                });
            }
        });
    }

    public <Result> Request<Result> request(Execute<Result> execute) {
        return new Request<>(execute);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class SyncExecuteResult<Result> {
        public ErrorInfo error;
        public Result ok;

        private SyncExecuteResult() {
            this.ok = null;
            this.error = null;
        }

        public /* synthetic */ SyncExecuteResult(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
