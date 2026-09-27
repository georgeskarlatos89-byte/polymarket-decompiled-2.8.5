package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CancelledCase", "ApprovalIncompleteCase", "MissingClientTokenCase", "PaypalTokenizationFailedCase", "VenmoTokenizationFailedCase", "PaypalDeviceDataFailedCase", "VenmoDeviceDataFailedCase", "UnsupportedOnPlatformCase", "UnimplementedCase", "Companion", "Lcom/polymarket/clients/ClientPayPalError$ApprovalIncompleteCase;", "Lcom/polymarket/clients/ClientPayPalError$CancelledCase;", "Lcom/polymarket/clients/ClientPayPalError$MissingClientTokenCase;", "Lcom/polymarket/clients/ClientPayPalError$PaypalDeviceDataFailedCase;", "Lcom/polymarket/clients/ClientPayPalError$PaypalTokenizationFailedCase;", "Lcom/polymarket/clients/ClientPayPalError$UnimplementedCase;", "Lcom/polymarket/clients/ClientPayPalError$UnsupportedOnPlatformCase;", "Lcom/polymarket/clients/ClientPayPalError$VenmoDeviceDataFailedCase;", "Lcom/polymarket/clients/ClientPayPalError$VenmoTokenizationFailedCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientPayPalError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientPayPalError cancelled = new CancelledCase();
    private static final ClientPayPalError missingClientToken = new MissingClientTokenCase();
    private static final ClientPayPalError paypalDeviceDataFailed = new PaypalDeviceDataFailedCase();
    private static final ClientPayPalError venmoDeviceDataFailed = new VenmoDeviceDataFailedCase();
    private static final ClientPayPalError unsupportedOnPlatform = new UnsupportedOnPlatformCase();
    private static final ClientPayPalError unimplemented = new UnimplementedCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$ApprovalIncompleteCase;", "Lcom/polymarket/clients/ClientPayPalError;", "associated0", "Lcom/polymarket/clients/ClientPayPalSDKError;", "<init>", "(Lcom/polymarket/clients/ClientPayPalSDKError;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientPayPalSDKError;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ApprovalIncompleteCase extends ClientPayPalError {
        private final ClientPayPalSDKError associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApprovalIncompleteCase(ClientPayPalSDKError clientPayPalSDKError) {
            super(null);
            clientPayPalSDKError.getClass();
            this.associated0 = clientPayPalSDKError;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ApprovalIncompleteCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((ApprovalIncompleteCase) other).associated0);
        }

        public final ClientPayPalSDKError getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$CancelledCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelledCase extends ClientPayPalError {
        public CancelledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$MissingClientTokenCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MissingClientTokenCase extends ClientPayPalError {
        public MissingClientTokenCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$PaypalDeviceDataFailedCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PaypalDeviceDataFailedCase extends ClientPayPalError {
        public PaypalDeviceDataFailedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$PaypalTokenizationFailedCase;", "Lcom/polymarket/clients/ClientPayPalError;", "associated0", "Lcom/polymarket/clients/ClientPayPalSDKError;", "<init>", "(Lcom/polymarket/clients/ClientPayPalSDKError;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientPayPalSDKError;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PaypalTokenizationFailedCase extends ClientPayPalError {
        private final ClientPayPalSDKError associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaypalTokenizationFailedCase(ClientPayPalSDKError clientPayPalSDKError) {
            super(null);
            clientPayPalSDKError.getClass();
            this.associated0 = clientPayPalSDKError;
        }

        public boolean equals(Object other) {
            if (!(other instanceof PaypalTokenizationFailedCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((PaypalTokenizationFailedCase) other).associated0);
        }

        public final ClientPayPalSDKError getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$UnimplementedCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnimplementedCase extends ClientPayPalError {
        public UnimplementedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$UnsupportedOnPlatformCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedOnPlatformCase extends ClientPayPalError {
        public UnsupportedOnPlatformCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$VenmoDeviceDataFailedCase;", "Lcom/polymarket/clients/ClientPayPalError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class VenmoDeviceDataFailedCase extends ClientPayPalError {
        public VenmoDeviceDataFailedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$VenmoTokenizationFailedCase;", "Lcom/polymarket/clients/ClientPayPalError;", "associated0", "Lcom/polymarket/clients/ClientPayPalSDKError;", "<init>", "(Lcom/polymarket/clients/ClientPayPalSDKError;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientPayPalSDKError;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class VenmoTokenizationFailedCase extends ClientPayPalError {
        private final ClientPayPalSDKError associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VenmoTokenizationFailedCase(ClientPayPalSDKError clientPayPalSDKError) {
            super(null);
            clientPayPalSDKError.getClass();
            this.associated0 = clientPayPalSDKError;
        }

        public boolean equals(Object other) {
            if (!(other instanceof VenmoTokenizationFailedCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((VenmoTokenizationFailedCase) other).associated0);
        }

        public final ClientPayPalSDKError getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ClientPayPalError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientPayPalError access$getCancelled$cp() {
        return cancelled;
    }

    public static final /* synthetic */ ClientPayPalError access$getMissingClientToken$cp() {
        return missingClientToken;
    }

    public static final /* synthetic */ ClientPayPalError access$getPaypalDeviceDataFailed$cp() {
        return paypalDeviceDataFailed;
    }

    public static final /* synthetic */ ClientPayPalError access$getUnimplemented$cp() {
        return unimplemented;
    }

    public static final /* synthetic */ ClientPayPalError access$getUnsupportedOnPlatform$cp() {
        return unsupportedOnPlatform;
    }

    public static final /* synthetic */ ClientPayPalError access$getVenmoDeviceDataFailed$cp() {
        return venmoDeviceDataFailed;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientPayPalError$Companion;", "", "<init>", "()V", "cancelled", "Lcom/polymarket/clients/ClientPayPalError;", "getCancelled", "()Lcom/polymarket/clients/ClientPayPalError;", "approvalIncomplete", "associated0", "Lcom/polymarket/clients/ClientPayPalSDKError;", "missingClientToken", "getMissingClientToken", "paypalTokenizationFailed", "venmoTokenizationFailed", "paypalDeviceDataFailed", "getPaypalDeviceDataFailed", "venmoDeviceDataFailed", "getVenmoDeviceDataFailed", "unsupportedOnPlatform", "getUnsupportedOnPlatform", "unimplemented", "getUnimplemented", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientPayPalError approvalIncomplete(ClientPayPalSDKError associated0) {
            associated0.getClass();
            return new ApprovalIncompleteCase(associated0);
        }

        public final ClientPayPalError getCancelled() {
            return ClientPayPalError.access$getCancelled$cp();
        }

        public final ClientPayPalError getMissingClientToken() {
            return ClientPayPalError.access$getMissingClientToken$cp();
        }

        public final ClientPayPalError getPaypalDeviceDataFailed() {
            return ClientPayPalError.access$getPaypalDeviceDataFailed$cp();
        }

        public final ClientPayPalError getUnimplemented() {
            return ClientPayPalError.access$getUnimplemented$cp();
        }

        public final ClientPayPalError getUnsupportedOnPlatform() {
            return ClientPayPalError.access$getUnsupportedOnPlatform$cp();
        }

        public final ClientPayPalError getVenmoDeviceDataFailed() {
            return ClientPayPalError.access$getVenmoDeviceDataFailed$cp();
        }

        public final ClientPayPalError paypalTokenizationFailed(ClientPayPalSDKError associated0) {
            associated0.getClass();
            return new PaypalTokenizationFailedCase(associated0);
        }

        public final ClientPayPalError venmoTokenizationFailed(ClientPayPalSDKError associated0) {
            associated0.getClass();
            return new VenmoTokenizationFailedCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientPayPalError() {
    }
}
