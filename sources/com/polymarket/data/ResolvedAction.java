package com.polymarket.data;

import java.net.URI;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/ResolvedAction;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analyticsKind", "", "getAnalyticsKind", "()Ljava/lang/String;", "Swift_analyticsKind", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "InAppCase", "ExternalCase", "AppStoreCase", "NoneCase", "Companion", "Lcom/polymarket/data/ResolvedAction$AppStoreCase;", "Lcom/polymarket/data/ResolvedAction$ExternalCase;", "Lcom/polymarket/data/ResolvedAction$InAppCase;", "Lcom/polymarket/data/ResolvedAction$NoneCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ResolvedAction implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ResolvedAction none = new NoneCase();
    private static final String canonicalHost = "polymarket.us";

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ResolvedAction$AppStoreCase;", "Lcom/polymarket/data/ResolvedAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AppStoreCase extends ResolvedAction {
        private final URI associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppStoreCase(URI uri) {
            super(null);
            uri.getClass();
            this.associated0 = uri;
        }

        public boolean equals(Object other) {
            if (!(other instanceof AppStoreCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((AppStoreCase) other).associated0);
        }

        public final URI getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ResolvedAction$ExternalCase;", "Lcom/polymarket/data/ResolvedAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ExternalCase extends ResolvedAction {
        private final URI associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalCase(URI uri) {
            super(null);
            uri.getClass();
            this.associated0 = uri;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ExternalCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((ExternalCase) other).associated0);
        }

        public final URI getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ResolvedAction$InAppCase;", "Lcom/polymarket/data/ResolvedAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InAppCase extends ResolvedAction {
        private final URI associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppCase(URI uri) {
            super(null);
            uri.getClass();
            this.associated0 = uri;
        }

        public boolean equals(Object other) {
            if (!(other instanceof InAppCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((InAppCase) other).associated0);
        }

        public final URI getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/ResolvedAction$NoneCase;", "Lcom/polymarket/data/ResolvedAction;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NoneCase extends ResolvedAction {
        public NoneCase() {
            super(null);
        }
    }

    public /* synthetic */ ResolvedAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_analyticsKind(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ String access$getCanonicalHost$cp() {
        return canonicalHost;
    }

    public static final /* synthetic */ ResolvedAction access$getNone$cp() {
        return none;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getAnalyticsKind() {
        return Swift_analyticsKind(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0010\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082 J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082 J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082 J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0082 J\u0010\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0007J\u0013\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0082 R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014¨\u0006\""}, d2 = {"Lcom/polymarket/data/ResolvedAction$Companion;", "", "<init>", "()V", "inApp", "Lcom/polymarket/data/ResolvedAction;", "associated0", "Ljava/net/URI;", "external", "appStore", "none", "getNone", "()Lcom/polymarket/data/ResolvedAction;", "canonicalHost", "", "getCanonicalHost", "()Ljava/lang/String;", "inAppHosts", "", "getInAppHosts", "()Ljava/util/Set;", "Swift_Companion_inAppHosts", "inAppSchemes", "getInAppSchemes", "Swift_Companion_inAppSchemes", "allowedExternalHosts", "getAllowedExternalHosts", "Swift_Companion_allowedExternalHosts", "appStoreHosts", "getAppStoreHosts", "Swift_Companion_appStoreHosts", "classify", "url", "Swift_Companion_classify_0", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Set<String> Swift_Companion_allowedExternalHosts();

        private final native Set<String> Swift_Companion_appStoreHosts();

        private final native ResolvedAction Swift_Companion_classify_0(URI url);

        private final native Set<String> Swift_Companion_inAppHosts();

        private final native Set<String> Swift_Companion_inAppSchemes();

        public final ResolvedAction appStore(URI associated0) {
            associated0.getClass();
            return new AppStoreCase(associated0);
        }

        public final ResolvedAction classify(URI url) {
            return Swift_Companion_classify_0(url);
        }

        public final ResolvedAction external(URI associated0) {
            associated0.getClass();
            return new ExternalCase(associated0);
        }

        public final Set<String> getAllowedExternalHosts() {
            return Swift_Companion_allowedExternalHosts();
        }

        public final Set<String> getAppStoreHosts() {
            return Swift_Companion_appStoreHosts();
        }

        public final String getCanonicalHost() {
            return ResolvedAction.access$getCanonicalHost$cp();
        }

        public final Set<String> getInAppHosts() {
            return Swift_Companion_inAppHosts();
        }

        public final Set<String> getInAppSchemes() {
            return Swift_Companion_inAppSchemes();
        }

        public final ResolvedAction getNone() {
            return ResolvedAction.access$getNone$cp();
        }

        public final ResolvedAction inApp(URI associated0) {
            associated0.getClass();
            return new InAppCase(associated0);
        }

        private Companion() {
        }
    }

    private ResolvedAction() {
    }
}
