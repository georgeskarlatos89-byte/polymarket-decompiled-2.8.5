package io.ably.lib.types;

import io.ably.lib.network.FailedConnectionException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class AblyException extends Exception {
    private static final long serialVersionUID = -3804072091596832634L;
    public ErrorInfo errorInfo;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class HostFailedException extends AblyException {
        private static final long serialVersionUID = 1;

        public HostFailedException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }

    public AblyException(Throwable th, ErrorInfo errorInfo) {
        super(th);
        this.errorInfo = errorInfo;
    }

    public static AblyException fromErrorInfo(Throwable th, ErrorInfo errorInfo) {
        int i = errorInfo.statusCode;
        if (i >= 500 && i <= 504) {
            return new HostFailedException(th, errorInfo);
        }
        return new AblyException(th, errorInfo);
    }

    public static AblyException fromThrowable(Throwable th) {
        if (th instanceof AblyException) {
            return (AblyException) th;
        }
        if (!(th instanceof ConnectException) && !(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof NoRouteToHostException)) {
            if (th instanceof FailedConnectionException) {
                return new HostFailedException(th.getCause(), ErrorInfo.fromThrowable(th.getCause()));
            }
            return new AblyException(th, ErrorInfo.fromThrowable(th));
        }
        return new HostFailedException(th, ErrorInfo.fromThrowable(th));
    }

    public static AblyException fromErrorInfo(ErrorInfo errorInfo) {
        return fromErrorInfo(new Exception(errorInfo.message), errorInfo);
    }
}
