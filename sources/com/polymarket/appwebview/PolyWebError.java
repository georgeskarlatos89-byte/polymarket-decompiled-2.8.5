package com.polymarket.appwebview;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Error;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004:\u0003\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 \u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/polymarket/appwebview/PolyWebError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "NavigationCase", "HttpCase", "Companion", "Lcom/polymarket/appwebview/PolyWebError$HttpCase;", "Lcom/polymarket/appwebview/PolyWebError$NavigationCase;", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PolyWebError extends Exception implements Error, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/polymarket/appwebview/PolyWebError$HttpCase;", "Lcom/polymarket/appwebview/PolyWebError;", "associated0", "", "associated1", "", "associated2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()I", "getAssociated2", "host", "getHost", "statusCode", "getStatusCode", "description", "getDescription", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HttpCase extends PolyWebError {
        private final String associated0;
        private final int associated1;
        private final String associated2;
        private final String description;
        private final String host;
        private final int statusCode;

        public HttpCase(String str, int i, String str2) {
            super(null);
            this.associated0 = str;
            this.associated1 = i;
            this.associated2 = str2;
            this.host = str;
            this.statusCode = i;
            this.description = str2;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final int getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getHost() {
            return this.host;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/polymarket/appwebview/PolyWebError$NavigationCase;", "Lcom/polymarket/appwebview/PolyWebError;", "associated0", "", "associated1", "", "associated2", "associated3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()I", "getAssociated2", "getAssociated3", "host", "getHost", ApiConstant.KEY_CODE, "getCode", "domain", "getDomain", "description", "getDescription", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NavigationCase extends PolyWebError {
        private final String associated0;
        private final int associated1;
        private final String associated2;
        private final String associated3;
        private final int code;
        private final String description;
        private final String domain;
        private final String host;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationCase(String str, int i, String str2, String str3) {
            super(null);
            str2.getClass();
            this.associated0 = str;
            this.associated1 = i;
            this.associated2 = str2;
            this.associated3 = str3;
            this.host = str;
            this.code = i;
            this.domain = str2;
            this.description = str3;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final int getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getAssociated3() {
            return this.associated3;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getHost() {
            return this.host;
        }
    }

    public /* synthetic */ PolyWebError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\"\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/appwebview/PolyWebError$Companion;", "", "<init>", "()V", "navigation", "Lcom/polymarket/appwebview/PolyWebError;", "host", "", ApiConstant.KEY_CODE, "", "domain", "description", "http", "statusCode", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PolyWebError http(String host, int statusCode, String description) {
            return new HttpCase(host, statusCode, description);
        }

        public final PolyWebError navigation(String host, int code, String domain, String description) {
            domain.getClass();
            return new NavigationCase(host, code, domain, description);
        }

        private Companion() {
        }
    }

    private PolyWebError() {
    }
}
