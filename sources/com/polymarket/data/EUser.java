package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001vB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010.\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00101\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00106\u001a\u0004\u0018\u0001032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010C\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010D\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010P\u001a\u0004\u0018\u0001032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010T\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010UJ\u0017\u0010Z\u001a\u0004\u0018\u00010W2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010\\\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010^\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010a\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010d\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010e\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010q\u001a\u00020\u0001H\u0016J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00170s2\u0006\u0010t\u001a\u00020\u0019H\u0016J\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00170s2\u0006\u0010t\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0013\u0010%\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u0010(\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u0011\u0010+\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00107\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0013\u0010:\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR(\u0010>\u001a\u0004\u0018\u00010\u001b2\b\u0010=\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010AR\u0013\u0010E\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0013\u0010H\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001dR\u0013\u0010K\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001dR\u0013\u0010N\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bO\u00105R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010V\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010[\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b[\u0010-R\u0011\u0010]\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b]\u0010-R\u0013\u0010_\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b`\u0010\u001dR\u0011\u0010b\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bc\u0010-R(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010gX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006w"}, d2 = {"Lcom/polymarket/data/EUser;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "userId", "getUserId", "Swift_userId", "auth0UserId", "getAuth0UserId", "Swift_auth0UserId", "email", "getEmail", "Swift_email", "phoneNumber", "getPhoneNumber", "Swift_phoneNumber", "emailVerified", "getEmailVerified", "()Z", "Swift_emailVerified", "phoneVerified", "getPhoneVerified", "Swift_phoneVerified", "updatedAt", "Ljava/util/Date;", "getUpdatedAt", "()Ljava/util/Date;", "Swift_updatedAt", "lastLoginAt", "getLastLoginAt", "Swift_lastLoginAt", "dateOfBirth", "getDateOfBirth", "Swift_dateOfBirth", "newValue", "profileImageUrl", "getProfileImageUrl", "setProfileImageUrl", "(Ljava/lang/String;)V", "Swift_profileImageUrl", "Swift_profileImageUrl_set", "value", Keys.KEY_NAME, "getName", "Swift_name", "displayName", "getDisplayName", "Swift_displayName", "username", "getUsername", "Swift_username", "createdAt", "getCreatedAt", "Swift_createdAt", "suspended", "getSuspended", "()Ljava/lang/Boolean;", "Swift_suspended", "(J)Ljava/lang/Boolean;", "exchangeAccountState", "Lcom/polymarket/data/EExchangeAccountState;", "getExchangeAccountState", "()Lcom/polymarket/data/EExchangeAccountState;", "Swift_exchangeAccountState", "isVerified", "Swift_isVerified", "isEmployee", "Swift_isEmployee", "referralCodeUsed", "getReferralCodeUsed", "Swift_referralCodeUsed", "allowSquadInvites", "getAllowSquadInvites", "Swift_allowSquadInvites", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EUser implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EUser(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }

    private final native boolean Swift_allowSquadInvites(long Swift_peer);

    private final native String Swift_auth0UserId(long Swift_peer);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native String Swift_dateOfBirth(long Swift_peer);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_email(long Swift_peer);

    private final native boolean Swift_emailVerified(long Swift_peer);

    private final native EExchangeAccountState Swift_exchangeAccountState(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isEmployee(long Swift_peer);

    private final native boolean Swift_isVerified(long Swift_peer);

    private final native String Swift_lastLoginAt(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native String Swift_phoneNumber(long Swift_peer);

    private final native boolean Swift_phoneVerified(long Swift_peer);

    private final native String Swift_profileImageUrl(long Swift_peer);

    private final native void Swift_profileImageUrl_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_referralCodeUsed(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Boolean Swift_suspended(long Swift_peer);

    private final native Date Swift_updatedAt(long Swift_peer);

    private final native String Swift_userId(long Swift_peer);

    private final native String Swift_username(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
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

    public final boolean getAllowSquadInvites() {
        return Swift_allowSquadInvites(this.Swift_peer);
    }

    public final String getAuth0UserId() {
        return Swift_auth0UserId(this.Swift_peer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final String getDateOfBirth() {
        return Swift_dateOfBirth(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    public final String getEmail() {
        return Swift_email(this.Swift_peer);
    }

    public final boolean getEmailVerified() {
        return Swift_emailVerified(this.Swift_peer);
    }

    public final EExchangeAccountState getExchangeAccountState() {
        return Swift_exchangeAccountState(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getLastLoginAt() {
        return Swift_lastLoginAt(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final String getPhoneNumber() {
        return Swift_phoneNumber(this.Swift_peer);
    }

    public final boolean getPhoneVerified() {
        return Swift_phoneVerified(this.Swift_peer);
    }

    public final String getProfileImageUrl() {
        return Swift_profileImageUrl(this.Swift_peer);
    }

    public final String getReferralCodeUsed() {
        return Swift_referralCodeUsed(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final Boolean getSuspended() {
        return Swift_suspended(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public final String getUserId() {
        return Swift_userId(this.Swift_peer);
    }

    public final String getUsername() {
        return Swift_username(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isEmployee() {
        return Swift_isEmployee(this.Swift_peer);
    }

    public final boolean isVerified() {
        return Swift_isVerified(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EUser(this);
    }

    public final void setProfileImageUrl(String str) {
        willmutate();
        try {
            Swift_profileImageUrl_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 ¨\u0006\u0007"}, d2 = {"Lcom/polymarket/data/EUser$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/data/EUser;", "Swift_Companion_mock_0", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EUser Swift_Companion_mock_0();

        public final EUser mock() {
            return Swift_Companion_mock_0();
        }

        private Companion() {
        }
    }

    public EUser(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
