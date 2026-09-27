package com.polymarket.usdependencies;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usdependencies/USState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "UserAccountStatus", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class USState implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public USState(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usdependencies/USState$UserAccountStatus;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "unauthenticated", "pendingWebOnboarding", "pendingOnboarding", "pendingKYC", "noMFAAuthorized", "mfaSMSRequired", "fullyAuthorized", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserAccountStatus implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ UserAccountStatus[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final UserAccountStatus unauthenticated = new UserAccountStatus("unauthenticated", 0);
        public static final UserAccountStatus pendingWebOnboarding = new UserAccountStatus("pendingWebOnboarding", 1);
        public static final UserAccountStatus pendingOnboarding = new UserAccountStatus("pendingOnboarding", 2);
        public static final UserAccountStatus pendingKYC = new UserAccountStatus("pendingKYC", 3);
        public static final UserAccountStatus noMFAAuthorized = new UserAccountStatus("noMFAAuthorized", 4);
        public static final UserAccountStatus mfaSMSRequired = new UserAccountStatus("mfaSMSRequired", 5);
        public static final UserAccountStatus fullyAuthorized = new UserAccountStatus("fullyAuthorized", 6);

        private static final /* synthetic */ UserAccountStatus[] $values() {
            return new UserAccountStatus[]{unauthenticated, pendingWebOnboarding, pendingOnboarding, pendingKYC, noMFAAuthorized, mfaSMSRequired, fullyAuthorized};
        }

        static {
            UserAccountStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private UserAccountStatus(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static UserAccountStatus valueOf(String str) {
            return (UserAccountStatus) Enum.valueOf(UserAccountStatus.class, str);
        }

        public static UserAccountStatus[] values() {
            return (UserAccountStatus[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/usdependencies/USState$UserAccountStatus$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usdependencies/USState$UserAccountStatus;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<UserAccountStatus> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<UserAccountStatus> getAllCases() {
                return ArrayKt.arrayOf(UserAccountStatus.unauthenticated, UserAccountStatus.pendingWebOnboarding, UserAccountStatus.pendingOnboarding, UserAccountStatus.pendingKYC, UserAccountStatus.noMFAAuthorized, UserAccountStatus.mfaSMSRequired, UserAccountStatus.fullyAuthorized);
            }

            private Companion() {
            }
        }
    }
}
