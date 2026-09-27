package com.polymarket.usdependencies;

import com.polymarket.data.APIUSNotification;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "InAppCase", "ExternalCase", "AppStoreCase", "OpenInboxCase", "DismissCase", "Companion", "Lcom/polymarket/usdependencies/NotificationTapAction$AppStoreCase;", "Lcom/polymarket/usdependencies/NotificationTapAction$DismissCase;", "Lcom/polymarket/usdependencies/NotificationTapAction$ExternalCase;", "Lcom/polymarket/usdependencies/NotificationTapAction$InAppCase;", "Lcom/polymarket/usdependencies/NotificationTapAction$OpenInboxCase;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class NotificationTapAction implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final NotificationTapAction openInbox = new OpenInboxCase();
    private static final NotificationTapAction dismiss = new DismissCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$AppStoreCase;", "Lcom/polymarket/usdependencies/NotificationTapAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AppStoreCase extends NotificationTapAction {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$DismissCase;", "Lcom/polymarket/usdependencies/NotificationTapAction;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DismissCase extends NotificationTapAction {
        public DismissCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$ExternalCase;", "Lcom/polymarket/usdependencies/NotificationTapAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ExternalCase extends NotificationTapAction {
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$InAppCase;", "Lcom/polymarket/usdependencies/NotificationTapAction;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InAppCase extends NotificationTapAction {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$OpenInboxCase;", "Lcom/polymarket/usdependencies/NotificationTapAction;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OpenInboxCase extends NotificationTapAction {
        public OpenInboxCase() {
            super(null);
        }
    }

    public /* synthetic */ NotificationTapAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ NotificationTapAction access$getDismiss$cp() {
        return dismiss;
    }

    public static final /* synthetic */ NotificationTapAction access$getOpenInbox$cp() {
        return openInbox;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011H\u0082 R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usdependencies/NotificationTapAction$Companion;", "", "<init>", "()V", "inApp", "Lcom/polymarket/usdependencies/NotificationTapAction;", "associated0", "Ljava/net/URI;", "external", "appStore", "openInbox", "getOpenInbox", "()Lcom/polymarket/usdependencies/NotificationTapAction;", ActionType.DISMISS, "getDismiss", "resolve", "for_", "Lcom/polymarket/data/APIUSNotification;", "Swift_Companion_resolve_0", "notification", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native NotificationTapAction Swift_Companion_resolve_0(APIUSNotification notification);

        public final NotificationTapAction appStore(URI associated0) {
            associated0.getClass();
            return new AppStoreCase(associated0);
        }

        public final NotificationTapAction external(URI associated0) {
            associated0.getClass();
            return new ExternalCase(associated0);
        }

        public final NotificationTapAction getDismiss() {
            return NotificationTapAction.access$getDismiss$cp();
        }

        public final NotificationTapAction getOpenInbox() {
            return NotificationTapAction.access$getOpenInbox$cp();
        }

        public final NotificationTapAction inApp(URI associated0) {
            associated0.getClass();
            return new InAppCase(associated0);
        }

        public final NotificationTapAction resolve(APIUSNotification for_) {
            for_.getClass();
            return Swift_Companion_resolve_0(for_);
        }

        private Companion() {
        }
    }

    private NotificationTapAction() {
    }
}
