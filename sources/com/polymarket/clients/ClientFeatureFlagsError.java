package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ClientUnavailableCase", "EmptySnapshotCase", "IdentifyFailedCase", "SupersededCase", "Companion", "Lcom/polymarket/clients/ClientFeatureFlagsError$ClientUnavailableCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError$EmptySnapshotCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError$IdentifyFailedCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError$SupersededCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientFeatureFlagsError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientFeatureFlagsError clientUnavailable = new ClientUnavailableCase();
    private static final ClientFeatureFlagsError emptySnapshot = new EmptySnapshotCase();
    private static final ClientFeatureFlagsError superseded = new SupersededCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError$ClientUnavailableCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ClientUnavailableCase extends ClientFeatureFlagsError {
        public ClientUnavailableCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError$EmptySnapshotCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmptySnapshotCase extends ClientFeatureFlagsError {
        public EmptySnapshotCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError$IdentifyFailedCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IdentifyFailedCase extends ClientFeatureFlagsError {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentifyFailedCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError$SupersededCase;", "Lcom/polymarket/clients/ClientFeatureFlagsError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SupersededCase extends ClientFeatureFlagsError {
        public SupersededCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientFeatureFlagsError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientFeatureFlagsError access$getClientUnavailable$cp() {
        return clientUnavailable;
    }

    public static final /* synthetic */ ClientFeatureFlagsError access$getEmptySnapshot$cp() {
        return emptySnapshot;
    }

    public static final /* synthetic */ ClientFeatureFlagsError access$getSuperseded$cp() {
        return superseded;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientFeatureFlagsError$Companion;", "", "<init>", "()V", "clientUnavailable", "Lcom/polymarket/clients/ClientFeatureFlagsError;", "getClientUnavailable", "()Lcom/polymarket/clients/ClientFeatureFlagsError;", "emptySnapshot", "getEmptySnapshot", "identifyFailed", "associated0", "", "superseded", "getSuperseded", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientFeatureFlagsError getClientUnavailable() {
            return ClientFeatureFlagsError.access$getClientUnavailable$cp();
        }

        public final ClientFeatureFlagsError getEmptySnapshot() {
            return ClientFeatureFlagsError.access$getEmptySnapshot$cp();
        }

        public final ClientFeatureFlagsError getSuperseded() {
            return ClientFeatureFlagsError.access$getSuperseded$cp();
        }

        public final ClientFeatureFlagsError identifyFailed(String associated0) {
            associated0.getClass();
            return new IdentifyFailedCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientFeatureFlagsError() {
    }
}
