package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0015\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0014\u001f !\"#$%&'()*+,-./012¨\u00063"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CancelledCase", "DuplicateCredentialCase", "ICloudKeychainDisabledCase", "DeviceRestrictedCase", "EmptyChallengeCase", "OperationInProgressCase", "PresentationAnchorMissingCase", "MissingAttestationObjectCase", "InvalidCBORStructureCase", "InvalidChallengeCase", "InvalidRegistrationResultCase", "InvalidAuthenticationResultCase", "FailedCase", "StolenDeviceProtectionCase", "AssociatedDomainNotConfiguredCase", "ForeignBundleAssociationCase", "InvalidResponseCase", "CredentialImportCase", "CredentialExportCase", "UnknownCase", "Companion", "Lcom/polymarket/clients/ClientPasskeyMFAError$AssociatedDomainNotConfiguredCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$CancelledCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$CredentialExportCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$CredentialImportCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$DeviceRestrictedCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$DuplicateCredentialCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$EmptyChallengeCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$FailedCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$ForeignBundleAssociationCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$ICloudKeychainDisabledCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidAuthenticationResultCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidCBORStructureCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidChallengeCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidRegistrationResultCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidResponseCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$MissingAttestationObjectCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$OperationInProgressCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$PresentationAnchorMissingCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$StolenDeviceProtectionCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError$UnknownCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientPasskeyMFAError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientPasskeyMFAError cancelled = new CancelledCase();
    private static final ClientPasskeyMFAError duplicateCredential = new DuplicateCredentialCase();
    private static final ClientPasskeyMFAError iCloudKeychainDisabled = new ICloudKeychainDisabledCase();
    private static final ClientPasskeyMFAError deviceRestricted = new DeviceRestrictedCase();
    private static final ClientPasskeyMFAError emptyChallenge = new EmptyChallengeCase();
    private static final ClientPasskeyMFAError operationInProgress = new OperationInProgressCase();
    private static final ClientPasskeyMFAError presentationAnchorMissing = new PresentationAnchorMissingCase();
    private static final ClientPasskeyMFAError missingAttestationObject = new MissingAttestationObjectCase();
    private static final ClientPasskeyMFAError invalidCBORStructure = new InvalidCBORStructureCase();
    private static final ClientPasskeyMFAError invalidChallenge = new InvalidChallengeCase();
    private static final ClientPasskeyMFAError invalidRegistrationResult = new InvalidRegistrationResultCase();
    private static final ClientPasskeyMFAError invalidAuthenticationResult = new InvalidAuthenticationResultCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$AssociatedDomainNotConfiguredCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AssociatedDomainNotConfiguredCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssociatedDomainNotConfiguredCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$CancelledCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelledCase extends ClientPasskeyMFAError {
        public CancelledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$CredentialExportCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CredentialExportCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CredentialExportCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$CredentialImportCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CredentialImportCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CredentialImportCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$DeviceRestrictedCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DeviceRestrictedCase extends ClientPasskeyMFAError {
        public DeviceRestrictedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$DuplicateCredentialCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DuplicateCredentialCase extends ClientPasskeyMFAError {
        public DuplicateCredentialCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$EmptyChallengeCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmptyChallengeCase extends ClientPasskeyMFAError {
        public EmptyChallengeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$FailedCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FailedCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$ForeignBundleAssociationCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ForeignBundleAssociationCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForeignBundleAssociationCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$ICloudKeychainDisabledCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ICloudKeychainDisabledCase extends ClientPasskeyMFAError {
        public ICloudKeychainDisabledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidAuthenticationResultCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidAuthenticationResultCase extends ClientPasskeyMFAError {
        public InvalidAuthenticationResultCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidCBORStructureCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidCBORStructureCase extends ClientPasskeyMFAError {
        public InvalidCBORStructureCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidChallengeCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidChallengeCase extends ClientPasskeyMFAError {
        public InvalidChallengeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidRegistrationResultCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidRegistrationResultCase extends ClientPasskeyMFAError {
        public InvalidRegistrationResultCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$InvalidResponseCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidResponseCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidResponseCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$MissingAttestationObjectCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MissingAttestationObjectCase extends ClientPasskeyMFAError {
        public MissingAttestationObjectCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$OperationInProgressCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OperationInProgressCase extends ClientPasskeyMFAError {
        public OperationInProgressCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$PresentationAnchorMissingCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PresentationAnchorMissingCase extends ClientPasskeyMFAError {
        public PresentationAnchorMissingCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$StolenDeviceProtectionCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StolenDeviceProtectionCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StolenDeviceProtectionCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$UnknownCase;", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnknownCase extends ClientPasskeyMFAError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ClientPasskeyMFAError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientPasskeyMFAError access$getCancelled$cp() {
        return cancelled;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getDeviceRestricted$cp() {
        return deviceRestricted;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getDuplicateCredential$cp() {
        return duplicateCredential;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getEmptyChallenge$cp() {
        return emptyChallenge;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getICloudKeychainDisabled$cp() {
        return iCloudKeychainDisabled;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getInvalidAuthenticationResult$cp() {
        return invalidAuthenticationResult;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getInvalidCBORStructure$cp() {
        return invalidCBORStructure;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getInvalidChallenge$cp() {
        return invalidChallenge;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getInvalidRegistrationResult$cp() {
        return invalidRegistrationResult;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getMissingAttestationObject$cp() {
        return missingAttestationObject;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getOperationInProgress$cp() {
        return operationInProgress;
    }

    public static final /* synthetic */ ClientPasskeyMFAError access$getPresentationAnchorMissing$cp() {
        return presentationAnchorMissing;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0003\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007¨\u0006("}, d2 = {"Lcom/polymarket/clients/ClientPasskeyMFAError$Companion;", "", "<init>", "()V", "cancelled", "Lcom/polymarket/clients/ClientPasskeyMFAError;", "getCancelled", "()Lcom/polymarket/clients/ClientPasskeyMFAError;", "duplicateCredential", "getDuplicateCredential", "iCloudKeychainDisabled", "getICloudKeychainDisabled", "deviceRestricted", "getDeviceRestricted", "emptyChallenge", "getEmptyChallenge", "operationInProgress", "getOperationInProgress", "presentationAnchorMissing", "getPresentationAnchorMissing", "missingAttestationObject", "getMissingAttestationObject", "invalidCBORStructure", "getInvalidCBORStructure", "invalidChallenge", "getInvalidChallenge", "invalidRegistrationResult", "getInvalidRegistrationResult", "invalidAuthenticationResult", "getInvalidAuthenticationResult", "failed", "associated0", "", "stolenDeviceProtection", "associatedDomainNotConfigured", "foreignBundleAssociation", "invalidResponse", "credentialImport", "credentialExport", "unknown", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientPasskeyMFAError associatedDomainNotConfigured(Throwable associated0) {
            associated0.getClass();
            return new AssociatedDomainNotConfiguredCase(associated0);
        }

        public final ClientPasskeyMFAError credentialExport(Throwable associated0) {
            associated0.getClass();
            return new CredentialExportCase(associated0);
        }

        public final ClientPasskeyMFAError credentialImport(Throwable associated0) {
            associated0.getClass();
            return new CredentialImportCase(associated0);
        }

        public final ClientPasskeyMFAError failed(Throwable associated0) {
            associated0.getClass();
            return new FailedCase(associated0);
        }

        public final ClientPasskeyMFAError foreignBundleAssociation(Throwable associated0) {
            associated0.getClass();
            return new ForeignBundleAssociationCase(associated0);
        }

        public final ClientPasskeyMFAError getCancelled() {
            return ClientPasskeyMFAError.access$getCancelled$cp();
        }

        public final ClientPasskeyMFAError getDeviceRestricted() {
            return ClientPasskeyMFAError.access$getDeviceRestricted$cp();
        }

        public final ClientPasskeyMFAError getDuplicateCredential() {
            return ClientPasskeyMFAError.access$getDuplicateCredential$cp();
        }

        public final ClientPasskeyMFAError getEmptyChallenge() {
            return ClientPasskeyMFAError.access$getEmptyChallenge$cp();
        }

        public final ClientPasskeyMFAError getICloudKeychainDisabled() {
            return ClientPasskeyMFAError.access$getICloudKeychainDisabled$cp();
        }

        public final ClientPasskeyMFAError getInvalidAuthenticationResult() {
            return ClientPasskeyMFAError.access$getInvalidAuthenticationResult$cp();
        }

        public final ClientPasskeyMFAError getInvalidCBORStructure() {
            return ClientPasskeyMFAError.access$getInvalidCBORStructure$cp();
        }

        public final ClientPasskeyMFAError getInvalidChallenge() {
            return ClientPasskeyMFAError.access$getInvalidChallenge$cp();
        }

        public final ClientPasskeyMFAError getInvalidRegistrationResult() {
            return ClientPasskeyMFAError.access$getInvalidRegistrationResult$cp();
        }

        public final ClientPasskeyMFAError getMissingAttestationObject() {
            return ClientPasskeyMFAError.access$getMissingAttestationObject$cp();
        }

        public final ClientPasskeyMFAError getOperationInProgress() {
            return ClientPasskeyMFAError.access$getOperationInProgress$cp();
        }

        public final ClientPasskeyMFAError getPresentationAnchorMissing() {
            return ClientPasskeyMFAError.access$getPresentationAnchorMissing$cp();
        }

        public final ClientPasskeyMFAError invalidResponse(Throwable associated0) {
            associated0.getClass();
            return new InvalidResponseCase(associated0);
        }

        public final ClientPasskeyMFAError stolenDeviceProtection(Throwable associated0) {
            associated0.getClass();
            return new StolenDeviceProtectionCase(associated0);
        }

        public final ClientPasskeyMFAError unknown(Throwable associated0) {
            associated0.getClass();
            return new UnknownCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientPasskeyMFAError() {
    }
}
