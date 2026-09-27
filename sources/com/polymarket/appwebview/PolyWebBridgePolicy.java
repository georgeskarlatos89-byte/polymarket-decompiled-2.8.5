package com.polymarket.appwebview;

import com.checkout.components.wallet.BuildConfig;
import java.net.URI;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0082 J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0019\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgePolicy;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "shouldInject", "", "for_", "Ljava/net/URI;", "Swift_shouldInject_0", "className", "", "url", "forURLString", "Swift_shouldInject_1", "urlString", "androidOriginRules", "", "getAndroidOriginRules", "()Ljava/util/Set;", "Swift_androidOriginRules", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "NoneCase", "StandardCase", "CustomCase", "Companion", "Lcom/polymarket/appwebview/PolyWebBridgePolicy$CustomCase;", "Lcom/polymarket/appwebview/PolyWebBridgePolicy$NoneCase;", "Lcom/polymarket/appwebview/PolyWebBridgePolicy$StandardCase;", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PolyWebBridgePolicy implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PolyWebBridgePolicy none = new NoneCase();
    private static final PolyWebBridgePolicy standard = new StandardCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgePolicy$CustomCase;", "Lcom/polymarket/appwebview/PolyWebBridgePolicy;", "associated0", "Lkotlin/Function1;", "Ljava/net/URI;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getAssociated0", "()Lkotlin/jvm/functions/Function1;", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CustomCase extends PolyWebBridgePolicy {
        private final Function1<URI, Boolean> associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CustomCase(Function1<? super URI, Boolean> function1) {
            super(null);
            function1.getClass();
            this.associated0 = function1;
        }

        public final Function1<URI, Boolean> getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgePolicy$NoneCase;", "Lcom/polymarket/appwebview/PolyWebBridgePolicy;", "<init>", "()V", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NoneCase extends PolyWebBridgePolicy {
        public NoneCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgePolicy$StandardCase;", "Lcom/polymarket/appwebview/PolyWebBridgePolicy;", "<init>", "()V", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StandardCase extends PolyWebBridgePolicy {
        public StandardCase() {
            super(null);
        }
    }

    public /* synthetic */ PolyWebBridgePolicy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Set<String> Swift_androidOriginRules(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native boolean Swift_shouldInject_0(String className, URI url);

    private final native boolean Swift_shouldInject_1(String className, String urlString);

    public static final /* synthetic */ PolyWebBridgePolicy access$getNone$cp() {
        return none;
    }

    public static final /* synthetic */ PolyWebBridgePolicy access$getStandard$cp() {
        return standard;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final Set<String> getAndroidOriginRules() {
        return Swift_androidOriginRules(getClass().getName());
    }

    public final boolean shouldInject(URI for_) {
        for_.getClass();
        return Swift_shouldInject_0(getClass().getName(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgePolicy$Companion;", "", "<init>", "()V", "none", "Lcom/polymarket/appwebview/PolyWebBridgePolicy;", "getNone", "()Lcom/polymarket/appwebview/PolyWebBridgePolicy;", BuildConfig.FLAVOR, "getStandard", "custom", "associated0", "Lkotlin/Function1;", "Ljava/net/URI;", "", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PolyWebBridgePolicy custom(Function1<? super URI, Boolean> associated0) {
            associated0.getClass();
            return new CustomCase(associated0);
        }

        public final PolyWebBridgePolicy getNone() {
            return PolyWebBridgePolicy.access$getNone$cp();
        }

        public final PolyWebBridgePolicy getStandard() {
            return PolyWebBridgePolicy.access$getStandard$cp();
        }

        private Companion() {
        }
    }

    private PolyWebBridgePolicy() {
    }

    public final boolean shouldInject(String forURLString) {
        forURLString.getClass();
        return Swift_shouldInject_1(getClass().getName(), forURLString);
    }
}
