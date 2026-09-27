package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\f\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/polymarket/clients/ClientKYCError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SessionTokenUnavailableCase", "PresentationNotAvailableCase", "DocVErrorCase", "UserCancelledCase", "ConsentDeclinedCase", "CameraPermissionDeniedCase", "InvalidOTPCodeCase", "PhoneChangeBlockedCase", "EmailOTPInvalidCodeCase", "EmailOTPRateLimitedCase", "EmailOTPNotEligibleCase", "EmailOTPUnavailableCase", "DocVReason", "Companion", "Lcom/polymarket/clients/ClientKYCError$CameraPermissionDeniedCase;", "Lcom/polymarket/clients/ClientKYCError$ConsentDeclinedCase;", "Lcom/polymarket/clients/ClientKYCError$DocVErrorCase;", "Lcom/polymarket/clients/ClientKYCError$EmailOTPInvalidCodeCase;", "Lcom/polymarket/clients/ClientKYCError$EmailOTPNotEligibleCase;", "Lcom/polymarket/clients/ClientKYCError$EmailOTPRateLimitedCase;", "Lcom/polymarket/clients/ClientKYCError$EmailOTPUnavailableCase;", "Lcom/polymarket/clients/ClientKYCError$InvalidOTPCodeCase;", "Lcom/polymarket/clients/ClientKYCError$PhoneChangeBlockedCase;", "Lcom/polymarket/clients/ClientKYCError$PresentationNotAvailableCase;", "Lcom/polymarket/clients/ClientKYCError$SessionTokenUnavailableCase;", "Lcom/polymarket/clients/ClientKYCError$UserCancelledCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientKYCError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientKYCError presentationNotAvailable = new PresentationNotAvailableCase();
    private static final ClientKYCError userCancelled = new UserCancelledCase();
    private static final ClientKYCError consentDeclined = new ConsentDeclinedCase();
    private static final ClientKYCError cameraPermissionDenied = new CameraPermissionDeniedCase();
    private static final ClientKYCError invalidOTPCode = new InvalidOTPCodeCase();
    private static final ClientKYCError phoneChangeBlocked = new PhoneChangeBlockedCase();
    private static final ClientKYCError emailOTPInvalidCode = new EmailOTPInvalidCodeCase();
    private static final ClientKYCError emailOTPRateLimited = new EmailOTPRateLimitedCase();
    private static final ClientKYCError emailOTPNotEligible = new EmailOTPNotEligibleCase();
    private static final ClientKYCError emailOTPUnavailable = new EmailOTPUnavailableCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$CameraPermissionDeniedCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CameraPermissionDeniedCase extends ClientKYCError {
        public CameraPermissionDeniedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$ConsentDeclinedCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ConsentDeclinedCase extends ClientKYCError {
        public ConsentDeclinedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$DocVErrorCase;", "Lcom/polymarket/clients/ClientKYCError;", "associated0", "Lcom/polymarket/clients/ClientKYCError$DocVReason;", "associated1", "", "associated2", "<init>", "(Lcom/polymarket/clients/ClientKYCError$DocVReason;Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientKYCError$DocVReason;", "getAssociated1", "()Ljava/lang/String;", "getAssociated2", "detail", "getDetail", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DocVErrorCase extends ClientKYCError {
        private final DocVReason associated0;
        private final String associated1;
        private final String associated2;
        private final String detail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocVErrorCase(DocVReason docVReason, String str, String str2) {
            super(null);
            docVReason.getClass();
            this.associated0 = docVReason;
            this.associated1 = str;
            this.associated2 = str2;
            this.detail = str2;
        }

        public final DocVReason getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$EmailOTPInvalidCodeCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailOTPInvalidCodeCase extends ClientKYCError {
        public EmailOTPInvalidCodeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$EmailOTPNotEligibleCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailOTPNotEligibleCase extends ClientKYCError {
        public EmailOTPNotEligibleCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$EmailOTPRateLimitedCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailOTPRateLimitedCase extends ClientKYCError {
        public EmailOTPRateLimitedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$EmailOTPUnavailableCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailOTPUnavailableCase extends ClientKYCError {
        public EmailOTPUnavailableCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$InvalidOTPCodeCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidOTPCodeCase extends ClientKYCError {
        public InvalidOTPCodeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$PhoneChangeBlockedCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PhoneChangeBlockedCase extends ClientKYCError {
        public PhoneChangeBlockedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$PresentationNotAvailableCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PresentationNotAvailableCase extends ClientKYCError {
        public PresentationNotAvailableCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$SessionTokenUnavailableCase;", "Lcom/polymarket/clients/ClientKYCError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SessionTokenUnavailableCase extends ClientKYCError {
        private final String associated0;

        public SessionTokenUnavailableCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$UserCancelledCase;", "Lcom/polymarket/clients/ClientKYCError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserCancelledCase extends ClientKYCError {
        public UserCancelledCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientKYCError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientKYCError access$getCameraPermissionDenied$cp() {
        return cameraPermissionDenied;
    }

    public static final /* synthetic */ ClientKYCError access$getConsentDeclined$cp() {
        return consentDeclined;
    }

    public static final /* synthetic */ ClientKYCError access$getEmailOTPInvalidCode$cp() {
        return emailOTPInvalidCode;
    }

    public static final /* synthetic */ ClientKYCError access$getEmailOTPNotEligible$cp() {
        return emailOTPNotEligible;
    }

    public static final /* synthetic */ ClientKYCError access$getEmailOTPRateLimited$cp() {
        return emailOTPRateLimited;
    }

    public static final /* synthetic */ ClientKYCError access$getEmailOTPUnavailable$cp() {
        return emailOTPUnavailable;
    }

    public static final /* synthetic */ ClientKYCError access$getInvalidOTPCode$cp() {
        return invalidOTPCode;
    }

    public static final /* synthetic */ ClientKYCError access$getPhoneChangeBlocked$cp() {
        return phoneChangeBlocked;
    }

    public static final /* synthetic */ ClientKYCError access$getPresentationNotAvailable$cp() {
        return presentationNotAvailable;
    }

    public static final /* synthetic */ ClientKYCError access$getUserCancelled$cp() {
        return userCancelled;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$DocVReason;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "sessionExpired", "invalidToken", "invalidConfiguration", "noInternet", "uploadFailed", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DocVReason implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ DocVReason[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final DocVReason sessionExpired = new DocVReason("sessionExpired", 0, "sessionExpired", null, 2, null);
        public static final DocVReason invalidToken = new DocVReason("invalidToken", 1, "invalidToken", null, 2, null);
        public static final DocVReason invalidConfiguration = new DocVReason("invalidConfiguration", 2, "invalidConfiguration", null, 2, null);
        public static final DocVReason noInternet = new DocVReason("noInternet", 3, "noInternet", null, 2, null);
        public static final DocVReason uploadFailed = new DocVReason("uploadFailed", 4, "uploadFailed", null, 2, null);
        public static final DocVReason unknown = new DocVReason("unknown", 5, "unknown", null, 2, null);

        private static final /* synthetic */ DocVReason[] $values() {
            return new DocVReason[]{sessionExpired, invalidToken, invalidConfiguration, noInternet, uploadFailed, unknown};
        }

        static {
            DocVReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ DocVReason(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static DocVReason valueOf(String str) {
            return (DocVReason) Enum.valueOf(DocVReason.class, str);
        }

        public static DocVReason[] values() {
            return (DocVReason[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$DocVReason$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientKYCError$DocVReason;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DocVReason init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -2078062178:
                        if (!rawValue.equals("uploadFailed")) {
                            return null;
                        }
                        return DocVReason.uploadFailed;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return DocVReason.unknown;
                        }
                        return null;
                    case 462997423:
                        if (rawValue.equals("sessionExpired")) {
                            return DocVReason.sessionExpired;
                        }
                        return null;
                    case 516913730:
                        if (rawValue.equals("invalidToken")) {
                            return DocVReason.invalidToken;
                        }
                        return null;
                    case 1729423394:
                        if (rawValue.equals("noInternet")) {
                            return DocVReason.noInternet;
                        }
                        return null;
                    case 1848630335:
                        if (rawValue.equals("invalidConfiguration")) {
                            return DocVReason.invalidConfiguration;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private DocVReason(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\"\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\n¨\u0006#"}, d2 = {"Lcom/polymarket/clients/ClientKYCError$Companion;", "", "<init>", "()V", "sessionTokenUnavailable", "Lcom/polymarket/clients/ClientKYCError;", "associated0", "", "presentationNotAvailable", "getPresentationNotAvailable", "()Lcom/polymarket/clients/ClientKYCError;", "docVError", "Lcom/polymarket/clients/ClientKYCError$DocVReason;", "associated1", "detail", "userCancelled", "getUserCancelled", "consentDeclined", "getConsentDeclined", "cameraPermissionDenied", "getCameraPermissionDenied", "invalidOTPCode", "getInvalidOTPCode", "phoneChangeBlocked", "getPhoneChangeBlocked", "emailOTPInvalidCode", "getEmailOTPInvalidCode", "emailOTPRateLimited", "getEmailOTPRateLimited", "emailOTPNotEligible", "getEmailOTPNotEligible", "emailOTPUnavailable", "getEmailOTPUnavailable", "DocVReason", "rawValue", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ClientKYCError docVError$default(Companion companion, DocVReason docVReason, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.docVError(docVReason, str, str2);
        }

        public final DocVReason DocVReason(String rawValue) {
            rawValue.getClass();
            return DocVReason.INSTANCE.init(rawValue);
        }

        public final ClientKYCError docVError(DocVReason associated0, String associated1, String detail) {
            associated0.getClass();
            return new DocVErrorCase(associated0, associated1, detail);
        }

        public final ClientKYCError getCameraPermissionDenied() {
            return ClientKYCError.access$getCameraPermissionDenied$cp();
        }

        public final ClientKYCError getConsentDeclined() {
            return ClientKYCError.access$getConsentDeclined$cp();
        }

        public final ClientKYCError getEmailOTPInvalidCode() {
            return ClientKYCError.access$getEmailOTPInvalidCode$cp();
        }

        public final ClientKYCError getEmailOTPNotEligible() {
            return ClientKYCError.access$getEmailOTPNotEligible$cp();
        }

        public final ClientKYCError getEmailOTPRateLimited() {
            return ClientKYCError.access$getEmailOTPRateLimited$cp();
        }

        public final ClientKYCError getEmailOTPUnavailable() {
            return ClientKYCError.access$getEmailOTPUnavailable$cp();
        }

        public final ClientKYCError getInvalidOTPCode() {
            return ClientKYCError.access$getInvalidOTPCode$cp();
        }

        public final ClientKYCError getPhoneChangeBlocked() {
            return ClientKYCError.access$getPhoneChangeBlocked$cp();
        }

        public final ClientKYCError getPresentationNotAvailable() {
            return ClientKYCError.access$getPresentationNotAvailable$cp();
        }

        public final ClientKYCError getUserCancelled() {
            return ClientKYCError.access$getUserCancelled$cp();
        }

        public final ClientKYCError sessionTokenUnavailable(String associated0) {
            return new SessionTokenUnavailableCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientKYCError() {
    }
}
