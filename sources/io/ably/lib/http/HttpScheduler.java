package io.ably.lib.http;

import defpackage.ace;
import defpackage.omf;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.network.HttpCall;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpScheduler implements AutoCloseable {
    protected static final String TAG = "io.ably.lib.http.HttpScheduler";
    protected final CloseableExecutor executor;
    private final HttpCore httpCore;

    public HttpScheduler(HttpCore httpCore, CloseableExecutor closeableExecutor) {
        this.httpCore = httpCore;
        this.executor = closeableExecutor;
    }

    public static /* synthetic */ HttpCore access$100(HttpScheduler httpScheduler) {
        return httpScheduler.httpCore;
    }

    public <T> Future<T> ablyHttpExecuteWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithFallback ablyRequestWithFallback = new AblyRequestWithFallback(this, str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback, null);
        this.executor.execute(ablyRequestWithFallback);
        return ablyRequestWithFallback;
    }

    public <T> Future<T> ablyHttpExecuteWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithRetry ablyRequestWithRetry = new AblyRequestWithRetry(this, str, str2, str3, paramArr, paramArr2, requestBody, responseHandler, z, callback, null);
        this.executor.execute(ablyRequestWithRetry);
        return ablyRequestWithRetry;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        boolean isTerminated;
        CloseableExecutor closeableExecutor = this.executor;
        if (closeableExecutor instanceof AutoCloseable) {
            closeableExecutor.close();
            return;
        }
        if (closeableExecutor instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) closeableExecutor;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        omf.a();
    }

    public <T> Future<T> del(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.DELETE, paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> exec(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public <T> Future<T> get(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.GET, paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> httpExecute(URL url, String str, Param[] paramArr, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
        UrlRequest urlRequest = new UrlRequest(this, url, str, paramArr, null, requestBody, responseHandler, callback, null);
        this.executor.execute(urlRequest);
        return urlRequest;
    }

    public <T> Future<T> patch(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.PATCH, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> post(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.POST, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> put(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.PUT, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public class UrlRequest<T> extends AsyncRequest<T> {
        private final URL url;

        private UrlRequest(URL url, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            super(HttpScheduler.this, str, paramArr, paramArr2, requestBody, responseHandler, callback, null);
            this.url = url;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                setResult(httpExecuteWithRetry(this.url));
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }

        public /* synthetic */ UrlRequest(HttpScheduler httpScheduler, URL url, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler responseHandler, Callback callback, AnonymousClass1 anonymousClass1) {
            this(url, str, paramArr, paramArr2, requestBody, responseHandler, callback);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public class AblyRequestWithFallback<T> extends AsyncRequest<T> {
        private final String path;
        private final boolean requireAblyAuth;

        private AblyRequestWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(HttpScheduler.this, str2, paramArr, paramArr2, requestBody, responseHandler, callback, null);
            this.path = str;
            this.requireAblyAuth = z;
        }

        private String extendMessage(String str) {
            if (Param.getFirst(this.params, "request_id") == null) {
                return str;
            }
            Locale locale = Locale.ROOT;
            return ace.m(str, " request_id=", Param.getFirst(this.params, "request_id"));
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            String preferredHost = HttpScheduler.access$100(HttpScheduler.this).hosts.getPreferredHost();
            if (HttpScheduler.access$100(HttpScheduler.this).hosts.fallbackHostsRemaining(preferredHost) > 0) {
                i = HttpScheduler.access$100(HttpScheduler.this).options.httpMaxRetryCount;
            } else {
                i = 0;
            }
            while (!this.isCancelled) {
                try {
                    T httpExecuteWithRetry = httpExecuteWithRetry(preferredHost, this.path, this.requireAblyAuth);
                    this.result = httpExecuteWithRetry;
                    setResult(httpExecuteWithRetry);
                    HttpScheduler.access$100(HttpScheduler.this).hosts.setPreferredHost(preferredHost, true);
                } catch (AblyException.HostFailedException e) {
                    try {
                        i--;
                        if (i < 0) {
                            ErrorInfo errorInfo = e.errorInfo;
                            errorInfo.message = extendMessage(errorInfo.message);
                            setError(e.errorInfo);
                        } else {
                            String str = HttpScheduler.TAG;
                            Log.d(str, extendMessage("Connection failed to host `" + preferredHost + "`. Searching for new host..."));
                            preferredHost = HttpScheduler.access$100(HttpScheduler.this).hosts.getFallback(preferredHost);
                            if (preferredHost == null) {
                                ErrorInfo errorInfo2 = e.errorInfo;
                                errorInfo2.message = extendMessage(errorInfo2.message);
                                setError(e.errorInfo);
                            } else {
                                Log.d(str, extendMessage("Switched to `" + preferredHost + "`."));
                                disposeConnection();
                            }
                        }
                    } catch (Throwable th) {
                        disposeConnection();
                        throw th;
                    }
                } catch (AblyException e2) {
                    ErrorInfo errorInfo3 = e2.errorInfo;
                    errorInfo3.message = extendMessage(errorInfo3.message);
                    setError(e2.errorInfo);
                }
                disposeConnection();
                return;
            }
        }

        public /* synthetic */ AblyRequestWithFallback(HttpScheduler httpScheduler, String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler responseHandler, boolean z, Callback callback, AnonymousClass1 anonymousClass1) {
            this(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public abstract class AsyncRequest<T> implements Future<T>, Runnable {
        protected final Callback<T> callback;
        protected ErrorInfo err;
        protected final Param[] headers;
        protected HttpCall httpCall;
        protected boolean isCancelled;
        protected boolean isDone;
        protected final String method;
        protected final Param[] params;
        protected final HttpCore.RequestBody requestBody;
        protected final HttpCore.ResponseHandler<T> responseHandler;
        protected T result;

        private AsyncRequest(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            this.isCancelled = false;
            this.isDone = false;
            this.method = str;
            this.headers = paramArr;
            this.params = paramArr2;
            this.requestBody = requestBody;
            this.responseHandler = responseHandler;
            this.callback = callback;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            this.isCancelled = true;
            return disposeConnection();
        }

        public synchronized boolean disposeConnection() {
            boolean z;
            HttpCall httpCall = this.httpCall;
            if (httpCall != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                httpCall.cancel();
                this.httpCall = null;
            }
            return z;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            long currentTimeMillis = System.currentTimeMillis() + millis;
            synchronized (this) {
                while (millis > 0) {
                    try {
                        wait(millis);
                        if (this.isDone) {
                            break;
                        }
                        millis = currentTimeMillis - System.currentTimeMillis();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.isDone) {
                    ErrorInfo errorInfo = this.err;
                    if (errorInfo != null) {
                        throw new ExecutionException(AblyException.fromErrorInfo(errorInfo));
                    }
                } else {
                    throw new TimeoutException();
                }
            }
            return this.result;
        }

        public T httpExecuteWithRetry(String str, String str2, boolean z) {
            return (T) HttpScheduler.access$100(HttpScheduler.this).httpExecuteWithRetry(HttpUtils.buildURL(HttpScheduler.access$100(HttpScheduler.this).scheme, str, HttpScheduler.access$100(HttpScheduler.this).port, str2, this.params), this.method, this.headers, this.requestBody, this.responseHandler, z);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.isCancelled;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.isDone;
        }

        public void setError(ErrorInfo errorInfo) {
            synchronized (this) {
                this.err = errorInfo;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onError(errorInfo);
            }
        }

        public void setResult(T t) {
            synchronized (this) {
                this.result = t;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onSuccess(t);
            }
        }

        public /* synthetic */ AsyncRequest(HttpScheduler httpScheduler, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler responseHandler, Callback callback, AnonymousClass1 anonymousClass1) {
            this(str, paramArr, paramArr2, requestBody, responseHandler, callback);
        }

        public T httpExecuteWithRetry(URL url) {
            return (T) HttpScheduler.access$100(HttpScheduler.this).httpExecuteWithRetry(url, this.method, this.headers, this.requestBody, this.responseHandler, false);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            synchronized (this) {
                while (!this.isDone) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ErrorInfo errorInfo = this.err;
                if (errorInfo != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(errorInfo));
                }
            }
            return this.result;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public class AblyRequestWithRetry<T> extends AsyncRequest<T> {
        private final String host;
        private final String path;
        private final Boolean requireAblyAuth;

        private AblyRequestWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(HttpScheduler.this, str3, paramArr, paramArr2, requestBody, responseHandler, callback, null);
            this.host = str;
            this.path = str2;
            this.requireAblyAuth = Boolean.valueOf(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                T httpExecuteWithRetry = httpExecuteWithRetry(this.host, this.path, this.requireAblyAuth.booleanValue());
                this.result = httpExecuteWithRetry;
                setResult(httpExecuteWithRetry);
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }

        public /* synthetic */ AblyRequestWithRetry(HttpScheduler httpScheduler, String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler responseHandler, boolean z, Callback callback, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        }
    }
}
